package byog.Core;

import byog.TileEngine.TERenderer;
import byog.TileEngine.TETile;

public class MapVisualTest {
    public static void main(String[] args) {
        MapGenerator mg = new MapGenerator(212);
        Map map = mg.generateRandomMap();

        TERenderer ter = new TERenderer();
        ter.initialize(mg.WIDTH, mg.HEIGHT);

        MapBuilder mapBuilder = new MapTileBuilder(mg.WIDTH, mg.HEIGHT);
        map.constructMapTile(mapBuilder);
        TETile[][] world = mapBuilder.getMapTile();

        // draws the map to the screen
        ter.renderFrame(world);
    }
}
