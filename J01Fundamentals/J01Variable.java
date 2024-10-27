package J01Fundamentals;

public class J01Variable {
    public static void main(String[] args) {

        // variable : variables are container to store data value

        int myNum = 10; // intialization and decalaration
        System.out.println(myNum);

        String name = "priyank";
        System.out.println(name);

        char myChar = 'A';
        System.out.println(myChar);

        final int number = 13;
        // If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)

        // number = 100;
        System.out.println(number);

        float myFloat = 31.45f;
        System.out.println(myFloat);

        boolean myBool = true;
        System.out.println(myBool);

        String myName = "priyank";
        System.out.println("Hello " + myName); // concatination oprator --> '+'


        // indentifiers : 
        // ariables must be identified with unique names.


        // Examples : 

        String StudentName = "priyank";
        int StudentAge = 99;
        float StudentPer = 55.55f;
        char StudentGrade = 'C';

        System.out.println("Student Name : " + StudentName);
        System.out.println("Student Age : " + StudentAge);
        System.out.println("Student Percentage : " + StudentPer);
        System.out.println("Student Grade : " + StudentGrade);
    }
}