/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report.javatechology;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ADMIN
 */
public class SuccessDialog extends JFrame{
    JButton openPopupBtn;
    public SuccessDialog(){   
        
        this.openPopupBtn = new JButton("Insert successfully!");

        this.openPopupBtn.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(SuccessDialog.this, "You just opened a dialog.", "Warning Dialog", JOptionPane.WARNING_MESSAGE);
        });

        this.setTitle("Notification");
        this.setSize(400,200);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(this.openPopupBtn);
        this.setResizable(false);
    }
    
}
