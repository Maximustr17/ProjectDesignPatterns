/**
 *
 */
package baseGame.beans;

import baseGame.Enums.MapEnum;
import baseGame.interfaces.IItem;

/**
 * @author pbarquerom
 */
public class HealthItem implements IItem {

    @Override
    public String printIcon() {
        return MapEnum.HEALTH_ITEM.toString();
    }

    @Override
    public String ControlColission() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean IsColisionable() {
        // TODO Auto-generated method stub
        return null;
    }

}
