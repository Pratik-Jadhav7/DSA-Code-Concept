package com.main;

public class ArrayandArraylist {
    public static void main(String[] args) {

//        syntax
//        datatype[] variable_name = new datatype[size];
//        eg. store 5 rollno.
//        int[] rollno = new int[5];
//        or
//        int[] rollno = {1,2,3,4,5};

        int[] rollno;  // declaration of array. rollno is getting defined in the stack
        rollno = new int[5]; // initializaton. actual object is created in heap

        int[] rollno2 = {1,2,3,4,5};
        System.out.println(rollno2[3]);

        String[] arr = new String[5];
        System.out.println(arr[2]);
    }
}
