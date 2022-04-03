/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

/**
 *
 * @author Muhammad Fadhil
 */
public class Square extends Rectangle {
	public Square(double side) {
		super(side, side);
	}
	
	@Override
	public double getArea() {
		return super.getArea();
	}
	
	@Override
	public double getPerimeter() {
		return super.getPerimeter();
	}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public void setLength(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public String toString() {
		return "A square with side=" +super.getWidth()+ 
				", which is a subclass of " +super.toString();
	}
}
