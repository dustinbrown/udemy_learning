import java.util.*;

/**
 * Created by dbrown on 1/25/17.
 */
public class Challenge4 {
    private static boolean forward = true;

    public static void main(String[] args) {
        LinkedList<Song> playList = new LinkedList<Song>();
        ArrayList<Album> albums = new ArrayList<Album>();

        createAlbums(albums);

        playList.add(getSongFromAlbums("jingle bells", albums));
        playList.add(getSongFromAlbums("joy", albums));
        playList.add(getSongFromAlbums("sunshine", albums));

        startPlaylist(playList);

    }

    private static void startPlaylist(LinkedList<Song> playList) {
        ListIterator playListIterator = playList.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        if (playListIterator.hasNext()) {
            Song song = (Song) playListIterator.next();
            System.out.println("Starting playlist with song: " + song.getTitle());
        } else {
            System.out.println("Playlist is empty");
        }
        while (!exit) {
            printOptions();
            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        playCurrentSong(playListIterator);
                        break;
                    case 1:
                        playNextSong(playListIterator);
                        break;
                    case 2:
                        playPreviousSong(playListIterator);
                        break;
                    case 3:
                        removeSongFromPlayList(playListIterator);
                        playNextSong(playListIterator);
                        break;
                    default:
                        System.out.println("Exiting!");
                        exit = true;
                        break;
                }
            } catch(InputMismatchException e) {
                //TODO fix this, it doesnt work how you expect
                System.out.println("Not a valid option, please select an integer");
                break;
            }

        }
    }

    private static void removeSongFromPlayList(ListIterator playListIterator) {
        Song song = getCurrentSong(playListIterator);
        System.out.println("Removing song: " + song.getTitle());
        playListIterator.remove();
    }

    private static void playCurrentSong(ListIterator playListIterator) {
        Song song = getCurrentSong(playListIterator);
        System.out.println("Playing song: " + song.getTitle());
    }

    private static Song getCurrentSong(ListIterator playListIterator) {
        Song song;
        if (! playListIterator.hasPrevious()) {
            song = (Song) playListIterator.next();
            playListIterator.previous();
        }else if (playListIterator.hasNext()) {
            if (forward) {
                song = (Song) playListIterator.previous();
                playListIterator.next();
            } else {
                song = (Song) playListIterator.next();
                playListIterator.previous();
            }
        } else {
            song = (Song) playListIterator.previous();
            playListIterator.next();

        }
        return song;
    }

    private static void playPreviousSong(ListIterator playListIterator) {
        Song previousSong;
        if (playListIterator.hasPrevious()) {
            previousSong = (Song) playListIterator.previous();
            if (forward) {
                previousSong = (Song) playListIterator.previous();
                forward = false;
            }
            System.out.println("Now playing: " + previousSong.getTitle());
        } else {
            System.out.println("At the beginning of the playlist.");
        }
    }

    private static void playNextSong(ListIterator playListIterator) {
        // TODO add repeat option
        Song nextSong;
        if (playListIterator.hasNext()) {
            nextSong = (Song) playListIterator.next();
            if (!forward) {
                nextSong = (Song) playListIterator.next();
                forward = true;
            }
            System.out.println("Now playing: " + nextSong.getTitle());
        } else {
            System.out.println("At the end of the playlist, no songs left to play");
        }

    }

    private static void printOptions() {
        System.out.println("===Select an option below===");
        System.out.println("0: Play current song");
        System.out.println("1: Play next song");
        System.out.println("2: Play previous song");
        System.out.println("3: Remove current song from playlist and skip to next");
        System.out.println("*: Any input will exit");
    }

    private static Song getSongFromAlbums(String title, ArrayList<Album> albums) {
        try {
            Album foundAlbum = albums.stream()
                    .filter(e -> (e.getSongByName(title).isPresent()))
                    .findFirst().get();
            return foundAlbum.getSongByName(title).get();
        } catch (NoSuchElementException e) {
            System.out.println("Song with title: " + title + " does not exist");
            return null;
        }
    }

    private static void createAlbums(ArrayList<Album> albums) {
        Album santa = new Album("santa");
        santa.addSong("jingle bells", 4.01);
        santa.addSong("wish you a merry christmas", 3.31);
        albums.add(santa);

        Album happy = new Album("happy");
        happy.addSong("joy", 2.55);
        happy.addSong("sunshine", 4.44);
        happy.addSong("beach", 3.45);
        albums.add(happy);
    }
}
