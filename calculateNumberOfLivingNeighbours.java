public class calculateNumberOfLivingNeighbours {

/*Three separate methods for checking the position of each cell instead of using one method 
that implements "!=null" checks for the neighbouring cells. 
The total number of checks through such three methods is less than the total checks 
through one method with "!=null" checks, provided that the playing field has sides 
equal or greater than 5 and the methods are implemented in the following order:
1. public int MiddleArea (...);
2. public int BordersWithoutCorners (...);    
3. public int Corners (...);*/
    public int Corners(int x, int y, boolean[][] table) {
        int counter = 0;
        if (x == 0 && y == 0) {
            if (table[x][y + 1] == true) {
                counter++;
            }
            if (table[x + 1][y] == true) {
                counter++;
            }
            if (table[x + 1][y + 1] == true) {
                counter++;
            }
        } else if (x == table.length - 1 && y == table[x].length - 1) {
            if (table[x][y - 1] == true) {
                counter++;
            }
            if (table[x - 1][y] == true) {
                counter++;
            }
            if (table[x - 1][y - 1] == true) {
                counter++;
            }
        } else if (x == 0 && y == table[x].length - 1) {
            if (table[x][y - 1] == true) {
                counter++;
            }
            if (table[x + 1][y] == true) {
                counter++;
            }
            if (table[x + 1][y - 1] == true) {
                counter++;
            }
        } else if (x == table.length - 1 && y == 0) {
            if (table[x][y + 1] == true) {
                counter++;
            }
            if (table[x - 1][y] == true) {
                counter++;
            }
            if (table[x - 1][y + 1] == true) {
                counter++;
            }
        }
        return counter;
    }

    public int BordersWithoutCorners(int x, int y, boolean[][] table) {
        int counter = 0;
        if (y > 0 && y < table[x].length - 1) {
            if (x == 0) {
                if (table[x][y - 1] == true) {
                    counter++;
                }
                if (table[x][y + 1] == true) {
                    counter++;
                }
                if (table[x + 1][y - 1] == true) {
                    counter++;
                }
                if (table[x + 1][y + 1] == true) {
                    counter++;
                }
                if (table[x + 1][y] == true) {
                    counter++;
                }
            } else if (x == table.length - 1) {
                if (table[x][y - 1] == true) {
                    counter++;
                }
                if (table[x][y + 1] == true) {
                    counter++;
                }
                if (table[x - 1][y - 1] == true) {
                    counter++;
                }
                if (table[x - 1][y + 1] == true) {
                    counter++;
                }
                if (table[x - 1][y] == true) {
                    counter++;
                }
            }
        } else if (x > 0 && x < table.length - 1) {
            if (y == 0) {
                if (table[x - 1][y] == true) {
                    counter++;
                }
                if (table[x + 1][y] == true) {
                    counter++;
                }
                if (table[x - 1][y + 1] == true) {
                    counter++;
                }
                if (table[x + 1][y + 1] == true) {
                    counter++;
                }
                if (table[x][y + 1] == true) {
                    counter++;
                }
            } else if (y == table[x].length - 1) {
                if (table[x - 1][y] == true) {
                    counter++;
                }
                if (table[x + 1][y] == true) {
                    counter++;
                }
                if (table[x - 1][y - 1] == true) {
                    counter++;
                }
                if (table[x + 1][y - 1] == true) {
                    counter++;
                }
                if (table[x][y - 1] == true) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int MiddleArea(int x, int y, boolean[][] table) {
        int counter = 0;

        if (x > 0 && x < table.length - 1 && (y > 0 && y < table[x].length - 1)) {
            if (table[x][y - 1] == true) {
                counter++;
            }
            if (table[x][y + 1] == true) {
                counter++;
            }
            if (table[x - 1][y] == true) {
                counter++;
            }
            if (table[x + 1][y] == true) {
                counter++;
            }
            if (table[x - 1][y - 1] == true) {
                counter++;
            }
            if (table[x + 1][y - 1] == true) {
                counter++;
            }
            if (table[x - 1][y + 1] == true) {
                counter++;
            }
            if (table[x + 1][y + 1] == true) {
                counter++;
            }
        }
        return counter;
    }
}
