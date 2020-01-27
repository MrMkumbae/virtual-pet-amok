package virtualpetamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetShelterTest {
	
	VirtualPetShelter undertest = new VirtualPetShelter();
	Cat cat = new Cat("cat","",14,19,15,15,13);
	Cat cat1 = new Cat("cat1","",15,20,16,16,14);
	Dog dog = new Dog("dog","",14,19,16,16,12);
	Dog dog1 = new Dog("dog1","",15,20,17,17,13);
	RoboticPet robo = new RoboticPet("robo","",12,14,13);
	RoboticPet robo1 = new RoboticPet("robo1","",13,15,14);

	@Test
	public void shouldAddOneVirtualPet() {
		undertest.addVirtualPet(cat);
		int check = undertest.getListSize();
		
		assertEquals(1, check);
	}
	
	@Test
	public void shouldAddThreeVirtualPet() {
		undertest.addVirtualPet(cat);
		undertest.addVirtualPet(dog);
		undertest.addVirtualPet(robo);
		int check = undertest.getListSize();
		
		assertEquals(3, check);
	}
	
	@Test
	public void shouldFeedAllPets() {
		
		undertest.addVirtualPet(cat);
		undertest.addVirtualPet(dog);
		undertest.addVirtualPet(robo);
		
		undertest.feedAll(); 
		
		assertEquals(4, cat.getHunger()); 
		assertEquals(4, dog.getHunger());
	}
	
	@Test
	public void shouldWaterAllPets() {
		undertest.addVirtualPet(cat);
		undertest.addVirtualPet(dog);
		undertest.addVirtualPet(robo);	
		
		undertest.waterAll(); 
		
		assertEquals(4, cat.getThirst()); 
		assertEquals(4, dog.getThirst());
	}
	
	@Test
	public void shouldWalkAllDogs() {
		
		undertest.addVirtualPet(dog);
		undertest.addVirtualPet(dog1);
		
		undertest.walkAll();
		
		assertEquals(15, dog.getHappiness()); 
		assertEquals(16, dog1.getHappiness());
	}
	
	@Test
	public void shouldOilAllRoboticPets() {
		
		undertest.addVirtualPet(robo);
		undertest.addVirtualPet(robo1);
		
		undertest.oilAll();
		
		assertEquals(21, robo.getOil()); 
		assertEquals(22, robo1.getOil()); 
	}
	
	@Test
	public void shouldgetAllPetState() {
		
		undertest.addVirtualPet(robo);
		undertest.addVirtualPet(dog);
		undertest.addVirtualPet(cat);
		
		undertest.petStateAll();
		
		assertEquals(5, robo.getHealth()); 
		assertEquals(9, dog.getHealth()); 
		assertEquals(8, cat.getHealth()); 
	}
	
	@Test
	public void shouldCheckCageCleanliness() {
		
		undertest.addVirtualPet(dog);
		undertest.addVirtualPet(dog1);	
		
		undertest.cageCleanliness();
		
		assertEquals(8, dog.getHealth()); 
		assertEquals(9, dog1.getHealth());  
	}
	
	@Test
	public void shouldCheckLitterBox() {
		
		undertest.addVirtualPet(cat);
		undertest.addVirtualPet(cat1);
		
		undertest.litterBoxCleanliness();
		
		assertEquals(7, cat.getHealth()); 
		assertEquals(8, cat1.getHealth());  
	}
	
	@Test
	public void shouldCheckOilLevels() {
		
		undertest.addVirtualPet(robo);
		undertest.addVirtualPet(robo1);
		
		undertest.oilLevel();
		
		assertEquals(4, robo.getHealth()); 
		assertEquals(5, robo1.getHealth());  
	}
	
	@Test
	public void shouldCleanCage() {
		
		undertest.addVirtualPet(dog);
		undertest.addVirtualPet(dog1);
		
		undertest.cleanAllCages();
		
		assertEquals(26, dog.getHealth()); 
		assertEquals(27, dog1.getHealth());  
	}
	
	
	@Test
	public void shouldemptyLitterBoxes() {
		
		undertest.addVirtualPet(cat);
		undertest.addVirtualPet(cat1);
		
		undertest.emptyLitterBox();
		
		assertEquals(25, cat.getHealth()); 
		assertEquals(26, cat1.getHealth());  
	}
	
	@Test
	public void shouldPlayWithPet() {
		undertest.addVirtualPet(cat);
		undertest.addVirtualPet(dog);
		undertest.addVirtualPet(robo);
		
		undertest.playWithPet(cat.getName());
		
		assertEquals(2, cat.getBoredom());
		assertEquals(16, dog.getBoredom()); 
		assertEquals(14, robo.getHappiness()); 
	}
	
	@Test
	public void shouldAdoptPet() {
		
		undertest.addVirtualPet(cat);
		undertest.addVirtualPet(dog);
		undertest.addVirtualPet(robo);
		
		undertest.adopt(dog.getName());
		int size = undertest.getListSize();
		
		assertEquals(2, size);
	}
	
	@Test
	public void shouldAmitPet() {
		undertest.addVirtualPet(cat);
		undertest.addVirtualPet(dog);
		undertest.addVirtualPet(robo);
		
		undertest.addVirtualPet(new Cat("Tom", "The beast"));
		int size = undertest.getListSize();
		
		assertEquals(4, size); 
	}
	
}
