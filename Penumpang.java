/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kansha11.relasiclass.percobaan4;

/**
 *
 * @author HP
 */
public class Penumpang {
   private String ktp;
   private String nama;
   
   public Penumpang(){
       
   }
   public Penumpang(String ktp, String nama){
       this.ktp = ktp;
       this.nama = nama;
   }
   public String getKtp(){
       return ktp;
   }
   public void setKtp(String ktp){
       this.ktp = ktp;
   }
   public String getNama(){
       return nama;
   }
   public void setNama(String nama){
       this.nama = nama;
   }
   public String info(){
       String info = "\n";
       info += "KTP: "+ktp+"\n" ;
       info += "Nama: "+nama+"\n";
       return info;
   }
}
