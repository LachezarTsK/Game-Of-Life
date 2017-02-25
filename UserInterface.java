import java.awt.Container;
import java.awt.Dimension;
import javax.swing.WindowConstants;
import javax.swing.JFrame;

public class UserInterface implements Runnable {

    private JFrame frame;
    private GameOfLifeBoard gameBoard;

    public UserInterface(GameOfLifeBoard gameBoard) {
        this.gameBoard = gameBoard;
        this.gameBoard.initiateRandomCells(0.6);
    }

    public void run() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
        DrawingBoard board = new DrawingBoard(this.gameBoard);
        container.add(board);
        container.setPreferredSize(new Dimension(this.gameBoard.getFieldLength(), this.gameBoard.getFieldLength()));
    }
}
