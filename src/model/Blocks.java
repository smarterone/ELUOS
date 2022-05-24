package model;

import java.awt.Point;

public class Blocks {
   Point[] points;
   Blocks(int [] xs,int[] ys){
	   for(int i=0;i<4;i++) {
		   points[i] =new Point(xs[i],ys[i]);
		   
	   }
	   
   }
}
