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
		
		App testB = new App();
		assertEquals(3, testB.calculate("1+1+1"));
		
		App testC = new App();
		assertEquals(52, testC.calculate("35+17"));
		
		App testD = new App();
		assertEquals(10593, testD.calculate("244+591+9758"));
		
		App testE = new App();
		assertEquals(2, testE.calculate("1*2"));
		
		App testF = new App();
		assertEquals(6, testF.calculate("1*2*3"));
		
		App testG = new App();
		assertEquals(2184, testG.calculate("52*42"));
		
		App testH = new App();
		assertEquals(87972792, testH.calculate("1643*552*97"));
		
		App testI = new App();
		assertEquals(3, testI.calculate("1+1*2"));
		
		App testJ = new App();
		assertEquals(3, testJ.calculate("1*2+1"));
		
		App testK = new App();
		assertEquals(4, testK.calculate("1+2*1+1"));
		
		App testL = new App();
		assertEquals(-11015, testL.calculate("12435-2345*10"));
		
		App testM = new App();
		assertEquals(1, testM.calculate("2-1"));
		
		App testN = new App();
		assertEquals(0, testN.calculate("3-2-1"));
		
		App testO = new App();
		assertEquals(-85219, testO.calculate("1256-86475"));
		
		App testP = new App();
		assertEquals(-76396, testP.calculate("12435+34569-12345*10+50"));

		
	}
	
} 