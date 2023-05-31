package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
	}
	public CompactDisc(String title) {
		super(title);
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public CompactDisc(String title, String category, float cost, String artist, List<Track> tracks) {
		super(title, category, cost);
		this.artist=artist;
		this.tracks=tracks;
	}
	

	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track " + track.getTitle() + " is already in the tracklist.");
        }
    }

    public boolean removeTrack(Track track) {
        if (tracks.contains(track)) {
            return tracks.remove(track);
        } else {
            System.out.println("Track " + track.getTitle() + " is not found in the tracklist.");
            return false;
        }
    }
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
}
	
