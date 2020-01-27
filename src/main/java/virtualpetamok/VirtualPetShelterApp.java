package virtualpetamok;

import java.util.Scanner;


public class VirtualPetShelterApp {
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 String petName;
		 
		 Cat joey = new Cat("Joey", "looks like he's seen better days.", 83, 34, 23, 43, 23);
		 Dog johnny = new Dog("Johnny", "is a bit nervous.", 69, 49, 2, 47, 26);
		 RoboticPet dee = new RoboticPet("Dee dee", "probably didn't start with that many legs", 49, 18, 25);
		 RoboticPet tommy = new RoboticPet("Tommy", "smells like a Stargazer lily fresh with morning dew", 49, 19, 37);
		 
		 VirtualPetShelter columbus = new VirtualPetShelter();
		 
		 columbus.addVirtualPet(joey);
		 columbus.addVirtualPet(johnny);
		 columbus.addVirtualPet(dee);
		 columbus.addVirtualPet(tommy);
		 
		 int choice;

		 System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!");
		 System.out.println("");
		 System.out.println("This is the status of your pets");
		 System.out.println("");
			
		 System.out.println("  Name   |Hunger |Thirst |Boredom|Health |Happy  |Oil ");
		 System.out.println("-------- |------ |------ |------ |------ |------ |------");
		 columbus.displayAll();
		 
		 do {
			 
			 System.out.println("");
			 System.out.println("What would you like to do next?");
			 System.out.println("");
				
			 System.out.println("1. Feed the pets");
			 System.out.println("2. Water the pets");
			 System.out.println("3. Play with a pet");
			 System.out.println("4. Walk all dogs");
			 System.out.println("5. Clean dog cages");
			 System.out.println("6. Clean the shelter litter box");
			 System.out.println("7. Oil all robotic pets");
			 System.out.println("8. Adopt a pet");
			 System.out.println("9. Admit a pet");
			 System.out.println("10. Quit");
			 System.out.println("");
				
			 choice = input.nextInt();
			 System.out.println("");
				
				
			 if(choice == 1) {
				 System.out.println("You feed all the pets");
				 columbus.feedAll();
			 }
				
			 else if(choice == 2) {
				 System.out.println("You watered all the pets");
				 columbus.waterAll();
			 }
				
			 else if(choice == 3) {
				 System.out.println("Ok, so you'd like to play with a pet. PLease choose one:");
				 System.out.println("");
				 columbus.displayTwo();
				 System.out.println("");
				 System.out.println("Which pet would you like to play with?");
				 input.nextLine();
				 petName = input.nextLine();
				 columbus.playWithPet(petName);
				 System.out.println("Ok, you play with " + petName);
			 }
			 
			 else if(choice == 4) {
				 System.out.println("You walk all dogs");
				 columbus.walkAll();
			 }
			 
			 else if(choice == 5) {
				 System.out.println("You clean all dog cages");
				 columbus.cleanAllCages();
			 }
			 
			 else if(choice == 6) {
				 System.out.println("You clean all shelter litter box");
				 columbus.emptyLitterBox();
			 }
			 
			 else if(choice == 7) {
				 System.out.println("You oil all robotic pets");
				 columbus.oilAll();
			 }
			 
				
			 else if(choice == 8) {
				 System.out.println("Which pet would you like to adopt?");
				 System.out.println("");
				 columbus.displayTwo();
				 System.out.println("");
				 input.nextLine();
				 petName = input.nextLine();
				 columbus.adopt(petName);
			 }
				
			 else if(choice == 9) {
				 System.out.println("Please Enter the pet's information at minimum the pet's name and description.");
				 System.out.println("Enter the pets name");
				 input.nextLine();
				 String name = input.nextLine(); 
				 System.out.println("");
				 System.out.println("Enter the pets description");
				 String description = input.nextLine(); 
				 System.out.println("");
				 
				 System.out.println("Enter c/C for Cat, d/D for Dog and r/R for robotic pet.");
				 String type = input.nextLine();
				 System.out.println("");
				 
				 System.out.println("Do you want to enter extra information? Enter y/Y for Yes");
				 String option = input.nextLine();
				 System.out.println("");
				 
				 if((option.equals("y") || option.equals("Y")) && (type.equals("c") || type.equals("C") || type.equals("d") || type.equals("D"))) {
					 System.out.println("Enter the pets hunger");
					 int hunger = input.nextInt(); 
					 System.out.println("");
					 
					 System.out.println("Enter the pets thirst");
					 int thirst = input.nextInt(); 
					 System.out.println("");
					 
					 System.out.println("Enter the pets boredom");
					 int boredom = input.nextInt(); 
					 System.out.println("");
					 
					 System.out.println("Enter the pets health");
					 int health = input.nextInt(); 
					 System.out.println("");
					 
					 System.out.println("Enter the pets happiness");
					 int happiness = input.nextInt(); 
					 System.out.println("");
					 
					 if(type.equals("c") || type.equals("C")) {
						 columbus.addVirtualPet(new Cat(name, description, hunger, thirst, boredom, health, happiness));
					 }
					 else {
						 columbus.addVirtualPet(new Dog(name, description, hunger, thirst, boredom, health, happiness));
					 }
				 }
				 
				 else if ((option.equals("y") || option.equals("Y")) && (type.equals("r") || type.equals("R"))) {
					 System.out.println("Enter the pets health");
					 int health = input.nextInt(); 
					 System.out.println("");
					 
					 System.out.println("Enter the pets happiness");
					 int happiness = input.nextInt(); 
					 System.out.println("");
					 
					 System.out.println("Enter the pets oil");
					 int oil = input.nextInt(); 
					 System.out.println("");
					 
					 columbus.addVirtualPet(new RoboticPet(name, description, health, happiness, oil));
				 }
				 
				 else
				 {
					 if(type.equals("c") || type.equals("C")) {
						 columbus.addVirtualPet(new Cat(name, description));
					 }
					 
					 if(type.equals("d") || type.equals("D")) {
						 columbus.addVirtualPet(new Dog(name, description));
					 }
					 
					 if(type.equals("r") || type.equals("R")) {
						 columbus.addVirtualPet(new RoboticPet(name, description));
					 }
					 
				 }
				 
				 System.out.println(""); 
			 }
				
			 else if(choice == 10) {
				 System.out.println("Quit");
				 System.out.println("");
			 }
				
			 else {
				 System.out.println("Please enter between 1 and 10");
			 }
				
			 System.out.println("");
			 System.out.println("********** Tick Update **********");
			 columbus.tick();
			 System.out.println("  Name   |Hunger |Thirst |Boredom|Health |Happy  |Oil ");
			 System.out.println("-------- |------ |------ |------ |------ |------ |------");
			 columbus.displayAll();
			 System.out.println("*********************************");
			 
			 columbus.petStateAll();
			 columbus.cageCleanliness();
			 columbus.litterBoxCleanliness();
			 columbus.oilLevel();
			 
			 
		 	} while (choice != 10); 

	}

}
