package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class StaticPanel extends JPanel{

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 991741388603869262L;
	
	StaticPanel(){
		JButton left= new JButton(new ImageIcon("img/left.png"));
		JButton righ= new JButton(new ImageIcon("img/righ.png"));;
		JButton down= new JButton(new ImageIcon("img/down.png"));;
		JButton rota= new JButton(new ImageIcon("img/rato.png"));;
		JButton stst= new JButton(new ImageIcon("img/stst.png"));;
		JButton sett= new JButton(new ImageIcon("img/sett.png"));;
		JButton logi= new JButton(new ImageIcon("img/logi.png"));;
		setBounds(0, 0, 360, 600);
		setLayout(null);
		setOpaque(false);
		left.setBounds(233,255,45,45);
        righ.setBounds(278,255, 45, 45);
        down.setBounds(233,300, 45, 45);
        rota.setBounds(278,300, 45, 45);
        stst.setBounds(233,350, 90, 50);
        sett.setBounds(240,510, 48, 48);
        logi.setBounds(290,510, 48, 48);
		add(left);
		add(righ);
		add(down);
		add(rota);
		add(stst);
		add(sett);
		add(logi);
	}
	@Override
	public void paintComponent(Graphics  g) {
		//继承父类
		g.setColor(new Color(0,0,0,30));
		//主屏
		g.fillRect(15, 30, 200, 360);
		//排名区
		g.fillRect(15, 405, 200, 400);
		//右侧排版
		g.fillRect(233, 20, 105, 400);
		g.setColor(new Color(2,2,2,30));
		//得分区
		g.fillRect(233, 30, 90, 70);
		//提示区
		g.fillRect(233, 105, 90, 140);
		//操作区
		g.fillRect(233, 255, 90, 90);
		//边框
		g.setColor(Color.white);
		((Graphics2D)g).setStroke(new BasicStroke(3L));
        g.drawRect(13, 28, 204, 364);
        g.drawRect(13, 403, 204, 134);
        g.setFont(new Font("黑体",Font.PLAIN,23));
		g.setColor(Color.DARK_GRAY);
        g.drawString("得分", 240, 50);
        g.drawString("下一个", 236, 140);
        g.drawString("荣誉榜", 25, 435);    
	}
}
