package labs1;

import java.math.BigInteger;
import java.util.Scanner;

public class program {
    private Scanner one = new Scanner(System.in);

    public void Close() {
        one.close();
    }

    public void task1() {
        System.out.print("X = ");
        double xx = one.nextDouble();
        System.out.print("Y = ");
        double yy = one.nextDouble();

        double res = (1 + Math.pow(Math.sin(xx + yy), 2)) / (2 + Math.abs(xx - 2 * xx / (1 + xx * xx * yy * yy))) + xx;
        System.out.println(res);


    }

    public void task2() {
        System.out.println("Point has coordinates:");
        System.out.print("X = ");
        double x = one.nextDouble();
        System.out.print("Y = ");
        double y = one.nextDouble();

        int x1 = 4;
        int x2 = 6;
        int y1 = 5;
        int y2 = -3;

        if (y < 0) {
            if (y > y2 && Math.abs(x) < x2)
                System.out.println("true");
            else
                System.out.println("false");
        } else {
            if (y < y1 && Math.abs(x) < x1)
                System.out.println("true");
            else
                System.out.println("false");
        }


    }

    public void task3() {
        System.out.print("A = ");
        double a = one.nextDouble();
        System.out.print("B = ");
        double b = one.nextDouble();
        System.out.print("H = ");
        double h = one.nextDouble();

        double x = a;

        while (x < b) {
            System.out.print(x);
            System.out.print(" ");
            System.out.println(Math.tan(x));
            x += h;
        }

    }

    public void task4() {
        System.out.print("Array length = ");
        int len = one.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = one.nextInt();
            BigInteger big = BigInteger.valueOf(arr[i]);
            boolean probablePrime = big.isProbablePrime((int) Math.log(arr[i]));
            if (probablePrime) {
                System.out.print(arr[i] + " ");
            }
        }


    }

    public void task5() {
        System.out.print("Array length = ");
        int len = one.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.print(arr[i] + " ");
        }
        int mxln = 0;
        int currpos;
        boolean isup;
        for (int i = 0; i < len; i++) {
            currpos = 1;
            isup = true;
            for (int j = i + 1; (j < len) && isup; j++) {
                if (arr[j - 1] < arr[j]) {
                    currpos++;
                } else {
                    isup = false;
                }
            }
            mxln = Math.max(mxln, currpos);
        }
        System.out.println("");
        System.out.print(mxln);
        //one.close();
    }

    public void task6()
    {
        System.out.print("Length = ");
        int len = one.nextInt();
        int[] arr = new int[len];
        System.out.print("Number: ");
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int pos = 0;
        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < len; j++)
            {
                System.out.print(arr[(j+pos) % len]+ " ");
            }
            pos++;
            System.out.println();
        }
    }

    public void task7()
    {
        System.out.print("Length = ");
        int len = one.nextInt();
        int[] arr = new int[len];
        System.out.print("Number: ");
        for (int i = 0; i < len; i++)
        {
            arr[i] = (int) (Math.random() * 20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int i = 0;
        while (i < len-1) {
            if (arr[i] <= arr[i + 1])
                i++;
            else {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                if (i != 0)
                    i--;
            }
        }
        for (i = 0; i < len; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public void task8()
    {
        System.out.print("Length of A array = ");
        int lenA = one.nextInt();
        int[] arrA = new int[lenA];
        int i, j;
        System.out.print("Array A: ");
        for (i = 0; i < lenA; i++)
        {
            arrA[i] = (int) (Math.random() * 20);
           // System.out.print(arrA[i] + " ");
        }
        i = 0;
        while (i < lenA-1) {
            if (arrA[i] <= arrA[i + 1])
                i++;
            else {
                int temp = arrA[i];
                arrA[i] = arrA[i + 1];
                arrA[i + 1] = temp;

                if (i != 0)
                    i--;
            }
        }
        for (i = 0; i < lenA; i++)
        {
            System.out.print(arrA[i]+" ");
        }
        System.out.println();
        System.out.print("Length of B array = ");
        int lenB = one.nextInt();
        int[] arrB = new int[lenB];
        System.out.print("Array B: ");
        for (j = 0; j < lenB; j++)
        {
            arrB[j] = (int) (Math.random() * 20);
           // System.out.print(arrB[j] + " ");
        }
        i = 0;
        while (i < lenB-1) {
            if (arrB[i] <= arrB[i + 1])
                i++;
            else {
                int temp = arrB[i];
                arrB[i] = arrB[i + 1];
                arrB[i + 1] = temp;

                if (i != 0)
                    i--;
            }
        }
        for (i = 0; i < lenB; i++)
        {
            System.out.print(arrB[i]+" ");
        }
        System.out.println();

        //int[] arrC = new int[lenA+lenB];
        int posA = 0, posB = 0, index = 0;

        while (posA < lenA)
        {
            if (arrB[posB] < arrA[posA])
            {
                System.out.print(index);
                System.out.print("  ");
                posB++;
            }
            else
            {
                posA++;
                index++;
            }

        }

        while (posB != lenB)
        {
            System.out.print(index);
            System.out.print("  ");
            posB++;
        }
        one.close();
    }
}
