package kata.rover;

public class Rover {
	private Position position;
	private final Direction direction;

	public Rover(int x, int y, Direction dir) {
		this.position = new Position(x,y);
		this.direction = dir;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public Position getPosition() {
		return this.position;
	}

	public void moveForward() {
		this.position = this.position.north();
	}

	public void moveBackward() {
		// TODO Auto-generated method stub
		this.position = this.position.south();
		
	}

	public void turnLeft() {
		// TODO Auto-generated method stub
		this.position = this.position.west();
	}

}
