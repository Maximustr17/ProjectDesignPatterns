/**
 * @version 1.0
 */
package baseGame.factories;

import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IGame;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

/**
 * @author pbarquerom
 * 
 */
public abstract class MainFactory {
	/**
	 * 
	 * @param terrain
	 * @return
	 */
	public abstract ITerrain getTerrain(String terrain);

	/**
	 * 
	 * @param building
	 * @return
	 */
	public abstract IBuilding getBuilding(String building);

	/**
	 * 
	 * @param world
	 * @return
	 */
	public abstract IWorld getWorld(String world);

	/**
	 * 
	 * @param character
	 * @return
	 */
	public abstract ICharacter getCharacter(String character);

	/**
	 * 
	 * @param item
	 * @return
	 */
	public abstract IItem getItem(String item);

	/**
	 * 
	 * @param race
	 * @return
	 */
	public abstract IRace getRace(String race);

	/**
	 * 
	 * @param hability
	 * @return
	 */
	public abstract IHability getHability(String hability);

	/**
	 * @param mission
	 * @return
	 */
	public abstract IMission getMission(String mission);

	/**
	 * @param game
	 * @return
	 */
	public abstract IGame getGame(String game);
}