/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.KaryawanControl;
import exception.InputKosongException;
import exception.IdErrorException;
import exception.JenisErrorException;
import exception.NotNumberException;
import java.lang.NumberFormatException;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Karyawan;

public class KaryawanView extends javax.swing.JFrame {

    /**
     * Creates new form KaryawanView
     */
    private KaryawanControl karyawanControl;
    String action = null;
    public KaryawanView() {
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        karyawanControl = new KaryawanControl();
        showKaryawan("Dosen");
        showKaryawan("Staff TU");
    }
    
    // method untuk set komponen input dan button save, button cancel
    public void setComponent(boolean value){
        idInput.setEnabled(value);
        namaInput.setEnabled(value);
        tahunMasukInput.setEnabled(value);
        noTeleponInput.setEnabled(value);
        bebanMengajarInput.setEnabled(value);
        jamKerjaInput.setEnabled(value);
        dosenButton.setEnabled(value);
        staffTUButton.setEnabled(value);
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);
    }
    
    // method untuk set komponen button edit dan delete button
    public void setEditDeleteBtn(boolean value){
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }
    
    // method untuk set value text dari komponen input
    public void clearText(){
        idInput.setText("");
        namaInput.setText("");
        tahunMasukInput.setText("");
        noTeleponInput.setText("");
        bebanMengajarInput.setText("");
        jamKerjaInput.setText("");
        searchInput.setText("");
        jenisButtonGroup.clearSelection();
    }
    
    public void showKaryawan(String jenis){
        if(jenis.compareTo("Dosen")==0){
            showDosen.setText(karyawanControl.showDataKaryawan(jenis));
        }else{
            showStaffTU.setText(karyawanControl.showDataKaryawan(jenis));
        }
            
        
    }
    
    public void inputKosongException() throws InputKosongException{
        if(idInput.getText().isEmpty() || namaInput.getText().isEmpty() || tahunMasukInput.getText().isEmpty() || noTeleponInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    public void idErrorException() throws IdErrorException{
        if(idInput.getText().length() < 5 || idInput.getText().length() >8){
            throw new IdErrorException();
            
        }
    }
    
    public void jenisErrorException() throws JenisErrorException{
        if(jenisButtonGroup.getSelection()==null){
            throw new JenisErrorException();
        }
    }
    
    public void notNumberException() throws NotNumberException{
        throw new NotNumberException();
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisButtonGroup = new javax.swing.ButtonGroup();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        SelectMenu = new javax.swing.JLabel();
        SelectMenu1 = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        isi = new javax.swing.JPanel();
        DataKaryawan = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        namaLabel = new javax.swing.JLabel();
        namaInput = new javax.swing.JTextField();
        tahunMasukLabel = new javax.swing.JLabel();
        tahunMasukInput = new javax.swing.JTextField();
        noTeleponInput = new javax.swing.JTextField();
        noTeleponLabel = new javax.swing.JLabel();
        dosenButton = new javax.swing.JRadioButton();
        staffTUButton = new javax.swing.JRadioButton();
        bebanMengajarLabel = new javax.swing.JLabel();
        bebanMengajarInput = new javax.swing.JTextField();
        jamKerjaLabel = new javax.swing.JLabel();
        jamKerjaInput = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showDosen = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        showStaffTU = new javax.swing.JTextArea();
        showDsn = new javax.swing.JLabel();
        showStaff = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(109, 152, 134));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 62, 70));
        jLabel1.setText("OBJECT PERSISTENCE");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 62, 70));
        jLabel2.setText("BY:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 62, 70));
        jLabel3.setText("Andreas Margono   |   Gabriel Allba Shemi Yuma");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 62, 70));
        jLabel5.setText("210711135             210711150");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(86, 86, 86))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addGap(309, 309, 309))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        Body.setBackground(new java.awt.Color(242, 231, 213));
        Body.setAutoscrolls(true);

        addBtn.setBackground(new java.awt.Color(153, 153, 153));
        addBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 0, 0));
        addBtn.setText("Tambah");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(153, 153, 153));
        editBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setText("Ubah");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn.setText("Hapus");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        SelectMenu.setBackground(new java.awt.Color(255, 255, 255));
        SelectMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SelectMenu.setForeground(new java.awt.Color(57, 62, 70));
        SelectMenu.setText("SELECT MENU");

        SelectMenu1.setBackground(new java.awt.Color(255, 255, 255));
        SelectMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SelectMenu1.setForeground(new java.awt.Color(57, 62, 70));
        SelectMenu1.setText("SEARCH DATA");

        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(153, 153, 153));
        searchBtn.setForeground(new java.awt.Color(0, 0, 0));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        isi.setBackground(new java.awt.Color(159, 135, 114));
        isi.setForeground(new java.awt.Color(63, 78, 79));

        DataKaryawan.setBackground(new java.awt.Color(0, 51, 102));
        DataKaryawan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DataKaryawan.setForeground(new java.awt.Color(44, 54, 57));
        DataKaryawan.setText("DATA KARYAWAN");

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(44, 54, 57));
        idLabel.setText("ID Karyawan");

        namaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(44, 54, 57));
        namaLabel.setText("Nama Karyawan");

        tahunMasukLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tahunMasukLabel.setForeground(new java.awt.Color(44, 54, 57));
        tahunMasukLabel.setText("Tahun Masuk");

        noTeleponInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTeleponInputActionPerformed(evt);
            }
        });

        noTeleponLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noTeleponLabel.setForeground(new java.awt.Color(44, 54, 57));
        noTeleponLabel.setText("Nomor Telepon");

        dosenButton.setBackground(new java.awt.Color(248, 148, 6));
        jenisButtonGroup.add(dosenButton);
        dosenButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dosenButton.setForeground(new java.awt.Color(44, 54, 57));
        dosenButton.setText("DOSEN");
        dosenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosenButtonActionPerformed(evt);
            }
        });

        staffTUButton.setBackground(new java.awt.Color(248, 148, 6));
        jenisButtonGroup.add(staffTUButton);
        staffTUButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffTUButton.setForeground(new java.awt.Color(44, 54, 57));
        staffTUButton.setText("STAFF TU");
        staffTUButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffTUButtonActionPerformed(evt);
            }
        });

        bebanMengajarLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bebanMengajarLabel.setForeground(new java.awt.Color(44, 54, 57));
        bebanMengajarLabel.setText("BEBAN MENGAJAR");

        bebanMengajarInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebanMengajarInputActionPerformed(evt);
            }
        });

        jamKerjaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jamKerjaLabel.setForeground(new java.awt.Color(44, 54, 57));
        jamKerjaLabel.setText("JAM KERJA");

        jamKerjaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamKerjaInputActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(153, 153, 153));
        saveBtn.setForeground(new java.awt.Color(0, 0, 0));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(153, 153, 153));
        cancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout isiLayout = new javax.swing.GroupLayout(isi);
        isi.setLayout(isiLayout);
        isiLayout.setHorizontalGroup(
            isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(DataKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(195, 195, 195))
            .addGroup(isiLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idInput)
                    .addComponent(noTeleponInput)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addComponent(noTeleponLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(97, 97, 97))
                    .addComponent(tahunMasukInput)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addComponent(tahunMasukLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(109, 109, 109))
                    .addComponent(namaInput)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(111, 111, 111)))
                .addGap(110, 110, 110)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(isiLayout.createSequentialGroup()
                                .addComponent(dosenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(92, 92, 92))
                            .addGroup(isiLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(isiLayout.createSequentialGroup()
                                        .addComponent(bebanMengajarInput)
                                        .addGap(8, 8, 8))
                                    .addGroup(isiLayout.createSequentialGroup()
                                        .addComponent(staffTUButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(88, 88, 88))
                                    .addGroup(isiLayout.createSequentialGroup()
                                        .addComponent(bebanMengajarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(77, 77, 77))
                                    .addComponent(jamKerjaInput)
                                    .addGroup(isiLayout.createSequentialGroup()
                                        .addComponent(jamKerjaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(122, 122, 122)))))
                        .addGap(25, 25, 25))))
        );
        isiLayout.setVerticalGroup(
            isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(DataKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tahunMasukLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tahunMasukInput))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(dosenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(bebanMengajarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bebanMengajarInput)
                        .addGap(18, 18, 18)
                        .addComponent(staffTUButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jamKerjaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jamKerjaInput)))
                .addGap(17, 17, 17)
                .addComponent(noTeleponLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noTeleponInput)
                    .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(SelectMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(52, 52, 52)))
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(SelectMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34))
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(searchInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtn))))
                    .addComponent(isi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SelectMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchInput)
                        .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28)
                .addComponent(isi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));

        showDosen.setEditable(false);
        showDosen.setColumns(20);
        showDosen.setRows(5);
        jScrollPane1.setViewportView(showDosen);

        showStaffTU.setEditable(false);
        showStaffTU.setColumns(20);
        showStaffTU.setRows(5);
        jScrollPane2.setViewportView(showStaffTU);

        showDsn.setBackground(new java.awt.Color(237, 228, 224));
        showDsn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showDsn.setForeground(new java.awt.Color(57, 62, 70));
        showDsn.setText("SHOW DOSEN");

        showStaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showStaff.setForeground(new java.awt.Color(57, 62, 70));
        showStaff.setText("SHOW STAFF TU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(showDsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(showStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(showDsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        setComponent(true);
        setEditDeleteBtn(false);
        clearText();
        
        bebanMengajarInput.setEnabled(false);
        jamKerjaInput.setEnabled(false);
        searchInput.setText("");
        action = "Tambah";
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
          if(!idInput.getText().isEmpty()){
            setComponent(true);
            idInput.setEnabled(false);
            if(dosenButton.isSelected()){
                staffTUButton.setEnabled(false);
                jamKerjaInput.setEnabled(false);
            }else{
                dosenButton.setEnabled(false);
                bebanMengajarInput.setEnabled(false);
            }
            action = "Ubah";
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                karyawanControl.deleteDataKaryawan(idInput.getText());
                clearText();
                showKaryawan("Dosen");
                showKaryawan("Staff TU");
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
                setComponent(false);
            }catch(Exception e){
                System.out.println("Error : "+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Data tidak jadi dihapus!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    private void noTeleponInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTeleponInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTeleponInputActionPerformed

    private void dosenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosenButtonActionPerformed
        bebanMengajarInput.setEnabled(true);
        jamKerjaInput.setEnabled(false);
        jamKerjaInput.setText("");
    }//GEN-LAST:event_dosenButtonActionPerformed

    private void staffTUButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffTUButtonActionPerformed
        jamKerjaInput.setEnabled(true);
        bebanMengajarInput.setEnabled(false);
        bebanMengajarInput.setText("");
    }//GEN-LAST:event_staffTUButtonActionPerformed

    private void bebanMengajarInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebanMengajarInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bebanMengajarInputActionPerformed

    private void jamKerjaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamKerjaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jamKerjaInputActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try{
            inputKosongException();
            idErrorException();
            jenisErrorException();
            
            
            dosenButton.setActionCommand("Dosen");
            staffTUButton.setActionCommand("Staff TU");
            
            Karyawan d = new Karyawan();
            
            if(jenisButtonGroup.getSelection().getActionCommand().compareTo("Dosen")==0){
                
                if(bebanMengajarInput.getText().isEmpty()){
                    throw new InputKosongException();
                }
                try{
                    Integer.parseInt(tahunMasukInput.getText());
                    d = new Karyawan(idInput.getText(), namaInput.getText(), jenisButtonGroup.getSelection().getActionCommand(), Integer.valueOf(tahunMasukInput.getText()), noTeleponInput.getText(), bebanMengajarInput.getText(), 0);    
                }catch(NumberFormatException e){
                    throw new NotNumberException();
                }
                
                
            }else{
                if(jamKerjaInput.getText().isEmpty()){
                    throw new InputKosongException();
                }
                
                try{
                    Integer.parseInt(tahunMasukInput.getText());
                    Integer.parseInt(jamKerjaInput.getText());
                    d = new Karyawan(idInput.getText(), namaInput.getText(), jenisButtonGroup.getSelection().getActionCommand(), Integer.valueOf(tahunMasukInput.getText()), noTeleponInput.getText(), null, Integer.valueOf(jamKerjaInput.getText()));        
                }catch(NumberFormatException e){
                    throw new NotNumberException();
                }
                
            }

            if(action.equals("Tambah")){
                karyawanControl.insertDataKaryawan(d);
            }else{
                karyawanControl.updateDataKaryawan(d, idInput.getText());
            }
            clearText();
            showKaryawan("Dosen");
            showKaryawan("Staff TU");
            setComponent(false);
            setEditDeleteBtn(false);
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }catch(IdErrorException e){
            JOptionPane.showMessageDialog(this, e.message());
        }catch(JenisErrorException e){
            JOptionPane.showMessageDialog(this, e.message());
        }catch(NotNumberException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setComponent(false);
        setEditDeleteBtn(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        setEditDeleteBtn(true);
        setComponent(false);

        try{
            Karyawan karyawan = karyawanControl.searchKaryawan(searchInput.getText());

            if(karyawan == null){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
                
                idInput.setText(karyawan.getId());
                namaInput.setText(karyawan.getNama());
                
                if(karyawan.getJamKerja()!=0){
                    
                    jamKerjaInput.setText(String.valueOf(karyawan.getJamKerja()));
                    staffTUButton.setSelected(true);
                    
                    
                }else{
                    
                    bebanMengajarInput.setText(String.valueOf(karyawan.getBebanMengajar()));
                    dosenButton.setSelected(true);
                    
                }

                tahunMasukInput.setText(String.valueOf(karyawan.getTahunMasuk()));
                noTeleponInput.setText(karyawan.getNoTelepon());
                

            }
        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }

    }//GEN-LAST:event_searchBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KaryawanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaryawanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaryawanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaryawanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KaryawanView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JLabel DataKaryawan;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel SelectMenu;
    private javax.swing.JLabel SelectMenu1;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField bebanMengajarInput;
    private javax.swing.JLabel bebanMengajarLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JRadioButton dosenButton;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel isi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jamKerjaInput;
    private javax.swing.JLabel jamKerjaLabel;
    private javax.swing.ButtonGroup jenisButtonGroup;
    private javax.swing.JTextField namaInput;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField noTeleponInput;
    private javax.swing.JLabel noTeleponLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTextArea showDosen;
    private javax.swing.JLabel showDsn;
    private javax.swing.JLabel showStaff;
    private javax.swing.JTextArea showStaffTU;
    private javax.swing.JRadioButton staffTUButton;
    private javax.swing.JTextField tahunMasukInput;
    private javax.swing.JLabel tahunMasukLabel;
    // End of variables declaration//GEN-END:variables
}
