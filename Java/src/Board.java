import java.awt.Graphics;

public class Board {

	public Tile[][] tiles = new Tile[8][8];
	
	public Board(){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				tiles[i][j] = new Tile();
			}
		}
	}

	public void update(){
		
	}
	
	public void draw(Graphics g){
		
	}
	
}
