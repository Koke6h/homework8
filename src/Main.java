import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Exercise 1");
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+1;
            System.out.println(numbers[i]);
        }
        System.out.println("Exercise 1.2");
        double[] numeral = {1.57, 7.654, 9.986};
        numeral[0] = 1.57f;
        numeral[1] = 7.654f;
        numeral[2] = 9.986f;
        for (int character = 0; character < numeral.length; character++) {
            System.out.println(numeral[character]);
        }
        System.out.println("Exercise 1.3");
        int[] symbol = new int[21];
        for (int a = 0; a < symbol.length; a+=7) {
            symbol[a]=a+7;
            System.out.println(symbol[a]);
        }
    }

    public static void task2() {
        System.out.println("Exercise 2");
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+1;
            if (i == numbers.length - 1) {
                System.out.println(numbers[i] + " ");
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("Exercise 2.2");
        double[] numeral = {1.57, 7.654, 9.986};
        for (int i = 0; i < numeral.length; i++) {
            if (i == numeral.length - 1) {
                System.out.println(numeral[i] + " ");
                break;
            }
            System.out.print(numeral[i] + ", ");
        }
        System.out.println("Exercise 2.3");
        int[] symbol = new int[21];
        for (int i = 0; i < symbol.length; i+=7) {
            symbol[i]=i+7;
            if (i == symbol.length - 7) {
                System.out.println(symbol[i] + " ");
                break;
            }
            System.out.print(symbol[i] + ", ");
        }
    }public static void task3(){
        System.out.println("Exercise 3");
        int [] numbers = new int[3];
        for (int i=2;i<numbers.length;i--){
            numbers[i]=i+1;
            if (i==0){
                System.out.println(numbers[i]+" ");
                break;
            }
            System.out.print(numbers[i]+", ");
        }
        System.out.println("Exercise 3.2");
        double[] numeral = {1.57, 7.654, 9.986};
        for (int i=2;i< numeral.length;i--){
            if (i==0){
                System.out.println(numeral[i]+" ");
                break;
            }
            System.out.print(numeral[i]+", ");
        }
        System.out.println("Exercise 3.3");
        int [] symbol = new int[22];
        for (int i=14;i< symbol.length;i-=7){
            symbol[i]=i+7;
            if (i==0){
                System.out.println(symbol[i]+" ");
                break;
            }
            System.out.print(symbol[i]+", ");
        }
    }
    public static void task4(){
        System.out.println("Exercise 4");
        int [] numeral = {0,1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i< 10;i++){
            if (i%2!=0){
                numeral[i]+=1;
            }
        }
        System.out.println(Arrays.toString(numeral));
    }
}



