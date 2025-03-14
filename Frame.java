import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private JPanel panel1;
    private JLabel l1;
    private JButton AIUBButton;
    private JButton NSUButton;
    private JButton IUBButton;
    private JButton BRACButton;

    Frame(){
        setTitle("CGPA Calculator");
        setSize(500,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setContentPane(panel1);


        AIUBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                AIUB a = new AIUB();
                dispose();

            }
        });
        AIUBButton.setFocusable(false);
        NSUButton.setFocusable(false);
        IUBButton.setFocusable(false);
        BRACButton.setFocusable(false);
        NSUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NSU n = new NSU();
                dispose();
            }
        });
        IUBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IUB i = new IUB();
                dispose();
            }
        });
        BRACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BRAC b = new BRAC();
                dispose();
            }
        });
    }
    public static void main(String[]args){
        new Frame();

    }
}
