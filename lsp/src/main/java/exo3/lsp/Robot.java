package exo3.lsp;

import java.util.List;

public class Robot {
	
	private Position position;
	private Direction direction;
	
	public Robot(Position position,Direction direction) {
		this.position=position;
		this.direction=direction;
	}

	public void tourne() { /*tourne d’1/ 4 de tour */ }
    public void avance() { /* avance d’une case */ }
   
    List<Robot> robots;
    
    public void avancer_tous(){
    	
     for (Robot r : robots) {
    		
    		r.avance();
    }
    }
}
