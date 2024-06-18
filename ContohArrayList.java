package pbo7;

import java.util.ArrayList;

public class ContohArrayList {


    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Dhika");
        nama.add("Dwi");
        nama.add("Nugraha");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Nugraha");

        boolean adaDwi = nama.contains("Dwi");

        System.out.println("Apakah ada Dwi? " + adaDwi);

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}