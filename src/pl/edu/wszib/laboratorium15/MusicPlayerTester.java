package pl.edu.wszib.laboratorium15;

public class MusicPlayerTester {
    public static void main(String[] args) {
        Song[] library=new Song[3];
        library[0]=new Song("Michal Jackson","Beat It","Thriller");
        library[1]=new Song("Anna","Dumb","Krey");
        library[2]=new Song("Samss","Loney","Hyro");

        Player[] players={new MP3(library),new CD(library)};
        players[0].play();

        System.out.println();
        players[0].next();
    }
}
