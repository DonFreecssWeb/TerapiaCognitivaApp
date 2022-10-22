package dao;

import Model.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
 
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import conexion.ConnectionFB;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;



public class DaoFB {
    Firestore db;
    
    public DaoFB() {
        this.db =   ConnectionFB.getInstance().getConnectionFB();
    }
    
     public boolean insertData(String user, String email, String birthday, String password, String passordEncripted) {
        try {
           
               DocumentReference docRef = db.collection("users").document(email);
         
        // Add document data  with id "alovelace" using a hashmap
        Map<String, Object> data = new HashMap<>();
        data.put("user", user);
        data.put("email", email);
        data.put("birthday",birthday );
        data.put("password",password );
        data.put("passwordEncripted",passordEncripted );
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
      
      public Boolean passwordRecorvery(String emailUser){
          
          try {
              if (validateEmail(emailUser)){
                  
                   
                  String password =  getPasswordFromEmail(emailUser);
                  if (password =="") {
                      System.out.println("La contraseña es vacio ");
                  }else{
                      System.out.println("La contraseña es: "+password);
                      
                      
                        Email email = new SimpleEmail();
                        String host = "smtp.gmail.com";

                         email.setHostName(host);
                         email.setSmtpPort(465);
                         email.setAuthenticator(new DefaultAuthenticator("terapiacognitivaApp@gmail.com", "mcvpbyuptdfpobjm"));
                         email.setSSLOnConnect(true);



                         email.setFrom("terapiacognitivaApp@gmail.com");
                         email.setSubject("Recuperación de contraseña");
                         email.setMsg("Su contraseña es: "+password);
                         email.addTo(emailUser);
                         email.send();
                         return true;
                  }
              }
             
              
              
              
          } catch (Exception e) {
              System.out.println("error en email: "+e.getMessage());
          }
        return false;
       
            
      } 

    private String getPasswordFromEmail(String emailToRecorvery) {
        
        try {
            DocumentSnapshot document =  db.collection("users").document(emailToRecorvery).get().get();
            String password = document.getString("password");
            return password;
            
        } catch (Exception e) {
        }
        return "";
    }

    private boolean validateEmail(String emailToRecorvery) {
       
        try {
             DocumentSnapshot document =  db.collection("users").document(emailToRecorvery).get().get();

            if (document.exists()) {
                System.out.println("Existe el correo");
                System.out.println(document.getString("email"));
                return true;
            } else{
                System.out.println("Documento no existe");
            }
            
        } catch (Exception e) {
            System.out.println("Error en validateEmail "+e.getMessage());
        } 
        return false;
      
    }   

    public boolean Login(String email, String password) {
        try {
           DocumentSnapshot document =  db.collection("users").document(email).get().get();

            if (document.exists()) {
                System.out.println("Existe el correo");
                System.out.println(document.getString("email"));
                System.out.println(document.getString("password"));
                String passwordFromDB = document.getString("password");
                
                if (passwordFromDB.equals(password)) {
                    
                    return true;
                }else{
                    System.out.println("Contraseña invalida");
                   
                }
                 
            } else{
               
            } 
        } catch (Exception e) {
            
            System.out.println("Error en el login: "+e.getMessage());
        }
        return false;
    }

    public boolean emailExist(String email) {
   
        try {
            
            DocumentSnapshot document =  db.collection("users").document(email).get().get();
         
         if (document.exists()) {
            System.out.println("Existe el correooooooo");
            return true;
        }else{
            System.out.println("No existe el correooooooo"); 
         }
         
        } catch (Exception e) {
             System.out.println("Error en el emailExist: "+e.getMessage());
        }
         
        
        return false;
    }

    public User getUser(String email) {
        User user = new User();
        try {
           DocumentSnapshot document =  db.collection("users").document(email).get().get();

            if (document.exists()) {
                
               user.setName(document.getString("user"));
                
                System.out.println("1 "+document.getString("user"));
                return user;
                 
            } else{
                System.out.println("No existe el documento"); 
            } 
        } catch (Exception e) {
            
            System.out.println("Error en el login: "+e.getMessage());
        }
        System.out.println("2");
        return user;
    }

    public boolean sendCode(int code, String emailUser) {
       try { 
           Email email = new SimpleEmail();
           String host = "smtp.gmail.com";

           email.setHostName(host);
           email.setSmtpPort(465);
           email.setAuthenticator(new DefaultAuthenticator("terapiacognitivaApp@gmail.com", "mcvpbyuptdfpobjm"));
           email.setSSLOnConnect(true);

           email.setFrom("terapiacognitivaApp@gmail.com");
           email.setSubject("Confirmación de correo electrónico");
           email.setMsg("Su código de confirmación es : " + code);
           email.addTo(emailUser);
           email.send();
           return true;
       } catch (Exception e) {
              System.out.println("error en sendCode (DaoFB): "+e.getMessage());
              return false;
          }
        
    }

    

   
}
