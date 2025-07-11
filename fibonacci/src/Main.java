//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int fib(int n) {
        if (n == 0) {
            return (0);
        } else if (n == 1) {
            return (1);
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

        public static void main (String[]args){
            Main x = new Main();
            System.out.println(x.fib(10));
        }
}