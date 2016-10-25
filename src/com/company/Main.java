package com.company;

public class Main {

    public static void main(String[] args) {
	int n=11;

        if(n%2==0){
            System.out.println("weird");
        }
        else if((n%2==0) && (n<=10 && n>20)){
            System.out.println("This is not weird");
        }
        else if(n%1==0 && n<=10 ){
            System.out.println("This is Odd weird");
        }
    }
}
