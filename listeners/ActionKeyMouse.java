import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class ActionKeyMouse {
    
    // O ActionListener é usado para receber eventos de ação, como cliques
    // em botões ou seleções de itens de menu. Aqui está um exemplo simples:
    public class ActionListenerExample {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            JButton button = new JButton("Clique aqui");

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Botão clicado!");
                }
            });

            frame.add(button);
            frame.setSize(300, 200);
            frame.setVisible(true);
        }
    }


    // KeyListener é comumente usado em situações onde você precisa
    // responder a interações do teclado, como em jogos ou campos de entrada de texto.
    public class KeyListenerExample {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            JTextField textField = new JTextField();
    
            textField.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {}
    
                @Override
                public void keyPressed(KeyEvent e) {
                    System.out.println("Tecla pressionada: " + e.getKeyChar());
                }
    
                @Override
                public void keyReleased(KeyEvent e) {}
            });
    
            frame.add(textField);
            frame.setSize(300, 200);
            frame.setVisible(true);
        }
    }
    

    // MouseListener é útil em interfaces gráficas para tratar cliques de mouse,
    // movimentos ou quando o cursor entra ou sai de um componente.
    public class MouseListenerExample {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            JLabel label = new JLabel("Clique no frame");
    
            label.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println("Mouse clicado na posição [" + e.getX() + ", " + e.getY() + "]");
                }
    
                @Override
                public void mousePressed(MouseEvent e) {}
    
                @Override
                public void mouseReleased(MouseEvent e) {}
    
                @Override
                public void mouseEntered(MouseEvent e) {}
    
                @Override
                public void mouseExited(MouseEvent e) {}
            });
    
            frame.add(label);
            frame.setSize(300, 200);
            frame.setVisible(true);
        }
    }

}