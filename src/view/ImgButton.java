package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public abstract class ImgButton extends JButton {

	/**
	 * ���л�
	 */
	private static final long serialVersionUID = -8810461936838403460L;
 
	ImgButton(ImageIcon imgic){
		//����͸��
		setContentAreaFilled(false);
		//����ͼƬ
		setIcon(imgic);
		//ȥ���߿�
	}
	}
