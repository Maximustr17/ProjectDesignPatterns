package baseGame.beans;

import java.util.List;

import baseGame.Helpers.SoundClipHelper;
import baseGame.interfaces.IGame;
import baseGame.interfaces.IWorld;

public class Game implements IGame {
	private SoundClipHelper soundClipHelper;
	static Game instance;
	private List<IWorld> worlds;

	private Game() {
		// Exists only to defeat instantiation.
	}

	public static Game getInstance() {
		if (instance == null) {
			instance = new Game();
		}
		return instance;
	}

	@Override
	public void init(String worldLevel) {
		soundClipHelper = SoundClipHelper.getInstance();
		soundClipHelper.stopSound();
		soundClipHelper.playSound("soundClips/Castle-8-Bit-Stein.wav");
	}

	@Override
	public void createWorld(String worldLevel) {
		// TODO Auto-generated method stub
		
	}
}
