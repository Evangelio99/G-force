/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.Tiles;

import java.awt.Graphics;
import static javax.swing.Spring.height;
import static javax.swing.Spring.width;
import tryyy.States.State;
import tryyy.gfx.Assets;

/**
 *
 * @author SHIELA FORBES
 */

public class Galaxy extends Tile {

	public Galaxy(int id) {
		super(Assets.galaxy, id);
	}
        
        @Override
        public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, 5000, 5000,null);
    }
        
	     
}