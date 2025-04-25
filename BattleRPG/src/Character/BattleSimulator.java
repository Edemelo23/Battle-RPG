package Character;

/**
 * This program is the Harry Potter Battle Simulator 
 * @author Ema Murata, COSC 1437, 03/22/2024
 */

//import
import java.util.Random;
public class BattleSimulator {
	public static void main(String[] args) {
		//create Random
		Random rnd = new Random();
		
		//create player1 and player2 with their (strength,speed,name)
		Character p1 = new Character(2, 3, "Dobby", 50);
                        Character p2 = new Character(3, 2, "Dumbledore", 50);
    
                        //start a duel
     		System.out.println("It's a duel to the death. Let's welcome our opponents:");
    	 	System.out.println(p1.getName() + " and " + p2.getName());
     		System.out.println("Let the battle commence!");
     		System.out.println("***************************************");
    
     //loop until either or both of characters run out of health
     while(p1.getCurrentHealth() > 0 && p2.getCurrentHealth() > 0) {
     	
     	//random to decide whether to attack or to heal
     	int attackOrHeal1 = rnd.nextInt(10);
     	int attackOrHeal2 = rnd.nextInt(10);
     	
     	//70% chance to attack and 30% chance to heal
     	//attack the opponent or heal themselves, and display that information
     	if(attackOrHeal1 < 7) {
     		int damage = p1.attack();
     		p2.takeDMG(damage);
             System.out.println(p1.getName() + " chooses to attack and inflicts " + damage + " damage.");
     	}
     	else {
     		int heal = p1.heal();
             System.out.println(p1.getName() + " chooses to heal. They gained " + heal + " health.");
     	}
     	
     	if(attackOrHeal2 < 7) {
     		int damage = p2.attack();
     		p1.takeDMG(damage);
             System.out.println(p2.getName() + " chooses to attack and inflicts " + damage + " damage.");
     	}
     	else {
     		int heal = p2.heal();
             System.out.println(p2.getName() + " chooses to heal. They gained " + heal + " health.");
           
     	}
     	
         //display current stats
         System.out.println("-------------------");
         System.out.println("Current Status:");
         System.out.println(p1.getName() + " health remaining: " + p1.getCurrentHealth());
         System.out.println(p2.getName() + " health remaining: " + p2.getCurrentHealth());
         System.out.println("-------------------");
         System.out.println();
        
     }
     	//loop ends if either or both of characters run out of health
     	System.out.println("********************************");
     	System.out.println("The battle has ended.");
     	
     	//determine which character wins or both of them are dead
         if (p1.getCurrentHealth() <= 0 && p2.getCurrentHealth() <= 0) {
             System.out.println("Sadly, the dual has left them both dead.");
         } else if (p1.getCurrentHealth() <= 0) {
             System.out.println(p2.getName() + " has emerged victorious!");
         } else {
             System.out.println(p1.getName() + " has emerged victorious!");
         }
	}
}

