package Giris;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n1,n2,ebob=0,a;
        System.out.print("İlk Sayısı Giriniz:");
        n1=inp.nextInt();
        System.out.print("İkinci Sayısı Giriniz:");
        n2=inp.nextInt();
        if(n1>n2){
            a=n1;
        }else{
            a=n2;
        } int k=1;
        while (k<=a){
            if(n1%k==0 && n2%k==0){
                ebob=k;
            }k++;
        }
        System.out.println("ebob:"+ebob);
        int x=1,ekok=0;
        while(x<n1*n2){
            if(n1*n2%x==0){
                ekok=x;
            }x++;
        } System.out.println("ekok:"+ekok);

    }
}
