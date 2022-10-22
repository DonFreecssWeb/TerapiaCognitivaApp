/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JPanel;


public class ImageBackground extends JPanel{
     private Image imagen;
     public void paint (Graphics g){
         imagen = new ImageIcon("src/main/java/images/fondo_blanco.jpg").getImage();
         g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
         this.setOpaque(false);
         super.paint(g);
     }
}

