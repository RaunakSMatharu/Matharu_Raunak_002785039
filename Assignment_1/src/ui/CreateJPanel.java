/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import model.Employee;
import model.EmployeeHistory;
import javax.swing.plaf.SplitPaneUI;
import javax.swing.event.*;
import java.awt.*;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.JSplitPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.StyleConstants;
/**
 *
 * @author Raunak Singh Matharu
 */

public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeHistory history;
    public CreateJPanel(EmployeeHistory history) {
        initComponents();
        this.history = history;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPositionTitle = new javax.swing.JLabel();
        lblCellNo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        TxtAge = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        txtCellNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        GenderComboBox1 = new javax.swing.JComboBox<>();
        jLabelImage = new javax.swing.JLabel();
        btnImageBrowse = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 0, 0));
        setBorder(new javax.swing.border.MatteBorder(null));

        lblTitle.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Employee");
        lblTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblTitleKeyPressed(evt);
            }
        });

        lblName.setText("Name");

        lblEmployeeID.setText("Employee ID");

        lblAge.setText("Age");

        lblGender.setText("Gender");

        lblStartDate.setText("Start Date");

        lblLevel.setText("Level");

        lblTeamInfo.setText("Team Info");

        lblPositionTitle.setText("Position Title ");

        lblCellNo.setText("Cell No.");

        lblEmail.setText("Email");

        lblPhoto.setText("Photo");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDActionPerformed(evt);
            }
        });
        txtEmployeeID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmployeeIDKeyPressed(evt);
            }
        });

        TxtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAgeKeyPressed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });
        txtLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLevelKeyPressed(evt);
            }
        });

        txtTeamInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTeamInfoKeyPressed(evt);
            }
        });

        txtPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionTitleActionPerformed(evt);
            }
        });
        txtPositionTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPositionTitleKeyPressed(evt);
            }
        });

        txtCellNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCellNoKeyPressed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtGender.setEditable(false);
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        GenderComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        GenderComboBox1.setSelectedIndex(-1);
        GenderComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboBox1ActionPerformed(evt);
            }
        });

        jLabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage.setText("Please Select a Image ");
        jLabelImage.setBorder(new javax.swing.border.MatteBorder(null));

        btnImageBrowse.setText("Browse");
        btnImageBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPhoto)
                                    .addComponent(lblEmail)
                                    .addComponent(lblCellNo)
                                    .addComponent(lblPositionTitle)
                                    .addComponent(lblTeamInfo)
                                    .addComponent(lblLevel)
                                    .addComponent(lblStartDate)
                                    .addComponent(lblGender)
                                    .addComponent(lblAge)
                                    .addComponent(lblEmployeeID)
                                    .addComponent(lblName))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(TxtAge)
                                    .addComponent(txtEmployeeID)
                                    .addComponent(txtName)
                                    .addComponent(txtLevel)
                                    .addComponent(txtPositionTitle)
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(txtCellNo)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(GenderComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(143, 143, 143)
                                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnImageBrowse)
                                        .addGap(28, 28, 28)))))
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAge)
                                    .addComponent(TxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGender)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GenderComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartDate)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLevel)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnImageBrowse)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPositionTitle)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellNo)
                    .addComponent(txtCellNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPhoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String EmployeeName = txtName.getText();
        int EmployeeID = Integer.parseInt(txtEmployeeID.getText());
        int Age = Integer.parseInt(TxtAge.getText());
        SimpleDateFormat dd = new SimpleDateFormat("MM-dd-yyyy");
        String StartDate = dd.format(jDateChooser1.getDate());
        
        
        String Level= txtLevel.getText();
        String TeamInfo = txtTeamInfo.getText();
        String PositionTitle = txtPositionTitle.getText();
        String Gender = txtGender.getText();
        //double CellNo = txtCellNo.getText();
        String Email = txtEmail.getText();
        
        
      Employee ED = history.addnewDetails();
      
      ED.setName(EmployeeName);
      ED.setEmployee_ID(EmployeeID);
      ED.setAge(Age);
      ED.setGender(Gender);
      ED.setStartDate(StartDate);
      ED.setLevel(Level);
      ED.setTeamInfo(TeamInfo);
      ED.setPosition(PositionTitle);
      ED.setCell_No(TeamInfo); 
      ED.setEmail_ID(Email);
      
      JOptionPane.showMessageDialog(this,"New Employee Added");
        
        txtName.setText(null);
        txtEmployeeID.setText(null);
        TxtAge.setText(null);
        txtLevel.setText(null);
        txtTeamInfo.setText(null);
        txtPositionTitle.setText(null);
        txtCellNo.setText(null);
        txtEmail.setText(null);
        jDateChooser1.setDate(null);
        GenderComboBox1.setSelectedIndex(-1);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionTitleActionPerformed

    private void GenderComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboBox1ActionPerformed
        // TODO add your handling code here:
        String seletctedGndr = (String)GenderComboBox1.getSelectedItem();
        txtGender.setText(seletctedGndr);
    }//GEN-LAST:event_GenderComboBox1ActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void btnImageBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageBrowseActionPerformed
        // TODO add your handling code here:
       JFileChooser browseImageFile = new JFileChooser();
       FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGE","png","jpg","jpeg");
       browseImageFile.addChoosableFileFilter(fnef);
       int showOpenDialogue = browseImageFile.showOpenDialog(null);
        
       if (showOpenDialogue == JFileChooser.APPROVE_OPTION){
           File selectedImageFile = browseImageFile.getSelectedFile();
           String selectedImagePath = selectedImageFile.getAbsolutePath();
           JOptionPane.showMessageDialog(null, selectedImagePath);
           ImageIcon ii = new ImageIcon(selectedImagePath);
           Image image = ii.getImage().getScaledInstance(jLabelImage.getWidth(),jLabelImage.getHeight(),Image.SCALE_SMOOTH);
           jLabelImage.setIcon(new ImageIcon(image));
       }
    }//GEN-LAST:event_btnImageBrowseActionPerformed

    private void lblTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblTitleKeyPressed
        // TODO add ur handling code here:
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lblTitleKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)||Character.isISOControl(c)||Character.isSpaceChar(c))
        {
            txtName.setEditable(true);
        }
        else{
            txtName.setEditable(false);
    }//GEN-LAST:event_txtNameKeyPressed
    }
    private void txtEmployeeIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeIDKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)){
            txtEmployeeID.setEditable(true);
        }
        else{
            txtEmployeeID.setEditable(false);
        }
    }//GEN-LAST:event_txtEmployeeIDKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        Character ch= c;
         if(Character.isLetter(c) || Character.isDigit(c)||Character.isISOControl(c)||Character.isUnicodeIdentifierPart(c)||ch.equals('@')||ch.equals('_')||ch.equals('.'))
        {
            txtEmail.setEditable(true);
        }
        else{
          txtEmail.setEditable(false);
    }    
    }//GEN-LAST:event_txtEmailKeyPressed

    private void TxtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAgeKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)){
            TxtAge.setEditable(true);
        }
        else{
            TxtAge.setEditable(false);
        }
    }//GEN-LAST:event_TxtAgeKeyPressed

    private void txtLevelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLevelKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
            if(Character.isLetter(c) || Character.isDigit(c)||Character.isISOControl(c)||Character.isUnicodeIdentifierPart(c))
        {
          
            txtLevel.setEditable(true);
        }
        else{
          txtLevel.setEditable(false);
    }   
    }//GEN-LAST:event_txtLevelKeyPressed

    private void txtTeamInfoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeamInfoKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
            if(Character.isLetter(c) || Character.isDigit(c)||Character.isISOControl(c)||Character.isUnicodeIdentifierPart(c))
        {
            txtTeamInfo.setEditable(true);
        }
        else{
          txtTeamInfo.setEditable(false);
    }    
    }//GEN-LAST:event_txtTeamInfoKeyPressed

    private void txtPositionTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPositionTitleKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
            if(Character.isLetter(c) || Character.isDigit(c)||Character.isISOControl(c)||Character.isUnicodeIdentifierPart(c))
        {
            txtPositionTitle.setEditable(true);
        }
        else{
          txtPositionTitle.setEditable(false);
    }    
    }//GEN-LAST:event_txtPositionTitleKeyPressed

    private void txtCellNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellNoKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)){
            txtCellNo.setEditable(true);
        }
        else{
            txtCellNo.setEditable(false);
        }
    }//GEN-LAST:event_txtCellNoKeyPressed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GenderComboBox1;
    private javax.swing.JTextField TxtAge;
    private javax.swing.JButton btnImageBrowse;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCellNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}