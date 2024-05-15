
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class ReadCSVExample extends javax.swing.JFrame {

    public static void main(String[] args) throws Exception {
        ArrayList<Person> kisiler = new ArrayList<Person>();
        ArrayList<String> id = new ArrayList<String>();
        ArrayList<String> isim = new ArrayList<String>();
        ArrayList<String> soyisim = new ArrayList<String>();
        ArrayList<String> dogum_tarihi = new ArrayList<String>();
        ArrayList<String> esi = new ArrayList<String>();
        ArrayList<String> anne_adi = new ArrayList<String>();
        ArrayList<String> baba_adi = new ArrayList<String>();
        ArrayList<String> kan_grubu = new ArrayList<String>();
        ArrayList<String> meslek = new ArrayList<String>();
        ArrayList<String> medeni_hal = new ArrayList<String>();
        ArrayList<String> kizlik_soyisim = new ArrayList<String>();
        ArrayList<String> cinsiyet = new ArrayList<String>();
        ArrayList<String> esid = new ArrayList<String>();
        ArrayList<Integer> dt = new ArrayList<>();
        ArrayList<Person> anneler = new ArrayList<>();
        ArrayList<Person> babalar = new ArrayList<>();
        ArrayList<Person> e = new ArrayList<>();
        ArrayList<Integer>yas =new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(new File("C:\\Users\\Rabia\\Desktop\\YENİ.csv"));
        
        int sayac = 0;
        while (true) {
 
            while (true) {
                String cumle = sc.nextLine();
                String[] kelime = cumle.split(",");
                id.add(kelime[0]);
                isim.add(kelime[1]);
                soyisim.add(kelime[2]);
                dogum_tarihi.add(kelime[3]);
                esi.add(kelime[4]);
                esid.add(kelime[5]);
                anne_adi.add(kelime[6]);
                baba_adi.add(kelime[7]);
                kan_grubu.add(kelime[8]);
                meslek.add(kelime[9]);
                medeni_hal.add(kelime[10]);
                kizlik_soyisim.add(kelime[11]);
                cinsiyet.add(kelime[12]);
                sayac++;
                break;
            }
            if (sayac == 44) {
                break;
            }
        }
        for (int i = 0; i < anne_adi.size(); i++) {
            Person p = new Person();
            anneler.add(p);
            p.isim = anne_adi.get(i);

        }
        for (int i = 0; i < baba_adi.size(); i++) {
            Person p = new Person();
            babalar.add(p);
            p.isim = baba_adi.get(i);

        }

        for (int i = 0; i < esi.size(); i++) {
            Person p = new Person();
            e.add(p);

            if (!esi.get(i).equalsIgnoreCase("")) {
               
                String b = esi.get(i);
                Scanner scan1 = new Scanner(b);
                String c = scan1.next();

                p.isim = c;
            } else {
                p.isim = esi.get(i);
            }
        }
        for (int i = 0; i < dogum_tarihi.size(); i++) {
            int a = dogum_tarihi.get(i).lastIndexOf('/');
            String b = dogum_tarihi.get(i).substring(a + 1);
            dt.add(Integer.parseInt(b));
        }
       
        for (int i = 0; i < id.size(); i++) {
            Person p = new Person();
            Person tmp = new Person();
            Person tmp1 = new Person();
            kisiler.add(p);
            p.id = id.get(i);
            p.isim = isim.get(i);
            p.soyisim = soyisim.get(i);
            p.dogum_tarihi = dogum_tarihi.get(i);
            p.esi = esi.get(i);
            p.esid = esid.get(i);
            p.anne_adi = anne_adi.get(i);
            p.baba_adi = baba_adi.get(i);
            p.kan_grubu = kan_grubu.get(i);
            p.meslek = meslek.get(i);
            p.medeni_hal = medeni_hal.get(i);
            p.kizlik_soyisim = kizlik_soyisim.get(i);
            p.cinsiyet = cinsiyet.get(i);
            p.dt = dt.get(i);
            p.anne = anneler.get(i);
            p.baba = babalar.get(i);
            p.e = e.get(i);
            p.yas=(2022-dt.get(i));
        }
     
        
 for(int i=0;i<id.size();i++)
        {
               
                yas.add(kisiler.get(i).yas);
        }
         
        for (int i = 0; i < id.size(); i++) {
         

            Person tmp1 = new Person();
            Person tmp2 = new Person();
            Person tmp3 = new Person();
            for (int j = 0; j < id.size(); j++) {
                if (kisiler.get(i).anne.isim.equalsIgnoreCase(kisiler.get(j).isim) && kisiler.get(i).baba_adi.equalsIgnoreCase(kisiler.get(j).e.isim)) {

                    tmp1.id = kisiler.get(j).id;
                    tmp1.isim = kisiler.get(j).isim;
                    tmp1.soyisim = kisiler.get(j).soyisim;
                    tmp1.dogum_tarihi = kisiler.get(j).dogum_tarihi;
                    tmp1.esi = kisiler.get(j).esi;
                    tmp1.esid = kisiler.get(j).esid;
                    tmp1.anne_adi = kisiler.get(j).anne_adi;
                    tmp1.baba_adi = kisiler.get(j).baba_adi;
                    tmp1.kan_grubu = kisiler.get(j).kan_grubu;
                    tmp1.meslek = kisiler.get(j).meslek;
                    tmp1.medeni_hal = kisiler.get(j).medeni_hal;
                    tmp1.kizlik_soyisim = kisiler.get(j).kizlik_soyisim;
                    tmp1.cinsiyet = kisiler.get(j).cinsiyet;
                    tmp1.e = kisiler.get(j).e;

                }
               

                if (kisiler.get(i).baba.isim.equalsIgnoreCase(kisiler.get(j).isim) && kisiler.get(i).anne_adi.equalsIgnoreCase(kisiler.get(j).e.isim)) {

                    tmp2.id = kisiler.get(j).id;
                    tmp2.isim = kisiler.get(j).isim;
                    tmp2.soyisim = kisiler.get(j).soyisim;
                    tmp2.dogum_tarihi = kisiler.get(j).dogum_tarihi;
                    tmp2.esi = kisiler.get(j).esi;
                    tmp2.esid = kisiler.get(j).esid;
                    tmp2.anne_adi = kisiler.get(j).anne_adi;
                    tmp2.baba_adi = kisiler.get(j).baba_adi;
                    tmp2.kan_grubu = kisiler.get(j).kan_grubu;
                    tmp2.meslek = kisiler.get(j).meslek;
                    tmp2.medeni_hal = kisiler.get(j).medeni_hal;
                    tmp2.kizlik_soyisim = kisiler.get(j).kizlik_soyisim;
                    tmp2.cinsiyet = kisiler.get(j).cinsiyet;
                    tmp2.e = kisiler.get(j).e;
                }

                if (kisiler.get(i).esi.equalsIgnoreCase(kisiler.get(j).isim + " " + kisiler.get(j).soyisim) || kisiler.get(i).esi.equalsIgnoreCase(kisiler.get(j).isim + " " + kisiler.get(j).kizlik_soyisim)) {

                    tmp3.id = kisiler.get(j).id;
                    tmp3.isim = kisiler.get(j).isim;
                    tmp3.soyisim = kisiler.get(j).soyisim;
                    tmp3.dogum_tarihi = kisiler.get(j).dogum_tarihi;
                    tmp3.esi = kisiler.get(j).esi;
                    tmp3.esid = kisiler.get(j).esid;
                    tmp3.anne_adi = kisiler.get(j).anne_adi;
                    tmp3.baba_adi = kisiler.get(j).baba_adi;
                    tmp3.kan_grubu = kisiler.get(j).kan_grubu;
                    tmp3.meslek = kisiler.get(j).meslek;
                    tmp3.medeni_hal = kisiler.get(j).medeni_hal;
                    tmp3.kizlik_soyisim = kisiler.get(j).kizlik_soyisim;
                    tmp3.cinsiyet = kisiler.get(j).cinsiyet;
                    tmp3.e = kisiler.get(j).e;
                }
            }
            kisiler.get(i).anne = tmp1;
            kisiler.get(i).baba = tmp2;
            kisiler.get(i).e = tmp3;

        }

        for (int i = 0; i < id.size(); i++) {
           

            Person tmp1 = new Person();
            Person tmp2 = new Person();
            Person tmp3 = new Person();
            Person tmp4 = new Person();
            Person tmp5 = new Person();
            Person tmp6 = new Person();
            for (int j = 0; j < id.size(); j++) {
                if (kisiler.get(i).anne.anne_adi == (kisiler.get(j).isim) && kisiler.get(i).anne.baba_adi == (kisiler.get(j).e.isim)) {

                    tmp1.id = kisiler.get(j).id;
                    tmp1.isim = kisiler.get(j).isim;
                    tmp1.soyisim = kisiler.get(j).soyisim;
                    tmp1.dogum_tarihi = kisiler.get(j).dogum_tarihi;
                    tmp1.esi = kisiler.get(j).esi;
                    tmp1.esid = kisiler.get(j).esid;
                    tmp1.anne_adi = kisiler.get(j).anne_adi;
                    tmp1.baba_adi = kisiler.get(j).baba_adi;
                    tmp1.kan_grubu = kisiler.get(j).kan_grubu;
                    tmp1.meslek = kisiler.get(j).meslek;
                    tmp1.medeni_hal = kisiler.get(j).medeni_hal;
                    tmp1.kizlik_soyisim = kisiler.get(j).kizlik_soyisim;
                    tmp1.cinsiyet = kisiler.get(j).cinsiyet;
                    tmp1.e = kisiler.get(j).e;

                }
               

                if (kisiler.get(i).anne.baba_adi == (kisiler.get(j).isim) && (kisiler.get(i).anne.anne_adi == (kisiler.get(j).e.isim))) {

                    tmp4.id = kisiler.get(j).id;
                    tmp4.isim = kisiler.get(j).isim;
                    tmp4.soyisim = kisiler.get(j).soyisim;
                    tmp4.dogum_tarihi = kisiler.get(j).dogum_tarihi;
                    tmp4.esi = kisiler.get(j).esi;
                    tmp4.esid = kisiler.get(j).esid;
                    tmp4.anne_adi = kisiler.get(j).anne_adi;
                    tmp4.baba_adi = kisiler.get(j).baba_adi;
                    tmp4.kan_grubu = kisiler.get(j).kan_grubu;
                    tmp4.meslek = kisiler.get(j).meslek;
                    tmp4.medeni_hal = kisiler.get(j).medeni_hal;
                    tmp4.kizlik_soyisim = kisiler.get(j).kizlik_soyisim;
                    tmp4.cinsiyet = kisiler.get(j).cinsiyet;
                    tmp4.e = kisiler.get(j).e;
                }

                if (kisiler.get(i).baba.anne_adi == (kisiler.get(j).isim) && kisiler.get(i).baba.baba_adi == (kisiler.get(j).e.isim)) {

                    tmp5.id = kisiler.get(j).id;
                    tmp5.isim = kisiler.get(j).isim;
                    tmp5.soyisim = kisiler.get(j).soyisim;
                    tmp5.dogum_tarihi = kisiler.get(j).dogum_tarihi;
                    tmp5.esi = kisiler.get(j).esi;
                    tmp5.esid = kisiler.get(j).esid;
                    tmp5.anne_adi = kisiler.get(j).anne_adi;
                    tmp5.baba_adi = kisiler.get(j).baba_adi;
                    tmp5.kan_grubu = kisiler.get(j).kan_grubu;
                    tmp5.meslek = kisiler.get(j).meslek;
                    tmp5.medeni_hal = kisiler.get(j).medeni_hal;
                    tmp5.kizlik_soyisim = kisiler.get(j).kizlik_soyisim;
                    tmp5.cinsiyet = kisiler.get(j).cinsiyet;
                    tmp5.e = kisiler.get(j).e;

                }
                

                if (kisiler.get(i).baba.baba_adi == (kisiler.get(j).isim) && kisiler.get(i).baba.anne_adi == (kisiler.get(j).e.isim)) {

                    tmp2.id = kisiler.get(j).id;
                    tmp2.isim = kisiler.get(j).isim;
                    tmp2.soyisim = kisiler.get(j).soyisim;
                    tmp2.dogum_tarihi = kisiler.get(j).dogum_tarihi;
                    tmp2.esi = kisiler.get(j).esi;
                    tmp2.esid = kisiler.get(j).esid;
                    tmp2.anne_adi = kisiler.get(j).anne_adi;
                    tmp2.baba_adi = kisiler.get(j).baba_adi;
                    tmp2.kan_grubu = kisiler.get(j).kan_grubu;
                    tmp2.meslek = kisiler.get(j).meslek;
                    tmp2.medeni_hal = kisiler.get(j).medeni_hal;
                    tmp2.kizlik_soyisim = kisiler.get(j).kizlik_soyisim;
                    tmp2.cinsiyet = kisiler.get(j).cinsiyet;
                    tmp2.e = kisiler.get(j).e;
                }

                if (kisiler.get(i).baba.esi == (kisiler.get(j).isim + " " + kisiler.get(j).soyisim) || kisiler.get(i).baba.esi == (kisiler.get(j).isim + " " + kisiler.get(j).kizlik_soyisim)) {

                    tmp3.id = kisiler.get(j).id;
                    tmp3.isim = kisiler.get(j).isim;
                    tmp3.soyisim = kisiler.get(j).soyisim;
                    tmp3.dogum_tarihi = kisiler.get(j).dogum_tarihi;
                    tmp3.esi = kisiler.get(j).esi;
                    tmp3.esid = kisiler.get(j).esid;
                    tmp3.anne_adi = kisiler.get(j).anne_adi;
                    tmp3.baba_adi = kisiler.get(j).baba_adi;
                    tmp3.kan_grubu = kisiler.get(j).kan_grubu;
                    tmp3.meslek = kisiler.get(j).meslek;
                    tmp3.medeni_hal = kisiler.get(j).medeni_hal;
                    tmp3.kizlik_soyisim = kisiler.get(j).kizlik_soyisim;
                    tmp3.cinsiyet = kisiler.get(j).cinsiyet;
                    tmp3.e = kisiler.get(j).e;
                }
                if (kisiler.get(i).anne.esi == (kisiler.get(j).isim + " " + kisiler.get(j).soyisim) || kisiler.get(i).anne.esi == (kisiler.get(j).isim + " " + kisiler.get(j).kizlik_soyisim)) {

                    tmp6.id = kisiler.get(j).id;
                    tmp6.isim = kisiler.get(j).isim;
                    tmp6.soyisim = kisiler.get(j).soyisim;
                    tmp6.dogum_tarihi = kisiler.get(j).dogum_tarihi;
                    tmp6.esi = kisiler.get(j).esi;
                    tmp6.esid = kisiler.get(j).esid;
                    tmp6.anne_adi = kisiler.get(j).anne_adi;
                    tmp6.baba_adi = kisiler.get(j).baba_adi;
                    tmp6.kan_grubu = kisiler.get(j).kan_grubu;
                    tmp6.meslek = kisiler.get(j).meslek;
                    tmp6.medeni_hal = kisiler.get(j).medeni_hal;
                    tmp6.kizlik_soyisim = kisiler.get(j).kizlik_soyisim;
                    tmp6.cinsiyet = kisiler.get(j).cinsiyet;
                    tmp6.e = kisiler.get(j).e;
                }
            }
            kisiler.get(i).anne.anne = tmp1;
            kisiler.get(i).anne.baba = tmp4;
            kisiler.get(i).baba.baba = tmp2;
            kisiler.get(i).baba.anne = tmp5;
            kisiler.get(i).baba.e = tmp3;
            kisiler.get(i).anne.e = tmp6;
 
        }
        
        
        while (true) {
            System.out.println();
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Yapilacak Islemi Seciniz: ");
            System.out.println("1.Kan Grubu Arama");
            System.out.println("2.Ayni Meslegi Yapanlar Ve Yakinliklari");
            System.out.println("3.Ayni Isme Sahip Kisilerin Ismi Ve Yaslari");
            System.out.println("4.Girilen Iki kisinin Yakinligi");
            System.out.println("5.Ailenin Soyagaci");
            System.out.println("6.Yapraklarin Yas Siralamasi");
            System.out.println("7.Dosyadaki Kisileri Yas Sirasina Gore Dosyaya Yazma");
            System.out.println("8.Cikis");
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------");
            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    System.out.println("Aramak istediginiz kan grubunu seciniz: ");
                    System.out.println("\n 1.A \n 2.B \n 3.AB \n 4.0");
                    int secim1 = scan.nextInt();

                    switch (secim1) {
                        case 1:
                            ArrayList<String> Akan = new ArrayList<>();
                            for (int i = 0; i < kan_grubu.size(); i++) {
                                if (kan_grubu.get(i).equalsIgnoreCase("A(+)") || kan_grubu.get(i).equalsIgnoreCase("A(-)")) {
                                    Akan.add(isim.get(i) + "  " + soyisim.get(i));
                                }
                            }
                            for (int i = 0; i < Akan.size(); i++) {
                                System.out.println(Akan.get(i));
                            }
                            break;
                        case 2:
                            ArrayList<String> Bkan = new ArrayList();
                            for (int i = 0; i < kan_grubu.size(); i++) {
                                if (kan_grubu.get(i).equalsIgnoreCase("B(+)") || kan_grubu.get(i).equalsIgnoreCase("B(-)")) {
                                    Bkan.add(isim.get(i) + "  " + soyisim.get(i));
                                }
                            }
                            for (int i = 0; i < Bkan.size(); i++) {
                                System.out.println(Bkan.get(i));
                            }
                            break;
                        case 3:
                            ArrayList<String> ABkan = new ArrayList();
                            for (int i = 0; i < kan_grubu.size(); i++) {
                                if (kan_grubu.get(i).equalsIgnoreCase("AB(+)") || kan_grubu.get(i).equalsIgnoreCase("AB(-)")) {
                                    ABkan.add(isim.get(i) + "  " + soyisim.get(i));
                                }
                            }
                            for (int i = 0; i < ABkan.size(); i++) {
                                System.out.println(ABkan.get(i));
                            }
                            break;
                        case 4:
                            ArrayList<String> Okan = new ArrayList();
                            for (int i = 0; i < kan_grubu.size(); i++) {
                                if (kan_grubu.get(i).equalsIgnoreCase("0(+)") || kan_grubu.get(i).equalsIgnoreCase("0(-)")) {
                                    Okan.add(isim.get(i) + "  " + soyisim.get(i));
                                }
                            }
                            for (int i = 0; i < Okan.size(); i++) {
                                System.out.println(Okan.get(i));
                            }
                            break;
                    }
                    break;
                }
                case 2: {
                    for (int i = 0; i < id.size(); i++) {
                        for (int j = i; j < id.size(); j++) {
                            if (meslek.get(i).equalsIgnoreCase(meslek.get(j)) && !id.get(i).equalsIgnoreCase(id.get(j)) && !meslek.get(i).equalsIgnoreCase("")) {

                                if (kisiler.get(i).cinsiyet.equalsIgnoreCase(kisiler.get(j).cinsiyet)) {
                                    if (kisiler.get(i).cinsiyet.equalsIgnoreCase("Kadın")) {
                                        if (kisiler.get(i).isim == kisiler.get(j).anne.isim) {
                                            System.out.println(id.get(i) + " " + isim.get(i) + "---- " + id.get(j) + " " + isim.get(j) + "------->" + meslek.get(i) + " / " + meslek.get(j));

                                            System.out.println("Anne kız ayni meslek   ");
                                        } else if (kisiler.get(i).isim.equalsIgnoreCase(kisiler.get(j).anne.anne_adi) && !kisiler.get(i).baba_adi.equalsIgnoreCase(kisiler.get(j).anne_adi)) {
                                            System.out.println(id.get(i) + " " + isim.get(i) + "---- " + id.get(j) + " " + isim.get(j) + "------->" + meslek.get(i) + " / " + meslek.get(j));

                                            System.out.println("Anneanne torun ayni meslek   ");
                                        }
                                    } else {

                                        {
                                            if (kisiler.get(i).isim == kisiler.get(j).baba.isim) {
                                                System.out.println(id.get(i) + " " + isim.get(i) + "---- " + id.get(j) + " " + isim.get(j) + "------->" + meslek.get(i) + " / " + meslek.get(j));

                                                System.out.println("Baba ogul ayni meslek   ");
                                            } else if (kisiler.get(i).isim.equalsIgnoreCase(kisiler.get(j).baba.baba_adi) && !kisiler.get(i).anne_adi.equalsIgnoreCase(kisiler.get(j).anne_adi)) {
                                                System.out.println(id.get(i) + " " + isim.get(i) + "---- " + id.get(j) + " " + isim.get(j) + "------->" + meslek.get(i) + " / " + meslek.get(j));

                                                System.out.println("Dede torun ayni meslek   ");
                                            }
                                        }
                                    }
                                }

                            }

                        }
                    }

                    break;
                }

                case 3: {
                   
                    System.out.println("AYNI İSME SAHİP KİŞİLER VE YAŞLARI : \n");
                    for (int i = 0; i < kisiler.size(); i++) {
                        for (int j = i; j < kisiler.size(); j++) {
                            if (kisiler.get(i).isim.equalsIgnoreCase(kisiler.get(j).isim) && !(kisiler.get(i).id.equalsIgnoreCase(kisiler.get(j).id))) {

                                int yasi = 2022 - kisiler.get(i).dt;
                                int yasj = 2022 - kisiler.get(j).dt;

                                System.out.print(kisiler.get(i).id + " " + kisiler.get(i).isim + " " + kisiler.get(i).soyisim + "  --> " + " " + yasi + " yaşında");
                                System.out.print("  ve  ");
                                System.out.print(kisiler.get(j).id + " " + kisiler.get(j).isim + " " + kisiler.get(j).soyisim + "  -->" + " " + yasj + " yaşında");
                                System.out.println("\n");

                            }
                        }
                    }

                    break;
                }
                case 4: {
                    System.out.println("Iki ID giriniz: ");
                    String id1 = scan.next();
                    String id2 = scan.next();
                    int yas1 = 0;
                    int yas2 = 0;
                    Person p = null;
                    Person k = null;

                    for (int i = 0; i < kisiler.size(); i++) {

                        if (kisiler.get(i).id.equalsIgnoreCase(id1)) {

                            yas1 = 2022 - kisiler.get(i).dt;
                            p = kisiler.get(i);
                        }
                        if (kisiler.get(i).id.equalsIgnoreCase(id2)) {
                            yas2 = 2022 - kisiler.get(i).dt;
                            k = kisiler.get(i);
                        }
                    }
                    
                    if (yas1 > yas2) {
                        
                        
                        if (k.anne_adi.equalsIgnoreCase(p.isim)) {
                            System.out.println(p.isim + "  annesidir " + k.isim + " nın");
                        } else if (k.baba_adi.equalsIgnoreCase(p.isim)) {
                            System.out.println(p.isim + "  babasidir  " + k.isim + " nın");
                        } else if (k.anne.anne_adi.equalsIgnoreCase(p.isim)) {
                            System.out.println(p.isim + "  anneannesidir " + k.isim + "  nın");
                        } else if (k.anne.baba_adi.equalsIgnoreCase(p.isim)) {
                            System.out.println(p.isim + "  annesinin babasıdır  " + k.isim + "  nın");
                        } else if (k.baba.anne_adi.equalsIgnoreCase(p.isim)) {
                            System.out.println(p.isim + "  babaannesidir  " + k.isim + "  nın");
                        } else if (k.baba.baba_adi.equalsIgnoreCase(p.isim)) {
                            System.out.println(p.isim + "  babasının babasıdır  " + k.isim+" nın");
                        } 
                    } else {
                        if (p.anne_adi.equalsIgnoreCase(k.isim)) {
                            System.out.println(k.isim+ " in "+ "  cocugu" + p.isim+" dir" );
                        } else if (p.baba_adi.equalsIgnoreCase(k.isim)) {
                            System.out.println(k.isim +" in "+ "  cocugu   " + p.isim+" dir" );
                        } else if (p.anne.anne_adi.equalsIgnoreCase(k.isim)) {
                            System.out.println(k.isim +" in "+ "  kizinin cocugu   " + p.isim+" dir" );
                        } else if (p.anne.baba_adi.equalsIgnoreCase(k.isim)) {
                            System.out.println(k.isim +" in "+ "   kizinin cocugu   " + p.isim+" dir" );
                        } else if (p.baba.anne_adi.equalsIgnoreCase(k.isim)) {
                            System.out.println(k.isim +" in "+ " oglunun cocugu   " + p.isim+" dir" );
                        } else if (p.baba.baba_adi.equalsIgnoreCase(k.isim)) {
                            System.out.println(k.isim +" in"+ "  oglunun cocugu   " + p.isim+" dir");
                        } 
                    }

                    break;
                }
                case 5: {
                    AgacOlusturma a = new AgacOlusturma();
                    Node start = new Node(kisiler.get(0));
                    a.node(start, kisiler, id.size());
                    JFrame frame = new JFrame("Tree");
                   
                }
                
             
               case 6:
               {
                   ArrayList<Person> bekar=new ArrayList<>();
                   for(int i=0;i<kisiler.size();i++)
                   { 
                           if(kisiler.get(i).medeni_hal.equalsIgnoreCase("Bekar"))
                           {
                               bekar.add(kisiler.get(i));
                           }
                      
                   }
                    
                   for(int pass=0;pass<bekar.size();pass++)
                   {
                       for(int mov=0;mov<bekar.size();mov++)
                       {
                           Person tmp=new Person();
                           if(bekar.get(pass).yas>bekar.get(mov).yas)
                           {      
                           tmp=bekar.get(pass);
                           bekar.set(pass,bekar.get(mov)) ;
                           bekar.set(mov,tmp);
                        }
                       }
                       
                   }
                   for(int i=0;i<bekar.size();i++)
                   {
                       System.out.println(bekar.get(i).id+"-"+bekar.get(i).isim+" "+bekar.get(i).soyisim+" -->"+bekar.get(i).yas+" yasinda");
                   }
                   
                break;
                   }    
              
               case 7: {
                   
                   File file=new File("Aile Yas Sirasi.txt");
                   if(!file.exists()){
                       file.createNewFile();
                   }
                   ArrayList<Person>yaslar=new ArrayList<>();
                   for(int i=0;i<kisiler.size();i++)
                   {  
                               yaslar.add(kisiler.get(i));
                              
                   }
                    
                   for(int pass=0;pass<yaslar.size();pass++)
                   {
                       for(int mov=0;mov<yaslar.size();mov++)
                       {
                           Person tmp=new Person();
                           if(yaslar.get(pass).yas>yaslar.get(mov).yas)
                           {      
                           tmp=yaslar.get(pass);
                           yaslar.set(pass,yaslar.get(mov)) ;
                           yaslar.set(mov,tmp);
                        }
                       }
                       
                   }FileWriter fwriter=new FileWriter(file,false);
                       BufferedWriter bwriter=new BufferedWriter(fwriter);
                   for(int i=0;i<yaslar.size();i++)
                   {
                       
                        bwriter.write(yaslar.get(i).yas+" yasinda--->\t|"+yaslar.get(i).id+"\t|"+yaslar.get(i).isim+"\t|"+yaslar.get(i).soyisim+"\t|"+yaslar.get(i).dogum_tarihi+"\t|"+yaslar.get(i).esi+"\t|"+yaslar.get(i).esid+
                                "\t|"+yaslar.get(i).anne_adi+"\t|"+yaslar.get(i).baba_adi+"\t|"+yaslar.get(i).kan_grubu+"\t|"+yaslar.get(i).meslek+"\t|"+yaslar.get(i).medeni_hal+"\t|"+yaslar.get(i).kizlik_soyisim+"\t|"+yaslar.get(i).cinsiyet);
                        bwriter.newLine();
                       
                   }
                   bwriter.close();
                   fwriter.close();
                   
                   break;
               }
               case 8:
               {    
                   System.exit(0);
                   
               }
               
                default:
                    break;
            }
            
           

        }

    }

    
}