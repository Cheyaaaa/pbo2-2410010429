/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.uniska.pbo2.p06;

import javax.swing.JOptionPane;

import com.formdev.flatlaf.FlatLaf;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class FormAnggotaPerpustakaan extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormAnggotaPerpustakaan.class.getName());

    /**
     * Creates new form FormAnggotaPerpustakaan
     */
public FormAnggotaPerpustakaan() {
    initComponents();

    // Kode tambahan: gaya huruf FlatLaf, placeholder, dan tombol default
    judulLabel.putClientProperty("FlatLaf.styleClass", "h2");
    keteranganLabel.putClientProperty("FlatLaf.style", "foreground: $Label.disabledForeground");
    dataAnggotaLabel.putClientProperty("FlatLaf.styleClass", "h4");
    kontakLabel.putClientProperty("FlatLaf.styleClass", "h4");
    emailField.putClientProperty("JTextField.placeholderText", "nama@contoh.com");
    hpField.putClientProperty("JTextField.placeholderText", "08xxxxxxxxxx");
    getRootPane().setDefaultButton(daftarButton);

    pack();                       // hitung ulang ukuran setelah gaya huruf berubah
    setMinimumSize(getSize());    // jendela tidak dapat dikecilkan melebihi ukuran awal
    setLocationRelativeTo(null);
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        prodiGroup = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        headerPanel = new javax.swing.JPanel();
        keteranganLabel = new javax.swing.JLabel();
        judulLabel = new javax.swing.JLabel();
        isiPanel = new javax.swing.JPanel();
        tombolPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        batalButton = new javax.swing.JButton();
        daftarButton = new javax.swing.JButton();
        formPanel = new javax.swing.JPanel();
        dataAnggotaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        prodiLabel = new javax.swing.JLabel();
        jenisAnggotaLabel = new javax.swing.JLabel();
        kontakLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        alamatLabel = new javax.swing.JLabel();
        npmField = new javax.swing.JTextField();
        namaField = new javax.swing.JTextField();
        prodiCombo = new javax.swing.JComboBox<>();
        emailField = new javax.swing.JTextField();
        hpField = new javax.swing.JTextField();
        alamatPanel = new javax.swing.JScrollPane();
        alamatArea = new javax.swing.JTextArea();
        jenisAnggotaPanel = new javax.swing.JPanel();
        mahasiswaRadio = new javax.swing.JRadioButton();
        dosenRadio = new javax.swing.JRadioButton();
        umumRadio = new javax.swing.JRadioButton();
        nomorLabel = new javax.swing.JLabel();
        npmPesanLabel = new javax.swing.JLabel();
        namaPesanLabel = new javax.swing.JLabel();
        prodiPesanLabel = new javax.swing.JLabel();
        hpPesanLabel = new javax.swing.JLabel();
        setujuCheck = new javax.swing.JCheckBox();
        emailPesanLabel = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AnggotaPerpustakaan");
        setEnabled(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 8, 16));
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.Y_AXIS));

        keteranganLabel.setText("Isi Biodata Anda.");
        headerPanel.add(keteranganLabel);

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        judulLabel.setText("Angoota Perpustakaan");
        headerPanel.add(judulLabel);

        isiPanel.setLayout(new java.awt.BorderLayout());

        tombolPanel.setLayout(new java.awt.BorderLayout());

        statusLabel.setText("Status Label");
        tombolPanel.add(statusLabel, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 8, 0));

        batalButton.setText("Batal");
        batalButton.addActionListener(this::batalButtonActionPerformed);
        jPanel1.add(batalButton);

        daftarButton.setText("Daftar");
        daftarButton.addActionListener(this::daftarButtonActionPerformed);
        jPanel1.add(daftarButton);

        tombolPanel.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        formPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 8, 16));
        formPanel.setLayout(new java.awt.GridBagLayout());

        dataAnggotaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dataAnggotaLabel.setText("Data Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 8);
        formPanel.add(dataAnggotaLabel, gridBagConstraints);

        npmLabel.setDisplayedMnemonic('P');
        npmLabel.setLabelFor(npmField);
        npmLabel.setText("NPM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 8);
        formPanel.add(npmLabel, gridBagConstraints);

        namaLabel.setDisplayedMnemonic('N');
        namaLabel.setLabelFor(namaField);
        namaLabel.setText("Nama Lengkap");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 8);
        formPanel.add(namaLabel, gridBagConstraints);

        prodiLabel.setDisplayedMnemonic('R');
        prodiLabel.setLabelFor(prodiCombo);
        prodiLabel.setText("Progran Studi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 8);
        formPanel.add(prodiLabel, gridBagConstraints);

        jenisAnggotaLabel.setDisplayedMnemonic('j');
        jenisAnggotaLabel.setLabelFor(mahasiswaRadio);
        jenisAnggotaLabel.setText("Jenis Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 8);
        formPanel.add(jenisAnggotaLabel, gridBagConstraints);

        kontakLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kontakLabel.setText("Kontak");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 8);
        formPanel.add(kontakLabel, gridBagConstraints);

        emailLabel.setDisplayedMnemonic('E');
        emailLabel.setLabelFor(emailField);
        emailLabel.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 8);
        formPanel.add(emailLabel, gridBagConstraints);

        alamatLabel.setDisplayedMnemonic('A');
        alamatLabel.setLabelFor(alamatPanel);
        alamatLabel.setText("Alamat");
        alamatLabel.setAutoscrolls(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 8);
        formPanel.add(alamatLabel, gridBagConstraints);

        npmField.addActionListener(this::npmFieldActionPerformed);
        npmField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                npmFieldKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 8);
        formPanel.add(npmField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 8);
        formPanel.add(namaField, gridBagConstraints);

        prodiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Sistem Informatika", "Manajemen" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 8);
        formPanel.add(prodiCombo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 8);
        formPanel.add(emailField, gridBagConstraints);

        hpField.addActionListener(this::hpFieldActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 8);
        formPanel.add(hpField, gridBagConstraints);

        alamatArea.setColumns(20);
        alamatArea.setRows(5);
        alamatPanel.setViewportView(alamatArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 8);
        formPanel.add(alamatPanel, gridBagConstraints);

        jenisAnggotaPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        prodiGroup.add(mahasiswaRadio);
        mahasiswaRadio.setSelected(true);
        mahasiswaRadio.setText("Mahasiswa");
        jenisAnggotaPanel.add(mahasiswaRadio);

        prodiGroup.add(dosenRadio);
        dosenRadio.setText("Dosen");
        jenisAnggotaPanel.add(dosenRadio);

        prodiGroup.add(umumRadio);
        umumRadio.setText("Umum");
        jenisAnggotaPanel.add(umumRadio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        formPanel.add(jenisAnggotaPanel, gridBagConstraints);

        nomorLabel.setDisplayedMnemonic('H');
        nomorLabel.setLabelFor(hpField);
        nomorLabel.setText("Nomor Hp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 8);
        formPanel.add(nomorLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        formPanel.add(npmPesanLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        formPanel.add(namaPesanLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        formPanel.add(prodiPesanLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        formPanel.add(hpPesanLabel, gridBagConstraints);

        setujuCheck.setText("Setuju dengan tata tertib perpustakaan.");
        setujuCheck.addItemListener(this::setujuCheckItemStateChanged);
        setujuCheck.addActionListener(this::setujuCheckActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        formPanel.add(setujuCheck, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        formPanel.add(emailPesanLabel, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(isiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tombolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpFieldActionPerformed

    private void npmFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npmFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npmFieldActionPerformed

    private void setujuCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setujuCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setujuCheckActionPerformed

    private void setujuCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_setujuCheckItemStateChanged
    daftarButton.setEnabled(setujuCheck.isSelected());        // TODO add your handling code here:
    }//GEN-LAST:event_setujuCheckItemStateChanged

    private void npmFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npmFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_npmFieldKeyReleased
    // TODO add your handling code here:
    // TODO add your handling code here:

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       int jawab = JOptionPane.showConfirmDialog(this,
 "Keluar dari aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
 if (jawab == JOptionPane.YES_OPTION) {
 dispose();}  // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
    daftar();    // TODO add your handling code here:
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batalButtonActionPerformed

private void daftar() {
    // Semua isian diperiksa agar pengguna melihat seluruh kesalahan sekaligus
    List<JComponent> salah = new ArrayList<>();
    if (!periksaNpm()) {
        salah.add(npmField);
    }
    if (!periksaNama()) {
        salah.add(namaField);
    }
    if (!periksaProdi()) {
        salah.add(prodiCombo);
    }
    if (!periksaEmail()) {
        salah.add(emailField);
    }
    if (!periksaHp()) {
        salah.add(hpField);
    }

    if (!salah.isEmpty()) {
        statusLabel.setText(salah.size() + " isian perlu diperbaiki");
        salah.get(0).requestFocusInWindow(); // arahkan pengguna ke kesalahan pertama
        return;
    }

    statusLabel.setText(" ");
    String pesan = "Pendaftaran berhasil."
            + "\n\nNPM: " + npmField.getText()
            + "\nNama: " + namaField.getText().trim()
            + "\nJenis anggota: " + jenisAnggota();
    JOptionPane.showMessageDialog(this, pesan, "Pendaftaran Berhasil",
            JOptionPane.INFORMATION_MESSAGE);
    kosongkan();
}
private String jenisAnggota() {
    if (dosenRadio.isSelected()) {
        return "Dosen";
    }
    if (umumRadio.isSelected()) {
        return "Umum";
    }
    return "Mahasiswa";
}

private void kosongkan() {
    for (JTextField isian : List.of(npmField, namaField, emailField, hpField)) {
        isian.setText("");
    }
    alamatArea.setText("");
    prodiCombo.setSelectedIndex(0);
    mahasiswaRadio.setSelected(true);
    setujuCheck.setSelected(false);

    tandai(npmField, npmPesanLabel, null);
    tandai(namaField, namaPesanLabel, null);
    tandai(prodiCombo, prodiPesanLabel, null);
    tandai(emailField, emailPesanLabel, null);
    tandai(hpField, hpPesanLabel, null);
    statusLabel.setText(" ");
    npmField.requestFocusInWindow();
}

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormAnggotaPerpustakaan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatArea;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JScrollPane alamatPanel;
    private javax.swing.JButton batalButton;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel dataAnggotaLabel;
    private javax.swing.JRadioButton dosenRadio;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailPesanLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField hpField;
    private javax.swing.JLabel hpPesanLabel;
    private javax.swing.JPanel isiPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jenisAnggotaLabel;
    private javax.swing.JPanel jenisAnggotaPanel;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JLabel kontakLabel;
    private javax.swing.JRadioButton mahasiswaRadio;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel namaPesanLabel;
    private javax.swing.JLabel nomorLabel;
    private javax.swing.JTextField npmField;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JLabel npmPesanLabel;
    private javax.swing.JComboBox<String> prodiCombo;
    private javax.swing.ButtonGroup prodiGroup;
    private javax.swing.JLabel prodiLabel;
    private javax.swing.JLabel prodiPesanLabel;
    private javax.swing.JCheckBox setujuCheck;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel tombolPanel;
    private javax.swing.JRadioButton umumRadio;
    // End of variables declaration//GEN-END:variables
private boolean periksaNpm() {
    return tandai(npmField, npmPesanLabel, Validator.npm(npmField.getText()));
}

private boolean periksaNama() {
    return tandai(namaField, namaPesanLabel, Validator.nama(namaField.getText()));
}

private boolean periksaProdi() {
    String kesalahan = null;
    if (prodiCombo.getSelectedIndex() == 0) {
        kesalahan = "Pilih salah satu program studi";
    }
    return tandai(prodiCombo, prodiPesanLabel, kesalahan);
}

private boolean periksaEmail() {
    return tandai(emailField, emailPesanLabel, Validator.email(emailField.getText()));
}

private boolean periksaHp() {
    return tandai(hpField, hpPesanLabel, Validator.nomorHp(hpField.getText()));
}

private boolean tandai(JComponent isian, JLabel pesan, String kesalahan) {
    isian.putClientProperty("JComponent.outline", (kesalahan == null) ? null : "error");
    pesan.setText((kesalahan == null) ? " " : kesalahan);
    return kesalahan == null;
}
}

