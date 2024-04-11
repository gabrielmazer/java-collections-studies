import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1 extends JFrame implements ActionListener{
    JButton bt = new JButton("Botão");

    Ex1() {
        super("Teste ActionListener");
        setLayout(new FlowLayout());
        add(bt);

        setVisible(true);
        pack();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("O botão foi clicado");
        
    }

    public static void main(String[] args){
        new Ex1();
    }
}