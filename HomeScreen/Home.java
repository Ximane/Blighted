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

    private ImageIcon background;

    private JLabel bg;

    private Dimension minimized = new Dimension(700, 500);
    
    //Function to set the default settings for the JFrame
    public void defaultFrameSetting(JFrame frame){
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setMinimumSize(minimized);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Function to Make Buttons Blend with Background
    public void BlendedButton(JButton button){
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }

    //Function to Make Panels Blend with Background
    public void BlendedPane(JPanel panel){
        panel.setBackground(new Color (0, 0, 0, 0));
    }

    //Initialize the Home Screen
    public void initialize(){
        homePage = new JFrame();
        homePage.setTitle("Home");
        defaultFrameSetting(homePage);

        // background = new ImageIcon("\\HomePageIcons\\TesterImage.png");
        // bg = new JLabel("", background, JLabel.CENTER);
        // bg.setBounds(0, 0, JFrame.MAXIMIZED_HORIZ, JFrame.MAXIMIZED_VERT);
        // bg.setMinimumSize(minimized);
        // homePage.add(bg);

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
        // BlendedPane(mainPanel);

        FirstBlock = new JPanel();
        // BlendedPane(FirstBlock);
        SecondBlock = new JPanel();
        // BlendedPane(SecondBlock);
        ThirdBlock = new JPanel();
        // BlendedPane(ThirdBlock);
        FourthBlock = new JPanel();
        // BlendedPane(FourthBlock);
        FifthBlock = new JPanel();
        // BlendedPane(FifthBlock);
        SixthBlock = new JPanel();
        // BlendedPane(SixthBlock);


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

