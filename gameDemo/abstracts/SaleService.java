package gameDemo.abstracts;

import gameDemo.entities.Campaign;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;

public interface SaleService {
	void sale(Game game, Gamer gamer);
	void saleWithCampaign(Game game, Gamer gamer, Campaign campaign);

}
