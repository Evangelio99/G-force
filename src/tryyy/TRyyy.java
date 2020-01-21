/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy;

/*import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream; */


public class TRyyy {

	public static void main(String[] args){
		//playMusic("/textures/sound.wav");
                Game game = new Game("Tile Game!", 1000, 800);
		game.start();
                
	}
	
      /*  public static void playMusic(String filepath){
            InputStream music;
            try{
                music = new FileInputStream(new File(filepath));
                AudioStream audios = new AudioStream(music);
                AudioPlayer.player.start(audios);
            }
            catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Error");
                e.printStackTrace();
		}
        } */
}
