import java.io.Console;

class Task4 {
    public static void main(String[] args) {
        Console io = System.console();

        System.out.print("Write a first string: ");
        String first = io.readLine();

        System.out.print("Write a second string: ");
        String second = io.readLine();

        // line break
        System.out.println();

        String concat12 = first.concat(second); // concatenated
        System.out.println("first + second is: " + concat12);

        String concat21 = second.concat(first); // concatenatedReverse
        System.out.println("second + first is: " + concat21);

        // line break
        System.out.println();

        if (concat12.equals(concat21)) {
            System.out.println("Compositions of two strings are equal");
        } else {
            System.out.println("Compositions of two strings are different");
        }
    }
}
