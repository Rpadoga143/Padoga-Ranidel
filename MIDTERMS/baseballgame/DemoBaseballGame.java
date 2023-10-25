package baseballgame;

import java.util.Scanner;

public class DemoBaseballGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        BaseballGame baseballGame = new BaseballGame();

        System.out.print("Please enter the name of the first team >> ");
        baseballGame.setTeamName(0, scan.nextLine());

        while (count < 9) {
            System.out.print("Please enter the score of team 1 for inning #" + (count + 1) + " >> ");
            baseballGame.setScores(0, count, scan.nextInt());
            scan.nextLine(); // Consume the newline character
            count++;
        }

        count = 0;
        System.out.print("Please enter the name of the second team >> ");
        baseballGame.setTeamName(1, scan.nextLine());
        

        while (count < 9) {
            System.out.print("Please enter the score of team 2 for inning #" + (count + 1) + " >> ");
            baseballGame.setScores(1, count, scan.nextInt());
            scan.nextLine(); // Consume the newline character
            count++;
        }
    }
}