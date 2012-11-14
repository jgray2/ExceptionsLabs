
package lab3;

/**
 *
 * @author Jenni
 */
public class InvalidNameException extends IndexOutOfBoundsException {
    public static final String MSG = "Incorrect name format.  Must have a space"
            + " between first and last name.";
    
    @Override
    public String getMessage() {
        return MSG;
    }
    
    @Override
    public String getLocalizedMessage() {
        return MSG;
    }
    
    @Override
    public String toString() {
        return MSG;
    }
}
