import javax.swing.*;
import java.awt.*;

public class Calc extends JFrame {
    JPanel p1 = new JPanel();
        JPanel p2 = new JPanel(new GridLayout(4,1));
        JPanel p3 = new JPanel();

        JButton b1 = new JButton("soma");
        JButton b2 = new JButton("subtrai");
        JButton b3 = new JButton("multiplica");
        JButton b4 = new JButton("divide");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();


        JLabel lb1 = new JLabel("= 0");

        Calc(){
            p1.add(t1);
            p2.add(b1);
            p2.add(b2);
            p2.add(b3);
            p2.add(b4);
            p3.add(t2);
            p3.add(lb1);

            t1.setColumns(20);
            t2.setColumns(20);

            setLayout(new BorderLayout());
            add(p1,BorderLayout.WEST);
            add(p2,BorderLayout.CENTER);
            add(p3,BorderLayout.EAST);
            pack();
            setVisible(true);
        }

        static public void main(String[] args){
            new Calc();
        }
}
