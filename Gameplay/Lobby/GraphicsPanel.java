package Gameplay.Lobby;
import java.awt.*;
import javax.swing.*;


public class GraphicsPanel extends JPanel{

    int panelHeight;
    int panelWidth;
    int circle;
    
    @Override
    //Function to draw on the frame to create the terrain outlines
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        // graphics.fillRect(x, y, Width, Height);

        getDimensions(this);

        //Research Table
        graphics.setColor(Color.PINK);
        graphics.drawRect(0, (int)(panelHeight*0.65), (int)(panelWidth*0.05), (int)(panelHeight*0.2));

        //Entertainment Shop NPC
        graphics.setColor(Color.BLACK);
        graphics.drawOval((int)(panelWidth*0.04), (int)(panelHeight*0.3), circle, circle);
        
        //Stools + Window - See the music and backgrounds collected; Backdrop
        graphics.setColor(new Color(150, 222, 209)); //Robin Egg Blue
        graphics.drawRect(0, 0, (int)(panelWidth), (int)(panelHeight*0.15));
        graphics.drawRect((int)(panelWidth*0.3), 0, (int)(panelWidth*0.05), (int)(panelHeight*0.15)); //Pillar1
        graphics.drawRect((int)(panelWidth*0.65), 0, (int)(panelWidth*0.05), (int)(panelHeight*0.15)); //Pillar2

        // - Window
        graphics.setColor(Color.WHITE);
        graphics.drawRect((int)(panelWidth*0.025),(int)(panelHeight*0.025), (int)(panelWidth*0.2), (int)(panelHeight*0.1));
        
        // - Stools
        graphics.drawRect((int)(panelWidth*0.04), (int)(panelHeight*0.175), (int)(panelWidth*0.03), (int)(panelHeight*0.07));
        graphics.drawRect((int)(panelWidth*0.075), (int)(panelHeight*0.175), (int)(panelWidth*0.03), (int)(panelHeight*0.07));
        graphics.drawRect((int)(panelWidth*0.11), (int)(panelHeight*0.175), (int)(panelWidth*0.03), (int)(panelHeight*0.07));
        graphics.drawRect((int)(panelWidth*0.145), (int)(panelHeight*0.175), (int)(panelWidth*0.03), (int)(panelHeight*0.07));
        graphics.drawRect((int)(panelWidth*0.18), (int)(panelHeight*0.175), (int)(panelWidth*0.03), (int)(panelHeight*0.07));


        //NPC 1 - Temp Buff
        graphics.setColor(Color.WHITE);
        graphics.drawOval(panelWidth*21/36, panelHeight*11/18, circle, circle);

        //NPC 2
        graphics.drawOval(panelWidth*14/36, panelHeight*7/18, circle, circle);

        //NPC 3
        graphics.drawOval(panelWidth*21/36, panelHeight*7/18, circle, circle);

        //Play
        graphics.setColor(Color.WHITE);
        graphics.drawOval((int)((panelWidth-circle*2.5)/2), (int)((panelHeight*1.05-circle*2.5)/2), circle*3, circle*3);

        //Item Box
        graphics.drawRect(panelWidth/3, panelHeight*11/18, panelWidth/10, panelHeight/10);

        //Spawn Box - Can make small carpet
        graphics.drawRect((int)(panelWidth*0.4), (int)(panelHeight*0.9), (int)(panelWidth*0.2), (int)(panelHeight*0.1));

        //Exit Door
        graphics.drawRect((int)(panelWidth*0.2), (int)(panelHeight*0.95), (int)(panelWidth*0.1), (int)(panelHeight*0.05));

        //Random Event Corner - Just need the coordinates moreso than anything
        graphics.drawRect((int)(panelWidth*0.875), (int)(panelHeight*0.825), (int)(panelWidth*0.125), (int)(panelHeight*0.175));

        //Costume closet
        graphics.drawRect((int)(panelWidth*0.965), (int)(panelHeight*0.6), (int)(panelWidth*0.035), (int)(panelHeight*0.175));

        //Exchange Counter
        graphics.drawRect((int)(panelWidth*0.93), (int)(panelHeight*0.4), (int)(panelWidth*0.07), (int)(panelHeight*0.125));

        //Shady Gambling
        graphics.drawRect((int)(panelWidth*0.9), (int)(panelHeight*0.15), (int)(panelWidth*0.1), (int)(panelHeight*0.15));
    
    }

    public void getDimensions(JPanel pane){
        if(panelHeight != 0 || panelWidth !=0){
            // System.out.print("GERRRR");
            return;
        }

        panelHeight = pane.getHeight();
        panelWidth = pane.getWidth();
        circle = (int)(panelHeight*0.075);

        // System.out.print(panelWidth + " " + panelHeight);
    }
}
