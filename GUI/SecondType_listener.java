import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondType_listener extends JFrame {
    JButton bt_soma = new JButton("Soma");
    JButton bt_subtrai = new JButton("Subtrai");
    JButton bt_multiplica = new JButton("Multiplica");
    JButton bt_divide = new JButton("Divide");

    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel(new GridLayout(4, 1));
    JPanel p3 = new JPanel();

    JLabel label = new JLabel("=   0");

    float float1;
    float float2;

    private float[] getNumbers() {
        float[] numbers = new float[2];
        try {
            numbers[0] = Float.parseFloat(t1.getText());
            numbers[1] = Float.parseFloat(t2.getText());
        }catch (NumberFormatException exnum){
            JOptionPane.showMessageDialog(null, "Por favor, insira apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return numbers;
    }

    SecondType_listener(){
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

        bt_soma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                float[] numbers = getNumbers();
                float result = numbers[0] + numbers[1];
                label.setText("= " + result);
            }
        });

        bt_subtrai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                float[] numbers = getNumbers();
                float result = numbers[0] - numbers[1];
                label.setText("= " + result);
            }
        });

        bt_multiplica.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                float[] numbers = getNumbers();
                float result = numbers[0] * numbers[1];
                label.setText("= " + result);
            }
        });

        bt_divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                float[] numbers = getNumbers();
                float result = (float) numbers[0] / numbers[1];
                label.setText("= " + result);
            }
        });

        pack();
        setVisible(true);
    }

    public static void main(String[] args){
        new SecondType_listener();
    }
}
