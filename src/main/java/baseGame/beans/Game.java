package baseGame.beans;

import baseGame.Enums.FactoryEnum;
import baseGame.Enums.WorldEnum;
import baseGame.Helpers.SoundClipHelper;
import baseGame.factories.MainFactory;
import baseGame.factories.MainFactoryProducer;
import baseGame.interfaces.IElement;
import baseGame.interfaces.IGame;
import baseGame.interfaces.IWorld;

import java.util.ArrayList;
import java.util.List;

public class Game extends IGame {
    static Game instance;

    private MainFactory worldFactory;
    private List<IWorld> worlds;

    private Game() {
        // Exists only to defeat instantiation.
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
            instance.init();
        }
        return instance;
    }

    @Override
   protected void init() {
        worlds = new ArrayList<>();
        createWorld();

    }

    @Override
    protected void startWorldSoundClip(String soundClipURL) {
            SoundClipHelper soundClipHelper = SoundClipHelper.getInstance();
            soundClipHelper.stopSound();
            soundClipHelper.playSound(soundClipURL);
    }

    @Override
    protected void createWorld() {
        worldFactory = MainFactoryProducer.getFactory(FactoryEnum.WORLD_FACTORY.toString());
        setWorlds();
    }

    @Override
    public List<IWorld> getWorls() {
        return worlds;
    }

    private void setWorlds() {
        worlds.add(worldFactory.getWorld(WorldEnum.WORLD_ONE.toString()));
    }
}
