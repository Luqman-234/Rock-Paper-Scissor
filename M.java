import java.util.Scanner;
class game {
    public static void M(String[] args) {
        System.out.println("Welcome to a game of Rock Papper Scissors, by Luqman Mohamed");
        Scanner mread = new Scanner(System.in);
        boolean tr=true;
        int compscore=0,userscore=0;
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
                    System.out.println();
                }
                break;
                case '2':

                break;
                case '3':

                break;
                case '4':
                mread.close();
                tr=false;
                break;
            }
        }
    }
}