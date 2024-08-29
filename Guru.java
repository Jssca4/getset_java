//Object Class
public class Guru {
String Guru;
int id;
String nama;
String mapel;
String alamat;

public String getGuru() {
    return this.Guru;
}

public void setGuru(String Guru) {
    this.Guru = Guru;
}

public String getNama() {
    return this.nama;
}

public void setNama(String Nama) {
    this.nama = Nama;
}


public int getID() {
    return id;
}


public void setID(int id) {
   this.id = id;
}

public String getMapel() {
    return this.mapel;
}

public void setMapel(String mapel) {
    this.mapel = mapel;
}

public String getAlamat() {
    return this.alamat;
}

public void setAlamat(String alamat) {
    this.alamat = alamat;
}


/*Constructo*/
public Guru() {
    id = 1;
    nama = "Aulia";
    mapel = "Produktif";
    alamat = "Malang";
    id = 2;
    nama = "Pasha";
    mapel = "Produktif";
    alamat = "Malang";
    id = 3;
    nama = "Nasikin";
    mapel = "BK";
    alamat = "Malang";
    id = 4;
    nama = "Rahmad";
    mapel = "Ipas";
    alamat = "Malang";
    id = 5;
    nama = "Diaur";
    mapel = "Pjok";
    alamat = "Malang";
    
}

//Constructor Parameter
public Guru(int id, String nama, String mapel, String alamat){
    this.id = id ;
    this.nama = nama;
    this.mapel = mapel;
    this.alamat = alamat;
}

//Method
public void print () {
    System.out.println("ID :"+ id);
    System.out.println("Nama :"+ nama);
    System.out.println("Mapel :"+ mapel);
    System.out.println("Alamat :"+ alamat);
    }
}
    
