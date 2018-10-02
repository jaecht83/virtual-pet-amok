package virtualPetsAmok;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter pets = new VirtualPetShelter();

		System.out.println(
				"Welcome to our shelter! Our pets are going crazy. You can adopt Baker, Charlie, Delta in the dog list, MeowMeow, Michelle, and Snowfox in the cat list, and Robocat, Tank or Slacker in the Robopet list.");
		System.out.println();

		// defining pets
		OrganicDog dog1 = new OrganicDog("Baker", "12-yo dog.", 40, 50, 60, 40, 60, 10);
		OrganicDog dog2 = new OrganicDog("Charlie", "6-yo dog.", 50, 40, 50, 50, 50, 10);
		OrganicDog dog3 = new OrganicDog("Delta", "2-yo dog.", 60, 60, 60, 60, 80, 10);

		OrganicCat cat1 = new OrganicCat("MeowMeow", "A Cat with sound issues!", 50, 45, 50, 70, 40, 30);
		OrganicCat cat2 = new OrganicCat("Michelle", "A Catwoman.", 50, 40, 50, 70, 30, 30);
		OrganicCat cat3 = new OrganicCat("SnowFox", "A white cat, obviously.", 50, 40, 50, 60, 70, 30);

		RobotDog robo1 = new RobotDog("RoboCat", "A high-tech Robot.", 50, 60, 70, true);
		RobotDog robo2 = new RobotDog("Tank", "A robot that desires things like oil.", 30, 40, 60, true);
		RobotDog robo3 = new RobotDog("Slacker", "A lazy robot dog, hence the name.", 40, 40, 80, true);

		// adding pets
		pets.addPet(dog1);
		pets.addPet(dog2);
		pets.addPet(dog3);

		pets.addPet(cat1);
		pets.addPet(cat2);
		pets.addPet(cat3);

		pets.addPet(robo1);
		pets.addPet(robo2);
		pets.addPet(robo3);

		// user has to make decision here
		String userdecision = "";
		while (!userdecision.equalsIgnoreCase("Yes")) {

			System.out.println("  ***Thank you for visiting your local pet shelter***\n");
			System.out.println("  which houses dogs, cats and robotic pets.");
			System.out.println(
					"  These are the statuses of the shelter pets you are looking for; enter the appropriate number for your choice. \n");

			// I am not sure why it is not taking my "pet" instances, even though they are
			// mapped elsewhere.
			System.out.println("\t\t     **Doggies**\n");
			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom |Waste  |Happiness");
			System.out.println("--------|-------|-------|--------|-------|---------");
			for (VirtualPet name : ((VirtualPetShelter) pets).showPets()) {
				if (name instanceof OrganicDog) {
					if (((OrganicDog) name).getCageStatus() >= 70) {
						System.out.println(name.getName() + " needs his kennel cleaned out.");
						System.out.println("We need to do something about these dog kennel(s), stat!\n");
					}
				}
			}

			// cats
			System.out.println("\n\t\t    **Cats and Felines**\n");
			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom |Happiness");
			System.out.println("--------|-------|-------|--------|---------");
			System.out.println(pets.catStatus());
			System.out.println("Shelter recommends not letting the litterbox go above 100.");
			System.out.println("Nothing will happen--yet. Deal with it, as it stinks from time to time.\n");
			System.out.println("Shelter Litter Box Level: " + pets.getCleanLitterbox() + "\n");

			// robotic dogs
			System.out.println("\n\t    **Robotic Dogs**\n");
			System.out.println("Name\t|Oil\t|Maintenance |Happiness");
			System.out.println("--------|-------|--------|---------");
			System.out.println(pets.robotStatus());
			System.out.println("\nWhat would you like to do next?\n");

			System.out.println("1. Feed organic dogs & cats.");
			System.out.println("2. Water organic dogs & cats.");
			System.out.println("3. Oil & maintain robot dogs.");
			System.out.println("4. Play with a shelter pet.");
			System.out.println("5. Adopt a pet.");
			System.out.println("6. Admit a pet.");
			System.out.println("7. Clean all dog cages.");
			System.out.println("8. Clean the shelter's litter box.");
			System.out.println("9. Quit");

			String optionEntered = input.nextLine();
			if (optionEntered.equals("1")) {
				pets.feedOrganicPets();
				System.out.println("You fed all the dogs and cats in the shelter food.\n");

			} else if (optionEntered.equals("2")) {
				pets.waterOrganicPets();
				System.out.println("You gave all the dogs and cats in the shelter water.\n");

			} else if (optionEntered.equals("3")) {
				pets.oilRobots();
				System.out.println("The robopets looked a bit weak and slow.");
				System.out.println("Thanks for helping them stay well-lubricated and moving.\n");

			} else if (optionEntered.equals("4")) {
				System.out.println("\nWhich shelter pet would you like to walk today? \n");
				System.out.println("Just a reminder: ");
				System.out.println("Taking robot dogs or robopets on a walk will decrease their oil levels. \n");
				System.out.println(pets.optionNo5Display());
				String petName = input.nextLine();
				petName = petName.substring(0, 1).toUpperCase() + petName.substring(1).toLowerCase();
				pets.play(petName);
				System.out.println("You took " + petName + " for a walk to the field to play.\n");
				// I keep getting undefined method errors and I am not sure why.
			} else if (optionEntered.equals("5")) {
				System.out.println("You've chosen to adopt a pet.");
				System.out.println("Which pet would you like to adopt?\n");
				System.out.println(pets.optionNo5Display());
				String petName = input.nextLine();

				if (!pets.addPet(petName)) {
					System.out.println("This dog doesn't exist.");
				} else {
					pets.removePet(petName);
					System.out.println("Congrats on adopting your new pet! \n" + petName + "!");
				}

			} else if (optionEntered.equals("6")) {
				System.out.println("What type of pet are your surrendering?\n");
				System.out.println("Is it either a dog, cat or robopet?");
				String petDecision = input.nextLine();

				if (petDecision.equalsIgnoreCase("OrganicDog")) {
					System.out.println("Enter the name of your dog being surrendered: ");
					String newPetName = input.nextLine();

					System.out.println("Enter a description for your dog being surrendered: ");
					String newPetDescription = input.nextLine();

					pets.addPet(new OrganicDog(newPetName, newPetDescription, 50, 50, 50, 50, 50, 0));
					System.out.println("Your dog will definitely miss you.");
					System.out.println("Thanks for admitting your dog, instead of discarding your Dog elsewhere...\n");

				} else if (petDecision.equalsIgnoreCase("OrganicCat")) {
					System.out.println("Enter the name of the cat being given up: ");
					String newPetName = input.nextLine();

					System.out.println("Enter a description for the cat being given up: ");
					String newPetDescription = input.nextLine();

					pets.addPet(new OrganicCat(newPetName, newPetDescription, 50, 50, 50, 50, 50, 0));
					System.out.println("Your Cat will sure miss you.");
					System.out.println("Thanks admitting your pet instead of discarding your Cat elsewhere...\n");

				} else if (petDecision.equalsIgnoreCase("Robopet/Robot dog")) {
					System.out.println("Enter the name of the robopet that you are surrendering.");
					String newPetName = input.nextLine();

					System.out.println("Enter a description for the robopet or dog being surrendered: ");
					String newPetDescription = input.nextLine();

					pets.addPet(new RobotDog(newPetName, newPetDescription, 50, 50, 50, true));
					System.out.println("Your robot will miss you.");
					System.out
							.println("Thanks for admitting your pet instead of discarding your robopet elsewhere...\n");
				}

			} else if (optionEntered.equals("7")) {
				System.out.println("Would you like to clean the shelter's kennels?");
				System.out.println("Yes or No");
				String newDecision = input.nextLine();
				if (newDecision.equalsIgnoreCase("Yes")) {
					pets.cleanAll();
					System.out.println("Thanks for cleaning these kennels!");
				} else if (newDecision.equalsIgnoreCase("No")) {
					System.out.println("Are you sure?");
					System.out.println("Some of these kennels look like they need it.\n");
				}

			} else if (optionEntered.equals("8")) {
				System.out.println("Would you like to clean the shelter's litterbox now?");
				System.out.println("Yes or No");
				String newDecision = input.nextLine();
				if (newDecision.equalsIgnoreCase("Yes")) {
					pets.getCleanLitterbox();
					System.out.println("That litterbox definitely needed it.");
					System.out.println("Thank you.\n");
				} else if (newDecision.equalsIgnoreCase("No")) {
					System.out.println("Are you sure?");
					System.out.println("It seems to be getting full...\n");
				}

			} else if (optionEntered.equals("9")) {
				System.out.println("Are you sure you wish to quit the game?");
				System.out.println("Enter Yes or No");
				userdecision = input.nextLine();

				if (userdecision.equalsIgnoreCase("Yes")) {
					System.out.println("You have quit this fun, amazing game...");

				} else {
					userdecision.equalsIgnoreCase("No");
					System.out.println("Glad you are still with us. LOL.");
					System.out.println("The pets told us they are pleased you stayed longer.\n");
				}
			}
			pets.tickPets();
		}

	}
}
