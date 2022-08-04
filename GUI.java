//Armando Bracco
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;    

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.*;    

public class GUI {
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {    
      JFrame frame = new JFrame("Spongebob Personality Quiz");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new GridLayout(12,1)); 
      int[] answers = new int[5];   

      createUI(frame, answers);
      createUIFirstQuestion(frame);
      createUISecondQuestion(frame);
      createUIThirdQuestion(frame);
      createUIFourthQuestion(frame);
      createUIFifthQuestion(frame);
      createUISixthQuestion(frame);
      createUISeventhQuestion(frame);
      createUIGenerateResults(frame);

      frame.setSize(860, 1000);      
      frame.setLocationRelativeTo(null);  
      frame.setVisible(true);
   }

   private static void createUI(final JFrame frame, int[] answers){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("Start!");
      final JLabel label = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "Enter your Name: ", 
               "Enter Name",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               "your name"
            );
            if(result != null && result.length() > 0){
               label.setText("Your name is: " + result);
            }else {
               label.setText("Your name is: " + result);
            }
         }
      });

      panel.add(button);
      panel.add(label);
      frame.getContentPane().add(panel, BorderLayout.CENTER);    
   }  



      private static void createUIFirstQuestion(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("First Question...");
      final JLabel label = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "What is your favorite thing to do in your free time? 1: Spending time with friends. \n 2: Sleeping \n 3: Practicing Music \n 4: Counting money \n 5: Playing sports! \n", 
               "What is your favorite thing to do in your free time?",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               1
            );
            if(result != null && result != ""){
               int number = Integer.parseInt(result); //like this
               label.setText("you answered: " + result); //like this 
               Input2.handleAnswers(number);// like this
            }else {
               label.setText("you answered: " + result);
            }
         }
      });

      panel.add(button);
      panel.add(label);
      frame.getContentPane().add(panel);    
   }  

         private static void createUISecondQuestion(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("Second Question...");
      final JLabel label = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "What does your dream house look like? \n 1: One shaped like a pineapple, of course! \n 2: Somewhere dark, like under a rock. \n 3: Something architecturally unique \n 4: A house shaped like an anchor would be perfect! \n 5: Something dome like where I could see all the stars and the world around me. \n", 
               "What does your dream house look like?",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               1
            );
            if(result != null && result.length() > 0){
               int number = Integer.parseInt(result); //like this
               label.setText("you answered: " + result); //like this 
               Input2.handleAnswers(number);// like this
            }else {
               label.setText("you answered: " + result);
            }
         }
      });

      panel.add(button);
      panel.add(label);
      frame.getContentPane().add(panel, BorderLayout.NORTH);    
   }  

         private static void createUIThirdQuestion(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("Third Question...");
      final JLabel label = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "What makes you the happiest? \n 1: Working my dream job! \n 2: Eating, relaxing, watching TV, you know just relaxing \n 3: Playing my instrument in peace away from others \n 4: Lots and lots and lots of money! \n 5: Being in nature, perferably near trees! \n", 
               "What makes you the happiest?",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               1
            );
            if(result != null && result.length() > 0){
               int number = Integer.parseInt(result); //like this
               label.setText("you answered: " + result); //like this 
               Input2.handleAnswers(number);// like this
            }else {
               label.setText("you answered: " + result);
            }
         }
      });

      panel.add(button);
      panel.add(label);
      frame.getContentPane().add(panel, BorderLayout.WEST);    
   }  

         private static void createUIFourthQuestion(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("Fourth Question...");
      final JLabel label = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "What is your favorite kind of music? \n 1: Anything upbeat, like pop music! \n 2: I'll listen to whatever \n 3: Classical music \n 4: Techno \n 5: Country \n", 
               "What is your favorite kind of music?",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               1
            );
            if(result != null && result.length() > 0){
               int number = Integer.parseInt(result); //like this
               label.setText("you answered: " + result); //like this 
               Input2.handleAnswers(number);// like this
            }else {
               label.setText("you answered: " + result);
            }
         }
      });

      panel.add(button);
      panel.add(label);
      frame.getContentPane().add(panel, BorderLayout.EAST);    
   }  

         private static void createUIFifthQuestion(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("Fifth Question...");
      final JLabel label = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "What would you have for a pet? \n 1 Cat \n 2 Rock \n 3 Pets are gross, none! \n 4 Dog \n 5 A reptile \n", 
               "What would you have for a pet?",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               1
            );
            if(result != null && result.length() > 0){
               int number = Integer.parseInt(result); //like this
               label.setText("you answered: " + result); //like this 
               Input2.handleAnswers(number);// like this
            }else {
               label.setText("you answered: " + result);
            }
         }
      });

      panel.add(button);
      panel.add(label);
      frame.getContentPane().add(panel, BorderLayout.PAGE_END);    
   }  

            private static void createUISixthQuestion(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("Sixth Question...");
      final JLabel label = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "What is your favorite color? \n 1: Yellow \n 2: Pink \n 3: Gray \n 4: Red \n 5: Green", 
               "What is your favorite color?",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               1
            );
            if(result != null && result.length() > 0){
               int number = Integer.parseInt(result); //like this
               label.setText("you answered: " + result); //like this 
               Input2.handleAnswers(number);// like this
            }else {
               label.setText("you answered: " + result);
            }
         }
      });

      panel.add(button);
      panel.add(label);
      frame.getContentPane().add(panel, BorderLayout.PAGE_END);    
   }  

    private static void createUISeventhQuestion(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("Seventh Question...");
      final JLabel label = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "What is your favorite food to get when you go out to eat?\n 1: Krabby Patty \n 2: Chicken tenders and fries \n 3: Filet Mignon \n 4: I do not go out to eat and waste my money! \n 5: BBQ", 
               "What is your favorite food to get when you go out to eat?",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               1
            );
            if(result != null && result.length() > 0){
               int number = Integer.parseInt(result); //like this
               label.setText("you answered: " + result); //like this 
               Input2.handleAnswers(number);// like this
            }else {
               label.setText("you answered: " + result);
            }
         }
      });

      panel.add(button);
      panel.add(label);
      frame.getContentPane().add(panel, BorderLayout.PAGE_END);    
   }  

            private static void createUIGenerateResults(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("Results!");
      final JLabel label1 = new JLabel();
      final JLabel label2 = new JLabel();
      final JLabel label3 = new JLabel();
      final JLabel label4 = new JLabel();
      final JLabel label5 = new JLabel();




      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
                      //initialize array
                int[] resultsArray = new int[5];

                // grabbing input data
                dataStorage.getInputs(resultsArray);
                dataStorage.convertToPercentages(resultsArray);

               label1.setText("You are " + resultsArray[0] + " percent like SpongeBob \n");
               label2.setText("You are " + resultsArray[1] + " percent like Patrick \n");
               label3.setText("You are " + resultsArray[2] + " percent like Squidward \n");
               label4.setText("You are " + resultsArray[3] + " percent like Mr. Krabs \n");
               label5.setText("You are " + resultsArray[4] + " percent like Sandy \n");


            }
         });
      panel.add(button);
      panel.add(label1);
      panel.add(label2);
      panel.add(label3);
      panel.add(label4);
      panel.add(label5);

      frame.getContentPane().add(panel, BorderLayout.PAGE_END);    
   }  

} 
