import javax.swing.*;

public class AIUB extends JFrame {

    private JPanel panel2;
    private JLabel l2;
    private JFormattedTextField AIUBCGPACalculatorFormattedTextField;
    private JLabel label4;
    private JButton passButton;
    private JButton calculateButton;
    private JComboBox comboBox1;

    AIUB() {
        setTitle("AIUB");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setContentPane(panel2);
    }

    public static void main(String[]args){
        new AIUB();
    }
}
