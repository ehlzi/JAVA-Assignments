//package tictactoe;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                """
                Welcome to Elzie's Tic-Tac-Toe!"
                """);
        userInterface.main();

        System.out.println(
                "Welcome " + userX.getName() + " and " + userO.getName() +
                """
                
                
                Here's the board, are you ready to play?
                Draw the board if so.
                """);
        Board.main();

        System.out.println("Who's first?");
    }

}