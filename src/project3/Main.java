package project3;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Main control loop
 *
 * To run in ZSH, run java -cp {PATH_TO_PROJECT}/IBCompSciPortfolio/out/production/com.ahs.IBCompSci project3.Main
 */
public class Main {
   private static Scanner scanner = new Scanner(System.in);

   public static void main(String... args){
       Board board = new Board();

       Cell.State player = Cell.State.X;
       while (board.isPlayable()){
           board.printBoard();

           System.out.println(player.value + " to play. Enter a coordinate in the form row, column");
           promptAndClaim(board, player);


           //check for a win
           Cell.State victor = board.checkForVictor();
           if(!victor.equals(Cell.State.EMPTY)){
               System.out.println(victor + " Wins!");
               break;
           }

           //switch players
           if (player.equals(Cell.State.X)) {
               player = Cell.State.O;
           } else {
               player = Cell.State.X;
           }
       }
       System.out.println("Game Over.");
   }

   private static void promptAndClaim(Board board, Cell.State player){
       try {
           String in = scanner.nextLine();
           int commaIndex = in.indexOf(',');
           if (commaIndex == -1) throw new ParseException(in, -1);

           //see converting char to int:
           //https://stackoverflow.com/questions/46343616/how-can-i-convert-a-char-to-int-in-java
           int row = in.charAt(commaIndex - 1) - '0';
           int col = in.charAt(commaIndex + 2) - '0';


           if (col < 3 && row < 3 && col >= 0 && row >= 0) {
               board.claimCell(row, col, player);
           }
           else throw new IndexOutOfBoundsException();

       } catch (ParseException | IndexOutOfBoundsException e){
           System.out.println("Failed to parse input. Try again.");

           promptAndClaim(board, player);
       } catch (CellOccupiedException e){
           System.out.println("That cell is already occupied. Try again.");

           promptAndClaim(board, player);
       }
   }
}
