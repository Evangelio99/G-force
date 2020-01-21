/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.Tiles;

import java.awt.Graphics;
import static tryyy.Tiles.Tile.TILEHEIGHT;
import tryyy.gfx.Assets;

/**
 *
 * @author SHIELA FORBES
 */
public class BorderLR extends Tile{
    
        public BorderLR(int id) {
        super(Assets.Border, id);
    }
    

    @Override
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, 5000, null);
	}
    
}
