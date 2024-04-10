import javax.swing.*;
import java.awt.*;

public class SecondType extends JFrame {
    JButton bt_soma = new JButton("Soma");
    JButton bt_subtrai = new JButton("Subtrai");
    JButton bt_multiplica = new JButton("Multiplica");
    JButton bt_divide = new JButton("Divide");

    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);

    SecondType(){
        super("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel(new GridLayout(4, 1));
        p.add(bt_soma);
        p.add(bt_subtrai);
        p.add(bt_multiplica);
        p.add(bt_divide);

        add(p, BorderLayout.CENTER);
        add(t1, BorderLayout.WEST);
        add(t2, BorderLayout.EAST);

        pack();
        setVisible(true);
    }

    public static void main(String[] args){
        new SecondType();
    }
}
