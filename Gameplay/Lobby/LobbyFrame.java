package Gameplay.Lobby;

import java.awt.*;
import javax.swing.*;

public class LobbyFrame {
    
    private JPanel mainPanel;

    private JFrame MapFrame;

    public void initialize(){

        MapFrame = new JFrame();

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

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
