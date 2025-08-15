import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmItemTest {

    @Test
    public void shouldGetFilmName() {
        FilmItem film_1 = new FilmItem(22, "Бладшот", "http://google/1", "боевик");

        String expected = "Бладшот";
        String actual = film_1.getFilmName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetFilmUrl() {
        FilmItem film_1 = new FilmItem(22, "Бладшот", "http://google/1", "боевик");

        String expected = "http://google/1";
        String actual = film_1.getFilmImgUrl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetFilmGenre() {
        FilmItem film_1 = new FilmItem(22, "Бладшот", "http://google/1", "боевик");

        String expected = "боевик";
        String actual = film_1.getFilmGenre();

        Assertions.assertEquals(expected, actual);
    }
}
