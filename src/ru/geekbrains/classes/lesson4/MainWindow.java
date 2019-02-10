package ru.geekbrains.classes.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {
    private final JTextField jtf;
    private final JTextArea jta = new JTextArea(10,20);
    private final JButton sendButton;
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
               // submitMessage("user", jtf.getText());
                jtf.requestFocus();
            }
        });

        //this.addComponentListener





        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        jta.setLineWrap(true);
        jta.setEditable(false);


        add(sendButton, BorderLayout.SOUTH);




        JPanel upperPanel = new JPanel(new BorderLayout());
        upperPanel.add(sendButton, BorderLayout.EAST);

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
