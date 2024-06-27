/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author ADMIN
 */
public class ChatRight extends javax.swing.JLayeredPane {

    /**
     * Creates new form ChatLeft
     */
    public ChatRight() {
        initComponents();
        txt.setBackground(new Color(195, 222, 255));
    }

    public void setText(String text) {

        if (text.equals("")) {
            txt.hideText();
        } else {
            txt.setText(text);
            //txt.sendSuccess();
        }
        txt.seen();
    }

    //Anh ro
    public void setImage(Icon... image) {
        txt.setImage(true, image);
    }

    //Anh mo
    public void setImage(String... image) {
        txt.setImage(false, image);
    }
    public void setEmoji(Icon icon){
      txt.hideText();
      txt.setEmoji(true, icon);
      
    }
          
    public void setTime() {
        txt.setTime("10:30 AM");
    }

    public void setFile(String fileName, String fileSize) {
        txt.setFile(fileName, fileSize);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new component.ChatItem();

        setLayer(txt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.ChatItem txt;
    // End of variables declaration//GEN-END:variables
}
