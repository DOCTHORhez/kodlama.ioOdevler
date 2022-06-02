package dortGun_ucuncuOdev;

public class GamerManager implements GamerService
{

	@Override
	public void add(Gamer gamer) {
		System.out.println("oyuncu eklendi "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("oyuncu güncellendi "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("oyuncu silindi "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

}
