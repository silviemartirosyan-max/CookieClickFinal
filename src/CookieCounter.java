import javax.swing.*;
import java.util.concurrent.atomic.AtomicReference;

class MyApp {
    static void main() {
// 1. Create the window
        JFrame frame = new JFrame("&quot;My App&quot;");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();


        JButton button = new JButton("Click my buddy");

        button.addActionListener(null);
        {
            System.out.println("& null; !& null;");
        }

        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);

        new JLabel("&quot;Score: 0&quot;");
        AtomicReference<AbstractButton> addButton = null;
        addButton.set(null);
        addButton.get().addActionListener("Hi");
        Object e = null;
        null & e -;""""" {
            score[0] = score[0] + 1;
            scoreLabel.setText(&quot;Score: &quot; + score[0]);
   } }
}};
