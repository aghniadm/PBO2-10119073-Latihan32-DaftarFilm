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

class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void setfilmName(String filmName) {
        this.filmName = filmName;
    }
    
    public void setfilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public void setfilmRating(double filmRating) {
        this.filmRating = filmRating;
    }
    
    public void setfilmDuration(int filmDuration) {
        this.filmDuration = filmDuration;
    }

    public void nowPlaying() {
        System.out.println("Judul Film  : " + filmName);
        System.out.println("Genre Film  : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + " menit\n");
    }
}