package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Playlist implements Playable{
	private int playlistId;
	private String playlistName;
	List<Song> songs=new ArrayList<>();
	
	
	
	public Playlist() {}
	
	public Playlist(int id, String playlistName) {
		this.playlistId=id;
		this.playlistName=playlistName;
	}

	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	public int getPlaylistId() {
		return playlistId;
	}
	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}
	public String getPlaylistName() {
		return playlistName;
	}
	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}
	
	public Song getSong(String name) {
		for(Song song:songs) {
			if(song.getSongTitle().equalsIgnoreCase(name)) {
				return song;
			}
		}
		return null;
	}
	public void addSong(Song song) {
		 for(Song s:songs) {
			 if(s.getSongTitle().equalsIgnoreCase(song.getSongTitle())) {
				 System.out.println("Song Already Exists in Playlist.. Try to add Different Songs");
				 return;
			 }
		 }
		 songs.add(song);
		 System.out.println(song.getSongTitle()+" Song added to PlayList Sucessfully!!");
	}
	
	public void removeSong(String songName) {
		boolean removed=songs.removeIf(song-> song.getSongTitle().equalsIgnoreCase(songName));
		if(removed) {
			System.out.println("Song Removed from playlist");
		}
		else {
			System.out.println("Song not found");
		}
	}
	
	public void displaySongs(){
		if(songs.isEmpty()) {
			System.out.println("No Songs in playlist , Please Add songs");
		}
		else {
			for(Song song:songs) {
				
				System.out.println("=>"+song.getSongTitle());
			}
		}
		
	}

	@Override
	public void play(String title) {
		for(Song song:songs) {
			if(song.getSongTitle().equalsIgnoreCase(title.trim())) {
					System.out.println(song.getSongTitle() +" Playing ....");
				}
				return;
			}
		System.out.println("Song not found!!");	
}
	@Override
	public void play(int songId) {
		for(Song song:songs) {
			if(song.getSongId()==songId) {
				System.out.println(song.getSongTitle() +" Playing ....");
				return;
			}
		}
		System.out.println("Song not found!!");
		
	}

	@Override
	public void pause(String title) {
		System.out.println(title+" Song Paused..");
		
	}

	@Override
	public void pause(int songId) {
		System.out.println("Song with ID "+songId+" paused..");
		
	}

	@Override
	public void stop(String title) {
		System.out.println(title+" stopped..");
		
	}

	@Override
	public void stop(int songId) {
		System.out.println("Song stopped...");
		
	}
	@Override
	public String toString() {
		return "Playlist [playlistId=" + playlistId + ", playlistName=" + playlistName + ", songs=" + songs + "]";
	}
	
	

}
