package com.yishan.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatBot extends JFrame {

    private JTextField txtEnter = new JTextField();
    private JTextArea txtChat = new JTextArea();


    public ChatBot(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600,600);
    this.setVisible(true);
    this.setResizable(false);
    this.setLayout(null);
    this.setTitle("My AI");


    txtEnter.setLocation(2,540);
    txtEnter.setSize(590,30);

    txtChat.setLocation(15,5) ;
    txtChat.setSize(560,510);
    txtChat.setEditable(false);

    txtEnter.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            String uText = txtEnter.getText();
            txtChat.append("Boss:" + uText + "\n");

            if(uText.contains("Hi")){
            botSay("How are you?");
            }
            else if(uText.contains("Fine")){
                botSay("Thank you!");
            }
            else if(uText.contains("Weather?")){
                botSay("76F");
            }
            else{
                int decider = (int) Math.random()*10+1;
                System.out.println(decider);
                if(decider == 1){
                    botSay("I didn't get that,  my Boss!");
                }
//                else if(decider == 2){
//                    botSay("Please rephrase that!");
//                }
//                else if(decider == 3){
//                    botSay("???");
//                }
            }

            txtEnter.setText("");
        }
    });

    this.add(txtEnter);
    this.add(txtChat);
    }

public void botSay(String s){
        txtChat.append("My AI: " + s + "\n");
}

public static void main(String args[]){
        new ChatBot();

}

}