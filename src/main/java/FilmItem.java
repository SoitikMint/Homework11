public class FilmItem {
    private int id;
    private String filmName;
    private String filmImgUrl;
    private String filmGenre;

    public FilmItem(int id, String filmName, String filmImgUrl, String filmGenre) {
        this.id = id;
        this.filmName = filmName;
        this.filmImgUrl = filmImgUrl;
        this.filmGenre = filmGenre;
    }

    public int getId() {
        return id;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getFilmImgUrl() {
        return filmImgUrl;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

}
