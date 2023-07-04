import javax.swing.*;
import java.awt.*;

public class Game {

    JFrame window;
    Container container;

    public static void main(String[] args) {

        new Game();
    }
    public Game(){
        window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.getContentPane().setBackground(Color.BLUE);
        window.setLayout(null);
        window.setVisible(true);
        container = window.getContentPane();
    }
}