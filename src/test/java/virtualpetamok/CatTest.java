package virtualpetamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest {
	
	Cat undertest = new Cat("","",14,19,15,15,13);

	@Test
	public void shouldCleanLitterBox() {
		undertest.cleanLitterBox();
		int check = undertest.getHealth();
		
		assertEquals(25, check);
	}
	
	@Test
	public void catsPetState() {
		undertest.petState();
		int check = undertest.getHealth();
		
		assertEquals(8, check);
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
		
		assertEquals(2, check);
	}

}
