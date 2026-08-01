package com.pro.calculator;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    private int No1;

    public int getNo1() {
        return No1;
    }
    public void setNo1(int no1) {
        No1 = no1;
    }

    private int No2;
    public int getNo2() {
        return No2;
    }

    public void setNo2(int no2) {
        No2 = no2;
    }

    public float Add(float No1,float No2){
        float result=No1+No2;
        return result;
    }

    public float Sub(float No1,float No2){
        float result=No1-No2;
        return result;
    }

    public float Multiply(float No1,float No2){
        float result=No1*No2;
        return result;
    }

    public float Divide(float No1,float No2){
        float result=No1/No2;
        return result;
    }

    public void Choose(int option){
        switch (option) {
            case 1:
                Add(No1,No2);
                break;
             case 2:
                Sub(No1,No2);
                break;
            case 3:
                Multiply(No1,No2);
                break;
             case 4:
                Divide(No1,No2);
                break;
        
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
