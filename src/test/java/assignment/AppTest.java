package assignment;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	@Test
	Public void tests() {
		
		Calculator testA = new Calculator("1+1");
		assertEquals(2, testA.Calculate);
		
	}
	
}
