import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana1 {
    private JButton okButton;
    private JTextField peso;
    private JTextField altura;
    private JPanel panel1;
    private JLabel Respuesta;

    public ventana1() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1= Double.parseDouble(peso.getText());
                double numero2= Double.parseDouble(altura.getText());
                Respuesta.setText("Su IMC es:" + numero1/Math.pow(numero2,2));
            }
        });
    }
    public static void main(String[] args){
        JFrame frame=new JFrame("ventana1");
        frame.setContentPane(new ventana1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

