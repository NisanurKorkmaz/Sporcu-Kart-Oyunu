package sporcugame;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Test{
    
    public static void main(String[] args) {
        
//Futbolcu ve Basketbolcu listeleri olusturuluyor 
    ArrayList<Futbolcu> futbolcuListesi = new ArrayList<>();
    ArrayList<Basketbolcu> basketbolcuListesi = new ArrayList<>();
 //Basketbolcular tanimlaniyor
    Basketbolcu isil = new Basketbolcu("Işıl Alben", "Basketbol");
    Basketbolcu nevriye = new Basketbolcu("Nevriye Yılmaz", "Basketbol");
    Basketbolcu birsel = new Basketbolcu("Birsel Vardarlı", "Basketbol");
    Basketbolcu ayse = new Basketbolcu("Ayşe Cora", "Basketbol");
    Basketbolcu meltem = new Basketbolcu("Meltem Yıldızhan", "Basketbol");
    Basketbolcu yasemen = new Basketbolcu("Yasemen Saylar", "Basketbol");
    Basketbolcu esra = new Basketbolcu("Esra Şencebe", "Basketbol");
    Basketbolcu bahar = new Basketbolcu("Bahar Çağlar", "Basketbol");
    
    //Basketbolcu listesine oyuncu eklemesi yapiliyor 
    basketbolcuListesi.add(isil);
    basketbolcuListesi.add(nevriye);
    basketbolcuListesi.add(birsel);
    basketbolcuListesi.add(ayse);
    basketbolcuListesi.add(meltem);
    basketbolcuListesi.add(yasemen);
    basketbolcuListesi.add(esra);
    basketbolcuListesi.add(bahar);
    
    isil.setIkilik(100);
    isil.setUcluk(100);
    isil.setSerbestAtis(95);
    isil.setIcon("isil.jpg");
    
    nevriye.setIkilik(95);
    nevriye.setUcluk(60);
    nevriye.setSerbestAtis(70);
    nevriye.setIcon("nevriye.jpg");
    
    birsel.setIkilik(85);
    birsel.setUcluk(45);
    birsel.setSerbestAtis(75);
    birsel.setIcon("birsel.jpg");
    
    ayse.setIkilik(95);
    ayse.setUcluk(70);
    ayse.setSerbestAtis(70);
    ayse.setIcon("ayse.jpg");
    
    meltem.setIkilik(95);
    meltem.setUcluk(90);
    meltem.setSerbestAtis(50);
    meltem.setIcon("meltem.jpg");
    
    yasemen.setIkilik(95);
    yasemen.setUcluk(100);
    yasemen.setSerbestAtis(90);
    yasemen.setIcon("yasemen.jpg");
    
    esra.setIkilik(95);
    esra.setUcluk(85);
    esra.setSerbestAtis(95);
    esra.setIcon("esra.jpg");
    
    bahar.setIkilik(95);
    bahar.setUcluk(95);
    bahar.setSerbestAtis(50);
    bahar.setIcon("bahar.jpg");
    
    //Futbolcular tanimlaniyor
    Futbolcu cris = new Futbolcu("Cristiano Ronaldo", "Futbol");
    Futbolcu muslera = new Futbolcu("Fernando Muslera", "Futbol");
    Futbolcu melo = new Futbolcu("Felipe Melo", "Futbol");
    Futbolcu drogba = new Futbolcu("Didier Drogba", "Futbol");
    Futbolcu wesley = new Futbolcu("Wesley Sneijder", "Futbol");
    Futbolcu rustu = new Futbolcu("Rüştü Reçber", "Futbol");
    Futbolcu metin = new Futbolcu("Metin Oktay", "Futbol");
    Futbolcu ibrahim = new Futbolcu("İbrahim Toraman", "Futbol");
        
    //Futbolcu listesine oyuncu eklemesi yapiliyor 
    futbolcuListesi.add(cris);
    futbolcuListesi.add(muslera);
    futbolcuListesi.add(melo);
    futbolcuListesi.add(drogba);
    futbolcuListesi.add(wesley);
    futbolcuListesi.add(rustu);
    futbolcuListesi.add(metin);
    futbolcuListesi.add(ibrahim);
    
    cris.setPenaltı(95);
    cris.setKaleciKarsiKarsiya(95);
    cris.setSerbestVurus(80);
    cris.setIcon("cris.jpg");
    
    muslera.setPenaltı(75);
    muslera.setKaleciKarsiKarsiya(100);
    muslera.setSerbestVurus(55);
    muslera.setIcon("muslera.jpg");
    
    melo.setPenaltı(90);
    melo.setKaleciKarsiKarsiya(65);
    melo.setSerbestVurus(65);
    melo.setIcon("melo.jpg");
    
    drogba.setPenaltı(70);
    drogba.setKaleciKarsiKarsiya(45);
    drogba.setSerbestVurus(85);
    drogba.setIcon("drogba.jpg");
    
    wesley.setPenaltı(80);
    wesley.setKaleciKarsiKarsiya(95);
    wesley.setSerbestVurus(70);
    wesley.setIcon("wesley.jpg");
    
    rustu.setPenaltı(55);
    rustu.setKaleciKarsiKarsiya(75);
    rustu.setSerbestVurus(100);
    rustu.setIcon("rustu.jpg");
    
    metin.setPenaltı(75);
    metin.setKaleciKarsiKarsiya(75);
    metin.setSerbestVurus(60);
    metin.setIcon("metin.jpg");
    
    ibrahim.setPenaltı(70);
    ibrahim.setKaleciKarsiKarsiya(55);
    ibrahim.setSerbestVurus(75);
    ibrahim.setIcon("ibrahim.jpg");

    
    UserPage jf = new UserPage(futbolcuListesi,basketbolcuListesi);
    jf.setTitle("Sporcu Kart Oyunu"); 
    jf.setSize(1044, 743); 
    jf.setLayout(null); 
    jf.setLocation(400,50);
    jf.setVisible(true); 
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    }
    
   //Ortaya atilan kartlarin hangi pozisyonda karsilastirilacaklari belirleniyor 
    public int pozisyonBilgisi(Sporcu name){
  
        return ((int)((Math.random())*10))%(3);
    }
    
   
} 
