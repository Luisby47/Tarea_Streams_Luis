package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("E.T.", "Steven Spielberg", 1982));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 2009));
        peliculas.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", 1998));
        peliculas.add(new Pelicula("Origen", "Christopher Nolan", 2010));
        peliculas.add(new Pelicula("L.A. Confidential", "Curtis Hanson", 1997));


        List<Pelicula> peliculasSiglo21 = peliculas.stream()
                .filter(p -> p.getEstreno() >= 2000)
                .toList();

        System.out.println("Peliculas del siglo XXI:");
        peliculasSiglo21.forEach(System.out::println);


        String titulosSpielberg = peliculas.stream()
                .filter(p -> p.getDirector().equals("Steven Spielberg"))
                .map(Pelicula::getTitulo)
                .collect(Collectors.joining(", ", "Peliculas de Spielberg: ", "."));

        System.out.println(titulosSpielberg);


        List<String> titulosOrdenados = peliculas.stream()
                .map(Pelicula::getTitulo)
                .sorted()
                .toList();
        System.out.println("Titulos ordenados alfabeticamete:");
        titulosOrdenados.forEach(System.out::println);



    }

}