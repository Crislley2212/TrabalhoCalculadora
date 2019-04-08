package Br.edu.ifcvideira.Trab2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Calculadora1 extends JFrame {

    private JPanel contentPane;

    /
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculadora1 frame = new Calculadora1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /
     * Create the frame.
     */
    public Calculadora1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }

}

public Calculadora() {
        setBackground(Color.MAGENTA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 430, 200);
        contentPane = new JPanel();
        contentPane.setBackground(Color.PINK);
        contentPane.setForeground(Color.CYAN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCalculadoraEngenharia = new JLabel("Calculadora para a professora");
        lblCalculadoraEngenharia.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 25));
        lblCalculadoraEngenharia.setBounds(35, 10, 351, 40);
        contentPane.add(lblCalculadoraEngenharia);

        tfNumero1 = new JTextField();
        tfNumero1.setBounds(5, 100, 50, 40);
        contentPane.add(tfNumero1);
        tfNumero1.setColumns(10);

        tfNumero2 = new JTextField();
        tfNumero2.setColumns(10);
        tfNumero2.setBounds(280, 100, 50, 40);
        contentPane.add(tfNumero2);

        JButton btSoma = new JButton("+");
        btSoma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Soma();
            }
        });