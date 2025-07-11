//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    static long[] fibArray;
    public long fib(int n) {
        if (fibArray[n] == -1) {
            fibArray[n] = fib(n - 1) + fib(n - 2);
        }
        return (fibArray[n]);
    }

    public static void main (String[]args){
            Main x = new Main();
            Scanner scan=new Scanner(System.in);
            int N=scan.nextInt();
            fibArray=new long[N+1];
            for(int i=0;i<=N;i++)
                fibArray[i]=-1;
        fibArray[0]=0;
        fibArray[1]=1;
        System.out.printf("the number is %d\n",N);
        System.out.printf("the nth term is %d\n",x.fib(N));
        System.out.print(fibArray[0]);
        for(int i=1;i<+N;i++)
            System.out.printf(" %d ",fibArray[i]);
        }
}