import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.event.ActionEvent;

public class SpotifyInternational extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpotifyInternational frame = new SpotifyInternational();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SpotifyInternational() {
		getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 25));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 692);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel albumLabel = new JLabel("ENGLISH ALBUM");
		albumLabel.setForeground(Color.BLACK);
		albumLabel.setFont(new Font("Times New Roman", Font.BOLD, 60));
		albumLabel.setBounds(240, 79, 523, 70);
		getContentPane().add(albumLabel);
		
		JLabel albumImg = new JLabel("");
		albumImg.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\english album2.jpg"));
		albumImg.setBounds(36, 31, 175, 164);
		getContentPane().add(albumImg);
		
		JLabel lblNewLabel_2 = new JLabel("Playlist");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(240, 42, 128, 25);
		getContentPane().add(lblNewLabel_2);
		
		JLabel descriptionLabel = new JLabel(".894 likes .5 songs .15 min 42 sec");
		descriptionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		descriptionLabel.setBounds(240, 160, 257, 25);
		getContentPane().add(descriptionLabel);
		
		JButton play = new JButton("");
		play.setFont(new Font("Tahoma", Font.PLAIN, 10));
		play.setBackground(Color.RED);
		play.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\Play2.png"));
		play.setBounds(22, 227, 80, 73);
		play.setOpaque(false);
		play.setBackground(new java.awt.Color(0,0,0,1));
		play.setBorderPainted(false);
		//btnNewButton.setBackground(new java.awt.Color(0,0,0,1));
		getContentPane().add(play);
		
		JButton download = new JButton("");
		download.setFont(new Font("Tahoma", Font.PLAIN, 40));
		download.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\Download1.png"));
		download.setBounds(176, 238, 54, 51);
		download.setOpaque(false);
		download.setBackground(new java.awt.Color(0,0,0,1));
		download.setBorderPainted(false);
		getContentPane().add(download);
		
		JButton more = new JButton("");
		more.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\more option1.png"));
		more.setBounds(240, 256, 46, 25);
		more.setOpaque(false);
		more.setBackground(new java.awt.Color(0,0,0,1));
		more.setBorderPainted(false);
		getContentPane().add(more);
		
		JButton likes = new JButton("");
		likes.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\like.png"));
		likes.setBounds(112, 238, 54, 47);
		likes.setOpaque(false);
		likes.setBackground(new java.awt.Color(0,0,0,1));
		likes.setBorderPainted(false);
		getContentPane().add(likes);
		
		JLabel no = new JLabel("#");
		no.setFont(new Font("Times New Roman", Font.BOLD, 25));
		no.setBounds(36, 331, 22, 14);
		getContentPane().add(no);
		
		JLabel title = new JLabel("Title");
		title.setFont(new Font("Times New Roman", Font.BOLD, 25));
		title.setBounds(93, 320, 54, 36);
		getContentPane().add(title);
		
		JLabel singer = new JLabel("Singer");
		singer.setFont(new Font("Times New Roman", Font.BOLD, 25));
		singer.setBounds(278, 320, 98, 36);
		getContentPane().add(singer);
		
		JLabel album = new JLabel("Album");
		album.setFont(new Font("Times New Roman", Font.BOLD, 25));
		album.setBounds(509, 320, 98, 36);
		getContentPane().add(album);
		
		JLabel time = new JLabel("");
		time.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\Time.png"));
		time.setBounds(724, 320, 32, 36);
		getContentPane().add(time);
		
		JButton song1 = new JButton("1       Call me When You Want                      Lil Nas X                              MONTERO                                               3.09");
		song1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				InputStream in;
				try{
			        File f = new File("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\music\\call me when you want.wav");
			        Clip clip = AudioSystem.getClip();
			        AudioInputStream ais = AudioSystem.getAudioInputStream(f);
			        clip.open(ais);
			        boolean playing = true;
					if(playing == true)
			        {
			            clip.stop(); // <- Doesnt stop the song
			        } 
			        clip.loop(Clip.LOOP_CONTINUOUSLY);

			    }catch(Exception exception){System.out.println("Failed To Play The WAV File!");}
			}
		});
		song1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		song1.setBounds(10, 390, 780, 36);
		song1.setOpaque(false);
		song1.setBackground(new java.awt.Color(0,0,0,1));
		//btnNewButton_4.setBorderPainted(false);
		getContentPane().add(song1);
		
		JButton song2 = new JButton("2        Devil Eyes                                       Hippie Sabotage                          Providence                                             2.16");
		song2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputStream in;
				try{
			        File f = new File("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\music\\devil eyes.wav");
			        Clip clip = AudioSystem.getClip();
			        AudioInputStream ais = AudioSystem.getAudioInputStream(f);
			        clip.open(ais);
			        boolean playing = true;
					if(playing == true)
			        {
			            clip.stop(); // <- Doesnt stop the song
			        } 
			        clip.loop(Clip.LOOP_CONTINUOUSLY);

			    }catch(Exception exception){System.out.println("Failed To Play The WAV File!");}
			}
		});
		song2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		song2.setBounds(10, 429, 780, 36);
		song2.setOpaque(false);
		song2.setBackground(new java.awt.Color(0,0,0,1));
		getContentPane().add(song2);
		
		JButton song3 = new JButton("3        Everything at once                                    Lenka                        Two (Expanded Edition)                                  4.02");
		song3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputStream in;
				try{
			        File f = new File("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\music\\everything at once.wav");
			        Clip clip = AudioSystem.getClip();
			        AudioInputStream ais = AudioSystem.getAudioInputStream(f);
			        clip.open(ais);
			        boolean playing = true;
					if(playing == true)
			        {
			            clip.stop(); // <- Doesnt stop the song
			        } 
			        clip.loop(Clip.LOOP_CONTINUOUSLY);

			    }catch(Exception exception){System.out.println("Failed To Play The WAV File!");}
			}
		});
		song3.setOpaque(false);
		song3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		song3.setBackground(new Color(0, 0, 0, 1));
		song3.setBounds(10, 467, 780, 36);
		getContentPane().add(song3);
		
		JButton song4 = new JButton(" 4               Peaches                                     Justin Bieber                             Justice                                                   3.17");
		song4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputStream in;
				try{
			        File f = new File("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\music\\peaches.wav");
			        Clip clip = AudioSystem.getClip();
			        AudioInputStream ais = AudioSystem.getAudioInputStream(f);
			        clip.open(ais);
			        boolean playing = true;
					if(playing == true)
			        {
			            clip.stop(); // <- Doesnt stop the song
			        } 
			        clip.loop(Clip.LOOP_CONTINUOUSLY);

			    }catch(Exception exception){System.out.println("Failed To Play The WAV File!");}
			}
		});
		song4.setOpaque(false);
		song4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		song4.setBackground(new Color(0, 0, 0, 1));
		song4.setBounds(10, 506, 780, 36);
		getContentPane().add(song4);
		
		JButton song5 = new JButton(" 5        put your head on my shoulder                 Paul Anka                                    -                                                    2.42");
		song5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputStream in;
				try{
			        File f = new File("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\music\\put your head on my shoulder.wav");
			        Clip clip = AudioSystem.getClip();
			        AudioInputStream ais = AudioSystem.getAudioInputStream(f);
			        clip.open(ais);
			        boolean playing = true;
					if(playing == true)
			        {
			            clip.stop(); // <- Doesnt stop the song
			        } 
			        clip.loop(Clip.LOOP_CONTINUOUSLY);

			    }catch(Exception exception){System.out.println("Failed To Play The WAV File!");}
			}
		});
		song5.setOpaque(false);
		song5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		song5.setBackground(new Color(0, 0, 0, 1));
		song5.setBounds(10, 545, 780, 36);
		getContentPane().add(song5);
	}
}
