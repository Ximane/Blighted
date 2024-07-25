package HomeScreen;
import java.awt.*;
import javax.swing.*;

public class Home {

    private JFrame homePage;

    private JPanel mainPanel;
    private JPanel FirstBlock;
    private JPanel SecondBlock;
    private JPanel ThirdBlock;
    private JPanel FourthBlock;
    private JPanel FifthBlock;
    private JPanel SixthBlock;

    private JButton play;
    private JButton settings;
    private JButton quit;
    private JButton back;

    
    
    //Function to set the default settings for the JFrame
    public void defaultFrameSetting(JFrame frame){
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setMinimumSize(new Dimension(700, 500));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Function to Make Buttons Blend with Background
    public void BlendedButton(JButton button){
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }

    //Initialize the Home Screen
    public void initialize(){
        homePage = new JFrame();
        homePage.setTitle("Home");
        defaultFrameSetting(homePage);

        //Create the Play Button
        play = new JButton("Play");
        BlendedButton(play);
        
        //Create Settings Button
        settings = new JButton("Settings");
        BlendedButton(settings);
        settings.addActionListener(e->{
            SecondBlock.remove(play);
            ThirdBlock.remove(settings);
            FourthBlock.remove(quit);
            
            //Back Button for Settings Page
            back = new JButton("Back");
            BlendedButton(back);
            back.addActionListener(f->{
                SixthBlock.remove(back);
                SecondBlock.add(play);
                ThirdBlock.add(settings);
                FourthBlock.add(quit);
                defaultFrameSetting(homePage);
            });
            SixthBlock.add(back);

            // homePage.pack();
            defaultFrameSetting(homePage);
        });

        //Quit Buttom Implementation
        quit = new JButton("Quit");
        BlendedButton(quit);
        quit.addActionListener(e -> {
            homePage.dispose(); //Exit on click
         });
        
         //Create the Panels that are viewed
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6,3));
        mainPanel.setBackground(new Color(128, 128, 255));

        FirstBlock = new JPanel();
        SecondBlock = new JPanel();
        ThirdBlock = new JPanel();
        FourthBlock = new JPanel();
        FifthBlock = new JPanel();
        SixthBlock = new JPanel();
        // JPanel options = new JPanel();
        // options.setLayout(new BoxLayout(options, BoxLayout.PAGE_AXIS));
        // options.setBackground(new Color(255));

        SecondBlock.add(play);
        ThirdBlock.add(settings);
        FourthBlock.add(quit);        

        mainPanel.add(FirstBlock);
        mainPanel.add(SecondBlock);
        mainPanel.add(ThirdBlock);
        mainPanel.add(FourthBlock);
        mainPanel.add(FifthBlock);
        mainPanel.add(SixthBlock);

        homePage.add(mainPanel);
        
        homePage.setVisible(true);
    }

    public static void main(String args[]){
        Home field = new Home();
        field.initialize();
    }
}

