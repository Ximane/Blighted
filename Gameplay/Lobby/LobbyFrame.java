package Gameplay.Lobby;

import java.awt.*;
import javax.swing.*;

/* TODO:
 * Use Graphics to draw / add sprite to page
 * Use Keyboard listener and if checks for interactions
 * May NOT need all the additional JPanel objects -- Check for a potential draw function
 */

public class LobbyFrame{
    
    private JPanel mainPanel;
    // private JPanel Left;
    // private JPanel Right;
    // private JPanel Bottom;
    // private JPanel Top;
    // private JPanel Center;

    private JFrame lobbyFrame;

    public void initialize(){

        lobbyFrame = new JFrame();

        mainPanel = new GraphicsPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(112, 128, 144));

        //Create the Panels to overlay on the main Panel
        // Left = new JPanel();
        // Right = new JPanel();
        // Bottom = new JPanel();
        // Top = new JPanel();
        // Center = new JPanel();

        // mainPanel.add(Left, BorderLayout.WEST);        
        // mainPanel.add(Right, BorderLayout.EAST);
        // mainPanel.add(Bottom, BorderLayout.SOUTH);
        // mainPanel.add(Top, BorderLayout.NORTH);
        // mainPanel.add(Center, BorderLayout.CENTER);

        lobbyFrame.setTitle("Lobby");
        lobbyFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        lobbyFrame.setResizable(false);
        // lobbyFrame.setSize(500, 600);
        // lobbyFrame.setMinimumSize(new Dimension(700, 500));
        lobbyFrame.setLocationRelativeTo(null);
        lobbyFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lobbyFrame.add(mainPanel);

        lobbyFrame.setVisible(true);
    }

    public static void main(String args[]){
        Gameplay.Lobby.LobbyFrame field = new Gameplay.Lobby.LobbyFrame();
        field.initialize();
    }
}
