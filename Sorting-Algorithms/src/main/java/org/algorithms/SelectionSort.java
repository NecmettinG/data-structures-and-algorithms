package org.algorithms;
import java.util.Scanner;

public class SelectionSort {

    private int[] array;
    private int size;

    public SelectionSort(int[] array, int size){

        this.array = array;
        this.size = size;
    }

    public void Small_to_Large(){

        int min_value, min_index, temp_value, temp_index;

        for (int i = 0; i < size; i++){

            min_value = array[i];
            temp_value = array[i];
            temp_index = i;
            min_index = i;

            for (int x = i; x < size; x++){

                if (min_value > array[x]){

                    min_value = array[x];
                    min_index = x;
                }
            }

            array[temp_index] = min_value;
            array[min_index] = temp_value;
        }

        for (int index = 0; index < size; index++){

            System.out.println(array[index]);
        }
    }

    public void Large_to_Small(){

        int max_value, max_index, temp_value, temp_index;

        for (int i = 0; i < size; i++){

            max_value = array[i];
            temp_value = array[i];
            temp_index = i;
            max_index = i;

            for (int x = i; x < size; x++){

                if (max_value < array[x]){

                    max_value = array[x];
                    max_index = x;
                }
            }

            array[temp_index] = max_value;
            array[max_index] = temp_value;
        }

        for (int index = 0; index < size; index++){

            System.out.println(array[index]);
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int element;
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        input.nextLine();
        int[] array = new int[size];

        for (int x = 0; x < size; x++){

            System.out.printf("Please enter the %d . element: ", (x+1));
            element = input.nextInt();
            input.nextLine();
            array[x] = element;
        }

        SelectionSort object = new SelectionSort(array, size);

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
