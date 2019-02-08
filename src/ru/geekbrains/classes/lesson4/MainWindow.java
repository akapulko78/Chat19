package ru.geekbrains.classes.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {
    private JTextField jTextField;
    private JList<String> list;
    private DefaultListModel<String> listModel;

    public MainWindow() throws HeadlessException {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton[] jbs = new JButton[5];
        for (int i = 0; i < 5; i++) {
            jbs[i] = new JButton("#" + i);
        }
        setLayout(new BorderLayout());   // выбор компоновщика элементов
        add(jbs[0], BorderLayout.EAST);  // добавление кнопки на форму
        add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.SOUTH);

        jbs[2].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.add(listModel.size(), jTextField.getText());
            }
        });

        jTextField = new JTextField();
        add(jTextField, BorderLayout.NORTH);

        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        add(list, BorderLayout.CENTER);
        setVisible(true);
    }
}
