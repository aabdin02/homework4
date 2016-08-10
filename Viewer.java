package homework4;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Viewer extends JPanel implements View{
	
	/**
	 * This class implements View and extends JPanel.
	 * acts as our panel where our component is. 
	 */
	private static final long serialVersionUID = 1L;
	private DrawingModel model;

	
	/**
	 * When notificed of changes in the DrawingModel,
	 *  it should draw all shapes from the model within the panel. 
	 */
	
	/**
	 * updates the model
	 */
	public void update(DrawingModel model){
		this.model= model;
		repaint();
		
	}
	/**
	 * Enables the drawing of the Shapes since it extends the JPanel.
	 */
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(model!=null){
			//ask for the shapes from the model
			//and display them
			for(Shape shape: model.getShapes()){
				shape.draw(g);
			}	
		}
	}
	
	

}
