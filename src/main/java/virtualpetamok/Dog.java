package virtualpetamok;

public class Dog extends VirtualPet implements OrganicPet {
	
	private int hunger;
	private int thirst;
	private int boredom;
	private int waste = 20;
	
	@Override
	public int getHunger() {
		return hunger;
	}
	
	@Override
	public int getThirst() {
		return thirst;
	}
	
	@Override
	public int getBoredom() {
		return boredom;
	}
	
	@Override
	public int getWaste() {
		return waste;
	}
	
	public Dog(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Dog(String name, String description, int hunger, int thirst, int boredom, int health, int happiness) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom; 
		this.name = name;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
	}

	public void cleanCage() {
		health = health + 10;	
		waste = 0;
	}
	
	@Override
	public void petState() {
		if(thirst > 30 || hunger > 30 || happiness < 15)
		{
			health = health - 7;
		}
	}
	
	public void walkDog() {
		happiness = happiness + 3;
		waste = waste - 1;
	}
	
	@Override
	public void feed() {
		hunger = hunger - 10;
		thirst = thirst + 8;
		happiness = happiness + 3;
		health = health + 5;
	}
	
	@Override
	public void water() {
		thirst = thirst - 15;
		hunger = hunger - 2; 
		happiness = happiness + 1;
		health = health + 3;
	} 
	
	@Override
	public void play() {
		boredom = boredom - 13;
		thirst = thirst + 5;
		hunger = hunger + 3;
		happiness = happiness + 5;
		health = health + 2;
	}
	
	// used the alternative which includes creating accessor_methods
	@Override
	public void tick() {
		hunger = hunger + 8;
		thirst = thirst + 9;
		boredom = boredom + 6;
		happiness = happiness + 2;
		health = health - 2;
		waste = waste + 9;
		happiness = happiness - 3;
	}

}
