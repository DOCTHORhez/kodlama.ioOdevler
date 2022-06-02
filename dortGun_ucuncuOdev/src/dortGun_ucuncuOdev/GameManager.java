package dortGun_ucuncuOdev;

public class GameManager implements GameService
{

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println("oyun satin alindi "+gamer.getFirstName()+" "+game.getGameName());
		
	}

	@Override
	public void rent(Gamer gamer, Game game) {
		System.out.println("oyun kiralandı "+gamer.getFirstName()+" "+game.getGameName());
		
	}

	@Override
	public void giveBack(Gamer gamer, Game game) {
		System.out.println("oyun iade edildi "+gamer.getFirstName()+" "+game.getGameName()+" "+game.getPrice()+" para geri verildi");
		
	}

}
