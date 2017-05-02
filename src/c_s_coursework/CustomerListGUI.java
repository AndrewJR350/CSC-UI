/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_s_coursework;

import employee_ws.EmployeeList;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andrew JR
 */
public class CustomerListGUI extends javax.swing.JFrame {

    /**
     * Creates new form CustomerListGUI
     */
    public CustomerListGUI() {
        initComponents();
        printCustomerDetails();
    }

    private void printCustomerDetails() {
        List<employee_ws.CustomerList> customers = getCustomerDetails();

        if (customers.get(0).getName().equals(null)) {
            errorMessage.setText("No Employee Found");
        } else {
            GridLayout experimentLayout = new GridLayout(0, 3);
            dynamicPanel.setLayout(experimentLayout);

            JLabel lblName = new JLabel("NAME");
            lblName.setForeground(Color.BLACK);
            lblName.setFont(new Font("Serif", Font.PLAIN, 18));
            lblName.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JLabel lblAccountNumber = new JLabel("ACCOUNT NUMBER");
            lblAccountNumber.setForeground(Color.BLACK);
            lblAccountNumber.setFont(new Font("Serif", Font.PLAIN, 18));
            lblAccountNumber.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JLabel lblManage = new JLabel("");
            lblManage.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            dynamicPanel.add(lblName);
            dynamicPanel.add(lblAccountNumber);
            dynamicPanel.add(lblManage);
            JButton[] buttons = new JButton[customers.size()];
            JLabel[] lblNames = new JLabel[customers.size()];
            JLabel[] lblAccountNumbers = new JLabel[customers.size()];

            int customerNumbers = 0;
            while (customerNumbers < customers.size()) {
                buttons[customerNumbers] = new JButton("EDIT/DELETE");
                lblNames[customerNumbers] = new JLabel(customers.get(customerNumbers).getName());
                lblAccountNumbers[customerNumbers] = new JLabel(customers.get(customerNumbers).getAccountNumber());
                employee_ws.CustomerList currentCustomer = customers.get(customerNumbers);
                buttons[customerNumbers].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                        new EditDeleteCustomerDetails(currentCustomer).setVisible(true);
                    }
                });
                lblNames[customerNumbers].setForeground(Color.BLACK);
                lblNames[customerNumbers].setFont(new Font("Serif", Font.PLAIN, 16));
                lblNames[customerNumbers].setBorder(BorderFactory.createLineBorder(Color.BLACK));

                lblAccountNumbers[customerNumbers].setForeground(Color.BLACK);
                lblAccountNumbers[customerNumbers].setFont(new Font("Serif", Font.PLAIN, 16));
                lblAccountNumbers[customerNumbers].setBorder(BorderFactory.createLineBorder(Color.BLACK));

                dynamicPanel.add(lblNames[customerNumbers]);
                dynamicPanel.add(lblAccountNumbers[customerNumbers]);
                dynamicPanel.add(buttons[customerNumbers]);
                customerNumbers++;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerListPanel = new javax.swing.JPanel();
        backLink = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        createCustomer = new javax.swing.JButton();
        dynamicPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backLink.setFont(new java.awt.Font("Serif", 2, 11)); // NOI18N
        backLink.setText("BACK");
        backLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLinkMouseClicked(evt);
            }
        });

        errorMessage.setFont(new java.awt.Font("Serif", 2, 11)); // NOI18N

        createCustomer.setBackground(new java.awt.Color(51, 255, 51));
        createCustomer.setText("Create Customer");
        createCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dynamicPanelLayout = new javax.swing.GroupLayout(dynamicPanel);
        dynamicPanel.setLayout(dynamicPanelLayout);
        dynamicPanelLayout.setHorizontalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dynamicPanelLayout.setVerticalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout customerListPanelLayout = new javax.swing.GroupLayout(customerListPanel);
        customerListPanel.setLayout(customerListPanelLayout);
        customerListPanelLayout.setHorizontalGroup(
            customerListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerListPanelLayout.createSequentialGroup()
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(backLink, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerListPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(createCustomer))
        );
        customerListPanelLayout.setVerticalGroup(
            customerListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerListPanelLayout.createSequentialGroup()
                .addGroup(customerListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backLink, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createCustomer))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLinkMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new subMenuPage("BACK").setVisible(true);

    }//GEN-LAST:event_backLinkMouseClicked

    private void createCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCustomerActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CreateCustomer().setVisible(true);

    }//GEN-LAST:event_createCustomerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerListGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLink;
    private javax.swing.JButton createCustomer;
    private javax.swing.JPanel customerListPanel;
    private javax.swing.JPanel dynamicPanel;
    private javax.swing.JLabel errorMessage;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<employee_ws.CustomerList> getCustomerDetails() {
        employee_ws.Customer_Service service = new employee_ws.Customer_Service();
        employee_ws.Customer port = service.getCustomerPort();
        return port.getCustomerDetails();
    }

}
