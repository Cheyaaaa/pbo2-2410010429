package id.ac.uniska.pbo2.p04;

import com.formdev.flatlaf.FlatLightLaf;

public class P04LayoutManager {

    public static void main(String[] args) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> new FormBiodata().setVisible(true));
    }
}