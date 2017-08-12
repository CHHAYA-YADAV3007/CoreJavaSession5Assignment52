/**
 * Rectangle.java
 * Compiled on 12th Aug 2017
 */
package session52;
/**
 * 
 * This class will illustrate the child class Rectangle which will inherit the properties of abstract class Figure.If child class is declared as abstract , then it cannot be instantiated.
 * 
 * A child will provide Implementation for all the abstract methods of parent class and can access the parent methods as well.
 * 
 * @author Chhaya yadav
 *
 */
//Child class declaration  inheriting the Abstract class

public class Rectangle extends Figure  {
	
//parameterized constructor declaration	
	
	public Rectangle(double length , double breadth ){
		
		dim1 = length ;
		
		dim2 = breadth  ;
		
	}
	
//Implementation of Abstract method of Parent Abstract Class	
	
    public void findArea(){
    	
    	area = dim1 * dim2 ;
    	
    	System.out.println( "Area of RECTANGLE is :" + area);
    	
       	System.out.println("________________________________________________");
    }
	
//Implementation of Abstract method of Parent Abstract Class
    
	public void findPerimeter(){
		
		peri = 2 * ( dim1 + dim2 ) ;
		
		System.out.println("Perimeter of RECTANGLE is :" + peri);
		
	   	System.out.println("________________________________________________");
		
	}


}
