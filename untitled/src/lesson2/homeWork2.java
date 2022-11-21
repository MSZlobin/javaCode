package lesson2;

import java.util.Arrays;
import java.util.Locale;

public class homeWork2 {
    public static void main(String[] args) {

        //Basic 1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        System.out.println((hi.trim() + world.toLowerCase() + newLine).repeat(3));
        System.out.println("----------------------");

        //Basic 2
        String row ="";
        for (int i = 1; i <101 ; i++) {
            row = row + i + "a ";
        }
        System.out.println(row);
        System.out.println("----------------------");
        //Basic 3

        dog sharik = new dog();
        Cat matroskin = new Cat();
        System.out.println("----------------------");

        //Advanced 1

        double increment = 0.01123;
        double result = 0;
        int i=0;

        do {
            result = result+increment;
            i++;
            if (result<0){
                break;
            }

        } while (
                result<1000000
        );
        System.out.println(i);
        System.out.println("----------------------");
        //Advanced 2
        int[] x = {1,1,1,1,1};
        for (int j = 0; j <x.length ; j=j+2) {
            x[j]=x[j]%1;
        }
        System.out.println(Arrays.toString(x));
        System.out.println("----------------------");
        //Advanced 3
        int[] firstArray = {1,2,5,7,10};
        int[] secondArray = {2,3,2,17,15};
        int[] resultArray = new int[firstArray.length*2 + secondArray.length];
        int count = 0;
        for (int j = 0; j < firstArray.length ; j++) {
            resultArray[j] = firstArray[j];
            count++;
        }
        for (int j = 0; j < secondArray.length ; j++) {
            resultArray[count++] = secondArray[j];
        }
        for (int j = 0; j < firstArray.length ; j++) {
            resultArray[count++] = firstArray[j]*secondArray[j];
        }

        System.out.println(Arrays.toString(resultArray));
        System.out.println("----------------------");
        //Advanced 4
        String hello = "Hello world!";
        hello = hello.replace ("l","r");
        String newHello = hello.toUpperCase();
        String substring = newHello.substring(0,7);

        System.out.println(substring);
        System.out.println("----------------------");

    }
}
