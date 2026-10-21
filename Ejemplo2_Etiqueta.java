
import javax.swing.*;
import java.awt.*;

public class Ejemplo2_Etiqueta {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Etiqueta");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

// Crear una etiqueta de texto
        JLabel etiqueta = new JLabel("¡Hola, Swing! :D"); // No editable por el usuario
        etiqueta.setFont(new Font("Arial", Font.BOLD, 18));
        ventana.add(etiqueta);
        ventana.setLocationRelativeTo(null);

        ventana.setVisible(true);

    }
}