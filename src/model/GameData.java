package model;

public class GameData {
	
	static Blocks[] BLOCKS=new Blocks[] {
			Blocks(new int[] {-1,0,1,1},new int[] {0,0,0,1}),
			Blocks(new int[] {-1,0,1,2},new int[] {0,0,0,0}),
			Blocks(new int[] {-1,-1,0,1},new int[] {0,1,0,1}),
			
	};
/**
 * 偏移量
 */
	public int x;
	public int y;
	public GameData() {
	     x=4;
	     y=0;
	}
	private static Blocks Blocks(int[] is, int[] is2) {
		// TODO 自动生成的方法存根
		return null;
	}
	public void move(boolean isH,int step) {
		if(isH) {
			x +=step;
		}else {
			y +=step;
		}
	}
}
