package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	private int id;
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(String title) {
		super();
		this.id = ++nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.id = ++nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.director = director;
		this.id = ++nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.director = director;
		this.length = length;
		this.id = ++nbDigitalVideoDiscs;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public int getId() {
		return id;
	}

	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

	// 6
	public boolean isMatch(String title) {
		return this.getTitle().equalsIgnoreCase(title);
	}

	public String toString() {
		return "DVD - Title: " + getTitle() + " - Category: " + getCategory() + " - Director: " + director + " - Length: "
				+ length + " - Price: $" + getCost();
	}

}
