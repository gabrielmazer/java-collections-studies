import javax.swing.*;
import java.awt.*;

public class SecondType extends JFrame {
    JButton bt_soma = new JButton("Soma");
    JButton bt_subtrai = new JButton("Subtrai");
    JButton bt_multiplica = new JButton("Multiplica");
    JButton bt_divide = new JButton("Divide");

    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel(new GridLayout(4, 1));
    JPanel p3 = new JPanel();

    JLabel label = new JLabel("= 0");

    SecondType(){
        super("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3));
        
        p1.add(t1);
        
        p2.add(bt_soma);
        p2.add(bt_subtrai);
        p2.add(bt_multiplica);
        p2.add(bt_divide);

        p3.add(t2);
        p3.add(label);

        add(p1);
        add(p2);
        add(p3);

        pack();
        setVisible(true);
    }

    public static void main(String[] args){
        new SecondType();
    }
}
