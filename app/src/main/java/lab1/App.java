/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab1;

public class App {

    public static void main(String[] args) {
        System.out.println(section1());
        System.out.println(section2());
        System.out.println(section3());
        System.out.println(section4());
    }

    public static String section1() {
        int num =42;
        float average =95.5f;
        char letter ="A";
        boolean isTrue = True;
        // Write section 1 code here
        return "num =" + num + "\n" ", average = " + average + "\n" ", letter = " + letter "\n" ", isTrue =" + isTrue;
        // Hint: How to return the values as a string
//        return "num: " + num + "\n" +
//                "average: " + average + "\n" +
//                "letter: " + letter + "\n" +
//                "isTrue: " + isTrue + "\n";
    }

    public static String section2() {
        // Write section 2 code here
        int num = 30;
        boolean isTrue = true;
        int sum = num + 25;
        float average = 30f;
        float product = average * 2;
        return "num ="+num +"isTrue ="+ isTrue + "sum =" + sum + "product ="+ product

    }

    public static String section3() {
        // Write section 3 code here
        int square ;
        for(int i = 1; i <= 10; i++){
            square =i*i;
        }
        while(int num<= 100){
            num = num * 2;
        }
    return "square" + square + "num" + num;
    }

    public static String section4() {
        // Write section 4 code here
        int num = 42;
        char letter='A';
        StringBuilder sb = new StringBuilder();

        if (num % 2 == 0) {
            sb.append("Even" +"\n");
        }
        else {
            sb.append("Odd" +"\n");
        }
        switch (letter) {
            case 'A':
                sb.append("Excellent" +"\n");
                break;
            case 'B':
                sb.append("Good" +"\n");
                break;
            case 'C':
                sb.append("Average" +"\n");
                break;
            case 'D':
                sb.append("Poor" +"\n");
                break;
            case 'F':
                sb.append("Fail" +"\n");
                break;
            default:
                sb.append("Invalid grade" +"\n");
                break;
        }
        return sb.toString();
    }

}