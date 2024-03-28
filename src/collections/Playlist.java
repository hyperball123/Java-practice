package collections;

import java.util.LinkedList;
import java.util.Scanner;
//LINKED LIST EXAMPLE
class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}

public class Playlist {
    private LinkedList<Song> playlist;
    private int currentSongIndex;

    public Playlist() {
        playlist = new LinkedList<>();
        currentSongIndex = -1; // Initially no song is playing
    }

    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        playlist.add(newSong);
        System.out.println("Added song: " + newSong);
    }

    public void playNext() {
        if (playlist.isEmpty()) {
            System.out.println("No songs in the playlist.");
            return;
        }

        currentSongIndex = (currentSongIndex + 1) % playlist.size();
        System.out.println("Playing next song: " + playlist.get(currentSongIndex));
    }

    public void playPrevious() {
        if (playlist.isEmpty()) {
            System.out.println("No songs in the playlist.");
            return;
        }

        currentSongIndex = (currentSongIndex - 1 + playlist.size()) % playlist.size();
        System.out.println("Playing previous song: " + playlist.get(currentSongIndex));
    }

    public void printPlaylist() {
        System.out.println("Current playlist:");
        for (Song song : playlist) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add song");
            System.out.println("2. Play next song");
            System.out.println("3. Play previous song");
            System.out.println("4. Print playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = scanner.nextLine();
                    playlist.addSong(title, artist);
                    break;
                case 2:
                    playlist.playNext();
                    break;
                case 3:
                    playlist.playPrevious();
                    break;
                case 4:
                    playlist.printPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }
}
