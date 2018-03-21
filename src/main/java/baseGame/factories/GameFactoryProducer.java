package baseGame.factories;

import baseGame.Enums.FactoryEnum;
import baseGame.Enums.MissionEnum;

public class GameFactoryProducer {
	public static GameFactory getFactory(String choice) {
		GameFactory gameFactory = null;

		if (choice.equals(FactoryEnum.CHARACTER_FACTORY.toString())) {
			gameFactory = new CharacterFactory();
		} else if (choice.equals(FactoryEnum.BUILDING_FACTORY.toString())) {
			gameFactory = new BuildingFactory();
		} else if (choice.equals(FactoryEnum.HABILITY_FACTORY.toString())) {
			gameFactory = new HabilityFactory();
		} else if (choice.equals(FactoryEnum.ITEM_FACTORY.toString())) {
			gameFactory = new ItemFactory();
		} else if (choice.equals(FactoryEnum.RACE_FACTORY.toString())) {
			gameFactory = new RaceFactory();
		} else if (choice.equals(FactoryEnum.TERRAIN_FACTORY.toString())) {
			gameFactory = new TerrainFactory();
		} else if (choice.equals(FactoryEnum.WORLD_FACTORY.toString())) {
			gameFactory = new WorldFactory();
		} else if (choice.equals(MissionEnum.MISSION_ONE.toString())) {
			gameFactory = new MissionFactory();
		}

		return gameFactory;
	}
}
