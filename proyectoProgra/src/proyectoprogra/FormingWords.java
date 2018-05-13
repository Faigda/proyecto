package proyectoprogra;
/*
 * @author Jasson, Yeiner y Edwin.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FormingWords
{
    private String inputWord;
    private String changedWord;
    private String line;
    
    public String findingWords()
    {
        String ruta = "C:\\Users\\DELL15\\Documents\\NetBeansProjects\\proyecto\\palabras_para_el_juego.txt";
        File file = new File(ruta);
        
        try
        {
            if ( !file.exists() )
                file.createNewFile();
            
            String line = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            
            line = buffReader.readLine();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        return line;
    }
    
    //Métodos get and set
    public String getInputWord() {
        return inputWord;
    }

    public void setInputWord(String inputWord) {
        this.inputWord = inputWord;
    }

    public String getChangedWord() {
        return changedWord;
    }

    public void setChangedWord(String changedWord) {
        this.changedWord = changedWord;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
    
}
