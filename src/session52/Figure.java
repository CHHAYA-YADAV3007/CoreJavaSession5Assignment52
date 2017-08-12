/**
 * Figure.java
 * Compiled on 12th Aug 2017
 */
package session52;
/**
 * 
 * This class will illustrate the abstract class Figure and its methods may or may not be abstracts. Constructor can be declared for this class but it cannot be instantiated.
 * 
 * A child will provide Implementation for all the abstract methods of parent class and can access the parent methods as well.
 * 
 * @author Chhaya yadav
 *
 */

//Parent Class  declared as public ABSTRACT

public abstract class Figure {
	
//Member variable declaration
	
	double dim1 ;
	
	double dim2 ;
	
	double dim3 ;

	double area ;
	
	double peri ;
	
// static final variable declaration which cannot be modified
	
	public static final float pi = 3.14f ;
	
// Abstract methods  which will be implemented by child class of ABSTRACT class
	
	public abstract void findArea();
	
	public abstract void findPerimeter();
		
}
