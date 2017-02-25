import javax.swing.SwingUtilities;

public class Run {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new PersonalBoard());
        SwingUtilities.invokeLater(ui);
    }
}
