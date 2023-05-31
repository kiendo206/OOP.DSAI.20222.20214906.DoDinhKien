package hust.soict.dsai.aims.Aims;

import hust.soict.dsai.aims.media.*;
import java.util.*;

public class Aims {

	public static void main(String[] args) {
		List<Media> mediae= new ArrayList<Media>();
		CompactDisc cd = new CompactDisc("Kem", "Kpop", 0.69f);
		DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King",
				"Animation","Roger Allers", 87, 19.95f);
		Book book = new Book("Aladin",
				"Animation", 18.99f);
		mediae.add(cd);
		mediae.add(dvd);
		
		for (Media m: mediae) {
			System.out.println(m.toString());
		}
		
		
		
		

	}

}
