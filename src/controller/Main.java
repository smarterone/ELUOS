package controller;
import model.GameData;
/*
 * �����֮��Ĺ�ϵ
 */
import view.MainWin;

public class Main {
    public static void main (String[] args) {
    	//ʵ��������
    	Opration opration =new Opration();
    	//��������
    	GameData gameData =new GameData();
    	//�����ݺʹ��ڹ���
        MainWin mainwin = new MainWin(opration,gameData);
        //�����ںͲ���������
        opration.setWin(mainwin);
        //�����ںͲ���������
        opration.setData(gameData);
        mainwin.setVisible(true);
    }
}