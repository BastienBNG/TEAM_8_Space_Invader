package engine;

/**
 * Implements an object that stores a single game's difficulty settings.
 * 
 * @author <a href="mailto:RobertoIA1987@gmail.com">Roberto Izquierdo Amo</a>
 * 
 */
public class GameSettings {

	/** Width of the level's enemy formation. */
	private int formationWidth;
	/** Height of the level's enemy formation. */
	private int formationHeight;
	/** Speed of the enemies, function of the remaining number. */
	private int baseSpeed;
	/** Frequency of enemy shootings, +/- 30%. */
	private int shootingFrecuency;
	/** Current level of the game. */
	private int lvl;
	private float musicVolume;
	private float SoundVolume;

	/**
	 * Constructor.
	 * 
	 *
	 * @param lvl
	 *           Each parameter of the level depends of the level itself.
	 */
	public GameSettings(final int lvl) {
		if (lvl % 2 == 0) {
			this.formationWidth = lvl + 1;
			this.formationHeight = lvl + 1;
			this.baseSpeed = 60 / lvl;
			this.shootingFrecuency = 2520 / lvl;
		}
		else {
			this.formationWidth = lvl;
			this.formationHeight = lvl + 2;
			this.baseSpeed = 60 / lvl;
			this.shootingFrecuency = 2520 / lvl;
		}
		musicVolume = 0;
		SoundVolume = 0;

	}

	/**
	 * @return the formationWidth
	 */
	public final int getFormationWidth() {
		return formationWidth;
	}

	/**
	 * @return the formationHeight
	 */
	public final int getFormationHeight() {
		return formationHeight;
	}

	/**
	 * @return the baseSpeed
	 */
	public final int getBaseSpeed() {
		return baseSpeed;
	}

	/**
	 * @return the shootingFrecuency
	 */
	public final int getShootingFrecuency() {
		return shootingFrecuency;
	}

	public float getMusicVolume() {
		return musicVolume;
	}

	public void setMusicVolume(float musicVolume) {
		this.musicVolume = musicVolume;
	}

	public float getSoundVolume() {
		return SoundVolume;
	}

	public void setSoundVolume(float soundVolume) {
		SoundVolume = soundVolume;
	}
}
