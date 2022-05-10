
/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 8.20

*/
import java.util.*;

public class DeSanti8_20 {
    // define some functions...

    // create a function that checks if there currently is a winner...
    public static boolean win_check(char[][] board, char current_player) {
        // there are four ways to win...
        // 4 verticle
        for (int rows = 0; rows < board.length - 3; rows++) {
            for (int cols = 0; cols < board[0].length; cols++) {
                if (board[rows][cols] == current_player && board[rows + 1][cols] == current_player
                        && board[rows + 2][cols] == current_player && board[rows + 3][cols] == current_player) {
                    return true;
                }
            }
        }
        // 4 horizontal
        for (int rows = 0; rows < board.length; rows++) {
            for (int cols = 0; cols < board.length - 3; cols++) {
                if (board[rows][cols] == current_player && board[rows][cols + 1] == current_player
                        && board[rows][cols + 2] == current_player && board[rows][cols + 3] == current_player) {
                    return true;
                }
            }
        }
        // diagonally up
        for (int rows = 0; rows < board.length; rows++) {
            for (int cols = 0; cols < board.length - 3; cols++) {
                if (board[rows][cols] == current_player && board[rows - 1][cols + 1] == current_player
                        && board[rows - 2][cols + 2] == current_player && board[rows - 3][cols + 3] == current_player) {
                    return true;
                }
            }
        }
        // diagonrally down
        for (int rows = 0; rows < board.length - 3; rows++) {
            for (int cols = 0; cols < board.length; cols++) {
                if (board[rows][cols] == current_player && board[rows + 1][cols + 1] == current_player
                        && board[rows + 2][cols + 2] == current_player && board[rows + 3][cols + 3] == current_player) {
                    return true;
                }
            }
        }
        return false;
    }

    // create a function that actually displays the board to the terminal...
    public static void show(char[][] board) {
        System.out.println(" 0 1 2 3 4 5 6 \n");
        for (int rows = 0; rows < board.length; rows++) {
            System.out.print('|');
            for (int cols = 0; cols < board[0].length; cols++) {
                System.out.print(board[rows][cols]);
                System.out.print('|');
            }
            System.out.println();
        }
        System.out.println('\n');
    }

    // create a function to check if the turn is valid...
    public static boolean valid_move(char[][] board, int choice) {
        // is the collumn full?
        if (board[0][choice] != ' ') {
            return false;
        }
        // in correct range?
        if (choice < 0 || choice > 6) {
            return false;
        }
        // otherwise return true
        return true;
    }

    public static void main(String[] args) {
        System.out.println("This program is a connect 4 game done via system terminal.");
        System.out.println(
                "Each turn the current player is prompted to enter a collumn to place their piece. It will be dropped into the next availble spot in the collumn if that turn is valid.");
        System.out.println("If a winner is found or 42 turns are reached, the game will end.");
        // initialize variables...
        int turn_counter = 1;
        char current_player = 'R';
        boolean running = true;

        // create a scanner for user input
        Scanner in = new Scanner(System.in);

        // create the 2d array that will represent the game board six rows seven
        // collumns
        char[][] board = new char[6][7];
        // for loops to fill the game board with ' '
        for (int rows = 0; rows < board.length; rows++) {
            for (int cols = 0; cols < board[0].length; cols++) {
                board[rows][cols] = ' ';

            }
        }
        // 'game' loop... while running is true and also less than 6*7 turns
        while (running == true && turn_counter <= 6 * 7) {
            int player_choice;
            boolean was_play_valid;
            // turn logic...
            // take user input to take the turn ie which collumn to put piece in
            // check to see that this is a valid move
            // place in next empty space in the collumn
            // check to see if that is a winning move

            // run this code as long as the play last play was not valid.. ie run until a
            // valid play is made....
            do {
                show(board);
                System.out.println(current_player + " please choose a collumn to drop a chip down (0-6)");
                player_choice = in.nextInt();
                System.out.println(current_player);
                was_play_valid = valid_move(board, player_choice);
            } while (was_play_valid == false);

            // place the chip once a valid move is made...
            for (int rows = board.length - 1; rows >= 0; rows--) {
                if (board[rows][player_choice] == ' ') {
                    board[rows][player_choice] = current_player;
                    break;
                }
            }

            // if there is not a winner, keep running
            running = !win_check(board, current_player);
            // switch players
            if (current_player == 'R') {
                current_player = 'Y';
            } else {
                current_player = 'R';
            }
            // increment turn counter...
            turn_counter++;
        }
        // once this loop ends either there is a tie or a winner has been found...
        show(board);
        if (!running) {
            if (current_player == 'Y') {
                System.out.println("Red has won.");
            } else {
                System.out.println("Yellow has won.");
            }
        } else {
            System.out.println("There was a tie.");
        }
        // close scanner
        in.close();
    }
}