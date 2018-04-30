package proyectoprogra;

import javax.swing.JOptionPane;
/*
 * @authors Yeiner, Jasson y Edwin.
 */
public class AddingNumbers
{
    private int correctSums;//Este contador contiene la cantidad de sumas corretcas.
    private boolean controlSums = true;//Este boolean controla que se cumplan las 15 sumas para que se termine el juego.
    private int totalSums;//Total de sumas realizadas.
    private int failedSums;//Este contador lleva la cantidad de sumas incorrectas.

    //Creación del objeto control, para llamar a los metodos adding.
    AddingNumbers control = new AddingNumbers();

    public int getRandomNumber()
    {
        return (int) (Math.random() * 8) + 1;//Determina numeros al azar.
    }

    //Se obtiene el primer número.
    public int addingTheFirstNumber()
    {
        return getRandomNumber();
    }

    //Se obtiene el segundo número.
    public int addingTheSecondNumber() 
    {
        return getRandomNumber();
    }

    //Método de la suma de los números aleatorios.
    public void calculateSum()
    {
        //Almacenamiento de los números aleatorios en variables con llamadas a los métodos adding
        int firstRandom = control.addingTheFirstNumber();
        int secondRandom = control.addingTheSecondNumber();
        
        //Suma de de los números aleatorios.
        int outputSum = firstRandom + secondRandom;
        
        //Ciclo que calcula la cantidad de sumas acertadas y falladas.
        while (controlSums) 
        {
            int ingresedNumber1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
            if (ingresedNumber1 + secondRandom == outputSum) 
            {
                correctSums++;
                //Modelo para la interfaz
                JOptionPane.showMessageDialog( null, "Tiene "+correctSums+" sumas acertardas");
                if (correctSums == 15)
                {
                    controlSums = false;
                }
            } else
            {
                failedSums++;
                JOptionPane.showMessageDialog( null, "Tiene "+failedSums+" sumas fallidas");
            }
        }
    }
}
