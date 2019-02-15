package ru.geekbrains.classes.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MainWindow extends JFrame {
    private final JTextField jtf;
//    private final JTextArea jta = new JTextArea(10,20);
    private JButton sendButton;
    private JScrollPane jScrollPane;
    private DefaultListModel<Message> listModel;
    private JList<Message> list;
    private JPanel panel;

    public MainWindow() throws HeadlessException {
        setTitle("My Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        list.setCellRenderer(new MessageCellRenderer());

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(list,BorderLayout.SOUTH);
        panel.setBackground(list.getBackground());
        jScrollPane = new JScrollPane(panel);
        add(jScrollPane, BorderLayout.CENTER);

        jtf = new JTextField(25);
        sendButton = new JButton("sent message");
        sendButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitMessage("user", jtf.getText());
                jtf.setText(null);
                jtf.requestFocus();
            }
        });

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent evt) {
                list.ensureIndexIsVisible(listModel.size() - 1);
            }
        });

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(sendButton, BorderLayout.EAST);
        panel.add(jtf, BorderLayout.CENTER);

        add(panel, BorderLayout.SOUTH);

        setVisible(true);

        jtf.requestFocus();

//        setLocationRelativeTo(null);
//        setAlwaysOnTop(true);
//        jta.setLineWrap(true);
//        jta.setEditable(false);
    }

    public void submitMessage(String user, String message) {
        if (message == null || message.isEmpty()) {
            return;
        }
        listModel.add(listModel.size(), new Message(user, message));
        list.ensureIndexIsVisible(listModel.size() - 1);
    }
}
