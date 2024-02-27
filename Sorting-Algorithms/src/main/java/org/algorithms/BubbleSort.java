package org.algorithms;
import java.util.Scanner;

public class BubbleSort {

    private int[] array;
    private int size;

    public BubbleSort(int[] array, int size){

        this.array = array;
        this.size = size;
    }

    public void Small_to_Large(){

        for(int i = 0; i < size; i++){

            int temp;
            for(int index = 1; index < (size - i); index++){

                if (array[index-1] > array[index]){

                    temp = array[index-1];
                    array[index-1] = array[index];
                    array[index] = temp;
                }
            }
        }
    }

    public void Large_to_Small(){

        for(int i = 0; i < size; i++){

            int temp;
            for(int index = 1; index < (size - i); index++){

                if (array[index-1] < array[index]){

                    temp = array[index-1];
                    array[index-1] = array[index];
                    array[index] = temp;
                }
            }
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int size;
        int element;

        System.out.println("Enter the size of the array: ");
        size = input.nextInt();
        input.nextLine();

        int[] array = new int[size];

        for (int i = 0; i < size; i++){

            System.out.println("Enter the "+ (i+1) + ". element: ");
            element = input.nextInt();
            input.nextLine();
            array[i] = element;
        }

        BubbleSort object = new BubbleSort(array, size);

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

        for (int x = 0; x < size; x++){

            System.out.println(object.array[x]);
        }

    }
}
