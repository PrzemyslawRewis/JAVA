package pl.przemyslawrewis;
/*
*Wykorzystując m.in. program z poprzednich zajęć, przygotować klasę reprezentującą układ dwóch równań liniowych z niewiadomymi (x,y):
a x + b y = c
d x + e y = f
i rozwiązującą go metodą wyznaczników.
Klasa ma zawierać konstruktor przyjmujący a,b,c,d,e,f (dopuszczamy dowolne wartości rzeczywiste) oraz następujące metody:
wypisującą układ równań w postaci jak powyżej,
zwracającą wyznacznik główny W,
zwracającą wyznacznik Wx,
zwracającą wyznacznik Wy,
zwracającą 2-elementową tablicę z rozwiązaniem (lub null jeśli układ jest sprzeczny lub nie ma jednoznacznego rozwiązania),
3 p.
*
* */


public class Main {

    public static void main(String[] args) {

        int imageWidth = 500;
        int imageHeight = 500;
        String filename = "wykres.png";
        rownania w1 = new rownania(7,2,1,3,4,2);
        w1.wypisz();
        double q,r,t;
        q=w1.Wyznacznikglowny();
        r=w1.Wyznacznikx();
        t=w1.Wyznaczniky();
        System.out.println(q);
        System.out.println(r);
        System.out.println(t);
        System.out.println();
        double [] tab;
        tab=w1.rozwiazania();
        System.out.println(tab[0]);
        System.out.println(tab[1]);
    }
}

class rownania
{
    private double a,b,c,d,e,f;
    public rownania(double a1,double b1,double c1,double d1,double e1,double f1)
    {
        a=a1;
        b=b1;
        c=c1;
        d=d1;
        e=e1;
        f=f1;
    }
    public void wypisz()
    {
        System.out.println(a+"x + "+b+"y = "+c);
        System.out.println(d+"x + "+e+"y = "+f);
    }
    public double Wyznacznikglowny()
    {
        return a*e-b*d;
    }
    public double Wyznacznikx()
    {
        return c*e-b*f;
    }
    public double Wyznaczniky()
    {
        return a*f-d*c;
    }
    public double[] rozwiazania()
    {
        double [] arr = new double[2];
        if(this.Wyznacznikglowny()!=0)
        {
            arr[0]=Wyznacznikx()/this.Wyznacznikglowny();
            arr[1]=this.Wyznaczniky()/this.Wyznacznikglowny();
        }
        else if(this.Wyznacznikglowny()==0&&this.Wyznacznikx()==0&&this.Wyznaczniky()==0)
        {
            return null;
        }
        else if(this.Wyznacznikglowny()==0&&(this.Wyznacznikx()!=0||this.Wyznaczniky()!=0))
        {
            return null;
        }

        return arr;


    }


}
