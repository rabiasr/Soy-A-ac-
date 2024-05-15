
import static java.lang.Double.max;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class AgacOlusturma extends JFrame {

    Node root;

    public void node(Node start, ArrayList<Person> kisiler, int id) throws ParseException {
        JFrame frame = new JFrame("Tree Example");
        frame.setSize(1600, 1000);
        DefaultMutableTreeNode rootnode = new DefaultMutableTreeNode("TREE");
         

        for (int j = 0; j < id; j++) {

            Node node = new Node(kisiler.get(j));
            start = node;
            DefaultMutableTreeNode kok = new DefaultMutableTreeNode(start.isim + " " + start.soyisim);

            for (int i = 0; i < id; i++) {

                if (start != null) {

                    if (start.cinsiyet.equalsIgnoreCase("Erkek") && kisiler.get(i).medeni_hal.equalsIgnoreCase("Evli")) {

                        if (start.esi.equalsIgnoreCase((kisiler.get(i).isim + " " + kisiler.get(i).kizlik_soyisim))) {
                         
                            Node tmp = new Node();
                            tmp = node;
                            start.es = tmp;
                             DefaultMutableTreeNode es = new DefaultMutableTreeNode(kisiler.get(i).id+" "+kisiler.get(i).isim + " " + kisiler.get(i).soyisim+"-->"+"  Es  ");
                            kok.add(es);

                        }
                    }
                    if (start.cinsiyet.equalsIgnoreCase("Kadın") && kisiler.get(i).medeni_hal.equalsIgnoreCase("Evli")) {
                        if (start.esi.equalsIgnoreCase((kisiler.get(i).isim + " " + kisiler.get(i).soyisim))) {
                        
                            Node tmp = new Node();
                            tmp = node;
                            start.es = tmp;
                            DefaultMutableTreeNode es = new DefaultMutableTreeNode(kisiler.get(i).id+" "+kisiler.get(i).isim + " " + kisiler.get(i).soyisim+"-->"+"  Es  ");
                            kok.add(es);

                        }
                    }

                    
                    if (kisiler.get(i).baba_adi.equalsIgnoreCase((start.isim)) || kisiler.get(i).anne_adi.equalsIgnoreCase((start.isim))) {

                        if (start.medeni_hal.equalsIgnoreCase("Evli")) {
                            if (kisiler.get(i).soyisim.equalsIgnoreCase(start.soyisim) || kisiler.get(i).kizlik_soyisim.equalsIgnoreCase(start.soyisim)) {
                                Date d1, d2;
                                String pattern = "dd/MM/yyyy";
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

                                d1 = simpleDateFormat.parse(kisiler.get(i).dogum_tarihi);
                                d2 = simpleDateFormat.parse(start.dogum_tarihi);
                                if (d1.compareTo(d2) > 0) {
                                    if (start.left == null) {
                                        Node tmp = new Node();
                                        tmp = node;
                                        start.left = tmp;
                                          DefaultMutableTreeNode sol = new DefaultMutableTreeNode(kisiler.get(i).id+" "+ kisiler.get(i).isim + " " + kisiler.get(i).soyisim+"-->"+"  Cocuk  ");
                                        kok.add(sol);

                                    } else if (start.left != null && start.mid == null) {
                                        Node tmp = new Node();
                                        tmp = node;
                                        start.mid = tmp;
                                        DefaultMutableTreeNode orta = new DefaultMutableTreeNode(kisiler.get(i).id+" "+kisiler.get(i).isim + " " + kisiler.get(i).soyisim+"-->"+"  Cocuk  ");
                                        kok.add(orta);

                                    } else if (start.mid != null && start.right == null) {
                                        Node tmp = new Node();
                                        tmp = node;
                                        start.right = tmp;
                                      DefaultMutableTreeNode sag = new DefaultMutableTreeNode(kisiler.get(i).id+" "+kisiler.get(i).isim + " " + kisiler.get(i).soyisim+"-->"+"  Cocuk  ");
                                        kok.add(sag);

                                    }
                                }
                            }

                        }
                     /*  String c = null ;
               if(!start.esi.equalsIgnoreCase(""))
               {      String b = start.esi;
                Scanner scan1 = new Scanner(b);
                 c= scan1.next();}
                       if((kisiler.get(i).anne_adi.equalsIgnoreCase(start.isim))&&((kisiler.get(i).baba_adi!=(c))))
                        {
                           
                           Node tmp=new Node();
                            tmp=node;
                        start.left=tmp;
                      DefaultMutableTreeNode sol = new DefaultMutableTreeNode(kisiler.get(i).isim + " " + kisiler.get(i).soyisim+"-->"+"  Cocuk  ");
                         kok.add(sol);
                            
                        }*/
 
                     else if (start.esi == null) {
                             
                            DefaultMutableTreeNode yaprak = new DefaultMutableTreeNode(kisiler.get(i).id+" "+kisiler.get(i).isim + " " + kisiler.get(i).soyisim+"-->"+"  Yaprak  ");
                                kok.add(yaprak);
                        }
                   
                    }
            }
            }
          
            rootnode.add(kok);
        }
        
        JTree tree = new JTree(rootnode);

        frame.add(tree);

        frame.setVisible(true);
        
    }

     
}
