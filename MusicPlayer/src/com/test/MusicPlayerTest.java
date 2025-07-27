package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.service.MusicPlayer;
import com.service.Playlist;
import com.service.Song;

public class MusicPlayerTest {
	
	static boolean show;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
//		Song song1=new Song(101,"Gore Gore","SS Thaman",3.24);
//		Song song2=new Song(102,"Antha Ramamayam","S.P.B",3.26);
//		Song song3=new Song(103,"Prema Vellva","Sid Sriram",4.26);
//		Song song4=new Song(104,"Poyiraa mama","Dhanush",3.20);
//		Song song5=new Song(105,"Premalo","Vijay Bilganin",4.05);
//		
//		List<Song> songList=new ArrayList<>(Arrays.asList(song1,song2,song3,song4,song5));
		
		
		Playlist playlist=new Playlist();
		
//		List<Playlist> finalPlaylist=new ArrayList<>(Arrays.asList(playlist));
		
		MusicPlayer musicPlayer=new MusicPlayer();
		while(show=true) {
			System.out.println("========= MUSIC PLAYER MENU =========");
			System.out.println("1. Add New Song\r\n"
					+ "2. Update Existing Song\r\n"
					+ "3. Delete Song\r\n"
					+ "4. Display All Songs\r\n"
					+ "5. Create New Playlist\r\n"
					+ "6. Add Song to Playlist\r\n"
					+ "7. Display All Playlists\r\n"
					+ "8. Display Songs in Playlist\r\n"
					+ "9. Play Song in Playlist\r\n"
					+ "10. Pause Song in Playlist\r\n"
					+ "11. Stop Song in Playlist\r\n"
					+ "12. Exit");
			
			System.out.println("Enter your choice : ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1: {
				System.out.println("Enter Song Details to Add :");
				System.out.println("Enter song Id :");
				int songId=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Song Name :");
				String songName=sc.nextLine();
				System.out.println("Enter Song Artist: ");
				String artist=sc.nextLine();
				System.out.println("Enter Song Duration : ");
				double duration=sc.nextDouble();
				sc.nextLine();
				musicPlayer.addSong(new Song(songId,songName,artist,duration));
				
				break;
			}
			case 2:{
				sc.nextLine();
				System.out.println("Enter Old Song name to update:");
				String oldSongName=sc.nextLine();
				boolean found=false;
				for(Song song:musicPlayer.displayAllSongs()) {
					if(song.getSongTitle().equalsIgnoreCase(oldSongName)) {
						found=true;
						System.out.println("New Song Title:");
						String newSongName=sc.nextLine();
						System.out.println("Enter Song Artist: ");
						String newArtist=sc.nextLine();
						System.out.println("Enter Song Duration : ");
						double newDuration=sc.nextDouble();
						musicPlayer.updateSong(new Song(0,newSongName,newArtist,newDuration));
						break;
					}
				}
				if(!found) {
					System.out.println("Song not Found");
				}
				
				break;
			}
			case 3:{
				sc.nextLine(); 
				System.out.println("Enter song title to delete:");
				String title=sc.nextLine();
				musicPlayer.deleteSong(title);
				break;
			}
			case 4:{
				List<Song> songs=musicPlayer.displayAllSongs();
				System.out.println(songs);
				break;
			}
			case 5:{
				sc.nextLine();
				System.out.println("Enter PlayList Id:");
				int playlistId=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Playlist Name:");
				String playlistName=sc.nextLine();
				musicPlayer.createPlaylist(playlistId,playlistName);
				break;
			}
			case 6:{
				sc.nextLine();
				System.out.println("Enter PlayList Name:");
				String playlistName=sc.nextLine();
				boolean found=false;
				for(Playlist pl:musicPlayer.displayAllPlaylists()) {
					if(pl.getPlaylistName().equalsIgnoreCase(playlistName)) {
						found=true;
						System.out.println("Enter Song Details:");
						System.out.println("Enter song Id :");
						int songId=sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Song Name :");
						String songName=sc.nextLine();
						System.out.println("Enter Song Artist: ");
						String artist=sc.nextLine();
						System.out.println("Enter Song Duration : ");
						double duration=sc.nextDouble();
						sc.nextLine();
						Song song=new Song(songId,songName,artist,duration);
						musicPlayer.addSongToPlaylist(playlistName, song);
					}
				}
				if(!found) {
					System.out.println("PlayList Not Found");
				}
				break;
			}
			case 7:{
				List<Playlist> playlists=musicPlayer.displayAllPlaylists();
				System.out.println(playlists);
				break;
			}
			case 8:{
				sc.nextLine();
				System.out.println("Enter Playlist Name:");
				String playlistName=sc.nextLine();
				boolean found=false;
				for(Playlist pl:musicPlayer.displayAllPlaylists()) {
					if(pl.getPlaylistName().equalsIgnoreCase(playlistName)) {
						playlist.displaySongs();
						found=true;
					}
				}
				if(!found) {
					System.out.println("Playlist not found");
				}
				break;
			}	
			case 9:{
				sc.nextLine();
				System.out.println("Enter Playlist name:");
				String name=sc.nextLine();
				
				Playlist playList=musicPlayer.getPlayList(name);
				if(playList!=null) {
					System.out.println("Enter Song name to play :");
					String songName=sc.nextLine();
					boolean found=false;
					for(Song song:playlist.getSongs()) {
						if(song.getSongTitle().equalsIgnoreCase(songName)) {
							playlist.play(songName);
							found=true;
							break;
						}
					}
					if(!found) {
						System.out.println("song not found");
					}
					
				}
				else { 
					System.out.println("playlist not found");
				}
				break;
			}
			case 10:
				
			case 11:
				
			case 12:
			
			default:
				System.out.println("Enter valid Choice");
			}
		
		if(choice == 12) {
			show = false;
		}
		}
	}
	
	

}
