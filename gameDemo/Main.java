package gameDemo;

import java.time.LocalDate;

import gameDemo.adapters.MernisServiceAdapter;
import gameDemo.concretes.GameManager;
import gameDemo.concretes.GamerManager;
import gameDemo.concretes.SaleManager;
import gameDemo.entities.Campaign;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		
		Gamer gamer= new Gamer(1,"Uður Kerem","Bal",LocalDate.of(1999, 04,30),"18568435938");
		
		
		
		Game game = new Game();
		game.setGameId(1);
		game.setGameName("GTA-San Andreas");
		game.setPrice(100);
		game.setStock(35);
		
		Campaign campaign=new Campaign(3, "Sprint Campaign", 50);
		
		
		gamerManager.add(gamer);
		//gamerManager.update(gamer);
	    //gamerManager.delete(gamer);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		//gameManager.update(game);
		//gameManager.delete(game);
		

		SaleManager saleManager =  new SaleManager();
		saleManager.sale(game, gamer);
	
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.saleWithCampaign(game, gamer, campaign);

	}
	
	

}
