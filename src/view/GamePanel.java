package view;

import java.awt.Graphics;

import javax.swing.JPanel;

import model.GameData;

public class GamePanel extends JPanel{
	GameData gameData;
	/**
	 * –Ú¡–ªØ
	 */
	private static final long serialVersionUID = 1860979716621182121L;

	GamePanel(GameData gameData){
		
		this.gameData=gameData;
		setOpaque(false);
		setBounds(15,30,200,300);
		
	}
	@Override
	public void paintComponent(Graphics g) {
		g.fillRect(gameData.x*20, gameData.y*20, 20, 20);
		
	}
}
