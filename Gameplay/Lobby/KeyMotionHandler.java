package Gameplay.Lobby;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyMotionHandler implements KeyListener{

    public boolean upPress, downPress, leftPress, rightPress;

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_W){
            upPress=true;
        }
        if(key == KeyEvent.VK_A){
            leftPress=true;
        }
        if(key == KeyEvent.VK_S){
            downPress=true;
        }
        if(key == KeyEvent.VK_D){
            rightPress=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_W){
            upPress=false;
        }
        if(key == KeyEvent.VK_A){
            leftPress=false;
        }
        if(key == KeyEvent.VK_S){
            downPress=false;
        }
        if(key == KeyEvent.VK_D){
            rightPress=false;
        }
    }


    
}
