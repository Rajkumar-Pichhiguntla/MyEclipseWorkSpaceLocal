package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.service.MusicPlayer;
import com.service.Playlist;
import com.service.Song;

public class MenuApplication {
	static boolean show;
	static boolean isSongPresent=false;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Song song1=new Song(1,"Sooseki","Shreya Ghosal",4.30);
		Song song2=new Song(2,"Ullasam","Jakes Bejoy",4.36);
		Song song3=new Song(3,"Nee Kannu Neeli Samudram","Javid Ali",4.56);
		Song song4=new Song(4,"Vachinde","Madhu Priya",3.50);
		Playlist playlist=new Playlist();
		MusicPlayer musicPlayer=new MusicPlayer();
		musicPlayer.addSong(song1);
		musicPlayer.addSong(song2);
		musicPlayer.addSong(song3);
		musicPlayer.addSong(song4);
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
//				System.out.println("Enter Song Id:");
//				int songId=sc.nextInt();
				sc.nextLine();
				System.out.println("========= Adding New Song to Music Player =========");
				System.out.println("Enter SongName:");
				String songName=sc.nextLine();
				System.out.println("Enter songArtist:");
				String artist=sc.nextLine();
				System.out.println("Enter song duration:");
				double duration=sc.nextDouble();
				sc.nextLine();
				musicPlayer.addSong(new Song(musicPlayer.getAllSongs().size()+1,songName,artist,duration));
				System.out.println("song added sucessfully");
				break;
			}
			case 2:{
				sc.nextLine();
				System.out.println("========= Updating Existing Song in Music Player =========");
				System.out.println("***Songs in Music Player***");
				musicPlayer.displayAllSongs();
				System.out.println("Choose Song to Update:");
				String oldTitle=sc.nextLine();
			
				System.out.println("Enter New Song Title");
				String newSong=sc.nextLine();
				System.out.println("Enter Song Artist:");
				String artist=sc.nextLine();
				musicPlayer.updateSong(oldTitle, new Song(newSong,artist));
				break;
			}
			case 3:{
				sc.nextLine();
				System.out.println("========= Deleting song from Music Player =========");
				System.out.println("Enter Song title to Delete:");
				String songTitle=sc.nextLine();
				musicPlayer.deleteSong(songTitle);
				break;
			}
			case 4:{
				System.out.println("========= Songs in Music Player =========");
				musicPlayer.displayAllSongs();
				break;
			}
			case 5:{
				sc.nextLine();
				System.out.println("========= Creating New Playlist =========");
				System.out.println("Enter Playlist name:");
				String newPlaylist=sc.nextLine();
				musicPlayer.createPlaylist(newPlaylist);
				break;
			}
			case 6:{
				sc.nextLine();
				System.out.println("========= Adding song to playlist =========");
				System.out.println("Available songs in Music Player :");
				musicPlayer.displayAllSongs();
				System.out.println("Enter Playlist name:");
				String playlistName=sc.nextLine();
				Playlist pl=musicPlayer.getPlayList(playlistName);
				boolean found=false;
				for(Playlist playList:musicPlayer.getPlaylists()) {
					if(playList.equals(pl)) {
						found=true;
						System.out.println("PlayList Found ");
						System.out.println("Enter Song Title to Add:");
						String songTitle=sc.nextLine();
							musicPlayer.getAllSongs().stream().filter(song-> song.getSongTitle().equalsIgnoreCase(songTitle)).findFirst().ifPresentOrElse(s-> musicPlayer.addSongToPlaylist(playlistName, s), ()-> System.out.println("Song Not Found"));
							break;
					}
				}
				if(!found) {
					System.out.println("PlayList Not found..");
				}
				
				break;
			}
			case 7:{
				musicPlayer.displayAllPlaylists();
				
				break;
			}
			case 8:{
				sc.nextLine();
				System.out.println("Enter Playlist Name:");
				String playlistName=sc.nextLine();
				Playlist pl=musicPlayer.getPlayList(playlistName);
				if(pl!=null) {
					System.out.println("Songs In "+pl.getPlaylistName()+" Playlist : ");
					pl.displaySongs();
				}
				else {
					System.out.println("PlayList Not Found!!");
				}
				break;
			}	
			case 9:{
				sc.nextLine();
				System.out.println("Enter PlayList name:");
				String plName=sc.nextLine();
				Playlist pl=musicPlayer.getPlayList(plName);
				if(pl!=null) {
					System.out.println("Enter Song Title:");
					String songName=sc.nextLine();
					pl.play(songName);
				}
				else {
					System.out.println("PlayList not Found!!");
				}
				break;
			}
			case 10:{
				sc.nextLine();
				System.out.println("Enter PlayList name:");
				String plName=sc.nextLine();
				Playlist pl=musicPlayer.getPlayList(plName);
				if(pl!=null) {
					System.out.println("Enter Song Title:");
					String songName=sc.nextLine();
					pl.pause(songName);
				}
				else {
					System.out.println("PlayList not Found!!");
				}
				break;
			}
			case 11:{
				sc.nextLine();
				System.out.println("Enter PlayList name:");
				String plName=sc.nextLine();
				Playlist pl=musicPlayer.getPlayList(plName);
				if(pl!=null) {
					System.out.println("Enter Song Title:");
					String songName=sc.nextLine();
					pl.stop(songName);
				}
				else {
					System.out.println("PlayList not Found!!");
				}
				break;
			}
				
			case 12:{
				show=false;
				break;
			}
			
			default:
				System.out.println("Enter valid Choice");
			}
		
		if(choice == 12) {
			show = false;
		}
		}
	}
}
