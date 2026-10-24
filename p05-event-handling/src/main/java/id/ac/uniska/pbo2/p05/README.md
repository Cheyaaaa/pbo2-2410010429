
### Tabel Pengamatan

| No | Tindakan | Event yang tercatat |
|:--:|---|---|
| 1 |Arahkan kursor ke tombol, lalu jauhkan | MouseEvent   kursor masuk ke tombol 03 MouseEvent   kursor keluar dari tombol|
| 2 | Klik tombol Klik saya | ActionEvent  tombol diklik |
| 3 |  Centang lalu hapus centang Aktifkan fitur | ItemEvent    kotak dicentang ItemEvent    centang dihapus|
| 4 | Ganti pilihan dari Pagi menjadi Malam |11 ItemEvent    memilih Malam|
| 5 | Klik isian, lalu ketik kata "abc" | KeyEvent     mengetik huruf a KeyEvent     mengetik huruf b KeyEvent     mengetik huruf c|
| 6 | Klik tombol setelah mengetik di isian |16 FocusEvent   isian kehilangan fokus|

 ### Jawaban Eksperimen Praktikum 3
1 . Pesan akan tercetak 2 kali setiap pilahan di ganti 1 kali waktu pilihan lama di lepas saltu kali waktu pilihan baru
2 . Karna keyPressed terpanggil saat tombol baru di tekan
3 . Muncul java.lang.NumberFormatException: For input string:"abc"

### Jawaban Eksperimen Praktikum 4
1. Tercetak 2 kali, karna biar ga dobel
2. Tab Design: tambah satu Button (text %) ke operatorPanel, lalu ubah Columns Grid-nya dari 4 jadi 5.
Tab Source: buat event actionPerformed yang manggil hitung('%'), lalu tambah case '%' -> a % b; di switch. Tanpa itu, % jatuh ke default dan malah menghitung a / b.
Ubah juga cek nol jadi if ((operator == '/' || operator == '%') && b == 0).
3.agar bisa langsung mengetik lagi

## Peta Event FormAnggotaPerpustakaan

| Komponen | Menu Events | Aksi |
|---|---|---|
| Kotak centang setuju | Item: itemStateChanged | Tombol Daftar hanya aktif jika dicentang |
| Tombol Batal | Action: actionPerformed | Kosongkan semua isian dan kembalikan fokus ke NPM |
| Tombol Daftar | Action: actionPerformed | Tampilkan ringkasan data dengan JOptionPane |
| Isian NPM | Key: keyReleased | Label kecil menampilkan jumlah digit, misalnya "8 dari 10 digit" |
| Form (JFrame) | Window: windowClosing | Minta konfirmasi sebelum aplikasi ditutup |
<img width="956" height="581" alt="image" src="https://github.com/user-attachments/assets/4940e0df-378b-478b-80f6-390d527f70d2" />
### Penggunaan Ai
Penggunaan Ai untuk keperluan pertanyaan dan langkah langkah praktikum karna saya tidak begitu mengerti yang di modul langkah langkah nya
