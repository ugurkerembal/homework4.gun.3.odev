package gameDemo.entities;



public class Game  {
	private int GameId;
	private String GameName;
	private int Price;
	private int stock;
	
	public Game() {
		
	}

	public Game(int gameId, String gameName, int price, int stock) {
		super();
		GameId = gameId;
		GameName = gameName;
		Price = price;
		this.stock = stock;
	}

	public int getGameId() {
		return GameId;
	}

	public void setGameId(int gameId) {
		GameId = gameId;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}