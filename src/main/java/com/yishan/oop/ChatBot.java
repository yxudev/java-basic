//package com.yishan.oop;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class ChatBot extends JFrame {
//
//    private JTextField txtEnter = new JTextField();
//    private JTextArea txtChat = new JTextArea();
//
//
//    public ChatBot(){
//    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    this.setSize(600,600);
//    this.setVisible(true);
//    this.setResizable(false);
//    this.setLayout(null);
//    this.setTitle("My AI");
//
//
//    txtEnter.setLocation(2,540);
//    txtEnter.setSize(590,30);
//
//    txtChat.setLocation(15,5) ;
//    txtChat.setSize(560,510);
//
//    txtEnter.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent arg0) {
//            String uText = txtEnter.getText();
//            txtChat.append("Boss:" + uText + "\n");
//
//            if(uText.contains("hi")){
//
//            }
//
//            txtEnter.setText("");
//        }
//    });
//
//    this.add(txtEnter);
//    }
//
//public void botSay(String s)
//
//public static void main(String args[]){
//        new ChatBot();
//
//}
//}