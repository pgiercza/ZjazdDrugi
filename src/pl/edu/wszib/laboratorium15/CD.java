package pl.edu.wszib.laboratorium15;

public class CD extends MusicPlayer{

    public CD(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("CD odtwarza..."+getCurrentSong());
    }

    @Override
    public void pauseStop() {
        System.out.println("CD Paza/Stop");
    }
}
