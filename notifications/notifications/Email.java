package com.example.notification;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailNotification {
   public static void main(String[] args) {

      // Recipient's email ID
      String to = "recipient@example.com";

      // Sender's email ID
      String from = "sender@example.com";

      // Sender's email password
      String password = "senderpassword";

      // Host name of the SMTP server
      String host = "smtp.gmail.com";

      // Create properties object
      Properties properties = new Properties();

      // Set SMTP host, port and SSL connection
      properties.put("mail.smtp.host", host);
      properties.put("mail.smtp.port", "465");
      properties.put("mail.smtp.ssl.enable", "true");

      // Get the Session object
      Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(from, password);
         }
      });

      try {
         // Create a default MimeMessage object
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("This is the Subject Line!");

         // Now set the actual message
         message.setText("This is the message body");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}
