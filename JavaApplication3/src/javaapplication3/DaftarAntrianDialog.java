package javaapplication3;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DaftarAntrianDialog extends JDialog {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("DAFTAR PASIEN");
        judulLabel.setBounds(100, 25, 150, 25); // HORIZONTAL, VERTIKAL, PANJANG KALIMAT, MENIPISKAN FONT 
        this.add(judulLabel);

        namaLabel = new JLabel("NoRM");
        namaLabel.setBounds(20, 70, 50, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(115, 72, 150, 20);
        this.add(namaText);

        namaLabel = new JLabel("NAMA");
        namaLabel.setBounds(20, 120, 50, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(115, 120, 150, 20);
        this.add(namaText);

        namaLabel = new JLabel("ALAMAT");
        namaLabel.setBounds(20, 170, 50, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(115, 168, 150, 20);
        this.add(namaText);

        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(120, 250, 80, 25);
        this.add(saveButton);
    }

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }
}
