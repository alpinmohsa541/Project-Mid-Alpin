/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

public class Sender {

   
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("", "Test", "Halo!");
        std.sendMessage("Tarnished", "Maiden", "Do you accept my offer?");
        
        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("", "Secret", "Don't tell anyone!");
        mail.sendMessage("EdShereen", "Burn", "Burned...");
        mail.disconnect();
        mail.sendMessage("Andy", "Gift", "Elden Ring");
    }
}

