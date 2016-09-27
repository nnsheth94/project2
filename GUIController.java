package GUI;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


//import java.util.*;

import javafx.fxml.FXML;

public class GUIController {

	ArrayList<Song> lib = readFromFile();

	public static void writeToFile(ArrayList<Song> temp) {
		try {
			PrintWriter out = new PrintWriter("src/main_APP/songLibrary.txt");

			for (Song s : temp) {
				String a = s.getName() + "  " + s.getArtist() + " " + s.getAlbum() + " " + s.getYear();
				// System.out.println("before"+ s.getName() +" " + s.getArtist()
				// +" "+s.getAlbum()+" "+s.getYear());
				out.println(a);
				// System.out.println("After"+s.getName() +" " + s.getArtist()
				// +" "+s.getAlbum()+" "+s.getYear());
			}
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static ArrayList<Song> readFromFile() {
		ArrayList<Song> lib = new ArrayList<Song>();
		try {
			Scanner scan = new Scanner(new File("src/main_APP/songLibrary.txt"));

			String str;

			while (scan.hasNextLine()) {
				str = scan.nextLine();
				if(str == null){
					break;
				}
				String[] songVar = str.split(",");
				Song song = new Song(songVar[0], songVar[1], songVar[2], songVar[3]);
				lib.add(song);

			}
			scan.close();
			/*
			 * for(Song s:lib){ System.out.println("After \n"+s.getName() +" " +
			 * s.getArtist() +" "+s.getAlbum()+" "+s.getYear()); }
			 */

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lib;
	}
}
