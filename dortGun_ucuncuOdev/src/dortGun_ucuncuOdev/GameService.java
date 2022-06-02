package dortGun_ucuncuOdev;

public interface GameService 
{
	void buy(Gamer gamer,Game game);
	
	void rent(Gamer gamer,Game game);
	
	void giveBack(Gamer gamer,Game game);
}
