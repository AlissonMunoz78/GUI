import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField nombreField;
    private JTextField cedulaField;
    private JTextField edadField;
    private JButton guardarButton;

    public Main() {
        setTitle("Inserción de Datos de Estudiante");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        nombreField = new JTextField();
        cedulaField = new JTextField();
        edadField = new JTextField();
        guardarButton = new JButton("Guardar");

        add(new JLabel("Nombre:"));
        add(nombreField);
        add(new JLabel("Cédula:"));
        add(cedulaField);
        add(new JLabel("Edad:"));
        add(edadField);
        add(new JLabel(""));
        add(guardarButton);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String cedula = cedulaField.getText();
                int edad = Integer.parseInt(edadField.getText());

                Estudiante estudiante = new Estudiante(nombre, cedula, edad);
                estudiante.imprimirInfo();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
