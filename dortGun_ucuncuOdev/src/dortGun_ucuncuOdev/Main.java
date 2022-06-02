package dortGun_ucuncuOdev;



public class Main {

	public static void main(String[] args) 
	{
      Gamer hasan = new Gamer();
      hasan.setId(1);
      hasan.setFirstName("hasan emre");
      hasan.setLastName("zeyrek");
      hasan.setNationalityId("12345678910");
      hasan.setDateofBirth("12/12/1212");
      
      Game game = new Game();
      game.setGameId(1);
      game.setGameName("minecraft");
      game.setPrice(425);
      game.setReleaseYear("2011");
      
      Campaign campaign = new Campaign();
      campaign.setId(1);
      campaign.setCampaignName("yaz");
      campaign.setDiscount(10);
      campaign.setStartingDate("01/06/2022");
      campaign.setEndDate("01/09/2022");
      
      
      GamerManager gamerManager = new GamerManager();
      gamerManager.add(hasan);
      
      GameManager gameManager = new GameManager();
      gameManager.buy(hasan, game);
      
      CampaignManager campaignManager = new CampaignManager();
      campaignManager.add(campaign);
      
      System.out.println("oyunun fiyati "+campaign.getDiscountPrice(game));
      
      
      
	}

}
