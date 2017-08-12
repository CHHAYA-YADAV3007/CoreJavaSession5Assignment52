/**
 * MainClass.java
 * Compiled on 12th Aug 2017
 */
package session52;
/**
 * 
 * This class will illustrate the MainClass class for instantiation of Children Class Objects
 * 
 * A child will provide Implementation for all the abstract methods of parent class and can access the parent methods as well.
 * 
 * @author Chhaya yadav
 *
 */

public class MainClass {

//Declaration of Main method
	
	public static void main(String[] args) {
	
//Instantiation of Circle class 
		
		Circle c = new Circle(10.0) ;
		
//Calling the abstract methods by Circle child class objects
		
		c.findArea();
		
		c.findPerimeter();

//Instantiation of Rectangle class
		
		Rectangle r = new Rectangle( 10.0, 20.0 );
		
//Calling the abstract methods by Rectangle child class objects		
		
		r.findArea();
		
		r.findPerimeter();
		
//Instantiation of Triangle class t1
		
		Triangle t1 = new Triangle(6, 7) ;
		
//Calling the abstract methods by Triangle child class objects		
		
		t1.findArea();
			
//Instantiation of Triangle class	t2
		
		Triangle t2 = new Triangle(3,6,9);
		
//Calling the abstract methods by child class objects			
		
		t2.findPerimeter();
			

	}

}
