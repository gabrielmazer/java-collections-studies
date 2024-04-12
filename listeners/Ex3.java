import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class TratarMouse implements MouseListener{
    public void mouseExited(MouseEvent me){

    }
    public void mouseReleased(MouseEvent me){

    }
    public void mouseClicked(MouseEvent me){

    }
    public void mouseEntered(MouseEvent me){
        System.out.println("Mouse sobre o botão");
    }
    public void mousePressed(MouseEvent me){

    }

}

public class Ex3 extends JFrame implements ActionListener{
    JButton bt = new JButton("Botão");
    JTextField text1 = new JTextField(20);

    Ex3() {
        super("Teste ActionListener");
        setLayout(new FlowLayout());
        
        bt.addActionListener(this);
        bt.addMouseListener(new TratarMouse());
        add(bt);
        add(text1);

        setVisible(true);
        pack();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(text1.getText());
        
    }

    public static void main(String[] args){
        new Ex3();
    }
}