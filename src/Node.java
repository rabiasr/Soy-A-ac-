
import java.util.LinkedList;

class Node extends Person {
 Node kardes;
    Node left;
    Node mid;
    Node right;
    Node es;
    public LinkedList<Node> children = new LinkedList<>();

    public Node(Person p) {
        this.id = p.id;
        this.isim = p.isim;
        this.soyisim = p.soyisim;
        this.dogum_tarihi = p.dogum_tarihi;
        this.esi = p.esi;
        this.anne_adi = p.anne_adi;
        this.baba_adi = p.baba_adi;
        this.kan_grubu = p.kan_grubu;
        this.meslek = p.meslek;
        this.medeni_hal = p.medeni_hal;
        this.cinsiyet = p.cinsiyet;
        this.kizlik_soyisim = p.kizlik_soyisim;
       
    }

    public Node() {
       
    }

}
