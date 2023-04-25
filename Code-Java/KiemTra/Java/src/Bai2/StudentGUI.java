package Bai2;

import javax.swing.*;
import java.awt.*;

public class StudentGUI extends JFrame {

    private JLabel nameLabel, genderLabel, mathLabel, physicsLabel, englishLabel, averageLabel;
    private JTextField nameField, mathField, physicsField, englishField, averageField;
    private JRadioButton maleButton, femaleButton;
    private JButton insertButton, averageButton, exitButton;

    public StudentGUI() {
        super("Input Marks - LeDinhMinh - 211204113 - CNTT3K62");


        nameLabel = new JLabel("Name:");
        genderLabel = new JLabel("Sex:");
        mathLabel = new JLabel("Math:");
        physicsLabel = new JLabel("Physics:");
        englishLabel = new JLabel("English:");
        averageLabel = new JLabel("Average:");

        nameField = new JTextField(20);
        mathField = new JTextField(5);
        physicsField = new JTextField(5);
        englishField = new JTextField(5);
        averageField = new JTextField(5);
        averageField.setEditable(false);


        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);


        insertButton = new JButton("Insert");
        averageButton = new JButton("Average marks");
        exitButton = new JButton("Exit");

        JPanel genderPanel = new JPanel(new FlowLayout());
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);


        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(insertButton);
        buttonPanel.add(averageButton);
        buttonPanel.add(exitButton);


        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(genderLabel);
        inputPanel.add(genderPanel);
        inputPanel.add(mathLabel);
        inputPanel.add(mathField);
        inputPanel.add(physicsLabel);
        inputPanel.add(physicsField);
        inputPanel.add(englishLabel);
        inputPanel.add(englishField);
        inputPanel.add(averageLabel);
        inputPanel.add(averageField);


        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);


        insertButton.addActionListener(e -> {

            String name = nameField.getText();
            String gender = maleButton.isSelected() ? "Male" : "Female";
            double math = Double.parseDouble(mathField.getText());
            double physics = Double.parseDouble(physicsField.getText());
            double english = Double.parseDouble(englishField.getText());


            JOptionPane.showMessageDialog(this, "Input successful");


            nameField.setText("");
            mathField.setText("");
            physicsField.setText("");
            englishField.setText("");
        });

        averageButton.addActionListener(e -> {

            double math = Double.parseDouble(mathField.getText());
            double physics = Double.parseDouble(physicsField.getText());
            double english = Double.parseDouble(englishField.getText());


            double average = (math + physics + english) / 3;

            averageField.setText(String.format("%.2f", average));
        });

        exitButton.addActionListener(e -> {
            System.exit(0);
        });

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentGUI();
    }
}
