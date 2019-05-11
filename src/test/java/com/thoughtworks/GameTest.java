package com.thoughtworks;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {
	@Test
	public void setupShouldBeReady(){
		Assert.assertEquals(0, 0);
	}
	
	@Test
	public void poker(){
		game instance = new game();
		instance.main("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH");
		instance.main("Black: 2H 4S 4C 2D 4H White: 2S 8S AS QS 3S");
		instance.main("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C KH");
		instance.main("Black: 2H 3D 5S 9C KD White: 2D 3H 5C 9S KH");
	}
}
