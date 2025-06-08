public class Films {

    private int id;
    private String nameFilms; // имя фильма
    private String genreFilms; // жанр фильма
    private int dataOutput; // количество выводимых данных


    public Films(int id, String nameFilms, String genreFilms) { // название конструктора должно повторять название класса

        this.id = id; // позволяет задавать id фильма
        this.nameFilms = nameFilms; // позволяет задавать название фильма
        this.genreFilms = genreFilms; // позволяет задавать жанр фильма
    }

    public Films (){
        this.dataOutput = 5; // количество выводимых данных по умолчанию
    }

    public Films(int dataOutput) {
        this.dataOutput = dataOutput; // позволяет через тест менять количество выводимых данных
    }

    public int getId() { // метод отражения id
        return id;
    }

    public int getDataOutput() { // метод отражения кол-ва выводимых данных
        return dataOutput;
    }

    @Override
    // метод позволяет выводить реальные значения элементов массива Films в строку System.out.println(Arrays.toString(actual));
    public String toString() {
        return id + ". " + nameFilms + ", " + "жанр: " + genreFilms + ". ";
    }

}

