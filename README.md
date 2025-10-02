# TicTacToe
A simple TicTacToe in java Terminal. It has the potential to be complete game. for now, I like it this way...
I made it in my free time in cse110 lab in last semester!!! Please Enjoy!

# Command-Line Tic-Tac-Toe in Java

A simple, classic game of Tic-Tac-Toe that runs in the command line. This project is a basic implementation of the game logic in Java, perfect for beginners learning the language. Two players can take turns to play on a 3x3 grid.

## Description

This program allows two players to play Tic-Tac-Toe directly from their terminal. The game board is represented by a 3x3 grid, and players take turns marking a spot on the grid. Player 1 uses 'Circle' (represented by the number `1`) and Player 2 uses 'Cross' (represented by the number `2`). The game ends when one player gets three of their marks in a row (horizontally, vertically, or diagonally), or when the board is full.

The current state of the board is printed after every move.

## Prerequisites

To compile and run this game, you need to have the following installed on your system:

  * **Java Development Kit (JDK)** - Version 8 or higher.

## How to Compile and Run

1.  **Clone the repository or download the source code.**
    If you have Git installed, you can clone the repository:

    ```bash
    git clone https://github.com/SadatanamAs/TicTacToe.git
    cd TicTacToe
    ```

    Alternatively, just save the `TicTacToe.java` file to a directory on your computer.

2.  **Open a terminal or command prompt** and navigate to the directory where you saved the `TicTacToe.java` file.

3.  **Compile the Java code:**

    ```bash
    javac TicTacToe.java
    ```

    This command will create a `TicTacToe.class` file in the same directory.

4.  **Run the game:**

    ```bash
    java TicTacToe
    ```

    The game will start, and you will see the first prompt to enter your move.

## How to Play

The game is played by two players taking turns.

1.  **The Board:** The game is played on a 3x3 grid. The rows are numbered 1 to 3, and the columns are also numbered 1 to 3.

2.  **Player Symbols:**

      * **Player 1** is 'Circle', represented by the number `1`.
      * **Player 2** is 'Cross', represented by the number `2`.
      * An empty spot on the board is represented by `0`.

3.  **Making a Move:**
    On your turn, the program will prompt you for three inputs:

      * `Enter Row no.:` Enter a number from `1` to `3`.
      * `Enter Column no.:` Enter a number from `1` to `3`.
      * `Enter 1 for Circle and 2 for Cross:` Enter `1` if you are Player 1, or `2` if you are Player 2.

4.  **Reading the Board:**
    After each move, the current state of the board will be printed to the console as three arrays. For example, a board in the middle of a game might look like this:

    ```
    [1, 0, 2]
    [0, 1, 0]
    [2, 0, 0]
    ```

5.  **Winning the Game:**
    The first player to get three of their marks in a straight line (horizontally, vertically, or diagonally) wins the game. The program will announce the winner and then terminate.

### Example Gameplay

```
Enter Row no.: 2
Enter Column no.: 2
Enter 1 for Circle and 2 for Cross: 1
[0, 0, 0]
[0, 1, 0]
[0, 0, 0]
Enter Row no.: 1
Enter Column no.: 1
Enter 1 for Circle and 2 for Cross: 2
[2, 0, 0]
[0, 1, 0]
[0, 0, 0]
Enter Row no.: 3
Enter Column no.: 3
Enter 1 for Circle and 2 for Cross: 1
[2, 0, 0]
[0, 1, 0]
[0, 0, 1]
Enter Row no.: 1
Enter Column no.: 3
Enter 1 for Circle and 2 for Cross: 2
[2, 0, 2]
[0, 1, 0]
[0, 0, 1]
Enter Row no.: 1
Enter Column no.: 2
Enter 1 for Circle and 2 for Cross: 1
Already taken
Enter Row no.: 2
Enter Column no.: 1
Enter 1 for Circle and 2 for Cross: 1
[2, 0, 2]
[1, 1, 0]
[0, 0, 1]
Enter Row no.: 1
Enter Column no.: 2
Enter 1 for Circle and 2 for Cross: 2
[2, 2, 2]
[1, 1, 0]
[0, 0, 1]
Winner is Player 2
```
