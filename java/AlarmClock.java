import java.awt.GridLayout;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class AlarmClock {
    private static LocalTime alarmTime;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AlarmClock::createUI);
    }

    private static void createUI() {
        JFrame frame = new JFrame("Alarm Clock");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        JLabel timeLabel = new JLabel("Set Alarm (HH:mm):");
        JTextField timeField = new JTextField();
        JButton setButton = new JButton("Set Alarm");
        JButton stopButton = new JButton("Stop Alarm");

        setButton.addActionListener(e -> {
            String timeText = timeField.getText();
            try {
                alarmTime = LocalTime.parse(timeText, DateTimeFormatter.ofPattern("HH:mm"));
                JOptionPane.showMessageDialog(frame, "Alarm set for " + alarmTime);
                startAlarm();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid time format. Use HH:mm.");
            }
        });

        stopButton.addActionListener(e -> {
            alarmTime = null;
            JOptionPane.showMessageDialog(frame, "Alarm stopped.");
        });

        frame.add(timeLabel);
        frame.add(timeField);
        frame.add(setButton);
        frame.add(stopButton);
        frame.setVisible(true);
    }

    private static void startAlarm() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (LocalTime.now().equals(alarmTime)) {
                    JOptionPane.showMessageDialog(null, "Alarm! Time is up!");
                    timer.cancel(); // Stop the timer
                }
            }
        }, 0, 1000); // Check every second
    }
}
