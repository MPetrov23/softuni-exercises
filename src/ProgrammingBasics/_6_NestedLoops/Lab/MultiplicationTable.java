package ProgrammingBasics._6_NestedLoops.Lab;

public class MultiplicationTable {
    public static void main(String[] args) {

        for(int a=1; a<=10; a++){
            for(int b =1; b<=10; b++){
                System.out.printf("%d * %d = %d%n",a,b,a*b);
            }
        }
    }

}
