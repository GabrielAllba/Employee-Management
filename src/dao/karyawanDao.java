package dao;
/*

Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135

*/
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Karyawan;


public class karyawanDao {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertKaryawan(Karyawan d){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO karyawan(id, nama, jenis, tahunMasuk, noTelepon, bebanMengajar, jamKerja) "+ "VALUES ('" + d.getId()+"', '"+d.getNama()+"', '"+d.getJenis()+"', '"+d.getTahunMasuk()+"','"+d.getNoTelepon()+"', '"+d.getBebanMengajar()+"', '"+d.getJamKerja()+"')";
        System.out.println("Adding karyawan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " karyawan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding karyawan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    public int countKaryawanByJenis(String jenis){
        con = dbCon.makeConnection();
        String sql = "SELECT COUNT(*) as total_count FROM karyawan WHERE id LIKE '%DSN%';";    
        if(jenis.compareTo("Dosen")==0){
            sql = "SELECT COUNT(*) as total_count FROM karyawan WHERE id LIKE '%DSN%';";    
        }else if(jenis.compareTo("Staff TU")==0){
            sql = "SELECT COUNT(*) as total_count FROM karyawan WHERE id LIKE '%STU%';";    
        }
        
        System.out.println("Mengambil data karyawan...");
        System.out.println(sql);
        int data=0;
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                data = rs.getInt("total_count");    
            }
            
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        System.out.println("Jumlah data : "+data);
        return data;
    }
    public List<Karyawan> showKaryawan(String jenis){
        con = dbCon.makeConnection();
        
        String sql;
        
        if(jenis.compareTo("Dosen")==0){
            sql = "Select * from karyawan WHERE jenis = 'DOSEN'";
        }else{
            sql = "Select * from karyawan WHERE jenis = 'Staff TU'";
        }
            
        
        System.out.println("Mengambil data karyawan...");
        
        List<Karyawan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Karyawan d = new Karyawan(
                            rs.getString("id"),
                            rs.getString("nama"),
                            rs.getString("jenis"),
                            rs.getInt("tahunMasuk"),
                            rs.getString("noTelepon"),
                            rs.getString("bebanMengajar"),
                            rs.getInt("jamKerja")
                    );
                    list.add(d);
                }
                
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return list;
    }
    
    public Karyawan searchKaryawan(String id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM karyawan WHERE id = '"+id+"'";
        System.out.println("Searching karyawan...");
        Karyawan d = null;
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs !=null){
                while(rs.next()){
                    d = new Karyawan(
                            rs.getString("id"),
                            rs.getString("nama"),
                            rs.getString("jenis"),
                            rs.getInt("tahunMasuk"),
                            rs.getString("noTelepon"),
                            rs.getString("bebanMengajar"),
                            rs.getInt("jamKerja")
                    );
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return d;
    }
    
    public void updateKaryawan(Karyawan d, String id){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE karyawan SET nama = '"+d.getNama()+"', "+ "jenis = '"+d.getJenis()+"', " + "tahunMasuk = '"+d.getTahunMasuk()+"', "+"noTelepon = '"+d.getNoTelepon()+"', "+"bebanMengajar = '"+d.getBebanMengajar()+"', "+"jamKerja = '"+d.getJamKerja()+"' "+"WHERE id = '"+id+"'";
        System.out.println(sql);
        System.out.println("Editing Karyawan ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " Karyawan "+id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing karyawan...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteKaryawan(String id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM karyawan WHERE id = '" + id + "'";
        
        System.out.println("Deleting karyawan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " Karyawan "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting karyawan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    
}
