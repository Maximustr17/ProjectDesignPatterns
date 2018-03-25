package baseGame.interfaces;

import baseGame.Helpers.SoundClipHelper;

import java.util.List;


public abstract class IGame {
    protected void init(){}

    protected abstract void startWorldSoundClip(String soundClipURL);

    protected void createWorld(){}


    public void printWorldMap(){}

    public abstract List<IWorld> getWorls();

}
