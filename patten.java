import javax.xml.transform.Source;
import java.util.Scanner;

public class patten {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
