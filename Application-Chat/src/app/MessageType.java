/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;


public enum MessageType {
    TEXT(1),EMOJI(2),FILE(3);
    int value;
    public int getValue(){
        return value;
    }
    private MessageType(int value){
        this.value=value;
    }
    public static MessageType toMessageType(int value){
        if(value==1){
            return TEXT;
        }else if(value==2){
            return EMOJI;
        } else{
            return FILE;
        }
    }
}
