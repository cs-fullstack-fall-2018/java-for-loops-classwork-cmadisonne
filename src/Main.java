public class Main {

    public static void main(String[] args) {
	    int lastNumber = 100;
	    int startNum = 0;
	    System.out.println("Starting Count to " + lastNumber);
	    countTheNumbers(lastNumber, startNum);
    }
    public static void countTheNumbers(int x, int y){
        for (y=0; y<= x; y++) {
            System.out.println(y);
        }
    }
}
