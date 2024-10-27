package J05loops;

public class J01for {
    public static void main(String[] args) {
        
        // loop means --> number of itrables items
        // for loop ( when you know exact number of itrables)

        // ( starting : condition check : increment/decrement )

        for (int i=0 ; i<=10 ;i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        // while lopp (when you know exact number of itrables)

        int a = 10;

        while(a < 20){
            if (a%2 != 0){
                System.out.println(a);
            }
            a++;
        }

        // do - while 

        int number = 19;

        do {
            System.out.println("Hello world !!");
        }while (number < 15);

        // Exmples

        int num = 11;
        for (int i=1;i<=10;i++){
            System.out.println(num + " * " + i +  " --> " +  num * i);
        }


        // break 

        for (int i=1;i<100;i++){
            if(i == 10){
                break;
            }
            System.out.println(i);
        }

        // continue

        for (int i=1;i<20;i++){
            if(i == 10){
            continue;
            }
            System.out.println(i);
        }

    }
}
