/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.Worlds;
import java.awt.Graphics;
import tryyy.Entity.Creatures.Player;
import tryyy.Entity.EntityManager;
import tryyy.Entity.Statics.Planets;

import tryyy.Game;
import tryyy.Handler;
import tryyy.Tiles.Tile;
import tryyy.Utils.Utils;

public class World {

	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;

        
        //Entities
        private EntityManager entityManager;
	
	public World(Handler handler, String path){
		this.handler = handler;
                entityManager = new EntityManager(handler, new Player(handler, 100, 100));
                entityManager.addEntity(new Planets(handler, 500, 500));
                
		loadWorld(path);
                
                //entityManager.getPlayer().setX(spawnX);
		//entityManager.getPlayer().setY(spawnY);
	
                entityManager.getPlayer().setX(500);
		entityManager.getPlayer().setY(500);
        }
	
	public void tick(){
		entityManager.tick();
	}
	/*
	public void render(Graphics g){
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
	}
        */
           public void render(Graphics g){
        for(int y = 0; y < height; y++ ){
            for(int x = 0; x < width; x++ ){
                getTile(x,y).render(g, (int)(x* Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), 
                                    (int) (y * Tile.TILEWIDTH - handler.getGameCamera().getyOffset()));
            }
        }
        //Entities
	entityManager.render(g);
    }
	
	public Tile getTile(int x, int y){
            if(x < 0 || y < 0 || x >= width || y >= height)
		return Tile.grassTile;
            
            Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
                    return Tile.dirtTile;
                    return t;
        }
	
	private void loadWorld(String path){
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
        
        public EntityManager getEntityManager() {
        return entityManager;
        }

         public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
        }
	
}








