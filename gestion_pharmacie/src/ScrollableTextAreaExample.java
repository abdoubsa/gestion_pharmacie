import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ScrollableTextAreaExample {
    public static void main(String[] args) {
        // Create a JFrame
        showTextArea();
    }

    public static void showTextArea() {
        JFrame frame = new JFrame("Scrollable JTextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create a JTextArea
        JTextArea textArea = new JTextArea(10, 30); // 10 rows, 30 columns
        textArea.setLineWrap(true); // Wrap lines when text exceeds the width
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        // Wrap the JTextArea in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Add the JScrollPane to the frame
        frame.add(scrollPane);

        textArea.setText("HELLO EVERYONE BLA BLA BLAsdfasdfs");

        // Make the frame visible
        frame.setVisible(true);
    }
}
