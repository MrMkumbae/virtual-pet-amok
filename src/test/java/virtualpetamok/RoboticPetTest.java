package virtualpetamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboticPetTest {
	
RoboticPet undertest = new RoboticPet("","",12,14,13);
	
	@Test
	public void shouldOilRoboticPet() {
		undertest.oilPet();
		int check = undertest.getHealth();
		
		assertEquals(17, check);
	}
	
	@Test
	public void shouldChangeRoboticPetState() {
		undertest.petState();
		int check = undertest.getHealth();
		
		assertEquals(5, check);
	}
	
	@Test
	public void shouldPlay() {
		undertest.play();
		int check = undertest.getHappiness();
		
		assertEquals(19, check);
	}
}
