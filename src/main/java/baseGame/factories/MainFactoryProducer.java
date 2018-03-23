package baseGame.factories;

import baseGame.Enums.FactoryEnum;
import baseGame.Enums.MissionEnum;

public class MainFactoryProducer {
	public static MainFactory getFactory(String choice) {
		MainFactory mainFactory = null;

		if (choice.equals(FactoryEnum.CHARACTER_FACTORY.toString())) {
			mainFactory = new CharacterFactory();
		} else if (choice.equals(FactoryEnum.BUILDING_FACTORY.toString())) {
			mainFactory = new BuildingFactory();
		} else if (choice.equals(FactoryEnum.HABILITY_FACTORY.toString())) {
			mainFactory = new HabilityFactory();
		} else if (choice.equals(FactoryEnum.ITEM_FACTORY.toString())) {
			mainFactory = new ItemFactory();
		} else if (choice.equals(FactoryEnum.RACE_FACTORY.toString())) {
			mainFactory = new RaceFactory();
		} else if (choice.equals(FactoryEnum.TERRAIN_FACTORY.toString())) {
			mainFactory = new TerrainFactory();
		} else if (choice.equals(FactoryEnum.WORLD_FACTORY.toString())) {
			mainFactory = new WorldFactory();
		} else if (choice.equals(MissionEnum.MISSION_ONE.toString())) {
			mainFactory = new MissionFactory();
		} else if (choice.equals(FactoryEnum.GAME_FACTORY.toString())) {
			mainFactory = new GameFactory();
		}

		return mainFactory;
	}
}
