import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagerTest {

    private Manager repo = new Manager();
    Poster first = new Poster(1, "Бладшот", "боевик");
    Poster second = new Poster(2, "Вперед", "мультфильм");
    Poster third = new Poster(3, "Отель Белград", "комедия");
    Poster fourth = new Poster(4, "Джентльмены", "боевик");
    Poster fifth = new Poster(5, "Человек-невидимка", "ужасы");
    Poster sixth = new Poster(6, "Тролли. Мировой тур", "мультфильм");
    Poster seventh = new Poster(7, "Номер один", "комедия");
    Poster eighth = new Poster(8, "Одна", "драмма");
    Poster ninth = new Poster(9, "Молодой человек", "комедия");
    Poster tenth = new Poster(10, "Пропавшая", "боевик");
    Poster eleventh = new Poster(11, "Кощей. Похититель невест", "мультфильм");
    Poster twelfth = new Poster(12, "12", "драмма");


    @Test
    void shouldAddLessThenDefault() {
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);

        Poster[] expected = {first, second, third, fourth};
        assertArrayEquals(expected, repo.findAll());
    }

    @Test
    void shouldAddMoreThenDefault() {
        Manager repo = new Manager(12);
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);
        repo.add(eighth);
        repo.add(ninth);
        repo.add(tenth);
        repo.add(eleventh);
        repo.add(twelfth);

        Poster[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth};
        assertArrayEquals(expected, repo.findAll());
    }

    @Test
    void shouldAddDefault() {
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);
        repo.add(eighth);
        repo.add(ninth);
        repo.add(tenth);

        Poster[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        assertArrayEquals(expected, repo.findAll());
    }

    @Test
    void shouldFindLast() {
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);
        repo.add(eighth);
        repo.add(ninth);

        Poster[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, repo.findLast());
    }

    @Test
    void shouldShowOnePositionArray() {
        repo.add(first);

        Poster[] expected = {first};
        assertArrayEquals(expected, repo.findAll());
    }

    @Test
    void shouldCheckArrayWithUsersConstructor() {
        Manager repo = new Manager(4);
        repo.add(first);
        repo.add(second);
        repo.add(third);
        repo.add(fourth);
        repo.add(fifth);
        repo.add(sixth);
        repo.add(seventh);

        Poster[] expected = {first, second, third, fourth};
        assertArrayEquals(expected, repo.findAll());
    }
}
