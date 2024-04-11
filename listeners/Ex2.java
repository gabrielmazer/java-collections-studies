import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2 extends JFrame implements ActionListener{
    JButton bt = new JButton("Botão");
    JTextField text1 = new JTextField(20);

    Ex2() {
        super("Teste ActionListener");
        setLayout(new FlowLayout());
        
        bt.addActionListener(this);
        add(bt);
        add(text1);

        setVisible(true);
        pack();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String t1 = text1.getText();
        System.out.println(t1);
        
    }

    public static void main(String[] args){
        new Ex2();
    }
}