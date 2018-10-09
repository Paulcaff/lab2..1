import javax.swing.*;
import java.awt.*;

public class Film {
    private String title;
    private String director;
    private int duration;
    private int filmcounter = 0 ;
//accessor methods
    /**
     *
     * @return The
     */
    public int getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public int getFilmcounter() {
        return filmcounter;
    }

    //Mutator methods
    /**
     *
     * @param director The director of the Film object
     */
    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Film(String title, String director, int duration) {
        setTitle(title);
        setDirector(director);
        setDuration(duration);
        filmcounter ++;
    }

    /**
     *
     */
    public Film() {
        this.title = "None";
        this.director = "None";
        this.duration = 0;
    }

    public String toString() {
        return "\nTitle :" + title + "\nDirector :" + director + "\nDuration : " + duration;
    }

    public static void displayFilms(int number,Film[] catalog) {
        Film film3 = new Film();
        JTextArea jta = new JTextArea();
        Font font = new Font("monospaced", Font.PLAIN, 12);


        for (int i = 0; i < number; i++) {

            film3 = catalog[i];

            System.out.println(film3.getTitle());


           jta.append(film3.toString());


        }

        JOptionPane.showMessageDialog(null,jta);
    }
}
