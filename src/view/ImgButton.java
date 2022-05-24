package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public abstract class ImgButton extends JButton {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -8810461936838403460L;
 
	ImgButton(ImageIcon imgic){
		//背景透明
		setContentAreaFilled(false);
		//更改图片
		setIcon(imgic);
		//去除边框
	}
	}
