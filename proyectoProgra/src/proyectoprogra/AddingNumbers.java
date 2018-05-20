package proyectoprogra;

import GameInterfaces.AddingNumbersInterface;

/*
 * @authors Yeiner, Jasson y Edwin.
 */
public class AddingNumbers
{
    protected int correctSums;
    protected int totalSums;
    protected int failedSums;
    protected int firstRandom;
    protected int secondRandom;
    private int ingresedNumber;
    private int outPutSum;
       
    public AddingNumbers(int correctSums, int totalSums, int failedSums, int firstRandom, int secondRandom, int outPutSum) {
        this.correctSums = correctSums;
        this.totalSums = totalSums;
        this.failedSums = failedSums;
        this.firstRandom = firstRandom;
        this.secondRandom = secondRandom;
        this.outPutSum = outPutSum;
    }

    public int getOutPutSum() {
        return outPutSum;
    }

    public void setOutPutSum(int outPutSum) {
        this.outPutSum = outPutSum;
    }
    
    //Método de la suma de los números aleatorios.
    public boolean calculateSum()
    {
        boolean output = false;
            //Suma de de los números aleatorios.
            int outputSum = getOutPutSum() ;
            
            if (ingresedNumber == outputSum) 
            {
                output = true;
            } 
            return output;
    }//Fin metodo calculateSum    

    public void addFailedSums( int parameter )
    {
        this.failedSums += parameter;
    }
    
    public void addCorrectSums( int parameter )
    {
        this.correctSums += parameter;
    }
    
    public void addTotalSums( int parameter )
    {
        this.totalSums += parameter;
    }
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
    
    public int getCorrectSums() {
        return correctSums;
    }

    public int getTotalSums() {
        return totalSums;
    }

    public int getFailedSums() {
        return failedSums;
    }

    public int getFirstRandom() {
        return firstRandom;
    }

    public int getSecondRandom() {
        return secondRandom;
    }
    
    public int getIngresedNumber() {
        return ingresedNumber;
    }

    public void setIngresedNumber(int ingresedNumber) {
        this.ingresedNumber = ingresedNumber;
    }
}//Fin metodo principal
