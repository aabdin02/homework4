package homework4;

import java.awt.*;

public class HShape extends AbstractShape{
	private int size;
	/**
	 * 
	 * @param x			the coordinates of the location of the shape
	 * @param y			the coordinates of the location of the shape
	 * @param c			is the Color of HShape
	 * @param size		is the length of the side of the square that contains HShape.
	 */
	public HShape(int x, int y, Color c, int size){
		super(x, y, size, c);
		this.x = x;
		this.y = y;
		this.c =c;
		this.size = size;
		
	}
	/**
	 * This method draws HShape to the graphics. 
	 */
	@Override
	public void draw(Graphics g) {
		//Setting the color of the Shape.
		g.setColor(c);
		//Creating the first 3 squares
		g.fillRect(x, y, size, size);
		g.fillRect(x, y+size,size, size);
		g.fillRect(x, y+(2*size), size, size);
		
		//Creating the middle squares
		g.fillRect(x+size, y+size, x+size, y+size);
		
		//Creating the last 3 squares
		g.fillRect(x+ 2*size, y, size, size);
		g.fillRect(x+ 2*size,y+ size, size, size);
		g.fillRect(x+ 2*size, y+ 2*size, size, size);
		
	}
	
	public boolean createInnerShapes(){
		return true;
	}
	
	
	
	
	
		
		
	
}
