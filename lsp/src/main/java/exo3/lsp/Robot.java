package exo3.lsp;

import java.util.*;

public class Robot extends RobotStatique{
	
	public Robot(Position position,Direction direction) {
		super(position,direction);
	}

	public void tourne() {
		if(direction.equals(Direction.NORD)) {
			this.direction=Direction.EST;
		}
		else if(direction.equals(Direction.EST)) {
			this.direction=Direction.SUD;
		}
		else if(direction.equals(Direction.SUD)) {
			this.direction=Direction.OUEST;
		}
		else {
			this.direction=Direction.NORD;
		}
	}
	
	public void avance(){
		if(direction.equals(Direction.NORD)) {
			this.position.deplaceY(1);
		}
		else if(direction.equals(Direction.EST)) {
			this.position.deplaceX(1);
		}
		else if(direction.equals(Direction.SUD)) {
			this.position.deplaceY(-1);
		}
		else {
			this.position.deplaceX(-1);
		}
	}
   
    private ArrayList<Robot> robots=new ArrayList<Robot>();
    
    public void Ajou_robot(Robot r) {
		this.robots.add(r);
	}
    public void avancer_tous(){
    	
     for (Robot r : robots) {
    		
    		r.avance();
    }
    }
}
