package dortGun_ucuncuOdev;

public class CampaignManager implements CampaignService
{

	@Override
	public void add(Campaign campaign) {
		System.out.println("kampanya eklendi "+campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("kampanya güncellendi "+campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("kampanya silindi "+campaign.getCampaignName());
		
	}

}
