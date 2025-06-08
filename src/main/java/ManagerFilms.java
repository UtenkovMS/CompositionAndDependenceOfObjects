public class ManagerFilms {

    private Films[] films = new Films[0]; // cоздаем пустой массив

    public void addFilms(Films newFilm) {

        // в скобках метода указан массив Films и условный элемент массива - newFilm, он независим и может иметь любое имя

        Films[] tmp = new Films[films.length + 1]; // создаем массив tmp с длиной массива на 1 элемент больше
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i]; // копирует значение i массива films в ячейку массива tmp
        }

        tmp[tmp.length - 1] = newFilm; // у массива tmp в квадратных скобках задана длинна, например 7,
        // означающая, если длинна массива 7, то последним индексом будет 6, он бдует ранвен элементу newFilm

        films = tmp; // данное выражение означает, что массив film равен массиву tmp
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

        Films tmp = new Films(3);

        int resultLength;
        if (films.length < tmp.getDataOutput()) {
            resultLength = films.length;
        } else {
            resultLength = tmp.getDataOutput();
        }

        Films[] reverced = new Films[resultLength];
        for (int i = 0; i < reverced.length; i++) {
            reverced[i] = films[films.length - 1 - i];
        }
        return reverced;
    }

    public Films[] findLastDefault() {

        Films tmp = new Films();

        int resultLength;
        if (films.length < tmp.getDataOutput()) {
            resultLength = films.length;
        } else {
            resultLength = tmp.getDataOutput();
        }

        Films[] reverced = new Films[resultLength];
        for (int i = 0; i < reverced.length; i++) {
            reverced[i] = films[films.length - 1 - i];
        }
        return reverced;
    }

}
