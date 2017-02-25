The program builds on Game Of Life, Exercise 43, Week 11, Helsinki University's MOOC on Object Oriented Programming.
The additional features are that it is animated and runs automatically. The logic of the game is as follows:
- Every living cell turns to waiting if it has less than two living neighbours.
- Every living cell keeps on living during the following iteration (i.e. turn) if it has two or three living neighbours.
- Every living cell turns to waiting if it has more than three living neighbours.
- Every waiting cell is turned back to life if it has exactly three living neighbours.
