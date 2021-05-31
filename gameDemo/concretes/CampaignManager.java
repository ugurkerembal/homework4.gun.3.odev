package gameDemo.concretes;


import gameDemo.abstracts.CampaignService;
import gameDemo.entities.Campaign;


public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign has been added" + campaign.getDiscount());

		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign has been updated" + campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign has been deleted" + campaign.getDiscount());
		
	}

	
}
