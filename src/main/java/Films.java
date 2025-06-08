public class Films {

    private int id;
    private String nameFilms; // имя фильма
    private String genreFilms; // жанр фильма

    public Films(int id, String nameFilms, String genreFilms) { // название конструктора должно повторять название класса

        this.id = id; // позволяет задавать id фильма
        this.nameFilms = nameFilms; // позволяет задавать название фильма
        this.genreFilms = genreFilms; // позволяет задавать жанр фильма
    }

    public int getId() { // метод отражения id
        return id;
    }

    @Override
    // метод позволяет выводить реальные значения элементов массива Films в строку System.out.println(Arrays.toString(actual));
    public String toString() {
        return id + ". " + nameFilms + ", " + "жанр: " + genreFilms + ". ";
    }

}

