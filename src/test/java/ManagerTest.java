import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagerTest {

    private Manager manager = new Manager();
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
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Poster[] expected = {first, second, third, fourth};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldAddMoreThenDefault() {
        Manager manager = new Manager(12);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Poster[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldAddDefault() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Poster[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldFindLast() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);

        Poster[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldShowOnePositionArray() {
        manager.add(first);

        Poster[] expected = {first};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldCheckArrayWithUsersConstructor() {
        Manager manager = new Manager(4);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Poster[] expected = {seventh, sixth, fifth, fourth};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldCheckArrayWithUsersConstructorFindLast() {
        Manager manager = new Manager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Poster[] expected = {seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldAddLessThenDefaultFindLast() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Poster[] expected = {fourth, third, second, first};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldAddMoreThenDefaultFindLast() {
        Manager manager = new Manager(12);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Poster[] expected = {twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldAddDefaultFindLast() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Poster[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, manager.findLast());
    }

}
