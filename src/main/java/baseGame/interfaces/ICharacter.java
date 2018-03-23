package baseGame.interfaces;

public abstract class ICharacter implements IElement {
	protected ICharacterStats characterStats;

	protected ICharacterStats getCharacterStats() {
		return characterStats;
	}

	protected void setCharacterStats(ICharacterStats characterStats) {
		this.characterStats = characterStats;
	}

}
