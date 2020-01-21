/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryyy.Input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import tryyy.gui.GUIManager;

public class MouseManager implements MouseListener, MouseMotionListener{

        private boolean leftPressed, rightPressed;
	private int mouseX, mouseY;
        private GUIManager guiManager;
	
	public MouseManager(){
            
	}
        
        public void setGUIManager(GUIManager guiManager){
            this.guiManager = guiManager;
	}
	
	// Getters
	
	public boolean isLeftPressed(){
		return leftPressed;
	}
	
	public boolean isRightPressed(){
		return rightPressed;
	}
	
	public int getMouseX(){
		return mouseX;
	}
	
	public int getMouseY(){
		return mouseY;
	}

        //Impelemnted Methods
        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getButton() == MouseEvent.BUTTON1)
		leftPressed = true;
            else if(e.getButton() == MouseEvent.BUTTON3)
		rightPressed = true;
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getButton() == MouseEvent.BUTTON1)
                leftPressed = false;
            else if(e.getButton() == MouseEvent.BUTTON3)
		rightPressed = false;
            
            if(guiManager != null)
		guiManager.onMouseRelease(e);
        }
    
        @Override
        public void mouseMoved(MouseEvent e) {
            mouseX = e.getX();
            mouseY = e.getY();
                
             if(guiManager != null)
		guiManager.onMouseMove(e);
        }
        
        @Override
        public void mouseDragged(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
               
        @Override
        public void mouseClicked(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        @Override
        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
       

    
    
}
