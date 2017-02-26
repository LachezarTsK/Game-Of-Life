import java.awt.Graphics;

public abstract class GameOfLifeBoard {

    /* playing field width, calculated on basis of int fieldLength*/
    private int width;
    /* playing field length, calculated on basis of int fieldLength*/
    private int length;
    /* playing field board*/
    private boolean[][] board;
     /* fieldLength is used in class UserInterface to set the size 
    of the frame that displays the playing field. It is initialized here 
    in order to set the diameter of the cells in proportion
    to the size of the frame, thus setting the total number of cells, as well as 
    to set the actual size of the playing field */
    private int fieldLength;
    /*diameter of the cell*/
    private int diameter;
    private int numberOfCircesPerRow;

    public GameOfLifeBoard() {
        this.fieldLength = 800;
        this.diameter = fieldLength / 100;
        this.numberOfCircesPerRow = this.fieldLength / (this.diameter + 2);
        this.width = this.numberOfCircesPerRow;
        this.length = this.numberOfCircesPerRow;
        this.board = new boolean[width][length];
    }

    public boolean[][] getBoard() {
        return board;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.length;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public int getFieldLength() {
        return this.fieldLength;
    }

    /*the cell is turned from waiting state back to life 
    if it has exactly three living neighbours.*/
    public abstract void turnToLiving(int x, int y);

    /*the cell is truned to waiting if it has less than two living neighbours
    or more than three living neighbours*/
    public abstract void turnToWaiting(int x, int y);

    /*the cell keeps on living during the following iteration (i.e. turn) if it has
   two or three living neighbours.*/
    public abstract boolean isAlive(int x, int y);

    /*put the initial cells on the field*/
    public abstract void initiateRandomCells(double probabilityForEachCell);

    /*returns the number of living elements per cell*/
    public abstract int getNumberOfLivingNeighbours(int x, int y);

    /*sets the algorithm for calculating the next "true/false" state 
    for each elemend of the double array "board"
     */
    public abstract void manageCell(int x, int y, int livingNeighbours);

    /*sets the elements in double array "board" according to the new "true/false" 
    state for each cell*/
    public abstract void applyManageCellMethod();

    /*sets the algorithm that calculates the display of each cell
    as a circle with colour corresponding to its state*/
    public abstract void drawCirles(Graphics graphics);
}
