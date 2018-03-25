package baseGame.interfaces;

import baseGame.Enums.MapEnum;
import baseGame.Helpers.SoundClipHelper;

import java.util.List;


public abstract class IGame {
    protected void init(){}

    protected abstract void startWorldSoundClip(String soundClipURL);

    public void printWorldMap(){}

    public abstract List<IWorld> getWorls();

    public abstract void updateCatzuraRace(String race, MapEnum mapEnum);
}
