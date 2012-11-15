package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    /**
     * Start the Gui for name input
     *
     * @throws InvalidNameException if name is not formatted properly
     */
    public void startConversation() throws InvalidNameException {
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        if (fullName == null || fullName.length() == 0) {
            InvalidNameException ine1 = new InvalidNameException();
            JOptionPane.showMessageDialog(null, ine1.getMessage());
        }
        String lastName = "";
        try {
            lastName = nameService.extractLastName(fullName);
        } catch (InvalidNameException ine) {
            JOptionPane.showMessageDialog(null, ine.getMessage());
        }
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);

    }
}
