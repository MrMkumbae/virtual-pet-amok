package virtualpetamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DogTest {
Dog undertest = new Dog("","",14,19,16,16,12);
	
	@Test
	public void shouldCleanCage() {
		undertest.cleanCage();
		int check = undertest.getHealth();
		
		assertEquals(26, check);
	}
	
	@Test
	public void catsPetState() {
		undertest.petState();
		int check = undertest.getHealth();
		
		assertEquals(9, check);
	}
	
	@Test
	public void shouldWalkDog() {
		undertest.walkDog();
		int check = undertest.getHappiness();
		
		assertEquals(15, check);
	}
	
	@Test
	public void shouldFeed() {
		undertest.feed();
		int check = undertest.getHunger();
		
		assertEquals(4, check);
	}
	
	@Test
	public void shouldWater() {
		undertest.water();
		int check = undertest.getThirst();
		
		assertEquals(4, check);
	}
	
	@Test
	public void shouldPlay() {
		undertest.play();
		int check = undertest.getBoredom();
		
		assertEquals(3, check);
	}

}
