package pbo2.pkg10119073.latihan32.daftarfilm;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan daftar film
 * yang sedang tayang dengan object oriented
 *
 */

public class filmTayang {
    public static void main(String[] args) {
        System.out.println("=====Daftar Film Sedang Tayang=====\n");
        Film flm1 = new Film();
        flm1.setfilmName("Venom");
        flm1.setfilmGenre("Action, Horror, Scifi");
        flm1.setfilmRating(8.5);
        flm1.setfilmDuration(120);
        flm1.nowPlaying();
        
        Film flm2 = new Film();
        flm2.setfilmName("Small Foot");
        flm2.setfilmGenre("Animation");
        flm2.setfilmRating(9.0);
        flm2.setfilmDuration(96);
        flm2.nowPlaying();
        
        Film flm3 = new Film();
        flm3.setfilmName("Crazy Rich Asian");
        flm3.setfilmGenre("Comedy");
        flm3.setfilmRating(7.8);
        flm3.setfilmDuration(119);
        flm3.nowPlaying();
        
        Film flm4 = new Film();
        flm4.setfilmName("Asih");
        flm4.setfilmGenre("Horror");
        flm4.setfilmRating(6.0);
        flm4.setfilmDuration(100);
        flm4.nowPlaying();
    }
}