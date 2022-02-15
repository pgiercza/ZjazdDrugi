package pl.edu.wszib.laboratorium15;

public class MP3 extends MusicPlayer{

    public MP3(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("Mp3 odtwarza..."+getCurrentSong());
    }

    @Override
    public void pauseStop() {
        System.out.println("Mp3 Paza/Stop");
    }

}
