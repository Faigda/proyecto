package proyectoprogra;

import GameInterfaces.AddingNumbersInterface;

/*
 * @authors Yeiner, Jasson y Edwin.
 */
public class AddingNumbers
{
    //The variables are declared
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
    
    //Method of the sum of the random numbers
    public boolean calculateSum()
    {
        boolean output = false;
            //Sum of random numbers
            int outputSum = getOutPutSum() ;
            
            if (ingresedNumber == outputSum) 
            {
                output = true;
            } 
            return output;
    }//End method calculateSum    

     public boolean comparador (int saveF, int saveS, int attemptsMade, int numberIngresed)
    {
        boolean output;
        
        if(attemptsMade % 2 == 0)
           {
                if(saveS == numberIngresed)
                {
                    output = true;
                }
                else
                {
                    output = false;
                }
           }
           else
           {
                if(saveF == numberIngresed)
                {
                    output = true;
                }
                else
                {
                    output = false;
                } 
            }
        return output;
    }
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
        return (int) (Math.random() * 8) + 1;//Determine random numbers
    }

    //The first number is obtained
    public int addingTheFirstNumber()
    {
        return getRandomNumber();
    }

    //The first number is obtained
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
}//End main method
