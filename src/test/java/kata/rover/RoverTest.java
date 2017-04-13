package kata.rover;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class RoverTest {

	private Rover rover;

	@Before
	public void init() {
		rover = new Rover(1, 2, Direction.NORTH);
	}
	
	@Test
	public void shouldReturnCurrentDirection() {
		assertThat(rover.getDirection()).isEqualTo(Direction.NORTH);
	}

	@Test
	public void shouldReturnCurrentPosition(){
		assertThat(rover.getPosition()).isEqualTo(new Position(1,2));
	}

	@Test
	public void shouldReturnAheadPosition(){
		rover.moveForward();
		assertThat(rover.getPosition()).isEqualTo(new Position(1,3));
	}
	
	@Test
	public void shouldReturnBehindPosition(){
		rover.moveBackward();
		assertThat(rover.getPosition()).isEqualTo(new Position(1,1));
	}
	
	@Test
	public void givenNorthDirectionWhenTurnLeftThenReturnDirectionWest(){
		rover.turnLeft();
		assertThat(rover.getDirection()).isEqualTo(Direction.WEST);
	}
}
