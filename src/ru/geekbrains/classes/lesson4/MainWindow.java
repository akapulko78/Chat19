package ru.geekbrains.classes.lesson4;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final JTextField jtf;
    private final JTextArea jta = new JTextArea(10,20);
    private final JButton sendButton;

    public MainWindow() throws HeadlessException {
        setTitle("My Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        jta.setLineWrap(true);
        jta.setEditable(false);

        sendButton = new JButton("sent message");
        add(sendButton, BorderLayout.SOUTH);
        sendButton.addActionListener(e -> sendMsg());


        JScrollPane jsp = new JScrollPane(jta);
        add(jsp, BorderLayout.CENTER);


        JPanel upperPanel = new JPanel(new BorderLayout());
        upperPanel.add(sendButton, BorderLayout.EAST);
        jtf = new JTextField(25);
        upperPanel.add(jtf, BorderLayout.CENTER);
        add(upperPanel, BorderLayout.SOUTH);

        Font font = new Font("Arial", Font.BOLD, 18);
        jta.setFont(font);

        jtf.addActionListener(e -> sendMsg());//отправка сообщение нажатием ENTER

        setVisible(true);
    }
    public void sendMsg() {
        jta.append(jtf.getText() + "\n");
        jtf.setText("");
        jtf.grabFocus();
    }
}
