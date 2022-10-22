/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import Common.FontDialog;
import Common.ImageBackground;
import dao.DaoFB;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import java.util.logging.Level;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

public class FrmCreateUser extends javax.swing.JFrame {

    ImageBackground imgBackground = new ImageBackground();
    FrmLogin frmLogin = null;
    int code;

    public FrmCreateUser() {
        this.setContentPane(imgBackground);
        initComponents();
        setLogo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel0 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jDateFecNac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        btnSendCode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 169, 72));
        jPanel1.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Creación de usuario");

        jLabel0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel0.setForeground(new java.awt.Color(102, 102, 102));
        jLabel0.setText("Primer nombre");

        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));

        btnSignUp.setBackground(new java.awt.Color(255, 255, 255));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(51, 51, 51));
        btnSignUp.setText("Crear usuario");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Fecha de nacimiento");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 51, 51));
        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Contraseña");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Código");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));

        jDateFecNac.setForeground(new java.awt.Color(102, 102, 102));
        jDateFecNac.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Correo");

        txtCode.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCode.setForeground(new java.awt.Color(102, 102, 102));

        btnSendCode.setBackground(new java.awt.Color(255, 255, 255));
        btnSendCode.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSendCode.setForeground(new java.awt.Color(51, 51, 51));
        btnSendCode.setText("Enviar Código");
        btnSendCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(66, 66, 66)
                            .addComponent(jDateFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel3))
                            .addGap(69, 69, 69)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                                    .addComponent(txtUser)
                                    .addComponent(txtCode))
                                .addComponent(jLabel4)))))
                .addGap(59, 59, 59)
                .addComponent(btnSendCode)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel4)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel0))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSendCode)))
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignUp)
                    .addComponent(btnBack))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frmLogin = new FrmLogin();

        this.setVisible(false);
        frmLogin.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        String user = txtUser.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String codeTyped = txtCode.getText();

        //System.out.println(Pattern.compile("[0-9]").matcher("a2").find());
        String birthday = getBirthday();

        getBirthday();
        System.out.println(birthday);

        if (user.isBlank()) {
            FontDialog.errorMessage("Debe introducir un nombre de usuario");
        } else if (!validarUser(user)) {
            FontDialog.errorMessage("El usuario debe tener solo letras");
        } else if (email.isBlank()) {
            FontDialog.errorMessage("Debe introducir un correo");
        } else if (codeTyped.isBlank()){
             FontDialog.errorMessage("Debe introducir el código de confirmación");
        } else if (password.isBlank())        {
            FontDialog.errorMessage("Debe introducir una contraseña");
        } else if (validarPassword(password) == false) {
            FontDialog.errorMessage("La contraseña debe tener al menos 8 caracteres, al menos 1 mayúscula, 1 minúscula y 1 dígito");
        } else if (birthday.isBlank()) {
            FontDialog.errorMessage("Debe introducir una fecha de nacimiento");
        } else if (emailExisted(email)) {
            FontDialog.errorMessage("El correo ya existe");
        } else if (!checkCode(codeTyped)){
              FontDialog.errorMessage("El código es erróneo");   
        } else {
            saveData(user, email, birthday, password);
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        /*
        
        System.out.println("a");
        if (evt.getSource() == txtUser) {
                System.out.println("b");
            if (txtUser.getText().matches("[0-20]+") == true){
                    System.out.println("c");
                 JOptionPane.showMessageDialog(null, "No se admiten numeros"); 
                evt.consume();
            }
                    
                    /*
            boolean isNumeric = txtUser.getText().chars().allMatch(x -> Character.isDigit(x));
          
            if (isNumeric) {
                 JOptionPane.showMessageDialog(null, "No se admiten numeros"); 
                evt.consume();
            }
         */
    }//GEN-LAST:event_txtUserKeyTyped

    private void btnSendCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendCodeActionPerformed
        String email = txtEmail.getText();
        
        if (email.isBlank()) {
            FontDialog.errorMessage("Debe escribir un correo");
        } else {
            Random numberRandom = new Random();

            this.code = numberRandom.nextInt(50000) + 50000;
            
            if (sendCode(code, email)) {
                FontDialog.confirmationMessage("Se envió un código a su correo");
            }else{
               FontDialog.errorMessage("No se pudo enviar el código"); 
            }
        }

    }//GEN-LAST:event_btnSendCodeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCreateUser().setVisible(true);
            }
        });
    }
    
    

    private void setLogo() {
        String logoPath = "src/main/java/images/logo.png";
        setIconImage(Toolkit.getDefaultToolkit().getImage(logoPath));
    }

    private String getBirthday() {
        if (jDateFecNac.getCalendar() != null) {
            Calendar calendar = jDateFecNac.getCalendar();
            Date date = calendar.getTime();
            // Addressing your comment:
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String birthdayFormat = sdf.format(date);
            return birthdayFormat;
        }
        return "";

    }

    private boolean validarPassword(String password) {
        Pattern pattern = Pattern.compile("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$");

        Matcher matcher = pattern.matcher(password);

        boolean matchFound = matcher.matches();
        return matchFound;

    }

    private boolean validarUser(String user) {
        return user.matches("[a-zA-Z ^ \\s]*");
    }

    private boolean emailExisted(String email) {
        DaoFB dao = new DaoFB();
        return dao.emailExist(email);
    }

    private boolean sendCode(int code, String email) {
        DaoFB dao = new DaoFB();
        return dao.sendCode(code,email);
    }
    
     private boolean checkCode(String code) {
          int codeParse = Integer.parseInt(code);
         return codeParse == this.code;
    }

    private void saveData(String user, String email, String birthday, String password) {

        String barra = File.separator;
        String address = System.getProperty("user.dir") + barra + "Registros" + barra;

        String fileName = "registro.txt";
        File createUbi = new File(address);
        File createFile = new File(address + fileName);

        FileWriter fichero = null;

        createUbi.mkdirs();
        try {

            fichero = new FileWriter(createFile);
            PrintWriter pw = new PrintWriter(fichero);
            pw.println(user + "," + email + "," + birthday);
            DaoFB dao = new DaoFB();

            String passwordEncripted = DigestUtils.sha256Hex(password);

            String mensaje = dao.insertData(user, email, birthday, password, passwordEncripted) == true ? "Se insertó" : "No se insertó";
            // dao.passwordRecorvery();
            FontDialog.confirmationMessage("Cuenta creada");
            System.out.println(mensaje);

            FrmLogin frmLogin = new FrmLogin();
            frmLogin.setVisible(true);
            this.setVisible(false);

        } catch (IOException ex) {
            Logger.getLogger(FrmCreateUser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(FrmCreateUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSendCode;
    private javax.swing.JButton btnSignUp;
    private com.toedter.calendar.JDateChooser jDateFecNac;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

   
    

}
