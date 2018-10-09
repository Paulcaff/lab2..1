import javax.swing.*;

public class Film {
    private String title;
    private String director;
    private int duration;
    private int filmcounter;

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
    }

    public Film() {
        this.title = "None";
        this.director = "None";
        this.duration = 0;
    }

    public String toString() {
        return "\nTitle :" + title + "\nDirector :" + director + "\nDuration : " + duration;
    }

    public void displayFilms(int number) {

        JTextArea jta = new JTextArea();

        for (int i = 0; i < number; i++) {

           catalog.append(jta);


        }

        JOptionPane.showMessageDialog(null,jta);
    }
}
