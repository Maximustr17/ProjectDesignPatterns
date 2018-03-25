package baseGame.beans;

import baseGame.Enums.FactoryEnum;
import baseGame.Enums.MapEnum;
import baseGame.Enums.WorldEnum;
import baseGame.Helpers.SoundClipHelper;
import baseGame.factories.MainFactory;
import baseGame.factories.MainFactoryProducer;
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
        worldFactory = MainFactoryProducer.getFactory(FactoryEnum.WORLD_FACTORY.toString());
        worlds = new ArrayList<>();
        setWorlds(WorldEnum.WORLD_ONE);
    }

    @Override
    protected void startWorldSoundClip(String soundClipURL) {
            SoundClipHelper soundClipHelper = SoundClipHelper.getInstance();
            soundClipHelper.stopSound();
            soundClipHelper.playSound(soundClipURL);
    }

    @Override
    public List<IWorld> getWorls() {
        return worlds;
    }

    @Override
    public void updateCatzuraRace(String race, MapEnum mapEnum) {
        worlds.get(0).updateCharacterRace(race, mapEnum);
    }

    private void setWorlds(WorldEnum world) {
        worlds.add(worldFactory.getWorld(world.toString()));
    }
}
