package baseGame.factories;

import baseGame.Enums.FactoryEnum;
import baseGame.Enums.MissionEnum;

public class GameFactoryProducer {
	public static GameFactory getFactory(String choice) {
		GameFactory gameFactory = null;

		if (choice.equals(FactoryEnum.CHARACTER_FACTORY.toString())) {
			gameFactory = CharacterFactory.getInstance();
		} else if (choice.equals(FactoryEnum.BUILDING_FACTORY.toString())) {
			gameFactory = BuildingFactory.getInstance();
		} else if (choice.equals(FactoryEnum.HABILITY_FACTORY.toString())) {
			gameFactory = HabilityFactory.getInstance();
		} else if (choice.equals(FactoryEnum.ITEM_FACTORY.toString())) {
			gameFactory = ItemFactory.getInstance();
		} else if (choice.equals(FactoryEnum.RACE_FACTORY.toString())) {
			gameFactory = RaceFactory.getInstance();
		} else if (choice.equals(FactoryEnum.TERRAIN_FACTORY.toString())) {
			gameFactory = TerrainFactory.getInstance();
		} else if (choice.equals(FactoryEnum.WORLD_FACTORY.toString())) {
			gameFactory = WorldFactory.getInstance();
		} else if (choice.equals(MissionEnum.MISSION_ONE.toString())) {
			gameFactory = MissionFactory.getInstance();
		}

		return gameFactory;
	}
}
