package homework4;


import java.awt.Color;

import javax.swing.*;



public class MainClass {
	

	public MainClass(){
		//creates DrawingModel such that the drawing is diplayed within JFrame
		//creates Viewer
		JFrame frame = new JFrame("Creating Shapes.");
		frame.setBackground(Color.yellow);
		
		frame.setSize(900,900);
		//Creating a model to store the shapes in.
		DrawingModel model = new DrawingModel();
		//Creating the Shapes needed. 
		//Creating the HShape.
		Shape shape = new HShape(0,0,Color.GREEN,90);
		
		//Creating the different quadrants of the FibonacciSquare.
		Shape shape1 = new FibonacciSquare(400,300,Color.RED, 1,40);
		
		//Creating JRadioButtons.
		JRadioButton decrease = new JRadioButton("Decrease Level!");
		decrease.setSelected(true);
		JRadioButton increase = new JRadioButton("Increase Level!");
		increase.setSelected(true);
		//Putting the two button together;
		ButtonGroup buttons = new ButtonGroup();
		buttons.add(increase);
		buttons.add(decrease);
		//Creating the Reset Button
		JButton reset = new JButton("Reset");
		
		
		//Creates a panel to draw the shapes to. 
		Viewer panel = new Viewer();
		//adding the buttons to the panel
		panel.add(increase);
		panel.add(decrease);
		panel.add(reset);
		//Add ActionListener to the panel
		increase.addActionListener(new ButtonListener(panel));
		decrease.addActionListener(new ButtonListener(panel));
		
		//Adding all the shapes to the model.
		model.add(shape);
		model.add(shape1);
		
		//adding the panel to the model. 
		model.addView(panel);
		frame.add(panel);
		//Making the frame visible.
		frame.setVisible(true);
		//Finally Closes;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String [] args){
		
		new MainClass();
	}
}
