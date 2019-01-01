// autohor @Gianluca Lucchesi

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom; // Utility needed to randomize an integer

public class Exo_9_Lotto {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        int[] winningNumbers = new int[7];
        int[] playedNumbers = new int[7];
        int i = 0, n = 0, playerWinningNumber = 0, playerComplemantaryNumber = 0;

        // Loop randomizes every value of winningNumbers array
        for (i = 0; i < 7; i++ ){       // 7 is the length of winningNumber but winningNumbers.length cannot be used as it has not been initialized
            winningNumbers[i] = ThreadLocalRandom.current().nextInt(1,45 + 1);  // nextInt(min, max + 1) "+1" to make max value inclusive
        }

        // Shows every winningNumber from de winningNumbers array for testing purposes 
        System.out.print("The winning numbers are: ");
        System.out.print("{");
        for (i = 0; i < winningNumbers.length; i++){
            System.out.print(winningNumbers[i] + ",");
        }
        System.out.println("}");
        

        // everything in the do-loop because program runs until user inputs 0
        do{
            // User input to fill playedNumbers array
            System.out.println("Please choose your numbers.");
            for (i = 0; i < 7; i++){
               playedNumbers[i] = sc.nextInt();
                if (playedNumbers[i] < 1 || playedNumbers[i] > 45){
                    while (playedNumbers[i] < 1 || playedNumbers[i] > 45){
                    System.out.println("Number not in range. Please choose again.");
                    playedNumbers[i] = sc.nextInt(); 
                    } 
                 }
              // verification if entered integer already exists in playedNumbers array
              for (n = 0; n < i; n++){ 
                 if (playedNumbers[i] == playedNumbers[n]){
                        while (playedNumbers[i] == playedNumbers[n]){
                           System.out.println("Number already chosen. Please choose an other number.");
                          playedNumbers[i] = sc.nextInt();
                        }          
                    }  
                }
                 // exist loop and stop user input when 0 is entered by user
                 if (playedNumbers[i] == 0){
                    break;
                }
            }

            do {
                // rank 1
                for (i = 0; i < 6; i++){
                    for (n = 0; n < 6; n++){
                       if (playedNumbers[i] == winningNumbers[n]){
                          playerWinningNumber = playerWinningNumber+1; 
                        }
                    }
                }
                  if (playerWinningNumber >= 6){
                      System.out.println ("Rank 1 winner.");
                      break;
                      }

                // rank 2
                for (i = 0; i < 6; i++){
                    for (n = 0; n < 6; n++){
                        if (playedNumbers[i] == winningNumbers[n]){
                            playerWinningNumber = playerWinningNumber+1;
                        }
                    }
                }

                if (playedNumbers[6] == winningNumbers[6]){
                    playerComplemantaryNumber = 1;
                }

                if (playerWinningNumber >= 5 && playerComplemantaryNumber == 1){
                   System.out.println ("Rank 2 winner.");
                   break;
                }
            } while (playerWinningNumber == 0);
           

        } while (playedNumbers[i] != 0);

    }
}
