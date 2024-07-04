
package UasAkhir;

//Inheritance
public class kerudungMain extends tokoKerudung{
   
    //overraiding
    public kerudungMain(String nama, String kode){
        super(nama, kode);
    }
    
    public String getKodeJenis(){
        String kodejen = getKode().substring(0, 2);
        //seleksi memakai if
        if(kodejen.equals("A4")){
            return "Kerudung segi empat";
        } else if (kodejen.equals("A5")){
            return "Kedurung pasmhina";
        } else if (kodejen.equals("A6")){
            return "Kedurung bergo";
        } else if (kodejen.equals("A0")){
            return "Kedurung syari";
        } else {
            return "Kerudung lainnya";
        }
    }
    
    public String getKodeWarna(){
        String kodewar = getKode().substring(2, 4);
        //seleksi menggunakan switch
       switch (kodewar){
           case "06":
            return "Nude";
           case "01":
            return "Babypink";
          case "05":
            return "Merah";
          case "03":
            return "Coklat";
          case "02":
            return "Hitam";
          case "09":
            return "Hijau";
          case "010":
            return "Cream";
          default:
              return "Warna lain";
       }  
    }
    public int getTahunProduksi(){
        return Integer.parseInt(getKode().substring(4)) + 2000;
    }
    
    //polymorephisme overriding
    @Override 
    public String displayInfo(){
              return super.displayInfo() +
                      "\nKode Jenis: "+getKodeJenis() +
                       "\nKode Warna: "+getKodeWarna() +
                       "\nTahun Produksi: "+getTahunProduksi();
    }                  
}
