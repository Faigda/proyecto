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
    
    public FormingWords(String inputWord, String changedWord, String line) {
        this.inputWord = inputWord;
        this.changedWord = changedWord;
        this.line = line;
    }

    public FormingWords() {
    }
    
    public String findingWords()
    {
        int valorLinea = (int) (Math.random()*69)+1;
        int contador = 0;
        boolean sentinel = true;
       
        String ruta = "palabras_para_el_juego.txt";
        File file = new File(ruta);
        //"E:\\palabras_para_el_juego.txt"
        //C:\Users\DELL15\Documents\NetBeansProjects\proyecto\palabras.txt
         try
        {
            if ( !file.exists() )
                file.createNewFile();
            
            String copy = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ( ( copy = buffReader.readLine() ) != null &&  sentinel)
            {
                if (contador == valorLinea)
                {
                    //Escoge el valor aleatorio.
                    line = copy;
                    sentinel = false;
                }
                contador++;
            }
            
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
    public String startGame (String changed)
    {
        String copy = changed;
        changedWord = "";
        
        //Desordena la palabra con valores aleatorios y la mostrar por pantalla.
        for ( int i = copy.length(); i >= 1; i-- )
        {
            int valorAleatorio = (int)(Math.random()* i+1);
            changedWord = changedWord + copy.substring( valorAleatorio - 1, valorAleatorio );
            copy =  copy.substring( 0, valorAleatorio -1 ) + copy.substring( valorAleatorio, i );
        }
        return changedWord;
    }
    
    public boolean compareWords (String iWord)
    {
        inputWord = iWord;
        boolean verificador = false;
        if (  line.equals(inputWord)  )
        {
            verificador = true;
        }
        return verificador;
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
