import javax.swing.*;
import java.awt.*;

public class FirstType extends JFrame{
    JButton bt_abrir = new JButton("Abrir");
    JButton bt_salvar = new JButton("Salvar");
    JButton bt_salvar_como = new JButton("Salvar Como");
    JButton bt_fechar = new JButton("Fechar");

    FirstType() {
        super ("Editor de texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel(new GridLayout(4, 1));
        p.add(bt_abrir);
        p.add(bt_salvar);
        p.add(bt_salvar_como);
        p.add(bt_fechar);
        add(p, BorderLayout.WEST);

        JTextArea textArea = new JTextArea("Digite texto nesta área com várias linhas.");
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public static void main(String[] args){
        new FirstType();
    }
}