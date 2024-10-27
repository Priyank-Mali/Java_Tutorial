package J04ConditionalStatement;

public class J01Ifelse {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 21;

        // if - else
        if (num1 > num2) {
            System.out.println(num1 + " is greter than " + num2);
        }else {
            System.out.println(num1 + " is less than " + num2);
        }

        // if - elseif

        int marks = 55;

        if(marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade Fail");
        }

        // short-hand -->  else if (Ternary if-else Condition)

        String result = marks >= 90 ? "Grade A" : marks >= 80 && marks < 90 ? "Grade B" : marks >= 70 && marks < 80 ? "Grade C" : "Fail";

        System.out.println(result);


        // switch

        String fruit = "Apple";
        
        switch(fruit){

            case "Banana" : 
                System.out.println("This is Banana");
                break;
            case "Apple":
                System.out.println("This is Apple");
                break;
            default:
                System.out.println("This is not fruit");
                
        }
    }
}
