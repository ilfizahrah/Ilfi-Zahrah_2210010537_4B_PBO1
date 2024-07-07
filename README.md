# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pada toko kerudung menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan kode, dan memberikan output berupa informasi detail dari kode tersebut seperti nama kerudung, kode, kode jenis, kode warna, dan tahun produksi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `tokoKerudung`, `kerudungBeraksi`, dan `kerudungMain` adalah contoh dari class.

```bash
public class tokoKerudung {
    ...
}

public class kerudungMain extends tokoKerudung {
    ...
}

public class kerudungBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `kerudungbs[i] = new kerudungMain(nama, kode);` adalah contoh pembuatan object.

```bash
kerudungbs[i] = new kerudungMain(nama, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `kode` adalah contoh atribut.

```bash
String nama;
String kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `tokoKerudung` dan `kerudungMain`.

```bash
public tokoKerudung(String nama, String kode) {
    this.nama = nama;
    this.kode = kode;
}

public kerudungMain(String nama, String kode) {
    super(nama, kode);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setKode` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setKode(String kode) {
    this.kode = kode;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getKode() {
    return kode;
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `kerudungMain` mewarisi `tokoKerudung` dengan sintaks `extends`.

```bash
public class kerudungMain extends tokoKerudung {
    ...
}
```

9.**Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda.  polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method displayInfo(String) di tokoKerudung merupakan overloading dan displayInfo di kerudungMain merupakan override dari method displayInfo di tokoKerudung.

```bash
public String displayInfo(String warna) {
    return displayInfo() + "\nWarna: " + warna;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKodeJenis` dan seleksi `switch` `kodeTahunProduksi' dalam method `KodeWarna`.

```bash
public String getKodeJenis(){
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

    //return getNpm().substring(0, 2).equals("A4, A5, A6, A0") ? "Kerudung segi empat, Kerudung pashmina, Kerudung bergo, Kerudung syari" : "Kerudung lainnya";
}

public String getKodeWarna(){
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
              return "Warnlain";
    }
}

  public int getTahunProduksi(){
        return Integer.parseInt(getKode().substring(4)) + 2000;
    }

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < kerudungbs.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Kerudung ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("=============================");
System.out.println("Data Kerudung");
System.out.println(data.displayInfo());
    }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `kerudungMain[] kerudungbs = new kerudungMain[2];` adalah contoh penggunaan array.

```bash
kerudungMain[] kerudungbs = new kerudungMain[1];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
	catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format kode: " + e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Kesalahan Format Number: " + e.getMessage());
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ilfi Zahrah 
NPM: 2210010537
