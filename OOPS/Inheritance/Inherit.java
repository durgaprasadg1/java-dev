package OOPS.Inheritance;

// Here inheritance is similar as in case of humans , jo parents kaa hai vo apna hi hai .

// Similar to this, when we have two similar thing which some sort of code part similar, there we use extetion of  the class to avoid the repeatition of code. This can be identified by is-a relationship.

//Below is the example.

//Like calculator is the class having function +  * / -
// Then We need make a sci. Calculator. then it will also have sum code same for /*-+ so
//Sci. cal is a Cal , so it can be a child of Calc having code for /*-+


// this is Called as Inheritance

// You can Check for below eg


public class Inherit {
    public static void main(String[] args) {
        SciCal a = new SciCal();
        System.out.println(a.sum(2,4));
        System.out.println(a.sq(7));
    }
}

// why we use Inheritance,
// 1.  Sometimes we need to add more features then we just original class


