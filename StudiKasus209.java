import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class StudiKasus209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara;

        System.out.println("Nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA : ");
        jenisKegiatan = sc.nextLine();
        System.out.println("Jumlah dokumen : ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) { 
        System.out.println("Peringkat juara : ");
        peringkatJuara = sc.nextInt();

        if (jumlahDokumen < 4) {
            System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). " + "Dana penghargaan tidak diberikan.");
        } else {
            if (peringkatJuara == 1 ||
                peringkatJuara == 2 ||
                peringkatJuara == 3) {   
            System.out.println("Status : Dana penghargaan diberikan.");     
            } else {
                System.out.println("Status : Bukan juara 1, 2, atau 3. " + "Dana penghargaan diberikan.");
            }
        }
        }
        
    }
}
