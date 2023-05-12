package model;
/*

Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135

*/
public class Karyawan {
    private String id;
    private String nama;
    private String jenis;
    private int tahunMasuk;
    private String noTelepon;
    private String bebanMengajar;
    private int jamKerja;

    public Karyawan(){
        this.bebanMengajar = null;
        this.jamKerja = 0;
    }
    
    public Karyawan(String id, String nama, String jenis, int tahunMasuk, String noTelepon, String bebanMengajar, int jamKerja) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.tahunMasuk = tahunMasuk;
        this.noTelepon = noTelepon;
        this.bebanMengajar = bebanMengajar;
        this.jamKerja = jamKerja;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public String getBebanMengajar() {
        return bebanMengajar;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void setBebanMengajar(String bebanMengajar) {
        this.bebanMengajar = bebanMengajar;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    
    
    public String showData(){
        return  
                "\n\nID             : " + this.id + "\n"+ 
                "Nama           : "+this.nama + "\n" +
                "Jenis          : "+this.jenis + "\n" +
                "Tahun Masuk    : "+this.tahunMasuk + "\n"+
                "No Telepon     : "+this.noTelepon + "\n";
                
    }
    
    
}

