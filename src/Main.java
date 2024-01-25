// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] words = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        int[] integers = { 45, 29, 10, 22, 41, 28, 33};
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};

        for(int i=0; i<integers.length; i++) {
            if(integers[i]<=32 && precipitation[i]>=50)
                System.out.println("it will likely snow on " + words[i]);
        }



        }



    }

