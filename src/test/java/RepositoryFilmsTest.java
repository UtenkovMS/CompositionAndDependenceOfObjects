import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryFilmsTest {

    Films film1 = new Films(1, "Бладшот", "боевик");
    Films film2 = new Films(2, "Вперед", "мультфильм");
    Films film3 = new Films(3, "Отель \"Белград\"", "комедия");
    Films film4 = new Films(4, "Джентельмены", "боевик");
    Films film5 = new Films(5, "Человек-невидимка", "ужасы");
    Films film6 = new Films(6, "Тролли. Мировой тур", "мультфильм");
    Films film7 = new Films(7, "Номер один", "комедия");

    @Test

    public void testAdd() {

        ManagerFilms repo = new ManagerFilms(); // данная строка делает ссылку на класс RepositoryFilms

        repo.addFilms(film1); // через переменную repo. вызываем метод addFilms, который примет элемент film1
        repo.addFilms(film2); // через переменную repo. вызываем метод addFilms, который примет элемент film2
        repo.addFilms(film3); // через переменную repo. вызываем метод addFilms, который примет элемент film3
        repo.addFilms(film4);
        repo.addFilms(film5);
        repo.addFilms(film6);
        repo.addFilms(film7);

        Films[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Films[] actual = repo.findAll(); // Массиву Films[] присвоена переменная actual она равна методу findAll, которая вызывается переменной repo.

        Assertions.assertArrayEquals(expected, actual); // Assertions.assertArrayEquals - сравниваем массивы друг с другом

        for (Films actualFilm : actual) // цикл, который перебирает элементы actualFilm массива Films в пределах массива actual
            System.out.println(actualFilm);
    }

    @Test

    public void testDelete() {

        ManagerFilms repo = new ManagerFilms();
        repo.addFilms(film1); // через переменную repo. вызываем метод addFilms, который примет элемент film1
        repo.addFilms(film2); // через переменную repo. вызываем метод addFilms, который примет элемент film2
        repo.addFilms(film3); // через переменную repo. вызываем метод addFilms, который примет элемент film3
        repo.addFilms(film4);
        repo.addFilms(film5);
        repo.addFilms(film6);
        repo.addFilms(film7);

        repo.deleteFilmsById(film7.getId()); // вызов метода deleteFilmsById через переменную repo., в котором у элемента film7 указан метод getId(), который показывает присвоенный Id

        Films[] expected = {film1, film2, film3, film4, film5, film6};
        Films[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

        for (Films actualFilm : actual) // цикл, который перебирает элементы actualFilm массива Films в пределах массива actual
            System.out.println(actualFilm);
    }

    @Test
    public void testFindLast() {

        ManagerFilms repo = new ManagerFilms();
        repo.addFilms(film1); // через переменную repo. вызываем метод addFilms, который примет элемент film1
        repo.addFilms(film2); // через переменную repo. вызываем метод addFilms, который примет элемент film2
        repo.addFilms(film3); // через переменную repo. вызываем метод addFilms, который примет элемент film3
        repo.addFilms(film4);
        repo.addFilms(film5);
        repo.addFilms(film6);
        repo.addFilms(film7);

        Films[] expected = {film7, film6, film5};
        Films[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);

        for (Films actualFilm : actual) // цикл, который перебирает элементы actualFilm массива Films в пределах массива actual
            System.out.println(actualFilm);
    }

    @Test
    public void testFindLast2() {

        ManagerFilms repo = new ManagerFilms();
        repo.addFilms(film6);
        repo.addFilms(film7);

        Films[] expected = {film7, film6};
        Films[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);

        for (Films actualFilm : actual) // цикл, который перебирает элементы actualFilm массива Films в пределах массива actual
            System.out.println(actualFilm);
    }

    @Test
    public void testFindLastDefault() {

        Films films = new Films();
        ManagerFilms repo = new ManagerFilms();
        repo.addFilms(film1); // через переменную repo. вызываем метод addFilms, который примет элемент film1
        repo.addFilms(film2); // через переменную repo. вызываем метод addFilms, который примет элемент film2
        repo.addFilms(film3); // через переменную repo. вызываем метод addFilms, который примет элемент film3
        repo.addFilms(film4);
        repo.addFilms(film5);
        repo.addFilms(film6);
        repo.addFilms(film7);

        Films[] expected = {film7, film6, film5, film4, film3};
        Films[] actual = repo.findLastDefault();

        Assertions.assertArrayEquals(expected, actual);

        for (Films actualFilm : actual) // цикл, который перебирает элементы actualFilm массива Films в пределах массива actual
            System.out.println(actualFilm);
    }

    @Test
    public void testFindLastDefault1() {

        Films films = new Films();
        ManagerFilms repo = new ManagerFilms();
        repo.addFilms(film4);
        repo.addFilms(film5);
        repo.addFilms(film6);
        repo.addFilms(film7);

        Films[] expected = {film7, film6, film5, film4};
        Films[] actual = repo.findLastDefault();

        Assertions.assertArrayEquals(expected, actual);

        for (Films actualFilm : actual) // цикл, который перебирает элементы actualFilm массива Films в пределах массива actual
            System.out.println(actualFilm);
    }


}
