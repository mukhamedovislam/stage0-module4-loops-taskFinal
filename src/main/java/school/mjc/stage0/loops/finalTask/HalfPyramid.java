package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
	    int a = cathetusLength * 2;
	    for(int i = 1; i <= a; i++){
		    for(int j = a; j > 1; j--){
			    System.out.print(" ");
		    }
		    for(int k = i; k != 0; k--){
			    System.out.print("*");
		    }
		    a--;
		    System.out.println();
	    }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
