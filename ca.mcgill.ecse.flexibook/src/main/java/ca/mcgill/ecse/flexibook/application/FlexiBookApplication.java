/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ca.mcgill.ecse.flexibook.application;

import java.sql.Date;
import java.sql.Time;

import ca.mcgill.ecse.flexibook.model.FlexiBook;
import ca.mcgill.ecse.flexibook.model.User;



public class FlexiBookApplication {
	
	/**
	 * Indicating which user is currently in the system or can be null
	 * @author AntoineW
	 */
	private static User currentUser;
	
	private static FlexiBook flexiBook;

   
	public static void main(String[] args) {

    }
	
	
	
    public static FlexiBook getFlexiBook() {
		if (flexiBook == null) {
			
			flexiBook = new FlexiBook();
			
		}
 		return flexiBook;
	}
    
    
    /**
     * 
     * This method set the current user.
     * @author AntoineW
     */
    public static void setCurrentLoginUser(User u) {
    	currentUser = u;
    }
    
    /**
     *
     * This method is only used when the user signs out.
     * @author AntoineW
     */
    public static void clearCurrentLoginUser() {
    	currentUser = null;
    }
    
    /**
     * 
     * This method get the current user in the system
     * Controller depend on this method to know whether the user is an Owner or a Customer.
     * @author AntoineW
     */
    public static User getCurrentLoginUser() {
    	return currentUser;
    }
    
    /**
     * @author AntoineW
     */
    public static Date getCurrentDate() {
    	return new Date(System.currentTimeMillis());
    }
    
    /**
     * @author AntoineW
     */
    public static Time setCurrentTime() {
    	return new Time(System.currentTimeMillis()); 	
    }
}
