package string;
import java.util.Scanner;
public class RockPaperScissors {
	    public static String getComputerChoice() {
	        int random = (int)(Math.random() * 3); // 0, 1, 2
	        if (random == 0) return "Rock";
	        else if (random == 1) return "Paper";
	        else return "Scissors";
	    }
	    public static String findWinner(String user, String comp) {
	        if (user.equals(comp)) return "Draw";
	        if ((user.equals("Rock") && comp.equals("Scissors")) ||
	            (user.equals("Paper") && comp.equals("Rock")) ||
	            (user.equals("Scissors") && comp.equals("Paper"))) {
	            return "User";
	        }
	        return "Computer";
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of games: ");
	        int games = sc.nextInt();
	        sc.nextLine(); 

	        int userWins = 0, compWins = 0, draws = 0;

	        System.out.println("\nGame\tUser\tComputer\tWinner");
	        for (int i = 1; i <= games; i++) {
	            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
	            String user = sc.nextLine();
	            String comp = getComputerChoice();
	            String winner = findWinner(user, comp);

	            if (winner.equals("User")) userWins++;
	            else if (winner.equals("Computer")) compWins++;
	            else draws++;

	            System.out.println(i + "\t" + user + "\t" + comp + "\t\t" + winner);
	        }

	        double userPercent = (userWins * 100.0) / games;
	        double compPercent = (compWins * 100.0) / games;

	        System.out.println("\nResults:");
	        System.out.println("User Wins: " + userWins + " (" + userPercent + "%)");
	        System.out.println("Computer Wins: " + compWins + " (" + compPercent + "%)");
	        System.out.println("Draws: " + draws);
	    }
	}

}
