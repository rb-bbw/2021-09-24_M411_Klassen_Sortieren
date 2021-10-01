package ch.bbw;

import java.util.*;

public class Main {
    private static final Random rand = new Random();
    private static long start_time = 0;
    private static long end_time = 0;

    public static void main(String[] args) {
        task_1();
        task_2();
        task_4();
    }
    private static void task_1(){
        int[] data_int = new int[100];
        for (int i = 0; i < 100; i++) {
            data_int[i] = i * rand.nextInt(10000);
        }
        start_time = System.nanoTime();
        Arrays.sort(data_int);
        end_time = System.nanoTime();
        System.out.println("Took " + (end_time - start_time) + " "+Arrays.toString(data_int));


        ArrayList<Integer> data_Integer = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data_Integer.add(i * rand.nextInt(10000));
        }
        start_time = System.nanoTime();
        Collections.sort(data_Integer, Collections.reverseOrder());
        end_time = System.nanoTime();
        System.out.println("Took " + (end_time - start_time) + " "+data_Integer);
    }
    private static void task_2(){
        Account[] accounts = new Account[100];
        for (int i = 0; i < 100; i++) {
            accounts[i] = new Account(i + 1, (i * rand.nextInt(10000)));
        }

        start_time = System.nanoTime();
        Account[] by_balance = insertionsort_balance(accounts.clone());
        end_time = System.nanoTime();
        System.out.print("\nTook " + (end_time - start_time));
        for(Account acc: by_balance){
            System.out.print(" " + acc.getBalance());
        }

        start_time = System.nanoTime();
        Account[] by_id = insertionsort_id(accounts.clone());
        end_time = System.nanoTime();
        System.out.print("\nTook " + (end_time - start_time));
        for(Account acc: by_id){
            System.out.print(" " + acc.getId());
        }
    }
    private static void task_4(){
        Account[] accounts = new Account[100];
        for (int i = 0; i < 100; i++) {
            accounts[i] = new Account(i + 1, (i * rand.nextInt(10000)));
        }

        start_time = System.nanoTime();
        Arrays.sort(accounts, new SortByBalanceAscending());
        end_time = System.nanoTime();
        System.out.print("\n\nTook " + (end_time - start_time));
        for(Account acc: accounts){
            System.out.print(" " + acc.getBalance());
        }

        start_time = System.nanoTime();
        Arrays.sort(accounts, new SortByBalanceDescending());
        end_time = System.nanoTime();
        System.out.print("\nTook " + (end_time - start_time));
        for(Account acc: accounts){
            System.out.print(" " + acc.getBalance());
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
