package baseGame.Helpers;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundClipHelper {
	static SoundClipHelper instance;
	private Clip clip;

	private SoundClipHelper() {
		// Exists only to defeat instantiation.
	}

	public static SoundClipHelper getInstance() {
		if (instance == null) {
			instance = new SoundClipHelper();
		}
		return instance;
	}

	public void playSound(String sound) {
		AudioInputStream audioIn;
		URL url;
		try {
			// Open an audio input stream.
			url = this.getClass().getClassLoader().getResource(sound);
			audioIn = AudioSystem.getAudioInputStream(url);
			// Get a sound clip resource.
			clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}

	public void stopSound() {
		if (clip.isRunning()) {
			clip.stop();
		}
	}
}
