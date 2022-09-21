/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
 
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;

/**
 *
 * @author Jorge
 */
public  class  ConnectionFB {
   private  Firestore db = null;
   private  static ConnectionFB instance  = new ConnectionFB();;
   
     private  ConnectionFB(){
        try {
             FileInputStream serviceAccount =
          new FileInputStream("acceso.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
          .setCredentials(GoogleCredentials.fromStream(serviceAccount))
          .build();

        FirebaseApp.initializeApp(options);
        db =  FirestoreClient.getFirestore();
        
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }      

    }

public  Firestore getConnectionFB(){
        return db;
    }    
public static  ConnectionFB getInstance(){
    return instance;
}
}

