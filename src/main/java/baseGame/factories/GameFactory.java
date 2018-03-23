/**
 * @version 1.0
 */
package baseGame.factories;

import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
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
public abstract class GameFactory {
	/**
	 * 
	 * @param terrain
	 * @return
	 */
	abstract ITerrain getTerrain(String terrain);

	/**
	 * 
	 * @param building
	 * @return
	 */
	abstract IBuilding getBuilding(String building);

	/**
	 * 
	 * @param world
	 * @return
	 */
	abstract IWorld getWorld(String world);

	/**
	 * 
	 * @param character
	 * @return
	 */
	abstract ICharacter getCharacter(String character);

	/**
	 * 
	 * @param item
	 * @return
	 */
	abstract IItem getItem(String item);

	/**
	 * 
	 * @param race
	 * @return
	 */
	abstract IRace getRace(String race);

	/**
	 * 
	 * @param hability
	 * @return
	 */
	abstract IHability getHability(String hability);

	/**
	 * @param mission
	 * @return
	 */
	abstract IMission getMission(String mission);
}
