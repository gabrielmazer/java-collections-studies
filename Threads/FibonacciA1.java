import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FibonacciA1 extends JFrame{
   
   JTextField tx = new JTextField(5);
   JButton bt = new JButton("Calcular");
   JLabel lb = new JLabel("0");
   JPanel p = new JPanel();

   FibonacciA1(){
      super("Fibonacci");
      setLayout(new GridLayout(1,3));
      bt.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
            try{
               bt.setEnabled(false);
               new Fibot().start();
            }catch(NumberFormatException exc){
               lb.setText("Digite um número natural!");
            }
         }
      });
      add(tx);
      add(bt);
      add(p);
      add(lb);
      pack();
      setVisible(true);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   }

   class Fibot extends Thread {
      public void run(){
         int v = Integer.parseInt(tx.getText());
         long res = fib(v);
         lb.setText(" "  + res);
         bt.setEnabled(true);
      }
      private long fib(int v){
         if (v <= 1)
            return 1;
         return fib(v-1) + fib(v-2);
      }
   }
   
   public static void main(String[] args) {
      new FibonacciA1();
   }

}