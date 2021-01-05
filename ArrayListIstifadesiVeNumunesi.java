package dersler;

import java.util.ArrayList;

public class ArrayListIstifadesiVeNumunesi {
    public static void main(String[] args) {

       // telefon[] telefonlar =new telefon[20];

        ArrayList<telefon> telefonlar= new ArrayList<>();
        telefon tel1=new telefon("samsun",1000);
        telefon tel2=new telefon("mi",2000);
        telefon tel3=new telefon("nokia",3000);
        telefon tel4=new telefon("iphone",4000);

        telefonlar.add(tel1);
        telefonlar.add(tel2);
        telefonlar.add(tel3);
        telefonlar.add(tel4);

        System.out.println(telefonlar.size());

        listeyiYazdir(telefonlar);


    }

    private static void listeyiYazdir(ArrayList<telefon> liste) {
        /* for (int i=0; i<liste.size() ; i++){
            System.out.println(liste.get(i));
        }*/

        for (telefon oAnkiDeyeri : liste){
            System.out.println(oAnkiDeyeri);
        }


    }
}

class telefon{
    String model;
    int qiymet;

    public telefon(String model, int qiymet) {
        this.model = model;
        this.qiymet = qiymet;
    }

    @Override
    public String  toString() {
        return "telefon{" +
                "model='" + model + '\'' +
                ", qiymet=" + qiymet +
                '}';
    }
}
