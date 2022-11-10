import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int n,r;

        System.out.print("İlk sayıyı giriniz: ");
        n=inp.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        r=inp.nextInt();
        while(r>=n)
        {
            System.out.print("İkinci sayı birinci sayıyla eşit veya birinci sayıdan büyük olamaz. Tekrar giriniz: ");
            r=inp.nextInt();
        }

        // n sayısının faktöriyeli
        double nFac=1;
        for (int i=1; i<=n; i++)
        {
            nFac*=i;
        }

        // r sayısının faktöriyeli
        double rFac=1;
        for (int i=1; i<=r; i++)
        {
            rFac*=i;
        }

        //n-r faktöriyeli
        int nrFac=1;
        for (int i=1; i<=(n-r); i++)
        {
            nrFac*=i;
        }

        double nrComb=nFac/(rFac*nrFac);
        System.out.println(n+" ve "+r+" sayılarının faktöriyeli: "+ nrComb);
    }
}