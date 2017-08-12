/**
 * Triangle.java
 * Compiled on 12th Aug 2017
 */
package session52;
/**
 * 
 * This class will illustrate the child class Triangle which will inherit the properties of abstract class Figure.If child class is declared as abstract , then it cannot be instantiated.
 * 
 * A child class will provide Implementation for all the abstract methods of parent class and can access the parent methods as well.
 * 
 * @author Chhaya yadav
 *
 */
//Child class declaration  inheriting the Abstract class

public class Triangle extends Figure {
	
//parameterized constructor declaration	with two arguments
	
	public Triangle(double height , double base)
	
	{
		dim1 = height ;
		
		dim2 = base ;
	}

//parameterized constructor declaration with three arguments
	
	public Triangle(double side1 , double side2 , double side3){
		
		dim1 = side1 ;
		
		dim2 = side2 ;
		
		dim3 = side3 ;
	}
	
//Implementation of Abstract method of Parent Abstract Class	
	
    public void findArea(){
    	
    	area = (dim1 * dim2 )/2  ;
    	   	
    	System.out.println( "Area of TRIANGLE is :" + area);
    	
    	System.out.println("________________________________________________");
    }
    
//Implementation of Abstract method of Parent Abstract Class    
	
	public void findPerimeter(){
		
		peri = dim1  + dim2 + dim3 ;
		
		System.out.println("Perimeter of TRIANGLE is :" + peri);
		
	   	System.out.println("________________________________________________");
		
	}


}
