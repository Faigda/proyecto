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
        String ruta = "E:\\palabras_para_el_juego.txt";
        File file = new File(ruta);
        String line = "";
        
        try
        {
            if ( !file.exists() )
                file.createNewFile();
            
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            
            line = buffReader.readLine();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        return line;
    }

    public int getInitialScore() {
        return initialScore;
    }

    public void setInitialScore(int initialScore) {
        this.initialScore = initialScore;
    }
    //No es necesario que el método reciba por parámetro la palabra digitada por el usuario.
    //Hay que cambiar la manera en que se obtiene la palabra digitada por el usuario.
    public String startGame ()
    {
        String copy = findingWords();
        changedWord = "";
        
        //Desordena la palabra a mostrar por pantalla.
        for ( int i = copy.length(); i >= 1; i-- )
        {
            int valorAleatorio = (int)(Math.random()* i+1);
            changedWord = changedWord + copy.substring( valorAleatorio - 1, valorAleatorio );
            copy =  copy.substring( 0, valorAleatorio -1 ) + copy.substring( valorAleatorio, i );
        }
        return changedWord;
    }
    
    public int compareWords ()
    {
        if ( !( inputWord.equals(line) ) )
        {
            initialScore -=10;
        }
        return initialScore;
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
