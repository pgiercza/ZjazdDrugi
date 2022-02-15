package pl.edu.wszib.laboratorium15;


abstract class MusicPlayer implements Player {

    private Song[] library;
    private int current=0;

    public MusicPlayer(Song[] library) {
        this.library = library;
    }

    public Song getCurrentSong(){
        return library[current];
    }

    @Override
    public void next() {
        if (++current>= library.length){
            current=0;
        }
        play();

    }

    @Override
    public void previous() {
        if (--current< library.length){
            current=library.length-1;
        }
    }


}
