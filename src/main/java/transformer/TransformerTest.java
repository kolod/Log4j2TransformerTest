/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transformer;

import java.awt.*;
import javax.swing.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author alexa
 */
public class TransformerTest extends JFrame {

    private static final Logger logger = LogManager.getLogger();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TransformerTest().setVisible(true);
            logger.info("Hello!");
        });
    }

    public TransformerTest() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 600));
        JTextArea logTextArea = new JTextArea();
        add(logTextArea);
        TextAreaAppender.addTextArea(logTextArea);
        pack();
        setLocationRelativeTo(null);
    }    
}
