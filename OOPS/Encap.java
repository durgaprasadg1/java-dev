package OOPS;

public class Encap {
    // Encap means storing the data in a secret box and not allowing the direct access from external committee.

    // to Not allow the direct access to the info. we make them public as well as the private , so the public can be accessed from anywhere but pvt does not which leads t the use of another public method (i.e. getDistance in our case)

    // Encapsulation me pvt variables banake data hide krte hai,
    // Data ko fetch yaa update krna ho to getter and setter use krte hai.
    // those private variables are dependent upon the method to be accessed and updated.

    // here the getter and setter are defined as getSrc and setAge


    public static void main(String[] args) {
        Pair p = new Pair(5, 7);
        p.getSrc();
        System.out.println(p.getDistance());


    }


}

class Pair{
    private int src;
    private int dest;
    private int distance;
    Pair(int src, int dest){
        this.src = src;
        this.dest = dest;
        this.distance = dest - src;
    }


    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public int getDistance(){
        return this.distance;
    }

}