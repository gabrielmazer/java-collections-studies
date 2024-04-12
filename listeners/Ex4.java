import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class AcaoMouse extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
        System.out.println("Teste");
        System.out.println(e.getX() + " "+ e.getY());
    }
}

public class Ex4 extends JFrame{
    Ex4(){
        super("Testar posição do mouse");
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addMouseListener(new AcaoMouse());
    }

    public static void main(String[] args){
        new Ex4();
    }
}