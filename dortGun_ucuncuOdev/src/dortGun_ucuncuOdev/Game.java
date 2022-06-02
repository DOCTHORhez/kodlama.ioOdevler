package dortGun_ucuncuOdev;



public class Game implements Entity //boş kalmasın diye entity oluşturup implement yaptım
{
	private int gameId;
	private String gameName;
	private double price;
	private String releaseYear;
	
	public Game()
	{
		
	}
	
	
	public Game(int gameId, String gameName, double price, String releaseYear) 
	{
		this();
		this.gameId = gameId;
		this.gameName = gameName;
		this.price = price;
		this.releaseYear = releaseYear;
	}


	public int getGameId() {
		return gameId;
	}


	public void setGameId(int gameId) {
		this.gameId = gameId;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	
	
	
	
	
	
}
