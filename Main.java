import java.util.Scanner;
import java.util.Random;
class game {
    public static void main(String[] args) {
        System.out.println("Welcome to a game of Rock Papper Scissors, by Luqman Mohamed");
        Scanner mread = new Scanner(System.in);
        boolean tr=true;
        Random rand = new Random();
        int compscore=0,userscore=0, x, y;
        String[] game= {"Rock", "Paper", "Scissor"};
        while(tr) {
            System.out.println("1. To play the game");
            System.out.println("2. To see the rules");
            System.out.println("3. To see the score");
            System.out.println("4. To quit");
            String line = mread.nextLine();
            switch(line.charAt(0)) {
                case '1':
                int wincomp=0, winuser=0;
                for(;wincomp!=3&&winuser!=3;) {
                    System.out.println("Choose one of these");
                    System.out.println(" 1. Rock");
                    System.out.println(" 2. Paper");
                    System.out.println(" 3. Scissor");
                    line=mread.nextLine();
                    y=Integer.valueOf(line);
                    x=rand.nextInt(3)+1;
                    System.out.println("Computer has chosen "+game[x-1]+ ", you have chosen "+game[y-1]);
                    switch((3+x-y)%3) {
                        case 2:
                        System.out.println(" You win this round");
                        winuser++;
                        break;
                        case 1:
                        System.out.println(" Coputer win this round");
                        wincomp++;
                        break;
                        case 0:
                        System.out.println(" this round is a tie");
                        break;
                    }
                }
                if(winuser>wincomp) {
                    System.out.println("You win!");
                    userscore++;
                }
                else
                {
                    System.out.println("Computer wins!");
                    compscore++;
                }
                break;
                case '2':
                System.out.println("The game of Rock Papper Scissor is a 3 round game");
                System.out.println("For each round either player can choose between, paper, rock, and scissor");
                System.out.println("Scissors beats papper, Papper beats rock, and rock beats scissor");
                System.out.println("If the same item is chosen for both players, it is a tie, and the round will repeat.");
                break;
                case '3':
                System.out.println("Computer Score: "+compscore+"       User Score: "+userscore);
                break;
                case '4':
                mread.close();
                tr=false;
                break;
            }
        }
    }
}

