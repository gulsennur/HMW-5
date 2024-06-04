package org.example.Maas_Hesabi;

public class Maas_Hesabi {
    int k = 250;
    int default_day = 25;
    int work_day = 27;

    void maas_cal(){
        System.out.println("Maaş = " + (k*work_day));
    }
    //prim hesabi
    int prim = ((work_day-default_day)*1000);

    void primli_maas (){
        System.out.println("Primli maaş = " +(prim+(k*work_day)));
    }

}
