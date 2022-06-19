package Form;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VanSlime
 */
public class MenuKasir extends javax.swing.JFrame {

    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in","ID"));
    public MenuKasir() {
        initComponents();
        KodeBarang();
        Total();
        Diskon();
    }
    private void Diskon(){
        txt_diskon.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int diskon, hasil_diskon;
                  diskon = Integer.parseInt(txt_jumlah_harga.getText().replace(".", "")) * Integer.parseInt(txt_diskon.getText().replace("", "")) /100;
                  hasil_diskon = Integer.parseInt(txt_jumlah_harga.getText().replace(".",""))- diskon;
        
                  txt_hasil_diskon.setText(nf.format(diskon));
                //ppn
                 int hasil_ppn = 0;
                 if (chk_ppn.isSelected()){
                 hasil_ppn = hasil_diskon * 10 / 100;
                 txt_hasil_ppn.setText(nf.format(hasil_ppn));
                }else{
                 hasil_ppn = hasil_diskon * 0 / 100;
                 txt_hasil_ppn.setText(nf.format(hasil_ppn));
        }
                    //total bersih semua
                    int totalbersih;
                    totalbersih = hasil_ppn + hasil_diskon;
                    lbl_jumlah_harga.setText("Rp. " + nf.format(totalbersih));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    private void Total(){
     txt_qty.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
         @Override
         public void insertUpdate(DocumentEvent arg0) {
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           try {
              
               int hasil = 0;
               if (txt_qty.getText().equals("")){
                   hasil = Integer.parseInt(txt_harga.getText().replace(".","")) * 0;
               }else{
                   hasil = Integer.parseInt(txt_harga.getText().replace(".","")) * 
                           Integer.parseInt(txt_qty.getText());
               }
               txt_total_harga.setText(nf.format(hasil));
           } catch (Exception e){
         }
         }

         @Override
         public void removeUpdate(DocumentEvent arg0) {
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          try {
              
               int hasil = 0;
               if (txt_qty.getText().equals("")){
                   hasil = Integer.parseInt(txt_harga.getText().replace(".","")) * 0;
               }else{
                   hasil = Integer.parseInt(txt_harga.getText().replace(".","")) * 
                           Integer.parseInt(txt_qty.getText());
               }
               txt_total_harga.setText(nf.format(hasil));
           } catch (Exception e){
         }
         }

         @Override
         public void changedUpdate(DocumentEvent e) {
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });
    }
    private void KodeBarang() {
     txt_kode_barang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
         @Override
         public void insertUpdate(DocumentEvent e) {
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String KodeBarang;
            KodeBarang = (String) txt_kode_barang.getText();
            
            switch (KodeBarang){
                case "B001" :
                    txt_nama_barang.setText("Teh Pucuk");
                    txt_harga.setText(nf.format(4000));
                    txt_qty.grabFocus();
                    break;
                case "B002" :
                    txt_nama_barang.setText("Susu Beruang");
                    txt_harga.setText(nf.format(10000));
                    txt_qty.grabFocus();
                    break;
                case "B003" :
                    txt_nama_barang.setText("Mie Instan");
                    txt_harga.setText(nf.format(3000));
                    txt_qty.grabFocus();
                    break;
                case "B004" :
                    txt_nama_barang.setText("Sabun Mandi");
                    txt_harga.setText(nf.format(2000));
                    txt_qty.grabFocus();
                    break;
                case "B005" :
                    txt_nama_barang.setText("Pasta Gigi");
                    txt_harga.setText(nf.format(2500));
                    txt_qty.grabFocus();
                    break;
                default:
                    txt_nama_barang.setText("");
                    txt_harga.setText(""); 
            }
         }

         @Override
         public void removeUpdate(DocumentEvent e) {
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         String KodeBarang;
            KodeBarang = (String) txt_kode_barang.getText();
            
            switch (KodeBarang){
                case "B001" :
                    txt_nama_barang.setText("Teh Pucuk");
                    txt_harga.setText(nf.format(4000));
                    txt_qty.grabFocus();
                    break;
                case "B002" :
                    txt_nama_barang.setText("Susu Beruang");
                    txt_harga.setText(nf.format(10000));
                    txt_qty.grabFocus();
                    break;
                case "B003" :
                    txt_nama_barang.setText("Mie Instan");
                    txt_harga.setText(nf.format(3000));
                    txt_qty.grabFocus();
                    break;
                case "B004" :
                    txt_nama_barang.setText("Sabun Mandi");
                    txt_harga.setText(nf.format(2000));
                    txt_qty.grabFocus();
                    break;
                case "B005" :
                    txt_nama_barang.setText("Pasta Gigi");
                    txt_harga.setText(nf.format(2500));
                    txt_qty.grabFocus();
                    break;
                default:
                    txt_nama_barang.setText("");
                    txt_harga.setText(""); 
            }

         }
         

         @Override
         public void changedUpdate(DocumentEvent e) {
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lbl_jumlah_harga = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_kode_barang = new javax.swing.JTextField();
        txt_nama_barang = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_qty = new javax.swing.JTextField();
        txt_total_harga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_list = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_jumlah_harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_diskon = new javax.swing.JTextField();
        txt_hasil_diskon = new javax.swing.JTextField();
        txt_hasil_ppn = new javax.swing.JTextField();
        chk_ppn = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        lbl_jumlah_qty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_jumlah_harga.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_jumlah_harga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_jumlah_harga.setText("Rp.");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Kode Barang");

        txt_kode_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kode_barangActionPerformed(evt);
            }
        });

        txt_nama_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_barangActionPerformed(evt);
            }
        });

        txt_harga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });

        txt_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtyActionPerformed(evt);
            }
        });

        txt_total_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_hargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_total_harga, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kode_barang)
                    .addComponent(txt_nama_barang)
                    .addComponent(txt_harga)
                    .addComponent(txt_qty)
                    .addComponent(txt_total_harga))
                .addGap(20, 20, 20))
        );

        tbl_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Barang", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tbl_list);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Jumlah Harga");

        txt_jumlah_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlah_hargaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Diskon %");

        txt_diskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diskonActionPerformed(evt);
            }
        });

        txt_hasil_diskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hasil_diskonActionPerformed(evt);
            }
        });

        txt_hasil_ppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hasil_ppnActionPerformed(evt);
            }
        });

        chk_ppn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk_ppn.setText("PPN 10%");
        chk_ppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_ppnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Item Yang Dibeli : ");

        lbl_jumlah_qty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_jumlah_qty.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_jumlah_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_jumlah_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_jumlah_harga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chk_ppn, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txt_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_hasil_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_hasil_ppn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_jumlah_harga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_jumlah_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_jumlah_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hasil_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_hasil_ppn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_ppn))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(810, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void txt_kode_barangActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txt_nama_barangActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if (txt_qty.getText().equals("")){
            return;
        }else{
            DefaultTableModel model =(DefaultTableModel) tbl_list.getModel();
            
            Object obj [] = new Object[6];
            obj [1] = txt_kode_barang.getText();
            obj [2] = txt_nama_barang.getText();
            obj [3] = txt_harga.getText();
            obj [4] = txt_qty.getText();
            obj [5] = txt_total_harga.getText(); 
            
            model.addRow(obj); 
            int baris = model.getRowCount();
            for (int a = 0; a < baris; a ++){
                String no = String.valueOf(a + 1); 
                model.setValueAt(no + ".", a, 0); 
            }
            tbl_list.setRowHeight(30);
            lbl_jumlah_qty.setText(String.valueOf(baris)); 
            
            jmlTotalHarga();
            bersih();
        }
    }                                       

    private void txt_total_hargaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txt_jumlah_hargaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void txt_diskonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void txt_hasil_diskonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void txt_hasil_ppnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void chk_ppnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here
       jmlTotalHarga();
       
    }                                       

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
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox chk_ppn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_jumlah_harga;
    private javax.swing.JLabel lbl_jumlah_qty;
    private javax.swing.JTable tbl_list;
    private javax.swing.JTextField txt_diskon;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_hasil_diskon;
    private javax.swing.JTextField txt_hasil_ppn;
    private javax.swing.JTextField txt_jumlah_harga;
    private javax.swing.JTextField txt_kode_barang;
    private javax.swing.JTextField txt_nama_barang;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_total_harga;
    // End of variables declaration                   

    private void jmlTotalHarga() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int sub_total = 0;
        for (int a = 0; a < tbl_list.getRowCount(); a ++){
            sub_total += Integer.parseInt((String)
                    tbl_list.getValueAt(a, 5).toString().replace(".",""));
        }
        
        txt_jumlah_harga.setText(nf.format(sub_total));
        
        //diskon
        int diskon, hasil_diskon;
        diskon = Integer.parseInt(txt_jumlah_harga.getText().replace(".", "")) * Integer.parseInt(txt_diskon.getText().replace("", "0")) /100;
        hasil_diskon = Integer.parseInt(txt_jumlah_harga.getText().replace(".",""))- diskon;
        
        //ppn
        int hasil_ppn = 0;
        if (chk_ppn.isSelected()){
            hasil_ppn = hasil_diskon * 10 / 100;
            txt_hasil_ppn.setText(nf.format(hasil_ppn));
        }else{
            hasil_ppn = hasil_diskon * 0 / 100;
            txt_hasil_ppn.setText(nf.format(hasil_ppn));
        }
        //total bersih semua
        int totalbersih;
        totalbersih = hasil_ppn + hasil_diskon;
        lbl_jumlah_harga.setText("Rp. " + nf.format(totalbersih));
    }

    private void bersih() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       txt_kode_barang.setText("");
       txt_kode_barang.grabFocus();
       txt_qty.setText("");
       txt_total_harga.setText("");
    }
}
