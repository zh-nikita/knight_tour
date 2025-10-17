# knight_tour

A simple implementation of the Knight's Tour problem in Java using recursion and backtracking.

The program lets the user choose a starting position for the knight on a 6×6 chessboard, 
then recursively explores all possible knight moves until it finds a valid path that covers all 36 squares.


// How It Works

The algorithm uses recursion to explore every valid move of the knight and backtracking to undo moves that lead to dead ends.

Main Steps:
1. Mark the starting position with 1.
2. For each possible knight move:
   - If the cell is inside the board and not visited, mark it with the current move number.
   - Recursively continue to the next move.
   - If no valid move is found, backtrack (set the cell back to 0).
3. Stop when all 36 squares are filled.


// Concepts Used

- Recursion  
- Backtracking  
- 2D arrays  
- Input handling with Scanner


// How to Run

1. Compile:
   javac Main.java

2. Run:
   java Main

3. Enter the starting row and column (1–6).



