import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ContactBook {
    private static final ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ContactBook::createUI);
    }

    private static void createUI() {
        JFrame frame = new JFrame("Contact Book");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextField nameField = new JTextField();
        JTextField phoneField = new JTextField();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> contactList = new JList<>(listModel);

        JButton addButton = new JButton("Add Contact");
        JButton deleteButton = new JButton("Delete Contact");

        addButton.addActionListener(e -> {
            String name = nameField.getText();
            String phone = phoneField.getText();
            if (!name.isEmpty() && !phone.isEmpty()) {
                contacts.add(new Contact(name, phone));
                listModel.addElement(name + " - " + phone);
                nameField.setText("");
                phoneField.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Both fields are required.");
            }
        });

        deleteButton.addActionListener(e -> {
            int selectedIndex = contactList.getSelectedIndex();
            if (selectedIndex != -1) {
                contacts.remove(selectedIndex);
                listModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(frame, "Select a contact to delete.");
            }
        });

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Phone:"));
        inputPanel.add(phoneField);
        inputPanel.add(addButton);
        inputPanel.add(deleteButton);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(contactList), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    static class Contact {
        private final String name;
        private final String phone;

        public Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }
    }
}
