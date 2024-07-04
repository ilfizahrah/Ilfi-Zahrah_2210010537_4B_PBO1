package UasAkhir;

//class
public class tokoKerudung {
    //atribut dan encapsulation (private)
    private String nama;
    private String kode;
    
    
    // Method konstruktor untuk nama dan kode
    public tokoKerudung(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }
    
    
    //method Muttator (setter) 
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setkode(String kode) {
        this.kode = kode;
    }

    
    //method Accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }
    
    //Polymorphism 
    public String displayInfo(){
        return "nama:  "+getNama()+
                "\nkode:  "+getKode();
    }

    //Polymorphism overloading
    public String displayInfo(String warna){
        return displayInfo() + "\nWarna: "+warna;
    }

}
