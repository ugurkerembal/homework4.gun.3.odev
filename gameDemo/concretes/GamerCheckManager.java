package gameDemo.concretes;

import gameDemo.abstracts.GamerCheckService;
import gameDemo.entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Gamer gamer) {
		// TODO Auto-generated method stub
		return true;
	}

}
