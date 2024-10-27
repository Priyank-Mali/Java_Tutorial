package J01Fundamentals;

public class J03TypeCasting {
    public static void main(String[] args) {

        /*
		 * In java there are two types of casting
		 * 
		 * 1.) Widening Casting (implicit - automatically)  converting a smaller type to a larger type size
		 * 		
		 * 		byte -> short -> char -> int -> long -> float -> double
		 * 
		 * 2.) Narrowing Casting (explicit - manually)   converting a larger type to a smaller size type
		 * 
		 * 		double -> float -> long -> int -> char -> short -> byte
		 *
		 */

        int myNum = 10;
        float newNum = myNum;

        System.out.println(newNum);

        float number = 10.11f;
        int newnumber = (int) number;

        System.out.println(newnumber);

        System.out.println(2/4); // 0
        // System.out.println(2.0/4); // 0
        // System.out.println(2/4.0); // 0


        // Example:

        int maxScore = 500;

        int userScore = 423;

        float percetage =  userScore / (float) maxScore * 100 ;

        System.out.println(percetage);

    }       
}
