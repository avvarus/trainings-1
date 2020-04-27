package com.company.training.samples;

public class Sample1 {


//    public static void main(String args[])
//    {
//        final int arr[] = {1, 2, 3, 4, 5};  // Note: arr is final
//        for (int i = 0; i < arr.length; i++)
//        {
//            arr[i] = arr[i]*10;
//            System.out.println(arr[i]);
//        }
//    }



    int p = 20;
    public static void main(String args[])
    {
        /*

        final Sample1 t = new Sample1();
        t.p = 30;
        System.out.println(t.p);

        */

        final Sample1 t1 = new Sample1();
        Sample1 t2 = new Sample1();
       // t1 = t2;
        System.out.println(t1.p);

    }

}
