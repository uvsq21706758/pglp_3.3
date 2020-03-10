package exo3.lsp;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Testes {
	
	Robot robot;
	Position pos;
	Direction dir;
	@Test
	public void testNotNull() {
		pos=new Position(2,3);
		dir=new Direction(5,7);
		robot = new Robot(pos,dir);
		assertNotNull(robot);
	}
	
	@Test 
	public void test_avancetous() {
		pos=new Position(2,3);
		dir=new Direction(5,7);
		robot = new Robot(pos,dir);
		robot.avancer_tous();
	}
  
}
