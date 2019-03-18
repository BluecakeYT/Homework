public class hw {

    public static void main(String []args) {

        int sum = 0 ;
        for(int i = 1 ; i <= 50 ; i++){
           sum += i;
        }
        System.out.println("Q1: THE SUM OF 1-50 = " + sum);

        System.out.println("Q2: THE RESULT");
        for (int i = 5; i <= 100; i += 10) {
            System.out.println (i - 1);
            System.out.println (i + 1);
        }

        int score = 99;
        if (score <= 60) {
            System.out.println ("Q3: Score " + score + " is grade F");
        } else
        if (score <= 70) {
            System.out.println ("Q3: Score " + score + " is grade D");
        } else
        if (score <= 80) {
            System.out.println ("Q3: Score " + score + " is grade C");
        } else
        if (score <= 90) {
            System.out.println ("Q3: Score " + score + " is grade B");
        } else {
            System.out.println ("Q3: Score " + score + " is grade A");
        }

        System.out.println ("Q4: Results [INFINITE! BAD! RUN AT YOUR OWN RISK!] ");
        for (int i = 3 ; ; i++) {
           if ((i % 3 == 0 || i % 4 == 0 ) && i % 12 != 0) {
               System.out.println(i);
           }
        }
    }
}
