package proyectoprogra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * @author Jasson, Edwin, Yeiner
 */
public class GameLog {

    private String name;

    public GameLog(String name) {
        this.name = name;
    }

    public GameLog() {
        //An empty constructor is created
    }
    

    public void insertedGamer(GameLog gamer) {
        String ruta = "PlayerNames.txt";//Route of the list that contains the names of the players
        File file = new File(ruta);

        FileWriter flWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();//If the file does not exist then it creates it 
            }

            flWriter = new FileWriter(file.getAbsoluteFile(), true);

            BufferedWriter brWriter = new BufferedWriter(flWriter);

            if (!findGamer(gamer.getName())) {
                brWriter.write(
                        gamer.getName()+ ""
                        
                );
                brWriter.newLine();
            }
            brWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"404 error: Logic no found");
        } finally {
            if (flWriter != null) {
                try {
                    flWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public boolean findGamer (String nombre){
    
        String ruta = "PlayerNames.txt";
        File file = new File(ruta);       
        boolean encontrado = false;
        
        try{
            if(!file.exists())
                file.createNewFile();

            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while((cadena = buffReader.readLine())!=null) 
            {
                if(cadena.indexOf(",") != -1)
                {
                    if(cadena.split(",")[1].equalsIgnoreCase(nombre))
                    {
                        encontrado = true;
                    }
                }
                //System.out.println(cadena);
            }
            buffReader.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        
        return encontrado;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
