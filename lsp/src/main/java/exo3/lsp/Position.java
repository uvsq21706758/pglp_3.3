package exo3.lsp;

public class Position {
	
     private int pos_x;
     private int pos_y;
     
     public Position(int pos_x,int pos_y) {
    	 this.pos_x=pos_x;
    	 this.pos_y=pos_y;
     }
     protected void deplaceX(int nbrCases) {
 		this.pos_x=this.pos_x+nbrCases;
 	}
 	
 	protected void deplaceY(int nrbCases) {
 		this.pos_y=this.pos_y+nrbCases;
 	}
 	
 	public int getPos_X() {
 		return this.pos_x;
 	}
 	
 	public int getPos_Y() {
 		return this.pos_y;
 	}
 
}
