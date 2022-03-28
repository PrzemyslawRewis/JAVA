package pl.przemyslawrewis;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class ComplexTest
{
    @Test
    public void test1()
    {
        Complex Liczba=new Complex(1,2);
        double expectedresult=1;
        assertEquals(expectedresult,Liczba.getRe());


    }
    @Test
    public void test2()
    {
        Complex Liczba=new Complex(1,2);
        double expectedresult=2;
        assertEquals(expectedresult,Liczba.getIm());

    }
    @Test
    public void test3()
    {
        Complex Liczba=new Complex(1,2);
        double expectedresult=0;
        Liczba.setRe(0);
        double wynik=Liczba.getRe();
        assertEquals(expectedresult,wynik);

    }
    @Test
    public void test4()
    {
        Complex Liczba=new Complex(1,2);
        double expectedresult=0;
        Liczba.setIm(0);
        double wynik=Liczba.getIm();
        assertEquals(expectedresult,wynik);


    }
    @Test
    public void test5()
    {
        Complex Liczba=new Complex(1,2);
        Complex Wynik=new Complex(0,0);
        Liczba.set(0,0);
        double Zespolona1=Liczba.getIm();
        double Zespolona2=Wynik.getIm();
        double Re1=Liczba.getRe();
        double Re2=Wynik.getRe();
        assertEquals(Zespolona1, Zespolona2);
        assertEquals(Re1, Re2);

    }
    @Test
    public void test6()
    {
        Complex Liczba1=new Complex(1,2);
        Complex Liczb2=new Complex(1,2);
        Complex Wynik=new Complex(2,4);
        Complex Wynik2=Complex.dodajv1(Liczba1,Liczb2);
        double Zespolona1=Wynik2.getIm();
        double Zespolona2=Wynik.getIm();
        double Re1=Wynik2.getRe();
        double Re2=Wynik.getRe();
        assertEquals(Zespolona1, Zespolona2);
        assertEquals(Re1, Re2);


    }
    @Test
    public void test7()
    {
        Complex Liczba1=new Complex(1,2);
        double l2=2;
        Complex Wynik=new Complex(3,2);
        Complex Wynik2=Complex.dodajv2(Liczba1,l2);
        double Re1=Wynik2.getRe();
        double Re2=Wynik.getRe();
        assertEquals(Re1, Re2);




    }
    @Test
    public void test8()
    {
        Complex Liczba1=new Complex(1,2);
        double l2=2;
        Complex Wynik=new Complex(3,2);
        Complex Wynik2=Complex.dodajv3(l2,Liczba1);
        double Re1=Wynik2.getRe();
        double Re2=Wynik.getRe();
        assertEquals(Re1, Re2);


    }
    @Test
    public void test9()
    {
        Complex Liczba1=new Complex(1,2);
        Complex Liczb2=new Complex(-1,2);
        Complex Wynik=new Complex(2,0);
        Complex Wynik2=Complex.odejmijv1(Liczba1,Liczb2);
        double Zespolona1=Wynik2.getIm();
        double Zespolona2=Wynik.getIm();
        double Re1=Wynik2.getRe();
        double Re2=Wynik.getRe();
        assertEquals(Zespolona1, Zespolona2);
        assertEquals(Re1, Re2);


    }
    @Test
    public void test10()
    {
        Complex Liczba1=new Complex(1,2);
        double l2=-1;
        Complex Wynik=new Complex(2,2);
        Complex Wynik2=Complex.odejmijv2(Liczba1,l2);
        double Re1=Wynik2.getRe();
        double Re2=Wynik.getRe();
        assertEquals(Re1, Re2);




    }
    @Test
    public void test11()
    {
        Complex Liczba1=new Complex(1,2);
        double l2=-1;
        Complex Wynik=new Complex(2,2);
        Complex Wynik2=Complex.odejmijv3(l2,Liczba1);
        double Re1=Wynik2.getRe();
        double Re2=Wynik.getRe();
        assertEquals(Re1, Re2);


    }
    @Test
    public void test12()
    {
        Complex Liczba1=new Complex(0,1);
        Complex Liczb2=new Complex(2,1);
        Complex Wynik=new Complex(-1,2);
        Complex Wynik2=Complex.mnozv1(Liczba1,Liczb2);
        double Zespolona1=Wynik2.getIm();
        double Zespolona2=Wynik.getIm();
        double Re1=Wynik2.getRe();
        double Re2=Wynik.getRe();
        assertEquals(Zespolona1,Zespolona2,0.00001);
        assertEquals(Re1,Re2,0.00001);

    }




}
