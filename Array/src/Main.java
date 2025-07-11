//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Integer;
public class Main{
    public static void main(String[] args){
        int[][]queries=new int[10][3];
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=Integer.parseInt(scan.nextLine());

        int[] resultArray=new int[n];
        for(int i=0;i<n;i++){
            resultArray[i]=0;
        }
        System.out.print("Enter the number of queries:");
        int q=Integer.parseInt(scan.nextLine());
        String[]line;
        for(int i=0;i<q;i++){
            line=scan.nextLine().split(" , ");
            queries[i][0] = Integer.parseInt(line[0]);
            queries[i][1] = Integer.parseInt(line[1]);
            queries[i][2] = Integer.parseInt(line[2]);
        }

        for(int j=0;j<q;j++){
            for(int i=queries[j][0];i<=queries[i][1];i++){
                resultArray[i]+=queries[i][2];
            }
        }
        System.out.println(Arrays.stream(resultArray).max().getAsInt());

}
}



