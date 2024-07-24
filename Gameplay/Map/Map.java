import java.awt.*;
import javax.swing.*;



public class Map extends JFrame {

    public void initialize(){

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        setTitle("Game");
        // setSize(500, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(700, 500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
    }

    // public static void main(String args[]){
    //     Map field = new Map();
    //     field.initialize();
    // }
}