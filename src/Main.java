public class Main {
    public static void main(String[] args) {

        Calculator meth = new Calculator();

        int sum1 = meth.add(5,8);
        int sum2 = meth.add(4,20,56);
        double sum3 = meth.add(28.6,47.8);

        System.out.println("sum 1 :"+sum1);
        System.out.println("sum 2 :"+sum2);
        System.out.println("sum 3 :"+sum3);


    }
}
