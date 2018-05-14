package proyectoprogra;

/*
 * @author Jasson, Yeiner y Edwin.
 */
import GameInterfaces.ProyectPrograInterface;
import javax.swing.JFrame;

public class ProyectoProgra 
{
    public static void main(String[] args)
    {
        ProyectPrograInterface startObject = new ProyectPrograInterface(); // crea objeto ProyectPrograInterface
        
        startObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startObject.setSize(404, 326); // establece el tamaño del marco
        startObject.setVisible(true); // muestra el marco
        startObject.setLocationRelativeTo(null);  //Hace que la ventana aparezca en el centro -Yeiner.
    }
}
