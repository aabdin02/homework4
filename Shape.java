package homework4;

import java.awt.Graphics;

public interface Shape{
	/**
	 * This interface is implemented by AbstractShape.
	 * @param g
	 */
	//Every Shape must be able to draw.
	void draw(Graphics g);
	//Add level or reduce level.
	void addLevel();
	void removeLevel();
	boolean createInnerShapes();
	
	
}
