import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TratarBotao implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("O botão foi clicado");
    }
}

public class Ex1_TratarBotao extends JFrame{
    JButton bt = new JButton("Botão");

    Ex1_TratarBotao() {
        super("Teste ActionListener");
        setLayout(new FlowLayout());
        
        bt.addActionListener(new TratarBotao());
        add(bt);

        setVisible(true);
        pack();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

        

    public static void main(String[] args){
        new Ex1();
    }
} 
    

