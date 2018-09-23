import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;

/**
 * OthelloPlayer.java
 *
 * This is the top-level class for all player classes.
 * 
 *  @author  TODO Your Name
 *  @author  TODO Id nnnnnnn
 *  @version TODO Date
 *  @author  Period: TODO
 *  @author  Assignment: GWOthello
 * 
 *  @author  Sources: TODO I received help from ...
 */
public abstract class OthelloPlayer
{
	/** The world */


	/** The grid */


	/** The name of the player ("Human" or "Computer") */


	/** The color of this player's game pieces */



	/**
	 * Constructs an Othello player object.
	 * @param w the world
	 * @param n the name ("Human" or "Computer")
	 * @param c the color
	 */
	public OthelloPlayer(OthelloWorld w, String n, Color c)
	{
	}

	/**
	 * Gets the next move.
	 * @return the location of the next move
	 */
	public abstract Location getPlay();

	/**
	 * Gets the player name.
	 * @return the player name
	 */
	public String getName()
	{
		return null;	// Replace with correct code
	}

	/**
	 * Gets the Othello world.
	 * @return the Othello world
	 */
	public OthelloWorld getWorld()
	{
		return null;	// Replace with correct code
	}

	/**
	 * Determines if the player can make a play.
	 * @return true if the player can play; false otherwise
	 */
	public boolean canPlay()
	{
		return true;	// Replace with correct code
	}

	/**
	 * Computers the list of locations that the player may play
	 * @return allowed (legal) plays (locations) for this player
	 */
	public ArrayList<Location> getAllowedPlays()
	{
		return null;	// Replace with correct code
	}

	/**
	 * Determines if this play is allowed by the rules
	 * @param loc location to be checked
	 * @return true if this location is allowed to be played;
	 *         false otherwise
	 */
	public boolean isAllowedPlay(Location loc)
	{
		return false;	// Replace with correct code
	}

	/**
	 * Make the play indicated by calling getPlay.
	 * (Place a piece and "flip" the appropriate other pieces.)
	 */
	public void play()
	{
		System.out.println(name + " plays");	// TEMPORARY
	}

	/**
	 * Determines the empty locations on the board.
	 * @return a list of the empty board locations
	 */
	private ArrayList<Location> getEmptyLocations()
	{
		return null;	// TEMPORARY
	}

	/**
	 * Finds the next location with this player's color
	 * beginning with second in the direction from first to second.
	 * @param first first location
	 * @param second second location
	 * @return next location with this player's color in the
	 *         direction from first to second starting with second
	 */
	private Location getNextLocationWithColor(
		Location first, Location second)
	{
		return null;	// Replace with correct code
	}

	/**
	 * Changes (flips) the color of the pieces to the current player's
	 * color in the locations from start (included) to end (not included)
	 * @param start first location to color (flip)
	 * @param end first location past last location to color (flip)
	 */
	private void flipColorOfPieces(Location start, Location end)
	{
	}
}
