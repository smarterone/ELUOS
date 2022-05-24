package view;

import java.awt.Component;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.Opration;
import model.GameData;

public class MainWin extends JFrame{
	
	Opration opration;
	GameData gameData;
	Component gamePanel;
	Container mainpane;
	private static final long serialVersionUID = 8450364846812667984L;

	
    public MainWin(Opration opration, GameData gameData){
    	
    	this.gameData=gameData;
    	this.opration=opration;
    	mainpane =getLayeredPane();
    	
     setBounds(100,50,360,600); 
     setResizable(false);//固定窗口大小不可调节
     setLayout(null);//图片自由布局
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     //设置背景
     setBack();
     //绘制区域
     StaticPanel staticPanel = new StaticPanel();
     mainpane.add(staticPanel);
     //添加游戏方块
     setGamePanel();
    }
    
    void setBack(){
    ImageIcon imgic = new ImageIcon ("img/bg04.jpg");//插入背景图片
     JLabel jl = new JLabel(imgic);
     jl.setBounds(0,0,360,600);//图片的位置
     getContentPane().add(jl);
}
    /**
     * 添加游戏方块
     */
    void setGamePanel() {
    	gamePanel =new GamePanel(gameData);
    	mainpane.add(gamePanel);
    	
    }
}

     