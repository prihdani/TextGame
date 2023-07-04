import javax.swing.*;
import java.awt.*;

public class Game {

    JFrame window;
    Container container;
    JPanel titleNamePanel, buttonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,90);
    Font buttonFont = new Font("Times New Roman", Font.PLAIN, 45);
    JButton startingButton;

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

        titleNameLabel = new JLabel("Kalandjatek");
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
        buttonPanel.add(startingButton);
        startingButton.setFont(buttonFont);
    }
}