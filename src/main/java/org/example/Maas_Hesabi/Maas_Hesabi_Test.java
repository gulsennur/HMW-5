package org.example.Maas_Hesabi;

public class Maas_Hesabi_Test {
    public static void main(String[] args) {
            Maas_Hesabi m1 = new Maas_Hesabi();

        System.out.println("Personelin çalıştığı gün sayısı : " + m1.work_day);
        String prim = (m1.work_day>25) ? "Prim alabilirsin!" : "Maalesef prim alamazsın.";
        System.out.println(prim);

        if(m1.work_day<25){
            m1.maas_cal();
        }
        else if (m1.work_day>25){
            m1.primli_maas();
        }

    }
}
