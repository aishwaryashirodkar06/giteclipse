package junittesting;

public class caba {
	int moves,cabbages;
	
	public caba(int moves,int cabbages) {
		this.moves=moves;
		this.cabbages=cabbages;
	}
	
	
	public int move(int moves) {
		moves++;
		return moves;
	}
	
	public int eat(int cabbages) {
		cabbages++;
		return cabbages;
	}
	
	
	public int getmoves() {
		return moves;
		
	}
	
	public int getcabbages() {
		return cabbages;
	}

}
