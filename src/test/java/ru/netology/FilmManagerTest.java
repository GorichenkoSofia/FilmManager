package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void rememberFilms() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void EqualsLimit() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";
        String film10 = "Movie 10";


        FilmManager manager = new FilmManager(10);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void GetLastUpperLimit() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";
        String film10 = "Movie 10";


        FilmManager manager = new FilmManager(5);


        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);


        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6,};


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void GetLastUnderLimit() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";


        FilmManager manager = new FilmManager(10);


        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);


        String[] actual = manager.findLast();
        String[] expected = {film5, film4, film3, film2, film1};


        Assertions.assertArrayEquals(expected, actual);

    }
}
