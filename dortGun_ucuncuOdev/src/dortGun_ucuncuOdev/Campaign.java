package dortGun_ucuncuOdev;



public class Campaign implements Entity //boş kalmasın diye entity oluşturup implement yaptım
{
      private int id;
      private String campaignName;
      private double discount;
      private String startingDate;
      private String endDate;
      
      public Campaign()
      {
    	  
      }
      
      
	public Campaign(int id, String campaignName, double discount, String startingDate, String endDate) 
	{
		this();
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.startingDate = startingDate;
		this.endDate = endDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public String getStartingDate() {
		return startingDate;
	}


	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public double getDiscountPrice(Game game)
	{
		return game.getPrice()-(game.getPrice()*discount/100);
	}
	
      
      
      
}
