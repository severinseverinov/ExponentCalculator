import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        int n,k,equal=1;
        Scanner input=new Scanner(System.in);

        System.out.print("Üssü alınacak sayı : ");
        n=input.nextInt();
        System.out.print("Üs : ");
        k=input.nextInt();

        for (int i=1;i<=k;i++){
            equal*=n;
        }
        System.out.println(n+" ^ "+k+" = "+equal);
    }
}
