/**
 * Circle.java
 * Compiled on 12th Aug 2017
 */
package session52;
/**
 * 
 * This class will illustrate the child class Circle which will inherit the properties of abstract class Figure.If child class is declared as abstract , then it cannot be instantiated.
 * 
 * A child class will provide Implementation for all the abstract methods of parent class and can access the parent methods as well.
 * 
 * @author Chhaya yadav
 *
 */
//Child class declaration inheriting the Abstract class

public class Circle extends Figure {
	
	
//parameterized constructor declaration
	
	public Circle(double dim1){
		
		this.dim1 = dim1   ;
		
	}
	
//Implementation of Abstract method of Parent Abstract Class
	
    public void findArea(){
    	
    	area  =  pi *  dim1 * dim1 ;
    	
    	System.out.println( "Area of CIRCLE is  :" + (float) area); 
    	
       	System.out.println("________________________________________________");
    	
    }
    
//Implementation of Abstract method of Parent Abstract Class   
	
	public void findPerimeter(){
		
		peri =   2 * pi * dim1 ;
		
		System.out.println("Perimeter of Circle is  :" + (float) peri);
		
	   	System.out.println("________________________________________________");
		
	}

}
