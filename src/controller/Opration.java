package controller;

import model.GameData;
import view.MainWin;

public class Opration {
	MainWin mainWin;
	GameData gameData;
	
	
	/**
	 * 关联视图
	 * @param mainwin
	 */
	public void setWin(MainWin mainwin) {
			this.mainWin=mainwin;
	}
/**
	 * 关联model
	 * @param gameData
	 */
	public void setData(GameData gameData) {
		this.gameData=gameData;
	}

}






