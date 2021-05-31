package gameDemo.concretes;

import gameDemo.abstracts.GamerCheckService;
import gameDemo.abstracts.GamerService;
import gameDemo.entities.Gamer;

public class GamerManager implements GamerService{
	 GamerCheckService gamerCheckService;
	 
	  public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService=gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Added to db :"+ gamer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer updated" + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted" + gamer.getFirstName());
		
	}
	 

}
