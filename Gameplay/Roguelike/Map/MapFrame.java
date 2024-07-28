package Gameplay.Roguelike.Map;
import java.awt.*;
import javax.swing.*;

/*TODO
 * Figure out why this is NOT running; java.lang.ClassNotFoundException -- Fixed (Maybe)
 */

public class MapFrame{

    private JPanel mainPanel;

    private JFrame MapFrame;

    public void initialize(){

        MapFrame = new JFrame();

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        MapFrame.setTitle("Game");
        // setSize(500, 600);
        MapFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        MapFrame.setResizable(false);
        // MapFrame.setMinimumSize(new Dimension(700, 500));
        MapFrame.setLocationRelativeTo(null);
        MapFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MapFrame.setVisible(true);
    }

    public static void main(String args[]){
        MapFrame field = new MapFrame();
        field.initialize();
    }
}