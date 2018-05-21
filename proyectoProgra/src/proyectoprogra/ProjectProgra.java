package proyectoprogra;

/*
 * @author Jasson, Yeiner y Edwin.
 */
import GameInterfaces.ProjectPrograInterface;
import javax.swing.JFrame;

public class ProjectProgra 
{
    public static void main(String[] args)
    {
        ProjectPrograInterface startObject = new ProjectPrograInterface(); // crea objeto ProyectPrograInterface
        
        startObject.setTitle("IF2000 Project");
        startObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startObject.setSize(404, 326); // establece el tamaño del marco
        startObject.setVisible(true); // muestra el marco
        startObject.setLocationRelativeTo(null);  //Hace que la ventana aparezca en el centro
        startObject.setResizable(false);
    }
}
