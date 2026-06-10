import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame;
    JPanel panel;
    JPanel fillerPanel;
    JLabel label;
    JLabel cost1;
    JLabel cost2;
    JLabel cost3;
    JLabel cost4;
    JLabel cost5;
    JLabel cost6;
    JLabel cost7;
    JButton cookieButton;
    JButton upgradeButton1;
    JButton upgradeButton2;
    JButton upgradeButton3;
    JButton upgradeButton4;
    JButton upgradeButton5;
    JButton upgradeButton6;
    JButton upgradeButton7;
    int counter = 0;
    Game cookies;
    ActionListener guiUpdate;
    Timer updateTimer;

    public GUI() {
        this.cookies = new Game();
        frame = new JFrame();
        panel = new JPanel();
        fillerPanel = new JPanel();
        label = new JLabel("Loading");

        cost1 = new JLabel("Upgrade Cost: " + cookies.upgrade1Cost);
        cost2 = new JLabel("Upgrade Cost: " + cookies.upgrade2Cost);
        cost3 = new JLabel("Upgrade Cost: " + cookies.upgrade3Cost);
        cost4 = new JLabel("Upgrade Cost: " + cookies.upgrade4Cost);
        cost5 = new JLabel("Upgrade Cost: " + cookies.upgrade5Cost);
        cost6 = new JLabel("Upgrade Cost: " + cookies.upgrade6Cost);
        cost7 = new JLabel("Upgrade Cost: " + cookies.upgrade7Cost);

        cookieButton = new JButton("COOKIE");
        upgradeButton1 = new JButton("MUCHO CLICK");
        upgradeButton2 = new JButton("SLOW COOK");
        upgradeButton3 = new JButton("DOUBLE DIP");
        upgradeButton4 = new JButton("COOKIE RAIN");
        upgradeButton5 = new JButton("BAKER BUDDY");
        upgradeButton6 = new JButton("OVEN BOOST");
        upgradeButton7 = new JButton("COOKIE JACKPOT");

        cookieButton.setBackground(Color.ORANGE);
        upgradeButton1.setBackground(Color.CYAN);
        upgradeButton2.setBackground(Color.YELLOW);
        upgradeButton3.setBackground(Color.GREEN);
        upgradeButton4.setBackground(Color.MAGENTA);
        upgradeButton5.setBackground(Color.BLUE);
        upgradeButton6.setBackground(Color.PINK);
        upgradeButton7.setBackground(Color.LIGHT_GRAY);

        cookieButton.addActionListener(this);
        upgradeButton1.addActionListener(e -> cookies.buyUpgrade1());
        upgradeButton2.addActionListener(e -> cookies.buyUpgrade2());
        upgradeButton3.addActionListener(e -> cookies.buyUpgrade3());
        upgradeButton4.addActionListener(e -> cookies.buyUpgrade4());
        upgradeButton5.addActionListener(e -> cookies.buyUpgrade5());
        upgradeButton6.addActionListener(e -> cookies.buyUpgrade6());
        upgradeButton7.addActionListener(e -> cookies.buyUpgrade7());

        guiUpdate = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Cookies: " + cookies.cookieCounter);
                cost1.setText("Upgrade Cost: " + cookies.upgrade1Cost);
                cost2.setText("Upgrade Cost: " + cookies.upgrade2Cost);
                cost3.setText("Upgrade Cost: " + cookies.upgrade3Cost);
                cost4.setText("Upgrade Cost: " + cookies.upgrade4Cost);
                cost5.setText("Upgrade Cost: " + cookies.upgrade5Cost);
                cost6.setText("Upgrade Cost: " + cookies.upgrade6Cost);
                cost7.setText("Upgrade Cost: " + cookies.upgrade7Cost);
            }
        };

        updateTimer = new Timer(500, guiUpdate);
        updateTimer.start();

        panel.setSize(800, 400);
        panel.setLayout(new GridLayout(4, 4));

        panel.add(cookieButton);
        panel.add(upgradeButton1);
        panel.add(upgradeButton2);
        panel.add(upgradeButton3);
        panel.add(upgradeButton4);
        panel.add(upgradeButton5);
        panel.add(upgradeButton6);
        panel.add(upgradeButton7);
        panel.add(label);
        panel.add(cost1);
        panel.add(cost2);
        panel.add(cost3);
        panel.add(cost4);
        panel.add(cost5);
        panel.add(cost6);
        panel.add(cost7);

        panel.setBackground(Color.PINK);

        fillerPanel.setSize(400, 400);
        fillerPanel.setBackground(Color.PINK);

        frame.add(panel);
        frame.add(fillerPanel);

        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cookies.click();
        label.setText("Cookies: " + cookies.cookieCounter);
    }
}
