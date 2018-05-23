package proyectoprogra;

/*
 * @author Jasson, Yeiner y Edwin.
 */
import GameInterfaces.LoginInterface;
import javax.swing.JFrame;

public class ProjectProgra 
{
    public static void main(String[] args)
    {
        LoginInterface startObject = new LoginInterface(); // crea objeto ProyectPrograInterface
        
        startObject.setTitle("IF2000 Project");
        startObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startObject.setSize(404, 200); // establece el tamaño del marco
        startObject.setVisible(true); // muestra el marco
        startObject.setLocationRelativeTo(null);  //Hace que la ventana aparezca en el centro
        startObject.setResizable(false);
    }
}
