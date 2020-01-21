/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.gfx;
import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 64, height = 64;
	
	public static BufferedImage player, dirt, grass, stone, planets, galaxy, lplanets, Border, menu;
        public static BufferedImage[] player_down, player_up, player_left, player_right;
        public static BufferedImage[] btn_start;

	public static void init(){
            SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
            
            btn_start = new BufferedImage[2];
            btn_start[0] = sheet.crop(width * 6, height * 4, width * 2, height);
            btn_start[1] = sheet.crop(width * 6, height * 5, width * 2, height);
            
            player_down = new BufferedImage[2];
            player_up = new BufferedImage[2];
            player_left = new BufferedImage[2];
            player_right = new BufferedImage[2];
		
            player_down[0] = sheet.crop(width * 4, 0, width, height);
            player_down[1] = sheet.crop(width * 5, 0, width, height);
            player_up[0] = sheet.crop(width * 6, 0, width, height);
            player_up[1] = sheet.crop(width * 7, 0, width, height);
            player_right[0] = sheet.crop(width * 4, height, width, height);
            player_right[1] = sheet.crop(width * 5, height, width, height);
            player_left[0] = sheet.crop(width * 6, height, width, height);
            player_left[1] = sheet.crop(width * 7, height, width, height);
                
		dirt = sheet.crop(width, 0, width, height);
		grass = sheet.crop(width * 2, 0, width, height);
		stone = sheet.crop(width * 3, 0, width, height);
		planets = sheet.crop(0, height, width, height);
                
                Border = ImageLoader.loadImage("/Textures/Border.png");
                galaxy = ImageLoader.loadImage("/Textures/Background1.png");
                lplanets = ImageLoader.loadImage("/Textures/lplanets.png");
                menu = ImageLoader.loadImage("/Textures/menu.png");
	}

 
	
}
