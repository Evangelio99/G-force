/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.Tiles;
import java.awt.Graphics;
import tryyy.gfx.Assets;

public class Menu extends Tile {

	public Menu(int id) {
		super(Assets.menu, id);
	}
        
        @Override
        public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, 1000, 800,null);
}
}