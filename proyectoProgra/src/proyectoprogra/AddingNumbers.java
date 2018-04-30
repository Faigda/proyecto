package proyectoprogra;

import javax.swing.JOptionPane;

/*
 * @authors Yeiner, Jasson y Edwin.
 */
public class AddingNumbers {

    private int correctSums;//Este contador contiene la cantidad de sumas corretcas.
    private boolean controlSums = true;//Este boolean controla que se cumplan las 15 sumas para que se termine el juego.
    private int totalSums;//Total de sumas realizadas.
    private int failedSums;//Este contador lleva la cantidad de sumas incorrectas.

    public int getRandomNumber() {
        return (int) (Math.random() * 8) + 1;//Determina numeros al azar.
    }

    //Se obtiene el primer número.
    public int addingTheFirstNumber() {
        int number1 = getRandomNumber();

        return number1;
    }

    //Se obtiene el segundo número.
    public int addingTheSecondNumber() {
        int number2 = getRandomNumber();

        return number2;
    }

    //Método de la suma de los números aleatorios.
    public void calculateSum(boolean controlSums, int addingTheFirstNumber, int addingTheSecondNumber) {
        
        //Creación del objeto control, para llamar a los metodos adding.
        AddingNumbers control = new AddingNumbers();
        int firstRandom = control.addingTheFirstNumber();
        int secondRandom = control.addingTheSecondNumber();
        int outputSum = firstRandom+secondRandom;
        int number1;
        int ingresedNumber1;

        while (controlSums) 
        {
            ingresedNumber1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
            if (ingresedNumber1+secondRandom==outputSum) 
            {
                correctSums++;
                
                
            }else
            {
                failedSums++;
            
            }
        }
    }
}
