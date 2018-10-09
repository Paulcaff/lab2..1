import javax.swing.*;

public class FilmDriver {
    public static void main(String[] args) {

        Film film = new Film();


        System.out.println(film.toString());

        int number =Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of movies you wish to enter into the catalog"));

        Film [] catalog = new Film[number];


        for(int i = 0; i < number; i ++){

          String  title = JOptionPane.showInputDialog(null,"Please enter the title of the movie: ");
          String  director = JOptionPane.showInputDialog(null,"Please enter the director of the movie: ");
          int duration =Integer.parseInt( JOptionPane.showInputDialog(null,"Please enter the director of the movie: "));


            Film film2 = new Film(title,director,duration);

            catalog[i]= film2;

        }

        Film.displayFilms(number,catalog);

    }
}
