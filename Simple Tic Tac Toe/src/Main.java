import java.util.*;

//package tictactoe;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Elzie's Tic-Tac-Toe!");
        userInterface.getUser();

        System.out.println("Welcome " + userX.getName() + " and " + userO.getName() + "\n");
        System.out.println(
                """
                
                Here's the board, are you ready to play? 
                
                "Player X is first! Let's GO!!"
                """);

        //board.printBoard();

        System.out.println("Please select a tile.");

        gameState.gameStateX();

    }

}