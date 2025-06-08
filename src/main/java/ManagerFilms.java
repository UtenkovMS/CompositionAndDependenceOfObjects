public class ManagerFilms {

    private Films[] films = new Films[0]; // cоздаем пустой массив
    private int dataOutput; // количество выводимых данных

    public ManagerFilms() {
        this.dataOutput = 5; // конструктор, задает количество выводимых данных по умолчанию
    }

    public ManagerFilms(int dataOutput) {
        this.dataOutput = dataOutput; // конструктор, позволяет через тест менять количество выводимых данных
    }

    public int getDataOutput() { // метод отражения кол-ва выводимых данных по умолчанию
        return dataOutput;
    }

    public void addFilms(Films newFilm) {

        // метод, в скобках метода указан массив Films и условный элемент массива newFilm, он независим и может иметь любое имя

        Films[] tmp = new Films[films.length + 1]; // создаем массив tmp с длиной массива на 1 элемент больше
        for (int i = 0; i < films.length; i++) { // счетчик, который пролистывает значения i массива, начиная с индекса 0 в пределах длинны массива films.length
            tmp[i] = films[i]; // копирует значение i массива films в ячейку i массива tmp
        }

        tmp[tmp.length - 1] = newFilm; // у массива tmp в квадратных скобках задана длинна, например 7,
        // означающая, если длинна массива 7, то последним индексом будет 6, он будет равен условному элементу newFilm

        films = tmp; // данное выражение означает, что массиву film присваиваются значения массива tmp.
    }

    public void deleteFilmsById(int id) { // в скобках казан элемент id по которому будет удаляться фильм, зависимое значение

        Films[] tmp = new Films[films.length - 1]; // создаем новый массив tmp с диапазоном меньше на 1
        int copyToFilmIndex = 0; // задаем значение индекса равно 0
        for (Films newFilm : films) { // цикл в который пробегает по условным элементам newFilm массива Films в пределах массива films
            if (newFilm.getId() != id) {  // условие если id элемента newFilm не равно заданному элементу id в тесте, то данные копируются
                tmp[copyToFilmIndex] = newFilm;

                copyToFilmIndex++; // увеличивает счетчик индексов
            }
        }

        films = tmp; // копирует массив tmp в массив films
    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findLast() {

        int resultLength;
        if (films.length < getDataOutput()) {
            resultLength = films.length;
        } else {
            resultLength = getDataOutput();
        }

        Films[] reverced = new Films[resultLength];
        for (int i = 0; i < reverced.length; i++) {
            reverced[i] = films[films.length - 1 - i];
        }
        return reverced;
    }
}
