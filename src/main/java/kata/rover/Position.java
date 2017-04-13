package kata.rover;

import java.util.Objects;

public class Position {

	private final int x;
	private final int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Position north() {
		return new Position(x, y + 1);
	}
	
	public Position south() {
		return new Position(x, y - 1);
	}

	public Position west() {
		return new Position(x-1, y);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x,y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}


}
