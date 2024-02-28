package org.algorithms;
import java.util.Scanner;
public class InsertionSort {

    private int[] array;
    private int size;

    public InsertionSort(int[] array, int size){

        this.array = array;
        this.size = size;
    }

    public void Small_to_Large(){

        int temp;

        for (int x = 1; x < size; x++){

            temp = array[x];
            int front = x;

            while (array[front-1] > temp){

                array[front] = array[front-1];
                front--;
                if (front == 0){
                    break;
                }
            }
            array[front] = temp;
        }

        for (int index = 0; index < size; index++){

            System.out.println(array[index]);
        }
    }

    public void Large_to_Small(){

        int temp;

        for (int x = 1; x < size; x++){

            temp = array[x];
            int front = x;

            while (array[front-1] < temp){

                array[front] = array[front-1];
                front--;
                if (front == 0){
                    break;
                }
            }
            array[front] = temp;
        }

        for (int index = 0; index < size; index++){

            System.out.println(array[index]);
        }
    }


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int element;
        System.out.println("Enter the array's size:");
        int size = input.nextInt();
        input.nextLine();

        int[] array = new int[size];

        for (int i = 0; i < size; i++){

            System.out.printf("Please enter the %d . element: ", (i+1));
            element = input.nextInt();
            input.nextLine();
            array[i] = element;
        }

        InsertionSort object = new InsertionSort(array, size);

        while (true) {

            System.out.println("Choose the sorting type:\n1-> Small to large\n2->Large to small");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    object.Small_to_Large();
                    break;

                case 2:
                    object.Large_to_Small();
                    break;

                default:
                    System.out.println("Invalid selection!");
                    continue;
            }
            break;
        }

    }
}
