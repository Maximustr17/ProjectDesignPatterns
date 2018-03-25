package baseGame.interfaces;

import baseGame.Helpers.SoundClipHelper;

import java.util.List;

public abstract class IWorld {
    protected void setMap(){}

    public List<List<IElement>> getMap(){
        return null;
    }

    protected void startWorldSoundClip(String soundClipURL) {
        SoundClipHelper soundClipHelper = SoundClipHelper.getInstance();
        soundClipHelper.stopSound();
        soundClipHelper.playSound(soundClipURL);
    }

    protected void init(){}
}
