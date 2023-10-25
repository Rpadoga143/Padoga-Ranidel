package baseballgame;

public class BaseballGame {
    private String[] teamNames = new String[2];
    protected int[][] scores;

    public BaseballGame() {
        scores = new int[2][9];

        for (int i = 0; i < 2; i++) { // Corrected the loop condition
            for (int j = 0; j < 9; j++) { // Corrected the loop condition
                scores[i][j] = 999;
                //scores[0][0] = 999;
                //scores[0][1] = 999;
            }
        }
    }

    // Setters
    public void setTeamName(int team, String name) {
        teamNames[team] = name;
    }

    public void setScores(int team, int index, int score) { // Changed "scores" to "score"
        if (index == 0 || (index < scores[team].length && scores[team][index - 1] != 999)) {
            scores[team][index] = score;
            if (scores[0][scores[0].length - 1] != 999 && scores[1][scores[1].length - 1] != 999) {
                calculateScore();
            }
        }
    }

    // Getters
    public String getTeamName(int index) {
        return teamNames[index]; // Corrected variable name to "teamNames"
    }

    public int getScore(int team, int index) {
        return scores[team][index];
    }

    public void calculateScore() {  
        int team1 = 0, team2 = 0;
        for (int score : scores[0]) {
            team1 += score;
        }
        for (int score : scores[1]) {
            team2 += score;
        }

        if (team1 > team2)
            System.out.println("Team 1 wins");
        else if (team2 > team1)
            System.out.println("Team 2 wins");
        else
            System.out.println("It was a tie");
    }
}