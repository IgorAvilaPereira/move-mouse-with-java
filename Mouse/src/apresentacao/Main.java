/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.awt.Robot;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {
    public static final int SECONDS = 4000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;
    public static void main(String[] argv) throws Exception {
        JTextField textField = new JTextField("Aperte s para parar de mexer o mouse");
        textField.addKeyListener(new MKeyListener());
        JFrame jframe = new JFrame();
        jframe.add(textField);
        jframe.setSize(200, 200);
        jframe.setVisible(true);               
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(SECONDS);
        }
    }
}
