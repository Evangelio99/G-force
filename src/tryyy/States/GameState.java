/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.States;
import java.awt.Graphics;

import tryyy.Game;
import tryyy.Entity.Creatures.Player;
import tryyy.Entity.Statics.Planets;
import tryyy.Handler;
import tryyy.Worlds.World;

public class GameState extends State {
	
	//private Player player;
	private World world;
        private Planets planets;
	
	public GameState(Handler handler){
		super(handler);
               
                world = new World(handler, "res/worlds/world2.txt");
                handler.setWorld(world);
	//	player = new Player(handler, 100, 100);
	//	planets = new Planets(handler, 500, 500);
	}
	
	@Override
	public void tick() {
		world.tick();
	//	player.tick();
         //       planets.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
	//	player.render(g);
        //        planets.render(g);
	}

}