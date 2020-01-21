/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.States;
import java.awt.Color;
import java.awt.Graphics;

import tryyy.Game;
import tryyy.Handler;
import tryyy.gfx.Assets;
import tryyy.gui.ClickListener;
import tryyy.gui.GUIImageButton;
import tryyy.gui.GUIManager;

public class MenuState extends State {

    private GUIManager guiManager;
    
	public MenuState(Handler handler){
            super(handler);
                
            guiManager = new GUIManager(handler);
            handler.getMouseManager().setGUIManager(guiManager);

            guiManager.addObject(new GUIImageButton(433, 620, 128, 64, Assets.btn_start, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setGUIManager(null);
                State.setState(handler.getGame().gameState);
            }
            }));
	}

	@Override
	public void tick() {
            /*if(handler.getMouseManager().isLeftPressed())
                State.setState(handler.getGame().gameState); */
            
            guiManager.tick();
	}

	@Override
	public void render(Graphics g) {
            /*g.setColor(Color.RED);
            g.fillRect(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 8, 8); */
            g.drawImage(Assets.menu, 0, 0, null);
            guiManager.render(g);
	}
	
}
