package homework4;


import java.util.ArrayList;
import java.util.List;


public class DrawingModel  {
	/**
	 * This class holds the state of the drawing.
	 * A collection of Shapes, looks at the shapes as just having a Shape type. 
	 */
	//A List of Shapes.
	private List<Shape> shapes	= new ArrayList<Shape>();
	//A List of Views.
	private List<View> views	= new ArrayList<View>();


	/**
	 * Addes a deepCopy of the shape.
	 * @param shape   the Shape the client adds.
	 */
	public void add(Shape shape){
		
		//Add that shape to the shapes collection.
		shapes.add(shape);	
		//Update the views.
		updateViews();
	}
	
/**
 * 
 * @returns a List of Shapes in the DrawingModel.
 */
	public List<Shape> getShapes(){
		//returns a deep copy.
		
		return shapes;
	}
	
	/**
	 * Add a view to the model
	 */
	public void addView(View v){
		views.add(v);
		v.update(this);
	}
	
	/**
	 * Updates all over the views.
	 * 
	 */
	public void updateViews(){
		for(View v: views){
			v.update(this);
		}
	}
	/**
	 * Adding a level.
	 */
	public void addLevel(){
		for(Shape shape:getShapes()){
			shape.addLevel();
		}
	}
	/**
	 * Removing a level.
	 */
	public void removeLevel(){
		for(Shape shape: getShapes()){
			shape.removeLevel();
		}
	}
}
