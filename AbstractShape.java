 package homework4;

import java.awt.Color;



public abstract class AbstractShape  implements Shape{
	//Location of the Shape.
	protected int x, y,size;
	//Color of the Shape.
	protected Color c;
	//Storing the children.
	protected Shape [] innerShape;
	
	/**
	 * Construcst a AbstractShape.
	 * this class holds the basics and is inherited by Shapes.
	 */
	
	public AbstractShape(int x, int y, int size, Color color){
		this.x=x;
		this.y=y;
		this.size=size;
		this.c =color;	
	}
	/**
	 * Adding level
	 */
	@Override
	public void addLevel(){
		if(innerShape[0]==null){
			innerShape[0].createInnerShapes();
		}
		
	}
	/**
	 * decreasing a level
	 */
	
	public void removeLevel(){
		
	}
	
	

}
