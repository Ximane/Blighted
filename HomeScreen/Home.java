package HomeScreen;
import java.awt.*;
import javax.swing.*;

public class Home {

    private JFrame homePage;
    private JButton play;
    private JButton settings;
    private JButton quit;
    private JPanel mainPanel;
    private JPanel holder;


    public void initialize(){
        homePage = new JFrame();
        homePage.setTitle("Home");
        homePage.setExtendedState(JFrame.MAXIMIZED_BOTH);
        homePage.setMinimumSize(new Dimension(700,500));
        homePage.setLocationRelativeTo(null);
        homePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // getContentPane().add(homePage);
        play = new JButton("Play");

        settings = new JButton("Settings");

        quit = new JButton("Quit");
        quit.addActionListener(e -> {
            homePage.dispose(); //Exit on click
         });
        

        // // setBackground(new Color(128, 128, 255));
        // setTitle("Home");
        // // setSize(500, 600);
        // setExtendedState(JFrame.MAXIMIZED_BOTH);
        // setMinimumSize(new Dimension(700,500));
        // setLocationRelativeTo(null);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6,3));
        mainPanel.setBackground(new Color(128, 128, 255));

        holder = new JPanel();
        // JPanel options = new JPanel();
        // options.setLayout(new BoxLayout(options, BoxLayout.PAGE_AXIS));
        // options.setBackground(new Color(255));

        // mainPanel.add(options);
        mainPanel.add(holder);
        mainPanel.add(play);
        mainPanel.add(settings);
        mainPanel.add(quit);
        homePage.add(mainPanel);
        

        homePage.setVisible(true);
    }

    public static void main(String args[]){
        Home field = new Home();
        field.initialize();
    }
}

