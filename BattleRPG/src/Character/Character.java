package Character;

/**
 * This program is the character constructor for the Harry Potter Battle RPG
 * @author Elli deMelo, COSC 1437, 03/22/2024
 */

//import
import java.util.Random;
import java.util.Scanner;


public class Character {
	//declare instance variables
	private int currentHealth = 50;
	private int strength;
	private int speed;
	private String name;
	
	//import scanner
	Scanner kbd = new Scanner(System.in);
	
	
	//parameterized constructor
	public Character(int strength, int speed, String name, int currentHealth) {
		this.speed = speed;
		this.strength = strength;
		this.name = name;
		this.currentHealth = currentHealth;	
		}
	
	//getter methods:
	
	//first method - name
	public String getName() {
		return name;
	}
	
	//second method - speed
	public int getSpeed() {
		return speed;
	}
	
	//third method - strength
	public int getStrength() {
		return strength;
	}
	

	//primary methods:
	
	//first method - attack
	public int attack() {
		int dmg = 10;
		dmg += strength;
		
		//generate random chance for critical hit
		Random random = new Random();
        int criticalHit = random.nextInt(100);
		
        //10% chance of a critical hit
        if (criticalHit < 10) {
            dmg += 5;
            System.out.println("Critical Hit!");
        	}
        //return dmg
		return dmg;
        }
		
	//second method - heal
	public int heal() {
		int healAmount = 5 + (speed * 2);
		currentHealth += healAmount;
		return healAmount;
		}
	
	//third method - takeDMG
	public void takeDMG(int dmg) {
		currentHealth -= dmg;
		return;
	}
	
	public int getCurrentHealth() {
		return currentHealth;
	}
	
	    
}

