package dao;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
 
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import conexion.ConnectionFB;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge
 */
public class DaoFB {
    Firestore db;
    
    public DaoFB() {
        this.db =   ConnectionFB.getInstance().getConnectionFB();
    }
    
     public boolean insertData(String user, String email, String birthday, String passwordEncripted) {
        try {
           
               DocumentReference docRef = db.collection("users").document(email);
         
        // Add document data  with id "alovelace" using a hashmap
        Map<String, Object> data = new HashMap<>();
        data.put("user", user);
        data.put("email", email);
        data.put("birthday",birthday );
        data.put("password",passwordEncripted );
        //asynchronously write data
        ApiFuture<WriteResult> result = docRef.set(data);
        // ...
        // result.get() blocks on response
        return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }        

    }
     
      public boolean readData(String user, String email, String birthday, String passwordEncripted) {
        try {
           
               DocumentReference docRef = db.collection("users").document(email);
         
        // Add document data  with id "alovelace" using a hashmap
        Map<String, Object> data = new HashMap<>();
        data.put("user", user);
        data.put("email", email);
        data.put("birthday",birthday );
        data.put("password",passwordEncripted );
        //asynchronously write data
        ApiFuture<WriteResult> result = docRef.set(data);
        // ...
        // result.get() blocks on response
        return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }        

    }
      
      public void passwordRecorvery(String emailToRecorvery){
 
          try {
               Email email = new SimpleEmail();
               String host = "smtp.gmail.com";
            
        email.setHostName(host);
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("terapiacognitivaApp@gmail.com", "pfrmvjzrxkzqdrie"));
        email.setSSLOnConnect(true);
        
        String passwordEncrypted =  getPasswordFromEmail(emailToRecorvery);
        
        email.setFrom("terapia@gmail.com");
        email.setSubject("Recuperación de contraseña");
        email.setMsg("Su contraseña es: ");
        email.addTo("jorgemartinezweb@gmail.com");
        email.send();
          } catch (Exception e) {
              System.out.println("error en email: "+e.getMessage());
          }
       
       
            
      } 

    private String getPasswordFromEmail(String emailToRecorvery) {
        try {
             DocumentSnapshot document =  db.collection("users").document(emailToRecorvery).get().get();

            if (document.exists()) {
                System.out.println(document.getString("email"));
                return document.getString("email");
            }else{
                System.out.println("No existe el correo");
            }
            
        } catch (Exception e) {
            
        } 
        return "";
       
    }
    
}
