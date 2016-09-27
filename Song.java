package GUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Song {
	private String Name;
    private String Artist;
    private String Album;
    private String Year;
    
    public Song(String name, String artist, String album, String year){
    	this.Name = name;
    	this.Artist = artist;
    	this.Album = album;
    	this.Year = year;
    }
    
    public void setName(String s){
		Name = s;
	}
	public void setArtist(String s){
		Artist = s;
	}
	public void setYear (String s){
		Year = s;
	}
	public void setAlbum(String s){
		Album = s;
	}
	public String getName(){
		return Name;
	}
	public String getArtist(){
		return Artist;
	}
	public String getYear(){
		return Year;
	}
	public String getAlbum(){
		return Album;
	}
	public String toString(){
		return " " + Name + "   "+ Artist;
	}
    
}

class SongComparator implements Comparator<Song> {
    
	public int compare(Song a1, Song a2){
		return a1.getName().toLowerCase().compareTo(a2.getName().toLowerCase());
	}
}
