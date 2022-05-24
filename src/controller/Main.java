package controller;
import model.GameData;
/*
 * 层与层之间的关系
 */
import view.MainWin;

public class Main {
    public static void main (String[] args) {
    	//实例化操作
    	Opration opration =new Opration();
    	//加载数据
    	GameData gameData =new GameData();
    	//将数据和窗口关联
        MainWin mainwin = new MainWin(opration,gameData);
        //将窗口和操作区关联
        opration.setWin(mainwin);
        //将窗口和操作区关联
        opration.setData(gameData);
        mainwin.setVisible(true);
    }
}