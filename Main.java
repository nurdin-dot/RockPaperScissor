import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //import methods
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        //text 
        System.out.print("Use char:\n   S: scissor,\n   R: rock,\n   P: paper.\n\n");

        /**
         * computer 
         * 1 = rock
         * 2 = paper
         * 3 = scissor
         */

        int compScore = 0;
        int playerScore = 0;

        boolean running = true;

        while(running) {

            //computer random int
            int comp = random.nextInt(3) + 1;

            //player input
            System.out.print("Enter Character => ");
            String player = scanner.nextLine();
            player.toLowerCase();
        
            //logic
            if(player.equals("r")) {
                if(comp == 2) {
                    System.out.println("Computer chose paper, Player LOSE!\n");
                    compScore += 1;
                } else if (comp == 3) {
                    System.out.println("Computer chose scissors, Player WIN\n");
                    playerScore += 1;
                }else if (comp == 1) {
                    System.out.println("Computer chose rock, DRAW\n");
                }
            }
            else if(player.equals("p")) {
                if(comp == 2) {
                    System.out.println("Computer chose paper, DRAW!\n");
                } else if (comp == 3) {
                    System.out.println("Computer chose scissors, Player LOSE\n");
                    compScore += 1;
                }else if (comp == 1) {
                    System.out.println("Computer chose rock, Player WIN\n");
                    playerScore += 1;
                }
            }
            else if(player.equals("s")) {
                if(comp == 2) {
                    System.out.println("Computer chose paper, Player WIN!\n");
                    playerScore += 1;
                } else if (comp == 3) {
                    System.out.println("Computer chose scissors, DRAW\n");
                }else if (comp == 1) {
                    System.out.println("Computer chose rock, Player LOSE!\n");
                    compScore += 1;
                }
            } else {
                System.out.println("Invalid Input\n");
            }

            //stop the while loop
            if (compScore == 3 || playerScore == 3) {
                running = false;
            }

        }// while 

        System.out.println("Player score: " + playerScore);
        System.out.println("Computer score: " + compScore);

        if(playerScore > compScore) {
            System.out.println("Player WIN!\n");
        }else if (playerScore < compScore) {
            System.out.println("Computer WIN!\n");
        }

    }

}