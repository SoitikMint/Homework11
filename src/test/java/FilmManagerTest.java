import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilmManagerTest {

    @Test
    public void shouldAddFilm() {
        FilmManager manager = new FilmManager();
        FilmItem film_1 = new FilmItem(22, "Бладшот", "http://google/1", "боевик");

        manager.add(film_1);

        FilmItem[] expected = {film_1};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByID() {
        FilmManager manager = new FilmManager();

        FilmItem film_1 = new FilmItem(22, "Бладшот", "http://google/1", "боевик");
        FilmItem film_2 = new FilmItem(45, "Вперед", "http://google/5", "мультфильм");
        FilmItem film_3 = new FilmItem(44, "Джентельмены", "http://google/4", "боевик");

        manager.add(film_1);
        manager.add(film_2);
        manager.add(film_3);

        manager.removeById(45);

        FilmItem[] expected = {film_1, film_3};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLast2Items() {
        FilmManager manager = new FilmManager(2);

        FilmItem film_1 = new FilmItem(22, "Бладшот", "http://google/1", "боевик");
        FilmItem film_2 = new FilmItem(45, "Вперед", "http://google/5", "мультфильм");
        FilmItem film_3 = new FilmItem(44, "Джентельмены", "http://google/4", "боевик");

        manager.add(film_1);
        manager.add(film_2);
        manager.add(film_3);

        FilmItem[] expected = {film_3, film_2};
        FilmItem[] actual = manager.findLastAdded();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowOnly3Items() {
        FilmManager manager = new FilmManager();

        FilmItem film_1 = new FilmItem(22, "Бладшот", "http://google/1", "боевик");
        FilmItem film_2 = new FilmItem(45, "Вперед", "http://google/5", "мультфильм");
        FilmItem film_3 = new FilmItem(44, "Джентельмены", "http://google/4", "боевик");

        manager.add(film_1);
        manager.add(film_2);
        manager.add(film_3);

        FilmItem[] expected = {film_3, film_2, film_1};
        FilmItem[] actual = manager.findLastAdded();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveLastFilm() {

        FilmManager manager = new FilmManager();

        FilmItem film_1 = new FilmItem(22, "Бладшот", "http://google/1", "боевик");
        FilmItem film_2 = new FilmItem(45, "Вперед", "http://google/5", "мультфильм");
        FilmItem film_3 = new FilmItem(44, "Джентельмены", "http://google/4", "боевик");

        manager.add(film_1);
        manager.add(film_2);
        manager.add(film_3);

        manager.removeLast();

        FilmItem[] expected = {film_1, film_2};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
