// Create a player class which acts as a player in the gussing game.
public class player {
    int number;  // number guessed by the player
    
    // player makes a guess for the the target number 
    public void guess(){
        
        number= (int) (Math.random()*20);
        System.out.println("I am guessing number ..."+ number );
    }
    
}