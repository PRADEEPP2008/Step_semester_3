import java.util.Random;
import java.util.Scanner;

    public class RockPaperScissors {
        public static String playRound(String playerMove, String computerMove) {
            if (playerMove.equalsIgnoreCase(computerMove)) {
                return "Draw";
            }
            if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
                    (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
                    (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
                return "Player Wins";
            }
            return "Computer Wins";
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            String[] moves = {"Rock", "Paper", "Scissors"};
            int n = 5;
            String[] roundTable = new String[n];
            String[] playerMoves = new String[n];
            String[] computerMoves = new String[n];

            int wins = 0, losses = 0, draws = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Round " + (i + 1) + " - Enter your move (Rock, Paper, Scissors): ");
                String playerMove = scanner.nextLine();
                String computerMove = moves[random.nextInt(3)];

                playerMoves[i] = playerMove;
                computerMoves[i] = computerMove;

                String result = playRound(playerMove, computerMove);
                roundTable[i] = result;

                if (result.equals("Player Wins")) {
                    wins++;
                } else if (result.equals("Computer Wins")) {
                    losses++;
                } else {
                    draws++;
                }

                System.out.println("Player: " + playerMove + ", Computer: " + computerMove + " --> " + result);
            }

            System.out.println("\nFinal Summary (after " + n + " rounds)");
            System.out.println("Round | Player Move | Computer Move | Result");
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + " | " + playerMoves[i] + " | " + computerMoves[i] + " | " + roundTable[i]);
            }

            double winPercentage = ((double) wins / n) * 100.0;
            System.out.println("Wins: " + wins + " | Losses: " + losses + " | Draws: " + draws + " | Win % = " + winPercentage + "%");
            scanner.close();
        }
    }

