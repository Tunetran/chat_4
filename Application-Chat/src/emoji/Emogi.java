/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emoji;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;


public class Emogi {
    private static Emogi instance;
    public static Emogi getInstance() {
      if (instance == null) {
            instance = new Emogi();
        }  
    return instance;
    }
     private Emogi() {
    }
     public List<Model_Emoji>getStyle1(){
         List<Model_Emoji> list=new ArrayList<>();
         for(int i=1;i<=20;i++){
             list.add(new Model_Emoji(i, new ImageIcon(getClass().getResource("emoji/icon/"+ i +".png"))));
         }
         return list;
     }
      public List<Model_Emoji>getStyle2(){
         List<Model_Emoji> list=new ArrayList<>();
         for(int i=20;i<=40;i++){
             list.add(new Model_Emoji(i, new ImageIcon(getClass().getResource("emoji/icon/"+ i +".png"))));
         }
         return list;
     }
            public List<Model_Emoji>getStyle3(){
         List<Model_Emoji> list=new ArrayList<>();
         for(int i=41;i<=50;i++){
             list.add(new Model_Emoji(i, new ImageIcon(getClass().getResource("emoji/icon/"+ i +".png"))));
         }
         return list;
     }

            
     public Model_Emoji getImoji(int id){
         return new Model_Emoji(id, new ImageIcon(getClass().getResource("emoji/icon/"+ id +".png")));
     }

    
}
