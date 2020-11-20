package com.zinni.hewanpedia;

import android.content.Context;

import com.zinni.hewanpedia.model.anjing;
import com.zinni.hewanpedia.model.hewan;
import com.zinni.hewanpedia.model.kelinci;
import com.zinni.hewanpedia.model.kucing;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<hewan> hewans = new ArrayList<>();

    private static List<kucing> iniDataKucing(Context ctx) {
        List<kucing> kucings = new ArrayList<>();
        kucings.add(new kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<anjing> iniDataAnjing(Context ctx) {
        List<anjing> anjings = new ArrayList<>();
        anjings.add(new anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<kelinci> iniDataKelinci(Context ctx) {
        List<kelinci> kelincis = new ArrayList<>();
        kelincis.add(new kelinci("Anggora", "Ankara Turki",
                "Rubah merah dikenalkani bewarna merah kecoklatan", R.drawable.kelinci_anggora));
        kelincis.add(new kelinci("Dutch", "Afrika Utara",
                "rubah ini dikenal sebagai jenis mamalia paling kecil di dunia dan termasuk hewan nokturnal", R.drawable.kelinci_dutch));
        kelincis.add(new kelinci("Himalaya", "Amerika Utara",
                "rubah kelabu adalah sebuah spesies mamalia omnivora dari keluarga Canidae, bulu rubah ini berwarna abu-abu", R.drawable.kelinci_himalaya));
        kelincis.add(new kelinci("Lop", "Amerika Utara",
                "Rubah ini disebut juga Rubah Fennec Amerika yang telinganya besar besar", R.drawable.kelinci_lop));
        kelincis.add(new kelinci("Rex", "Britania Raya dan Irlandia",
                "Rubah korsak adalah rubah berukuran sedang yang bisa ditemukan di Stepa, semi-gurun dan gurun di Asia Tenggara,tersebar dari Mongolia dan Timur Laut Cina.", R.drawable.kelinci_rex));
        kelincis.add(new kelinci("Shiba", "Jepang",
                "Kelinci dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.kelinci_satin));

        return kelincis;
    }

    private static void iniAllHewans(Context ctx) {
        hewans.addAll(iniDataKucing(ctx));
        hewans.addAll(iniDataAnjing(ctx));
        hewans.addAll(iniDataKelinci(ctx));
    }

    public static List<hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            iniAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<hewan> getHewansByTipe(Context ctx, String jenis) {
        List<hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            iniAllHewans(ctx);
        }
        for (hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}





