import java.util.Random;

import javax.swing.JOptionPane;

//Elijah Hernandez
//Program where you raise and train your own Digimon
public class Main {

	public static void main(String[] args) {
		//Method made primarily to welcome the user and introduce them to their digimon
	

		System.out.println("Welcome Digital Trainer!");
		
		System.out.println("Let's begin!");

		System.out.println("Since you're a new trainer, I think this Digimon would be more your speed.");
		
		System.out.println("This is Koromon! He is an In-Training Digimon, but don't let his size fool you.");
		
		System.out.println("This small pink creature has a mean bite and a fiery temper.");
	
		String name = (String)JOptionPane.showInputDialog(null,
				
				"What will you call your Koromon?",
				"DigiFarm",
				2,
				null,
				null,
				"Enter your name here");
					//Used an escape to separate name and the following sentence
		System.out.println(name + "\nWhat a nice name!");
							
		System.out.println("Now that " + name + " has a name, it's time to head to the farm!");
		
		System.out.println("In the farm you can feed your Koromon, search the cave for treasures, and train your digimon.");
		
	
	        String[] options = {"Garden", "Gym", "Forest"};
	        
	        int x = JOptionPane.showOptionDialog(null, "Where would you like to go to on the farm?",
	                "Click a button",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	       
	        if (x == 0) {
	        	System.out.println("Welcome to the Garden!");}
	        
	        if (x == 1) {
	     
	        {
	        	//Used to switch the int to double methods
	        	 final double workout = 25.0;
	        	//In Java we use final keyword with variables to specify its values are not to be changed
	        		System.out.println("Welcome to the Gym!");
	        		System.out.println("Your Koromon will start a workout now!");
	        		System.out.println("Your workout is completed! You have earned the following EXP!");
	        	double gymEXP = workout;
	        	System.out.println(gymEXP);
	        }
	        }
	        
	        else {
	        	System.out.println("Welcome to the Forest!");
	        
	        	Random rand = new Random();
	        	int n = rand.nextInt(5) + 1;
	        	System.out.println(n);
	        	
	        	if (n == 1) {
	        		System.out.println("You found an EXP Potion! Raise your level by one!");}
	        	if (n == 2) {
	        		System.out.println("You found a Shiny Gem! It looks like it's worth a lot!");}
	        	if (n == 3) {
	        		System.out.println("You found a Digifruit! It has been added to your Garden!");}
	        	if (n == 4) {
	        		System.out.println("You found nothing sadly.");}
	        	
	        }
		
	}
		//A while loop that will be used to help evolve the digimon
			public static void main1(String args[]){
				int i=10;
				while(i>1) {
						System.out.println(i);
						i--;
				}
			
			
			}
			
			
			
			
			
			


}
