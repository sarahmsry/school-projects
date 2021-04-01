//Name: Sarah Masry
//PantherID: 002519149
//Due Date: Feb 20

import java.util.*;
import java.awt.*;
import javax.swing.JFrame;

public class hw3_task2{
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(400,400); //Creates the panel and sets size 
		panel.setBackground(Color.cyan); //Sets background color of panel
		Graphics g = panel.getGraphics();
		int x = 0;
		int y = 0;
		int size = 100; 
		int numOfCircles = 5;
		topLeft(g, x, y, size, numOfCircles);
		bottomLeft(g, x, y, size, numOfCircles);
		topRight(g, x, y, size, numOfCircles);
		bottomRight(g, x, y, size, numOfCircles); 
}
	public static void topLeft(Graphics g, int y, int x, int size, int numOfCircles) {
		y += 0;
		x += 0;
		g.setColor(Color.green);
		g.fillRect(x, y, size, size); //Creates a rectangle filled with color green
		g.setColor(Color.yellow);
		g.fillOval(x, y, size, size); //Creates an oval filled with color yellow
		g.setColor(Color.black);
		g.drawRect(x, y, size, size); //Creates a rectangle colored black to outline the original green rectangle
		//The following code draws the lines within the original rectangle 
		g.drawLine(x, y, x+size, y+size); 
		g.drawLine(x, y+size, x+size, y);
		g.drawLine(x, y+size/2, x+size, y+size/2);
		int uniform = size/numOfCircles;
		for(int i = 0; i < numOfCircles; i++){
			g.drawOval(x+uniform*i/2, y+uniform*i/2, size-uniform*i, size-uniform*i); //Creates the circles in the oval
}}
//Uses original topLeft subfigure method in a nested for-loop to create bottomLeft figure 
	public static void bottomLeft(Graphics g, int x, int y, int size, int numOfCircles) { 
		size = 24;
		numOfCircles = 4;
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				topLeft(g, 120+i*size, 10+j*size, size, numOfCircles);
}}}
//Uses original topLeft subfigure method in a nested for-loop to create topRight figure 
	public static void topRight(Graphics g, int x, int y, int size, int numOfCircles) {
		size = 40;
		numOfCircles = 5;
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				topLeft(g, 20+i*size, 150+j*size, size, numOfCircles);
}}}
//Uses original topLeft subfigure method in a nested for-loop to create bottomRight figure 
	public static void bottomRight(Graphics g, int x, int y, int size, int numOfCircles) {
		size = 36;
		numOfCircles = 3;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				topLeft(g, 275+i*size, 130+j*size, 36, 3);
}}}}