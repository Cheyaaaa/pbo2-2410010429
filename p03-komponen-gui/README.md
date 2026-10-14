<img width="780" height="639" alt="Cuplikan layar 2026-10-10 212648" src="https://github.com/user-attachments/assets/26651d4f-a326-490e-8c49-f9f8eb9a5799" />
<img width="1207" height="1017" alt="Cuplikan layar 2026-10-10 211618" src="https://github.com/user-attachments/assets/6c4ebc20-e3dd-4b6f-b2bc-74a62744bd58" />
<img width="747" height="634" alt="Cuplikan layar 2026-10-10 212658" src="https://github.com/user-attachments/assets/696944f9-e469-4096-a317-11010eaf34d5" />
## Jawaban Refleksi (Bagian G)

**1.

Top-level container adalah jendela paling luar tempat semua komponen lain berada, dan dia tidak bisa dimasukkan ke container lain. Contohnya `JFrame`, seperti `FormPendaftaran` dan `FormTiketTravel`. Intermediate container adalah wadah di tengah yang dipakai untuk mengelompokkan atau mengatur komponen, dan dirinya sendiri diletakkan di dalam container lain. Contohnya `JPanel`, atau `JScrollPane` yang membungkus Text Area di `FormTiketTravel`. Atomic component adalah komponen yang langsung berinteraksi dengan pengguna dan tidak menampung komponen lain. Contohnya `JButton`, `JLabel`, dan `JTextField`.

**2. 

Kedua `JRadioButton` perlu diberi properti `buttonGroup` yang sama karena `ButtonGroup` membuat pilihan saling meniadakan. Kalau satu dipilih, yang lain otomatis tidak terpilih. Tanpa grup yang sama, setiap radio button berdiri sendiri sehingga keduanya bisa tercentang bersamaan. Karena itu di method `tampilkanRingkasan()` cukup dicek `lakiRadio.isSelected()`, sebab kalau tidak terpilih berarti yang terpilih adalah Perempuan.

**3.

`JComboBox` dipilih ketika pilihannya banyak atau daftarnya bisa berubah, dan ruang di form terbatas, karena dropdown hanya memakai satu baris. Contohnya program studi dan kota tujuan. `JRadioButton` dipilih ketika pilihannya sedikit, sekitar dua sampai empat, dan lebih baik semuanya langsung terlihat tanpa harus diklik dulu. Contohnya jenis kelamin dan kelas tiket.

**4.

Kode di dalam `initComponents()` tidak boleh diedit langsung karena isinya dibuat otomatis oleh NetBeans dari file `.form` setiap kali ada perubahan di tab Design. Kalau diedit manual, perubahan itu akan tertimpa dan hilang saat kode digenerate ulang. Kode tambahan ditulis di luar blok abu-abu, yaitu di konstruktor setelah `initComponents()` (misalnya placeholder dan default button), di method buatan sendiri seperti `tampilkanRingkasan()` dan `gantiTema()`, serta di dalam event handler di antara komentar `GEN-FIRST` dan `GEN-LAST`.

**5. 

`FlatLightLaf.setup()` harus dipanggil sebelum form dibuat karena method ini memasang look and feel ke `UIManager`, dan komponen Swing mengambil tampilannya dari `UIManager` saat objeknya dibuat. Kalau `setup()` dipanggil setelah form dibuat, komponen sudah terlanjur memakai tampilan lama. Karena itu di `main`, `FlatLightLaf.setup()` dipanggil dulu, baru `new FormPendaftaran().setVisible(true)`. Sebaliknya, di `gantiTema()` form sudah ada, jadi dibutuhkan `FlatLaf.updateUI()` supaya tema baru diterapkan ke jendela yang sedang terbuka.
