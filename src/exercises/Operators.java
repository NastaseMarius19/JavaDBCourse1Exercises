package exercises;

public class Operators {
    public void mainUndercoverX2(){
        int a = 5;
        System.out.println(a + -a - a++ % 10);
        System.out.println(a - a + --a / 10);
        for (int i = 2; i < 5;){
            i++;
            a += a;
        }
        System.out.println("a = " + a);
    }
}
