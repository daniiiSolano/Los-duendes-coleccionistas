import javax.swing.JFrame;
public class ventana {
    public static void main(String[] args) {
// Crear la ventana principal
        JFrame ventana = new JFrame("Mi Primera Ventana");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
// Mostrar la ventana
        ventana.setVisible(true);
    }
}