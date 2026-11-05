
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class UjiNilaiMahasiswa {
   

    public static void main(String[] args) {
        NilaiMahasiswa[] data = {
            new NilaiMahasiswa("2410010001", "Siti Rahmah", 80, 75, 90),
            new NilaiMahasiswa("2410010002", "Budi Santoso", 70, 72, 74),
            new NilaiMahasiswa("2410010003", "Nur Aisyah", 65, 60, 58)
        };

        Locale id = Locale.forLanguageTag("id-ID");
        double total = 0;

        for (NilaiMahasiswa m : data) {
            double akhir = m.hitungNilaiAkhir();
            total += akhir;
            System.out.println(String.format(id, "%s | %-12s | %d | %d | %d | %.2f | %s",
                    m.getNpm(), m.getNama(),
                    m.getNilaiTugas(), m.getNilaiUts(), m.getNilaiUas(),
                    akhir, m.tentukanHuruf()));
        }

        System.out.println(String.format(id,
                "Jumlah mahasiswa: %d, rata-rata nilai akhir: %.2f",
                data.length, total / data.length));
    }
}
