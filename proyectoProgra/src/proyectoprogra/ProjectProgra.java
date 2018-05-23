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
        LoginInterface startObject = new LoginInterface(); //Create object LoginInterface
        
        startObject.setTitle("IF2000 Project");//Title
        startObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startObject.setSize(404, 200); //Set the frame size
        startObject.setVisible(true); //Show the frame
        startObject.setLocationRelativeTo(null);//Makes the window appear in the center
        startObject.setResizable(false);//Does not allow the player to change the size of the windows
    }
}
