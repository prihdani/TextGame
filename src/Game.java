import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    JFrame window;
    Container container;
    JPanel titleNamePanel, buttonPanel, mainTextPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,90);
    Font averageFont = new Font("Times New Roman", Font.PLAIN, 45);
    JButton startingButton;
    JTextArea textarea;
    TitleScreenHandler tsHandler = new TitleScreenHandler();


    public static void main(String[] args) {

        new Game();
    }
    public Game(){
        window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        container = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,150);
        titleNamePanel.setBackground(Color.BLACK);
        container.add(titleNamePanel);

        titleNameLabel = new JLabel("Kalandjáték");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);

        buttonPanel = new JPanel();
        buttonPanel.setBounds(300,400,200,100);
        buttonPanel.setBackground(Color.BLACK);
        container.add(buttonPanel);

        startingButton = new JButton("Kezdés");
        startingButton.setBackground(Color.BLACK);
        startingButton.setForeground(Color.white);
        startingButton.addActionListener(tsHandler);
        buttonPanel.add(startingButton);
        startingButton.setFont(averageFont);
    }

    public void createGameScreen(){

        titleNamePanel.setVisible(false);
        buttonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLUE);
        container.add(mainTextPanel);
        textarea = new JTextArea("Ez egy teszt szöveg");
        textarea.setBackground(Color.BLACK);
        textarea.setBounds(100,100,600,250);
        textarea.setForeground(Color.white);
        textarea.setFont(averageFont);
        textarea.setLineWrap(true);
        mainTextPanel.add(textarea);
    }

    public class TitleScreenHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }
}