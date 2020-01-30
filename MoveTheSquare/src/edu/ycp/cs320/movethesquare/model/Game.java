package edu.ycp.cs320.movethesquare.model;

public class Game {
	public static final double MOVE_DIST = 2.0; // x/y distance square moves each tick 
	private double height, width, radius;
	private Square square;
	private Circle circle;
	
	private double squareDx, circleDx;
	private double squareDy, circleDy;
	
	public Game() {
		
	}
	
	public void setSquare(Square square) {
		this.square = square;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public Square getSquare() {
		return square;
	}
	
	public Circle getCircle() {
		return circle;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setSquareDx(double squareDx) {
		this.squareDx = squareDx;
	}
	
	public double getSquareDx() {
		return squareDx;
	}
	
	public void setCircleDx(double circleDx) {
		this.circleDx = circleDx;
	}
	
	public double getCircleDx() {
		return circleDx;
	}
	
	public void setSquareDy(double squareDy) {
		this.squareDy = squareDy;
	}
	
	public double getSquareDy() {
		return squareDy;
	}
	
	public void setCircleDy(double circleDy) {
		this.circleDy = circleDy;
	}
	
	public double getCircleDy() {
		return circleDy;
	}
	
	
}
