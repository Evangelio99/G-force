/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.Entity.Creatures;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import tryyy.Game;
import tryyy.Handler;
import tryyy.gfx.Animation;
import tryyy.gfx.Assets;

public class Player extends Creatures {
    
    //Animations
    private Animation animDown, animUp, animLeft, animRight;
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, x,100, 100);
                
            bounds.x = 25;
            bounds.y = 25;
            bounds.width = 50;
            bounds.height = 50;
                
            animDown = new Animation(500, Assets.player_down);
            animUp = new Animation(500, Assets.player_up);
            animLeft = new Animation(500, Assets.player_left);
            animRight = new Animation(500, Assets.player_right);
            
            
             
	}

	@Override
	public void tick() {
            //Animations
            animDown.tick();
            animUp.tick();
            animRight.tick();
            animLeft.tick();
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
	}
        
        /*
        public void pointing(){
            int mX = handler.getMouseManager().getMouseX();
        int mY = height - handler.getMouseManager().getMouseX();
        int pX = sprite.x;
        int pY = sprite.y;
        int tempY, tempX;
        double mAng, pAng = sprite.angle;
        double angRotate=0;

        if(mX!=pX){
            mAng = Math.toDegrees(Math.atan2(mY - pY, mX - pX));
            if(mAng==0 && mX<=pX)
                mAng=180;
        }
        else{
            if(mY>pY)
                mAng=90;
            else
                mAng=270;
        }

        sprite.angle = mAng;
        sprite.image.setRotation((float) mAng);
        }
	*/
	private void getInput(){
		xMove = 0;
		yMove = 0;
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove = speed;
                if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove = speed;
                        
                 // x += Math.sin(Math.toRadians(xMove));
                 //y += Math.cos(Math.toRadians(yMove));
	}

	@Override
	public void render(Graphics g) {
           g.drawImage(getCurrentAnimationFrame(),(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height,null);
          
           
            // g.setColor(Color.red);
           // g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
				//(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
				//bounds.width, bounds.height);
            
            
            
           
	}
        
        private BufferedImage getCurrentAnimationFrame(){
	if(xMove < 0){
            return animLeft.getCurrentFrame();
        }
        else if(xMove > 0){
            return animRight.getCurrentFrame();
	}
        else if(yMove < 0){
            return animUp.getCurrentFrame();
	}
        else{
            return animDown.getCurrentFrame();
	}
	}
        
       
        
   
       
        
}
