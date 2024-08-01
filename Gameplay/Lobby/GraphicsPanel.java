package Gameplay.Lobby;
import java.awt.*;
import javax.swing.*;


public class GraphicsPanel extends JPanel{

    int panelHeight;
    int panelWidth;
    
    @Override
    //Function to draw on the frame to create the terrain outlines
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;

        getDimensions(this);

        //Research Table
        graphics.setColor(Color.PINK);
        graphics.drawRect(0, (int)(panelHeight*0.55), (int)(panelWidth*0.075), (int)(panelHeight*0.3));
        graphics.fillRect(0, (int)(panelHeight*0.55), (int)(panelWidth*0.075), (int)(panelHeight*0.3));

        //Entertainment Shop NPC
        
        //Stools + Window - See the music and backgrounds collected
        
        //NPC 1 - Temp Buff

        //NPC 2

        //NPC 3

        //Play

        //Item Box

        //Spawn Box - Can make small carpet

        //Random Event Corner - Just need the coordinates moreso than anything

        //Costume closet

        //Exchange COunter

        //Shady Gambling
    
    }

    public void getDimensions(JPanel pane){
        if(panelHeight != 0 || panelWidth !=0){
            // System.out.print("GERRRR");
            return;
        }

        panelHeight = pane.getHeight();
        panelWidth = pane.getWidth();

        // System.out.print(panelWidth + " " + panelHeight);
    }
}
