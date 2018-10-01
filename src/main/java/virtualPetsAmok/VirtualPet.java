package virtualPetsAmok;

public class VirtualPet {
	private String name;
	private String description;
	private int health;
	protected int happiness;
	private int ticktime;

	// Constructor
	public VirtualPet(String name, String description, int health, int happiness) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
		this.ticktime = 0;

	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getTick() {
		return ticktime;
	}

	public void tick() {
		ticktime += 1;
	}

	public void play() {
		happiness += 10;
	}

}
