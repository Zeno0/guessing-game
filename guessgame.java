public class guessgame {
  // create players
    player p1;
    player p2;
    player p3;
    player p4;
    player p5;

 // strat() method for game
    public void start() {
        // initialize players
        p1 = new player();
        p2 = new player();
        p3 = new player();
        p4 = new player();
        p5 = new player();

        // these variable will have the guesses of the players
        int g1 ;
        int g2 ;
        int g3 ;
        int g4 ;
        int g5 ;

        // by default every player's guess is false
        boolean p1guess = false;
        boolean p2guess = false;
        boolean p3guess = false;
        boolean p4guess = false;
        boolean p5guess = false;

        // create a random target for players
        int target = (int) (Math.random() * 20);
        System.out.println("number which you niggas have to search is in between 0 to 19.. .. .. ..");

        while (true) {  // players are guessing until a winner is found
            System.out.println(".. the number you have to search is  " + target);

            // players makes the guess
            p1.guess();
            p2.guess();
            p3.guess();
            p4.guess();
            p5.guess();

            // printing the guess of each players
            g1 = p1.number;
            System.out.println("player 1 guessed " + g1);

            g2 = p2.number;
            System.out.println("player 1 guessed " + g2);

            g3 = p3.number;
            System.out.println("player 1 guessed " + g3);

            g4 = p4.number;
            System.out.println("player 1 guessed " + g4);

            g5 = p5.number;
            System.out.println("player 1 guessed " + g5);

            // comparing the target with guess
            if (g1 == target) {
                p1guess = true;
            }
            if (g2 == target) {
                p2guess = true;
            }
            if (g3 == target) {
                p3guess = true;
            }
            if (g4 == target) {
                p4guess = true;
            }
            if (g5 == target) {
                p5guess = true;
            }

            // break the loop if the winner is found
            if (p1guess || p2guess || p3guess || p4guess || p5guess) {
                System.out.println("we have a winner !!!!!!!!!");
                System.out.println("does player 1 got it right?        " + p1guess);
                System.out.println("does player 2 got it right?        " + p2guess);
                System.out.println("does player 3 got it right?        " + p3guess);
                System.out.println("does player 4 got it right?        " + p4guess);
                System.out.println("does player 5 got it right?        " + p5guess);

                // winner is declared
                if(p1guess == true){
                 System.out.println("Winner is the Player 1");
                }
                if(p2guess == true){
                 System.out.println("Winner is the Player 2"); 
                 }
                if(p3guess == true){
                 System.out.println("Winner is the Player 3");
                 }
                if(p4guess == true){
                 System.out.println("Winner is the Player 4"); 
                }
                if(p5guess == true){
                 System.out.println("Winner is the Player 5");
                }
                
                System.out.println("game is over ");
                break;
            } else {
                System.out.println("players will have to try again");
            }
     
        }
    } // start() method end
    // main 
    public static void main (String args[]){
        guessgame game = new guessgame();
        game.start(); // start the game
    }

}// close guessgame class
