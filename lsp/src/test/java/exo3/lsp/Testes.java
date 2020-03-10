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
		robot = new Robot(pos,dir);
		assertNotNull(robot);
	}
	@Test
	public void tourneTest() {
		Position pos=new Position(2,3);
		Direction dir=Direction.NORD;
		robot=new Robot(pos,dir);
		Direction verif=Direction.EST;
		robot.tourne();
		
		assertEquals(verif,robot.getDirection());
	}
	
	@Test
	public void avanceTest()  {
		Position pos=new Position(2,3);
		Direction dir=Direction.NORD;
		robot=new Robot(pos,dir);
		Position verif=new Position(2,4);
		robot.avance();
		
		assertEquals(verif.getPos_Y(),robot.getPosition().getPos_Y());
		assertEquals(verif.getPos_X(),robot.getPosition().getPos_X());
	}
	@Test 
	public void test_avancetous() {
		pos=new Position(2,3);
		robot = new Robot(pos,dir);
		robot.avancer_tous();
	}
  
}
