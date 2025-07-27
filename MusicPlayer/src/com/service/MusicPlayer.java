package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MusicPlayer {
	
	List<Song> allSongs=new ArrayList<>();
	List<Playlist> playlists=new ArrayList<>();
	private Playlist currentPlayingPlaylist=null;
	private Song currentPlayingSong=null;
	
	
	public List<Song> getAllSongs() {
		return allSongs;
	}

	public void setAllSongs(List<Song> allSongs) {
		this.allSongs = allSongs;
	}

	public List<Playlist> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}

	public Playlist getCurrentPlayingPlaylist() {
		return currentPlayingPlaylist;
	}

	public void setCurrentPlayingPlaylist(Playlist currentPlayingPlaylist) {
		this.currentPlayingPlaylist = currentPlayingPlaylist;
	}

	public Song getCurrentPlayingSong() {
		return currentPlayingSong;
	}

	public void setCurrentPlayingSong(Song currentPlayingSong) {
		this.currentPlayingSong = currentPlayingSong;
	}

	public void addSong(Song song) {
		allSongs.add(song);
	}
	
	public void updateSong(String oldSong,Song newSong) {
		for(Song song:allSongs) {
			if(song.getSongTitle().equalsIgnoreCase(oldSong)) {
				song.setSongId(newSong.getSongId());
				song.setSongTitle(newSong.getSongTitle());
				song.setArtist(newSong.getArtist());
				song.setDuration(newSong.getDuration());
				System.out.println("song updates Sucessfully..");
				return;
			}
		}
		System.out.println("Song Not Found");
	}
	public void deleteSong(String s) {
		
		boolean removed=allSongs.removeIf(song-> song.getSongTitle().equalsIgnoreCase(s));
		if(removed) {
			System.out.println("Deleted Successfully");
		}
		else {
			System.out.println("Song Not Found");
		}
//		int index=0;
//		boolean found=false;
//		for(Song song:allSongs) {
//			if(song.getSongTitle().equalsIgnoreCase(s)) {
//				allSongs.remove(index);
//				System.out.println("Deleted Sucessfully..");
//				found=true;
//				break;
//			}
//			index++;
//		}
//		if(!found) {
//			System.out.println("Song Not Found");
//		}
		
	}
	
	public void displayAllSongs(){
		if(allSongs.isEmpty()) {
			System.out.println("No Songs in Music Player");
		}
		else {
			for(Song song:allSongs) {
				System.out.println("=> "+ song.getSongTitle());
			}
		}
		
	}
	public void createPlaylist(String playlistName) {
		for(Playlist p:playlists) {
			if(p.getPlaylistName().equalsIgnoreCase(playlistName)) {
				System.out.println("Playlist "+p.getPlaylistName()+" already Exists");
				return;
			}
		}
		playlists.add(new Playlist(playlists.size()+1,playlistName));
		System.out.println("PlayList "+playlistName+" created..");
	}
	public void addSongToPlaylist(String s,Song song) {
		boolean found=false;
		for(Playlist p:playlists) {
			if(p.getPlaylistName().equalsIgnoreCase(s)) {
				p.addSong(song);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("PlayList Not Found");
		}
		
	}
	
	public void deletePlaylist(String s) {
		boolean removed=playlists.removeIf(playlist-> playlist.getPlaylistName().equalsIgnoreCase(s));
		if(removed) {
			System.out.println("Deleted Playlist "+s+" Successfully");
		}
		else {
			System.out.println("Playlist Not Found");
		}
	}
	
	public void playPlaylist(String s) {
		Playlist playlist=this.getPlayList(s);
		if(playlist!=null) {
			if(currentPlayingPlaylist != null) {
				System.out.println("Already playlist Running");
			}
			else {
				playlist.displaySongs();
				System.out.println(playlist+" Songs Playing..");
			}
		}
	}
	
	public Playlist getPlayList(String name) {
		for(Playlist playlist:playlists) {
			if(playlist.getPlaylistName().equalsIgnoreCase(name)) {
				return playlist;
			}
		}
		return null;
	}
	
	
	public void displayAllPlaylists(){
		
		if(playlists.isEmpty()) {
			System.out.println("No PlayLists in Player !!");
		}
		else {
			for(Playlist pl:playlists) {
				System.out.println("-> "+pl);
			}
		}
		
	}
}
