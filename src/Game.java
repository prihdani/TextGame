import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    int hp;
    String weapon;
    JFrame window;
    Container container;
    JPanel titleNamePanel, buttonPanel, mainTextPanel, inGameButtonPanel, characterPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman",Font.PLAIN,90);
    Font averageFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startingButton, choice1, choice2, choice3, choice4;
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
        startingButton.setFocusPainted(false);
        startingButton.addActionListener(tsHandler);
        buttonPanel.add(startingButton);
        startingButton.setFont(averageFont);
    }

    public void createGameScreen(){

        titleNamePanel.setVisible(false);
        buttonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        container.add(mainTextPanel);
        textarea = new JTextArea("Ez egy teszt szöveg");
        textarea.setBackground(Color.BLACK);
        textarea.setBounds(100,100,600,250);
        textarea.setForeground(Color.white);
        textarea.setFont(averageFont);
        textarea.setLineWrap(true);
        mainTextPanel.add(textarea);

        inGameButtonPanel = new JPanel();
        inGameButtonPanel.setBounds(250,350,300,150);
        inGameButtonPanel.setBackground(Color.black);
        inGameButtonPanel.setLayout(new GridLayout(4,1));
        container.add(inGameButtonPanel);

        choice1 = new JButton("teszt1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(averageFont);
        choice1.setFocusPainted(false);
        inGameButtonPanel.add(choice1);

        choice2 = new JButton("teszt2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(averageFont);
        choice2.setFocusPainted(false);
        inGameButtonPanel.add(choice2);

        choice3 = new JButton("teszt3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(averageFont);
        choice3.setFocusPainted(false);
        inGameButtonPanel.add(choice3);

        choice4 = new JButton("teszt4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(averageFont);
        choice4.setFocusPainted(false);
        inGameButtonPanel.add(choice4);

        characterPanel = new JPanel();
        characterPanel.setBounds(100,15,600,50);
        characterPanel.setBackground(Color.black);
        characterPanel.setLayout(new GridLayout(1,4));
        container.add(characterPanel);

        hpLabel = new JLabel("HP:");
        hpLabel.setFont(averageFont);
        hpLabel.setForeground(Color.white);
        characterPanel.add(hpLabel);

        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(averageFont);
        hpLabelNumber.setForeground(Color.white);
        characterPanel.add(hpLabelNumber);

        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setFont(averageFont);
        weaponLabel.setForeground(Color.white);
        characterPanel.add(weaponLabel);

        weaponLabelName = new JLabel();
        weaponLabelName.setFont(averageFont);
        weaponLabelName.setForeground(Color.white);
        characterPanel.add(weaponLabelName);

        playerStats();
    }

    public void playerStats(){
        hp = 15;
        weapon = "Stick";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText(String.valueOf(hp));
    }

    public class TitleScreenHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }
}