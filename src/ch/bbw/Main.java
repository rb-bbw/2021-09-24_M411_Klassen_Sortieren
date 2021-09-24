package ch.bbw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    private static Random rand = new Random();
    private static long start = 0;
    private static long end = 0;

    public static void main(String[] args) {
        task_1();
        task_2();
    }
    private static void task_1(){
        int[] data_int = new int[100];
        for (int i = 0; i < 100; i++) {
            data_int[i] = i * rand.nextInt(10000);
        }
        start = System.nanoTime();
        Arrays.sort(data_int);
        end = System.nanoTime();
        System.out.println("Took " + (end-start) + " "+Arrays.toString(data_int));


        ArrayList<Integer> data_Integer = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data_Integer.add(i * rand.nextInt(10000));
        }
        start = System.nanoTime();
        Collections.sort(data_Integer, Collections.reverseOrder());
        end = System.nanoTime();
        System.out.println("Took " + (end-start) + " "+data_Integer);
    }
    private static void task_2(){
        Account[] accounts = new Account[100];
        for (int i = 0; i < 100; i++) {
            accounts[i] = new Account(i + 1, (i * rand.nextInt(10000)));
        }

        start = System.nanoTime();
        Account[] by_balance = insertionsort_balance(accounts.clone());
        end = System.nanoTime();
        System.out.println("Took " + (end-start));
        for(Account acc: by_balance){
            System.out.print(acc.getBalance() + " ");
        }

        System.out.println();
        start = System.nanoTime();
        Account[] by_id = insertionsort_id(accounts.clone());
        end = System.nanoTime();
        System.out.println("Took " + (end-start));
        for(Account acc: by_id){
            System.out.print(acc.getId() + " ");
        }
    }

    private static Account[] insertionsort_balance(Account[] accounts){
        Account temp;
        for(int i = 1; i < accounts.length; i++){
            for(int j = 0; j < i; j++){
                if(accounts[i-j].getBalance() < accounts[i-j-1].getBalance()){
                    temp = accounts[i-j-1];
                    accounts[i-j-1] = accounts[i-j];
                    accounts[i-j] = temp;
                }
            }
        }

        return accounts;
    }
    private static Account[] insertionsort_id(Account[] accounts){
        Account temp;
        for(int i = 1; i < accounts.length; i++){
            for(int j = 0; j < i; j++){
                if(accounts[i-j].getId() < accounts[i-j-1].getId()){
                    temp = accounts[i-j-1];
                    accounts[i-j-1] = accounts[i-j];
                    accounts[i-j] = temp;
                }
            }
        }

        return accounts;
    }
}
