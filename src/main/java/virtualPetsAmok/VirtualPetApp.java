package virtualPetsAmok;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter pets = new VirtualPetShelter();

		System.out.println("Welcome to our shelter! Our pets are going crazy.");
		System.out.println();

		OrganicDog dog1 = new OrganicDog("Baker", "12-yo dog.", 40, 50, 60, 40, 60, 10);
		OrganicDog dog2 = new OrganicDog("Charlie", "6-yo dog.", 50, 40, 50, 50, 50, 10);
		OrganicDog dog3 = new OrganicDog("Delta", "2-yo dog.", 60, 60, 60, 60, 80, 10);

		OrganicCat cat1 = new OrganicCat("MeowMeow", "A Cat with sound issues!", 50, 45, 50, 70, 40, 30);
		OrganicCat cat2 = new OrganicCat("Michelle", "A Catwoman.", 50, 40, 50, 70, 30, 30);
		OrganicCat cat3 = new OrganicCat("SnowFox", "A white cat, obviously.", 50, 40, 50, 60, 70, 30);

		RobotDog robo1 = new RobotDog("RoboCat", "A high-tech Robot.", 50, 60, 70, true);
		RobotDog robo2 = new RobotDog("Tank", "A robot that desires things like oil.", 30, 40, 60, true);
		RobotDog robo3 = new RobotDog("Slacker", "A lazy robot dog, hence the name.", 70, 40, 80, true);

		pets.addPet(dog1);
		pets.addPet(dog2);
		pets.addPet(dog3);

		pets.addPet(cat1);
		pets.addPet(cat2);
		pets.addPet(cat3);

		pets.addPet(robo1);
		pets.addPet(robo2);
		pets.addPet(robo3);

		String userdecision = "";
		while (!userdecision.equalsIgnoreCase("Yes")) {

			System.out.println("  ***Thank you for visiting your local pet shelter***\n");
			System.out.println("  That houses dogs, cats and robotic pets.");
			System.out.println("  These are the statuses of the shelter pets you are looking for. \n");

			// I am not sure why it is not taking my "pet" instances, even though they are
			// mapped elsewhere.
			System.out.println("\t\t     **Doggies**\n");
			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom |Waste  |Happiness");
			System.out.println("--------|-------|-------|--------|-------|---------");
			for (VirtualPet VirtualPet : VirtualPet.pet()) {
				if (pet instanceof OrganicDog) {
					if (((OrganicDog) pet).getCageStatus() >= 70) {
						System.out.println(pet.getName() + " needs his kennel cleaned out.");
						System.out.println("We need to do something about these dog kennel(s), stat!\n");
					}
				}
			}

			System.out.println("\n\t\t    **Cats and Felines**\n");
			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom |Happiness");
			System.out.println("--------|-------|-------|--------|---------");
			System.out.println(pets.catStatus());
			System.out.println("Shelter recommends not letting the litterbox go above 100.");
			System.out.println("Nothing will happen--yet. Deal with it, as it stinks from time to time.\n");
			System.out.println("Shelter Litter Box Level: " + pets.cleanLitterbox() + "\n");

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
				System.out.println(pets.optionDisplay());
				String petName = input.nextLine();
				petName = petName.substring(0, 1).toUpperCase() + petName.substring(1).toLowerCase();
				pets.play(petName);
				System.out.println("You took " + petName + " for a walk to the field to play.\n");
				// I keep getting undefined method errors and I am not sure why.
			} else if (optionEntered.equals("5")) {
				System.out.println("You've chosen to adopt a pet.");
				System.out.println("Which pet would you like to adopt?\n");
				System.out.println(pets.option5Display());
				String petName = input.nextLine();

				if (!pets.doesPetRemain(petName)) {
					System.out.println("This Dog does not exist.");
				} else {
					pets.adopt(petName);
					System.out.println("Congrats on adopting your new Shelter baby: \n" + petName + "!");
				}

			} else if (optionEntered.equals("6")) {
				System.out.println("What type of pet are your surrendering?\n");
				System.out.println("Dog? Cat? Robot Dog?");
				String petDecision = input.nextLine();

				if (petDecision.equalsIgnoreCase("Dog")) {
					System.out.println("Enter the name of the Dog being surrendered: ");
					String newPetName = input.nextLine();

					System.out.println("Enter a description for the Dog being surrendered: ");
					String newPetDescription = input.nextLine();

					pets.add(new Dog(newPetName, newPetDescription, 50, 50, 50, 50, 50));
					System.out.println("Your Dog will sure miss you.");
					System.out.println("Thanks admitting your Dog instead of discarding your Dog elsewhere...\n");

				} else if (petDecision.equalsIgnoreCase("Cat")) {
					System.out.println("Enter the name of the Cat being surrendered: ");
					String newPetName = input.nextLine();

					System.out.println("Enter a description for the Cat being surrendered: ");
					String newPetDescription = input.nextLine();

					pets.add(new Cat(newPetName, newPetDescription, 50, 50, 50, 50, 50));
					System.out.println("Your Cat will sure miss you.");
					System.out.println("Thanks admitting your pet instead of discarding your Cat elsewhere...\n");

				} else if (petDecision.equalsIgnoreCase("Robot Dog")) {
					System.out.println("Enter the name of the Robot Dog that you are surrendering.");
					String newPetName = input.nextLine();

					System.out.println("Enter a description for the Robot Dog being surrendered: ");
					String newPetDescription = input.nextLine();

					pets.add(new RobotDog(newPetName, newPetDescription, 50, 50, 50));
					System.out.println("Your Robot Pet will sure miss you.");
					System.out.println("Thanks admitting your pet instead of discarding your Robot Pet elsewhere...\n");
				}

			} else if (optionEntered.equals("7")) {
				System.out.println("Would you like to clean the Dog Kennels?");
				System.out.println("Yes or No");
				String newDecision = input.nextLine();
				if (newDecision.equalsIgnoreCase("Yes")) {
					pets.cleanCage();
					System.out.println("Thanks for cleaning the Kennels!");
				} else if (newDecision.equalsIgnoreCase("No")) {
					System.out.println("Are you sure?");
					System.out.println("Some of the Kennels look like they need it.\n");
				}

			} else if (optionEntered.equals("8")) {
				System.out.println("Would you like to clean the Shelter Litter Box now?");
				System.out.println("Yes or No");
				String newDecision = input.nextLine();
				if (newDecision.equalsIgnoreCase("Yes")) {
					pets.cleanLitterbox();
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
