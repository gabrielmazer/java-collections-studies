import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.util.Scanner;


public class FirstType_listener extends JFrame{
    JButton bt_abrir = new JButton("Abrir");
    JButton bt_salvar = new JButton("Salvar");
    JButton bt_salvar_como = new JButton("Salvar Como");
    JButton bt_fechar = new JButton("Fechar");

    StringBuffer txt = new StringBuffer();
    String txt_salvar = new String();

    FileInputStream in;
    Scanner sin;

    FirstType_listener() {
        super ("Editor de texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try{
            in = new FileInputStream("texto.txt");
            sin = new Scanner(in);

            while(sin.hasNextLine()){
                txt.append(sin.nextLine());
                txt.append("\n");
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        JPanel p = new JPanel(new GridLayout(4, 1));
        p.add(bt_abrir);
        p.add(bt_salvar);
        p.add(bt_salvar_como);
        p.add(bt_fechar);
        add(p, BorderLayout.WEST);

        JTextArea textArea = new JTextArea("Digite texto nesta área com várias linhas.");
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        bt_abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                textArea.setText(txt.toString());
            }
        });

        bt_salvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                txt_salvar = textArea.getText();
                try{
                    FileOutputStream out = new FileOutputStream("texto_salvo.txt");
                    out.write(txt_salvar.getBytes());
                    out.close();
                }catch(IOException e2){
                    e2.printStackTrace();
                }
            }
        });

        pack();
        setVisible(true);
    }

    public static void main(String[] args){
        new FirstType_listener();
    }
}