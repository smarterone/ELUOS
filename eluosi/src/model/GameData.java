package model;
//俄罗斯方块的随机出现的方块
public class GameData {
    public Blocks blocks;
    static Blocks[] BLOCKS = new Blocks[]{
        new Blocks(new int[]{-1,0,1,1},new int[]{0,0,0,1}),
        new Blocks(new int[]{-1,0,1,2},new int[]{0,0,0,0}),
        new Blocks(new int[]{-1,-1,0,1},new int[]{0,1,0,0}),
    };
    /**
     * 偏移量
     */
    public int x ;
    public int y ;
    public GameData(){
        x = 0;
        y = 4;
        blocks =new Blocks(BLOCKS[1]);
    }

    public void move(boolean isH,int step){
        if(isH){
            x += step;
        }else{
            y+=step;
        }
    }
}
