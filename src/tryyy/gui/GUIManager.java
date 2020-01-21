/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.gui;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import tryyy.Handler;

public class GUIManager {

	private Handler handler;
	private ArrayList<GUIObject> objects;
	
	public GUIManager(Handler handler){
            this.handler = handler;
            objects = new ArrayList<GUIObject>();
	}
	
	public void tick(){
            for(GUIObject o : objects)
                o.tick();
	}
	
	public void render(Graphics g){
            for(GUIObject o : objects)
                o.render(g);
	}
	
	public void onMouseMove(MouseEvent e){
            for(GUIObject o : objects)
                o.onMouseMove(e);
	}
	
	public void onMouseRelease(MouseEvent e){
            for(GUIObject o : objects)
                o.onMouseRelease(e);
	}
	
	public void addObject(GUIObject o){
            objects.add(o);
	}
	
	public void removeObject(GUIObject o){
            objects.remove(o);
	}

	public Handler getHandler() {
            return handler;
	}

	public void setHandler(Handler handler) {
            this.handler = handler;
	}

	public ArrayList<GUIObject> getObjects() {
            return objects;
	}

	public void setObjects(ArrayList<GUIObject> objects) {
            this.objects = objects;
	}
        
        
        
}