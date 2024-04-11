import javax.swing.*;
import java.awt.*;

public class ThirdType extends JFrame{
    JFrame frame = new JFrame("Calculadora");

    JPanel p1 = new JPanel(new GridLayout(1, 3));
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();

    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);

    JLabel label = new JLabel("= 0");

    JComboBox<String> cb = new JComboBox<>();

    JButton button = new JButton("Calcular");

    ThirdType() {
        super("Calculadora");
        setLayout(new GridLayout(2, 1));

        p1.add(p2);

        p2.add(t1);
        p2.add(cb);
        p2.add(t2);

        cb.addItem("Soma");
        cb.addItem("Subtrai");
        cb.addItem("Multiplica");
        cb.addItem("Divide");

        add(p1);

    }
    public static void main(String[] args) {
        new ThirdType();
    }
}

