package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;
    private static final String NAME_REQ_MSG = "You must enter your full name";
    private static final String NAME_SP_MSG = "You must enter a space between"
            + " your first and last name";

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        try {
          lastName = app.extractLastName(fullName);  
        } catch (ArrayIndexOutOfBoundsException iae){
            JOptionPane.showMessageDialog(null, NAME_SP_MSG);
        }
        
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public String extractLastName(String fullName) throws IllegalArgumentException {
        if (fullName == null || fullName.length() == 0 ) {
            JOptionPane.showMessageDialog(null, NAME_REQ_MSG);
        }
        String [] nameParts = new String [1];
        try {
            nameParts = fullName.split(" ");
        } catch (ArrayIndexOutOfBoundsException iae) {
            
        }
        return nameParts[LAST_NAME_IDX];
    }

}

    