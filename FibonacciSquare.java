package homework4;

import java.awt.Color;
import java.awt.Graphics;

public class FibonacciSquare extends AbstractShape{
	private int  quadrant, n;
	
	/**
	 * Constructs a Fibonannci square given its location, its color, its quadrn
	 * 
	 * @param x			are the coordinates of the location of square.
	 * @param y			are the coordinates of the location of square.
	 * @param c			is the color of the square and the arc
	 * @param quadrant	is the corresponding quadrant of the arc.
	 * @param n			nth fibonacci number    F[n] = F[n-1] + F[n-2]
	 * 
	 */
	public FibonacciSquare(int x, int y, Color c, int quadrant, int n){
		super(x, y,n, c);
		this.x = x;
		this.y=y;
		this.c=c;
		this.quadrant = quadrant;
		this.n =n;
		innerShape = new Shape [1];
		
	}
	/**
	 * Draws the Shape into the graphic.
	 * Instead of creating a new method to adjust the square the arc holds
	 * We adjusted within the draw method.
	 */
	
	@Override
	public void draw(Graphics g) {
//		if(innerShape[0]==null){
//			draw(g);
//		}
//		for(int i=0; i<innerShape.length; i++){
//			innerShape[i].draw(g);
//		}
			switch(quadrant){
			//Quadrant 1.
			case 1:
				g.setColor(c);
				g.drawRect(x+n/2, y, n/2, n/2);
				g.drawArc(x, y, n, n, 0, 90);
				break;
				//Quadrant 2;
			case 2:
				g.setColor(c);
				g.drawRect(x, y, n/2, n/2);
				g.drawArc(x, y, n, n, 90, 90);
				break;
				//Quadrant 3!
			case 3:
				g.setColor(c);
				g.drawRect(x, y+n/2, n/2, n/2);
				g.drawArc(x, y, n, n, 180, 90);
				break;
				//Quadrant 4!
				case 4:
				g.setColor(c);
				g.drawRect(x+n/2, y+n/2, n/2, n/2);
				g.drawArc(x, y, n, n, 270,90);
				break;
			}

	}
	public boolean createInnerShapes(){
		if(n >150){
			return false;
		}
		if(innerShape[0]==null){
			innerShape[0] = new FibonacciSquare(x,y,c, quadrant, n);
			return true;
		}
		for(int i=0; i<innerShape.length;i++){
			n-= (int)(n*.9);
			x+=(int)(x*.9);
			y=(int)(y*.9);
			innerShape[i]= new FibonacciSquare(x,y,c,quadrant,n);
			
		}
		return true;
	}
	
//	public int getNumberShapes(){
//		if(innerShape[0]==null){
//			return 0;
//		}
//		else{
//			for(int i=0; i<innerShape.length; i++){
//				
//				return 1 + innerShape[i];
//			}
//			
//		}
//	}

}
