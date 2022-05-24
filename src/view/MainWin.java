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
     setResizable(false);//�̶����ڴ�С���ɵ���
     setLayout(null);//ͼƬ���ɲ���
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     //���ñ���
     setBack();
     //��������
     StaticPanel staticPanel = new StaticPanel();
     mainpane.add(staticPanel);
     //�����Ϸ����
     setGamePanel();
    }
    
    void setBack(){
    ImageIcon imgic = new ImageIcon ("img/bg04.jpg");//���뱳��ͼƬ
     JLabel jl = new JLabel(imgic);
     jl.setBounds(0,0,360,600);//ͼƬ��λ��
     getContentPane().add(jl);
}
    /**
     * �����Ϸ����
     */
    void setGamePanel() {
    	gamePanel =new GamePanel(gameData);
    	mainpane.add(gamePanel);
    	
    }
}

     