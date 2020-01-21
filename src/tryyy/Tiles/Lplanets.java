/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.Tiles;

import java.awt.Graphics;
import tryyy.gfx.Assets;

public class Lplanets extends Tile {

	public Lplanets(int id) {
		super(Assets.lplanets, id);
	}

        @Override
        public void render(Graphics g, int x, int y){
        //g.drawImage(texture, x, y, 500, 500,null);
    }
}