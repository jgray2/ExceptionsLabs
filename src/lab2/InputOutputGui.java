package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;
    private static final String NAME_REQ_MSG = "You must enter your full name";
    private static final String NAME_SP_MSG = "You must enter a space between"
            + " your first and last name";

    public InputOutputGui() {
        nameService = new NameService();
    }

    /**
     * starts input window
     *
     * @throws IllegalArgumentException if space is missing between names
     */
    public void startConversation() throws IndexOutOfBoundsException {
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        try {
            lastName = nameService.extractLastName(fullName);
        } catch (IndexOutOfBoundsException ibe) {
            JOptionPane.showMessageDialog(null, NAME_SP_MSG);
        }

        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);

    }
}
