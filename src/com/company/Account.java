package com.company;

public class Account {
    private int numberAccount = 0;

    public synchronized void add(int num){
        if (numberAccount == 0){

        }
        numberAccount += num;
        System.out.println("Da nop: " + num);
        notify();
    }

    public synchronized void sub(int num){
        if (numberAccount < 50000){
            System.out.println("So du phai > 50000!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numberAccount -= num;
        System.out.println("Da rut: " + num);
    }
}


