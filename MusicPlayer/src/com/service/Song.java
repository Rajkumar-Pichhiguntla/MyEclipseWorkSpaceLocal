package com.service;

public class Song {
	private int songId;
	private String songTitle;
	private String artist;
	private double duration;
	
	public Song() {};
	public Song(int songId, String songTitle, String artist, double duration) {
		super();
		this.songId = songId;
		this.songTitle = songTitle;
		this.artist = artist;
		this.duration = duration;
	}
	public Song(String newSong,String newArtist) {
		this.songTitle=newSong;
		this.artist=newArtist;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songTitle=" + songTitle + ", artist=" + artist + ", duration=" + duration
				+ "]";
	}
	

}
