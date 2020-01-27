package virtualpetamok;

public abstract class VirtualPet {
	
	protected int health;
	protected int happiness;
	protected String name;
	protected String description;
	
	public int getHealth() {
		return health;
	}
	
	public int getHappiness() {
		return happiness;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void decreaseHealth() {
		health = health - 8;
	}
	
	public abstract void petState();
	
	public abstract void play();
	
	public abstract void tick();

}
