package pl.przemyslawrewis;



public class Complex
{

    private double Rzeczywista;
    private double Urojona;
    public Complex()
    {
        Rzeczywista=0;
        Urojona=0;

    }
    public Complex(double a) {
        Rzeczywista = a;
        Urojona = 0;

    }
    public Complex(double a,double b)
    {
        Rzeczywista=a;
        Urojona=b;

    }

    public String toString()
    {
        return Rzeczywista+"+"+Urojona+"i";

    }
    public  void set(double a, double b)
    {
        Rzeczywista=a;
        Urojona=b;


    }
    public  void setRe(double a)
    {
        Rzeczywista=a;

    }
    public  void setIm(double a)
    {
        Urojona=a;

    }
    public double getRe()
    {
        return Rzeczywista;
    }
    public double getIm()
    {
        return Urojona;
    }

    public static Complex dodajv1(Complex l1,Complex l2)
    {
        Complex wynik=new Complex();
        wynik.Rzeczywista=l1.Rzeczywista+l2.Rzeczywista;
        wynik.Urojona=l1.Urojona+l2.Urojona;
        return wynik;

    }
    public static Complex odejmijv1(Complex l1,Complex l2)
    {
        Complex wynik=new Complex();
        wynik.Rzeczywista=l1.Rzeczywista-l2.Rzeczywista;
        wynik.Urojona=l1.Urojona-l2.Urojona;
        return wynik;

    }
    public static Complex mnozv1(Complex l1,Complex l2)
    {
        Complex wynik=new Complex();
        wynik.Rzeczywista=l1.Rzeczywista*l2.Rzeczywista-l1.Urojona*l2.Urojona;
        wynik.Urojona=l1.Rzeczywista*l2.Urojona+l1.Urojona*l2.Rzeczywista;
        return wynik;

    }

    public static Complex dodajv2(Complex l1,double l2)
    {
        Complex wynik=new Complex();
        wynik.Rzeczywista=l1.Rzeczywista+l2;
        wynik.Urojona=l1.Urojona;
        return wynik;

    }
    public static Complex odejmijv2(Complex l1,double l2)
    {
        Complex wynik=new Complex();
        wynik.Rzeczywista=l1.Rzeczywista-l2;
        wynik.Urojona=l1.Urojona;
        return wynik;

    }

    public static Complex dodajv3(double l1,Complex l2)
    {
        Complex wynik=new Complex();
        wynik.Rzeczywista=l2.Rzeczywista+l1;
        wynik.Urojona=l2.Urojona;
        return wynik;

    }
    public static Complex odejmijv3(double l1,Complex l2) {
        Complex wynik = new Complex();
        wynik.Rzeczywista = l2.Rzeczywista - l1;
        wynik.Urojona = l2.Urojona;
        return wynik;
    }







}