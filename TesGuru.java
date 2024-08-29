//Driver Class
public class TesGuru {
    public static void main(String[] args) {
        //membuat objek
        Guru aulia = new Guru();
        Guru pasha = new Guru();
        Guru nasikin = new Guru();
        Guru rahmad = new Guru();
        Guru diaur = new Guru();
        

        aulia.id = 1;
        aulia.nama = "aulia";
        aulia.mapel = "produktif";
        aulia.alamat = "malang";
        System.out.println("Ini Data Bu Aulia");
        System.out.println(aulia.id);
        System.out.println(aulia.nama);
        System.out.println(aulia.mapel);
        System.out.println(aulia.alamat);

        pasha.id = 2;
        pasha.nama = "pasha";
        pasha.mapel = "produktif";
        pasha.alamat = "malang";
        System.out.println("Ini Data Bu Pasha");
        System.out.println(pasha.id);
        System.out.println(pasha.nama);
        System.out.println(pasha.mapel);
        System.out.println(pasha.alamat);

        nasikin.id = 3;
        nasikin.nama = "nasikin";
        nasikin.mapel = "BK";
        nasikin.alamat = "malang";
        System.out.println("Ini Data Pak Nasikin");
        System.out.println(nasikin.id);
        System.out.println(nasikin.nama);
        System.out.println(nasikin.mapel);
        System.out.println(nasikin.alamat);

        rahmad.id = 4;
        rahmad.nama = "rahmad";
        rahmad.mapel = "Ipas";
        rahmad.alamat = "malang";
        System.out.println("Ini Data Pak Rahmad");
        System.out.println(rahmad.id);
        System.out.println(rahmad.nama);
        System.out.println(rahmad.mapel);
        System.out.println(rahmad.alamat);

        diaur.id = 5;
        diaur.nama = "diaur";
        diaur.mapel = "Pjok";
        diaur.alamat = "malang";
        System.out.println("Ini Data Pak Diaur");
        System.out.println(diaur.id);
        System.out.println(diaur.nama);
        System.out.println(diaur.mapel);
        System.out.println(diaur.alamat);
       
       
        aulia.print();
        pasha.print();
        nasikin.print();
        rahmad.print();
        diaur.print();
    }
    
}