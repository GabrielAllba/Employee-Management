package control;
/*

Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135

*/
import dao.karyawanDao;
import java.util.List;
import model.Karyawan;

public class KaryawanControl {
    private karyawanDao dDao = new karyawanDao();
    
    public void insertDataKaryawan(Karyawan d){
        dDao.insertKaryawan(d);
    }
    public int countKaryawanByJenis(String jenis){
        return dDao.countKaryawanByJenis(jenis);
    }
    public String showDataKaryawan(String jenis){
        List<Karyawan> dataKaryawan = dDao.showKaryawan(jenis);
        String karyawanString = "";
        for(int i=0; i<dataKaryawan.size(); i++){
            karyawanString = karyawanString + dataKaryawan.get(i).showData();
            
            if(jenis.compareTo("Dosen")==0){
               karyawanString+="Beban Mengajar : "+dataKaryawan.get(i).getBebanMengajar();
            }else{
               karyawanString+="Jam Kerja : "+dataKaryawan.get(i).getJamKerja();
            }
            
        }
        return karyawanString;
    }
    
    public Karyawan searchKaryawan(String id){
        Karyawan d = null;
        d = dDao.searchKaryawan(id);
        return d;
    }
    
    public void updateDataKaryawan(Karyawan d, String id){
        dDao.updateKaryawan(d, id);
    }
    
    public void deleteDataKaryawan(String id){
        dDao.deleteKaryawan(id);
    }
}
