package boardgame;

public class Square {
	private Ship ship;
	private String tile = "[   ]";
	private int x;
	private int y;

	public Square() {

	}

	public Square(Ship ship, String tile, int x, int y) {
		this.ship = ship;
		this.tile = tile;
		this.x = x;
		this.y = y;

	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public String getColor() {
		return tile;
	}

	public void setColor(String color) {
		this.tile = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return tile;
		
	}
}
