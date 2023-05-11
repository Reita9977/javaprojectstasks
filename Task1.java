class Task1 {
    public static void main(String[] args) {
        
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - 1 - i;
        }

        for (int x : arr) {
            System.out.printf("array[%d] = %d\n", x, arr[x]);
        }
    }
}
