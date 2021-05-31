package gameDemo.concretes;

import gameDemo.abstracts.SaleService;
import gameDemo.entities.Campaign;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("Game named" +game.getGameName()+ "sold to gamer"+gamer.getFirstName());
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Game named"+game.getGameName()+ "discount applied"+ campaign.getDiscount()+ "Sold to gamer"+ gamer.getFirstName());
		
	}

}
