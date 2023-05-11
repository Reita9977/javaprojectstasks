package com.company;

public class Task4 {

    public static void Method(int Reita ) throws LessThanOneException,GreaterThanOneException,EqualsZeroException{
        if(Reita <0){
            throw new LessThanOneException("The number Is Less Than 0");
        }
        else if ( Reita >1){
            throw new GreaterThanOneException("The number Is Greater Than 1");
        }
        else if(Reita ==0){
            throw new EqualsZeroException("The number Is equal To 0");
        }
    }
    public static  void main(String[]args) throws GreaterThanOneException, LessThanOneException, EqualsZeroException {
        try {
            Method(0);
        }
        catch (GreaterThanOneException | EqualsZeroException |LessThanOneException tfs ){
            System.out.println(tfs);
        }

    }


}
