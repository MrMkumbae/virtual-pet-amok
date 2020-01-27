package virtualpetamok;

public class RoboticPet extends VirtualPet {
	
	private int oil;
	
	public int getOil() {
		return oil;
	}

	public RoboticPet(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public RoboticPet(String name, String description, int health, int happiness, int oil) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
		this.oil = oil;
	}
	
	public void oilPet() {
		health = health + 5;
		oil = oil + 8;
	}
	
	@Override
	public void petState() {
		if(happiness < 15)
		{
			health = health - 7;
		}
	}
	
	@Override
	public void play() {
		happiness = happiness + 5;
		health = health + 2;
	}
	
	@Override
	public void tick() {
		health = health - 5;
		happiness = happiness - 3;
	}

}
