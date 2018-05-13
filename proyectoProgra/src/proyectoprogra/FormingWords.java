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
    private int initialScore = 100;
    
    
    public String findingWords()
    {
        String ruta = "palabras_para_el_juego.txt";
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
    
    public void startGame ( String inputWord )
    {
        String copy = findingWords();
        changedWord = "";
        
        //Desordena la palabra a mostrar por pantalla.
        for ( int i = copy.length(); i >= 2; i-- )
        {
            int valorAleatorio = (int)(Math.random()* i+1);
            changedWord = changedWord + copy.substring( valorAleatorio - 1, valorAleatorio );
            copy =  copy.substring( 0, valorAleatorio -1 ) + copy.substring( valorAleatorio, i );
        }
        
        if ( !( inputWord.equals(line) ) )
        {
            initialScore -=10;
        }
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
