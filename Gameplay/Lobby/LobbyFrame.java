package Gameplay.Lobby;

import java.awt.*;
import javax.swing.*;

/* TODO:
 * Use Graphics to draw / add sprite to page
 * Use Keyboard listener and if checks for interactions
 * May NOT need all the additional JPanel objects -- Check for a potential draw function
 */

public class LobbyFrame {
    
    private JPanel mainPanel;
    private JPanel Left;
    private JPanel Right;
    private JPanel Bottom;
    private JPanel Top;
    private JPanel Center;

    private JFrame MapFrame;

    public void initialize(){

        MapFrame = new JFrame();

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        //Create the Panels to overlay on the main Panel
        Left = new JPanel();
        Right = new JPanel();
        Bottom = new JPanel();
        Top = new JPanel();
        Center = new JPanel();

        mainPanel.add(Left, BorderLayout.WEST);        
        mainPanel.add(Right, BorderLayout.EAST);
        mainPanel.add(Bottom, BorderLayout.SOUTH);
        mainPanel.add(Top, BorderLayout.NORTH);
        mainPanel.add(Center, BorderLayout.CENTER);

        MapFrame.setTitle("Lobby");
        // setSize(500, 600);
        MapFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        MapFrame.setResizable(false);
        // MapFrame.setMinimumSize(new Dimension(700, 500));
        MapFrame.setLocationRelativeTo(null);
        MapFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MapFrame.add(mainPanel);

        MapFrame.setVisible(true);
    }

    public static void main(String args[]){
        Gameplay.Lobby.LobbyFrame field = new Gameplay.Lobby.LobbyFrame();
        field.initialize();
    }
}
