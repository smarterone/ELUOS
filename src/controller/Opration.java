package controller;

import model.GameData;
import view.MainWin;

public class Opration {
	MainWin mainWin;
	GameData gameData;
	
	
	/**
	 * ������ͼ
	 * @param mainwin
	 */
	public void setWin(MainWin mainwin) {
			this.mainWin=mainwin;
	}
/**
	 * ����model
	 * @param gameData
	 */
	public void setData(GameData gameData) {
		this.gameData=gameData;
	}

}






