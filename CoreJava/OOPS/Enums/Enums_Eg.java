package CoreJava.OOPS.Enums;

// Enums are the class for the constants
// they are also indexed from 0 . we can check by doing s.ordinal();
// If we want to get all the items in nums so we can implement the s.values() method so that we get the array of enums.
enum Status{
    Good, Bad, Better, Best , Bestest;
}
public class Enums_Eg {
    public static void main(String[] args) {
        Status s = Status.Best; // we Can only use those which  are defined .
//        System.out.println(s);

        Status[] sb = Status.values(); // we can iterate over it
        //also we can use the switch cases for that
        System.out.println(sb[2]);


    }
}
