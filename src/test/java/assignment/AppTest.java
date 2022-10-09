package assignment;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.*;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	@Test
	public void tests() {
		
		App testA = new App();
		assertEquals(2, testA.calculate("1+1"));

	}
	
} 