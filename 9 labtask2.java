package com.company;
class Task2 {

    public static void main(String[ ] args) {
        int[] Reita52334 = {1, 2, 3, 6 , 8 , 21};
        System.out.println(Reita52334[7]);


        try {
            Reita52334 = new int[]{1, 2, 3, 6 , 8 , 21};

            System.out.println(Reita52334[7]);
        } catch (Exception e) {
            System.out.println("Something is off.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


    }
}
