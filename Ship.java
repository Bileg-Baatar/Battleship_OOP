package boardgame;

public class Ship {
	private String battleship = "<OO>";
	private int xCord;
	private int yCord;

	public Ship() {

	}

	public Ship(String battleship, int xCord, int yCord) {
		this.battleship = battleship;
		this.xCord = xCord;
		this.yCord = yCord;

	}

	public void setColor(String color) {
		this.battleship = color;
	}

	public String getColor() {
		return battleship;
	}

	public void setxCord(int xCord) {
		this.xCord = xCord;
	}

	public int getxCord() {
		return xCord;
	}

	public void setyCord(int yCord) {
		this.yCord = yCord;
	}

	public int getyCord() {
		return yCord;
	}
	public String toString() {
		return battleship;
	}

}