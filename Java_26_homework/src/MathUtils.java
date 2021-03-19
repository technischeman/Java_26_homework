import java.util.Scanner;

public class MathUtils {
    public int kareal(int a){
        int kare=a*a;
        System.out.println(a+" sayisinin karesi= "+kare);
        return kare;
    }
    public int sayiyibeslecarp(int a){
        int beslecarp=a*5;
        System.out.println(a+" carpi 5= "+beslecarp);
        return beslecarp;
    }
    public double ücsayiortalama(double a,double b,double c){
      double ortalama=(a+b+c)/3;
        System.out.println(a+" "+b+" ve "+c+" sayilarinin ortalamasi ="+ortalama);
      return ortalama;

    }
}
