package exo3.lsp;

public class RobotStatique {
	
	protected Position position;
	protected Direction direction;
	
	public RobotStatique(Position position,Direction direction) {
		this.position=position;
		this.direction=direction;
	}
    
    public Direction getDirection() {
		return this.direction;
	}
	
	public Position getPosition() {
		return this.position;
	}

}
