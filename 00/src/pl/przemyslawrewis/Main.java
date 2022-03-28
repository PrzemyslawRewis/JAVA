package pl.przemyslawrewis;
/*Napisać program zawierający klasę przechowującą tablicę n liczb rzeczywistych.
Każda z tych liczb ma zawierać sumę k losowych wartości uzyskanych za pomocą metody Math.random().
Wartości n i k będą argumentami konstruktora klasy.
Napisać metody obliczające średnią, maksimum oraz minimum z wartości zapisanych w tablicy.
Za pomocą osobnej metody "rysować" (w trybie tekstowym, np. poziomymi słupkami z gwiazdek) histogram wartości z tablicy.*/
public class Main {

    public static void main(String[] args) {
        int n = 20;
        int k = 10;
        Tabliczb w1 = new Tabliczb(n,k);
        double x= w1.srednia(n);
        double y= w1.minimum(n);
        double z= w1.maksimum(n);
        System.out.println();
        System.out.println("Srednia wynosi: "+x);
        System.out.println("Minimum wynosi: "+y);
        System.out.println("Maksimum wynosi:"+z);
        w1.histogram(n);
    }
}

class Tabliczb
{
    private final double[] tablica;
    public Tabliczb(int n,double k)
    {
        tablica = new double[n];
        int i =0;
        int j=0;
        double suma=0.0;
        while(j<n)
        {
            while(i<k)
            {
                double losowa=Math.random();
                suma=suma+losowa;
                i++;
            }
            tablica[j]=suma;
            System.out.println(tablica[j]);
            suma=0.0;
            i=0;
            j++;
        }

    }
    public double srednia(double n)
    {
        int i=0;
        double srednia=0.0;
        while(i<n)
        {
            srednia=srednia + tablica[i];
            i++;
        }
        srednia=srednia/n;
        return srednia;

    }
    public double minimum(int n)
    {
        int i =1;
        double minimum=tablica[0];
        while(i<n)
        {
            if(minimum>tablica[i])
            {
                minimum=tablica[i];
            }
            i++;
        }
        return minimum;
    }
    public double maksimum(int n)
    {
        int i =1;
        double maksimum=tablica[0];
        while(i<n)
        {
            if(maksimum<tablica[i])
            {
                maksimum=tablica[i];
            }
            i++;
        }
        return maksimum;
    }
    public void histogram(int n)
    {
        int liczba_przedzialow_histogramu =(int) Math.round(Math.sqrt(n));
        int[] histogram;
        histogram = new int[liczba_przedzialow_histogramu];
        for(int q=0; q<liczba_przedzialow_histogramu;q++)
        {histogram[q]=0;}
        double dlugosc_przedzialu,min,max;
        min=this.minimum(n);
        max=this.maksimum(n);
        dlugosc_przedzialu=(max-min)/liczba_przedzialow_histogramu;
        System.out.println(dlugosc_przedzialu);
        int u=0;
        int t=0;
        int licznik=0;

        while(t<liczba_przedzialow_histogramu)
        {
            if (t==3)//nie liczy maksimum bez tego
                licznik++;
            while(u<n) {

                if (this.tablica[u] >= (min + t * dlugosc_przedzialu) && (this.tablica[u] < (min + (t + 1) * dlugosc_przedzialu))) {


                    licznik++;
                }
                u++;


            }
            histogram[t]=licznik;
            u=0;
            licznik=0;
            t++;
        }


        for (int p =0;p<liczba_przedzialow_histogramu;p++)
        {
            int s=0;
            while(s<histogram[p])
            {

                System.out.print("*");
                s++;

            }
            System.out.println();

        }

    }

}