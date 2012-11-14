/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author jgray2
 */
public class MandatoryFieldException extends IllegalArgumentException {
    public static final String MSG = "Field is required";
    
    public MandatoryFieldException() {
        super();
    }
    
    public MandatoryFieldException(String msg){
        super(MSG);
    }
    
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
