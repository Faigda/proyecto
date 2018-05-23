package proyectoprogra;
/*
 * @author Jasson, Yeiner y Edwin.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FormingWords
{
    private String inputWord;//The variables are declared
    private String changedWord;
    private String line;

    public FormingWords(String inputWord, String changedWord, String line) {
        this.inputWord = inputWord;//A builder is created
        this.changedWord = changedWord;
        this.line = line;
    }

    public FormingWords() {
        //Empty builder
    }

    
    public String findingWords()
    {
        int valueLine = (int) (Math.random()*19)+1;//Generates a random number between 1 and 20
        int accountant = 0;
        boolean sentinel = true;
       
        String ruta = "WordsGame.txt";//Route of the list that contains the words for the "Forming Words" game
        File file = new File(ruta);
        
         try
        {
            if ( !file.exists() )
                file.createNewFile();
            
            String copy = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ( ( copy = buffReader.readLine() ) != null &&  sentinel)
            {
                if (accountant == valueLine)
                {
                    //Choose the random value
                    line = copy;
                    sentinel = false;
                }
                accountant++;
            }
            
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        
        return line;
    }

    //It is not necessary for the method to receive the word typed by the user by parameter
    public String startGame (String changed)
    {
        String copy = changed;
        changedWord = "";
        
        //This for disorders the word to be displayed on the screen.
        for ( int i = copy.length(); i >= 1; i-- )
        {
            int randomValue = (int)(Math.random()* i+1);
            changedWord = changedWord + copy.substring( randomValue - 1, randomValue );
            copy =  copy.substring( 0, randomValue -1 ) + copy.substring( randomValue, i );
        }
        return changedWord;
    }
    
    public boolean compareWords (String iWord)
    {
        inputWord = iWord;
        boolean checker = false;
        if (  line.equals(inputWord)  )
        {
            checker = true;
        }
        return checker;
        
    }
    //Methods get and set
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
