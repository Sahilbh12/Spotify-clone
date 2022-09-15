import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class SpotifyMarathi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpotifyMarathi frame = new SpotifyMarathi();
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
	public SpotifyMarathi() {
		getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 25));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 692);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel albumLabel = new JLabel("MARATHI ALBUM");
		albumLabel.setForeground(Color.BLACK);
		albumLabel.setFont(new Font("Times New Roman", Font.BOLD, 60));
		albumLabel.setBounds(240, 75, 557, 70);
		getContentPane().add(albumLabel);
		
		JLabel albumImg = new JLabel("");
		albumImg.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\marathi_album2.jpg"));
		albumImg.setBounds(36, 31, 165, 159);
		getContentPane().add(albumImg);
		
		JLabel lblNewLabel_2 = new JLabel("Playlist");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(240, 39, 128, 25);
		getContentPane().add(lblNewLabel_2);
		
		JLabel descriptionLabel = new JLabel(".894 likes .5 songs .15 min 07 sec");
		descriptionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		descriptionLabel.setBounds(233, 156, 257, 25);
		getContentPane().add(descriptionLabel);
		
		JButton play = new JButton("");
		play.setBackground(Color.RED);
		play.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\Play2.png"));
		play.setBounds(22, 216, 80, 73);
		play.setOpaque(false);
		play.setBackground(new java.awt.Color(0,0,0,1));
		play.setBorderPainted(false);
		//btnNewButton.setBackground(new java.awt.Color(0,0,0,1));
		getContentPane().add(play);
		
		JButton download = new JButton("");
		download.setFont(new Font("Tahoma", Font.PLAIN, 40));
		download.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\Download1.png"));
		download.setBounds(172, 222, 54, 51);
		download.setOpaque(false);
		download.setBackground(new java.awt.Color(0,0,0,1));
		download.setBorderPainted(false);
		getContentPane().add(download);
		
		JButton more = new JButton("");
		more.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\more option1.png"));
		more.setBounds(233, 236, 46, 25);
		more.setOpaque(false);
		more.setBackground(new java.awt.Color(0,0,0,1));
		more.setBorderPainted(false);
		getContentPane().add(more);
		
		JButton likes = new JButton("");
		likes.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\like.png"));
		likes.setBounds(108, 226, 54, 47);
		likes.setOpaque(false);
		likes.setBackground(new java.awt.Color(0,0,0,1));
		likes.setBorderPainted(false);
		getContentPane().add(likes);
		
		JLabel no = new JLabel("#");
		no.setFont(new Font("Times New Roman", Font.BOLD, 25));
		no.setBounds(25, 342, 22, 14);
		getContentPane().add(no);
		
		JLabel title = new JLabel("Title");
		title.setFont(new Font("Times New Roman", Font.BOLD, 25));
		title.setBounds(82, 331, 54, 36);
		getContentPane().add(title);
		
		JLabel singer = new JLabel("Singer");
		singer.setFont(new Font("Times New Roman", Font.BOLD, 25));
		singer.setBounds(280, 331, 98, 36);
		getContentPane().add(singer);
		
		JLabel album = new JLabel("Album");
		album.setFont(new Font("Times New Roman", Font.BOLD, 25));
		album.setBounds(518, 331, 98, 36);
		getContentPane().add(album);
		
		JLabel time = new JLabel("");
		time.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\Time.png"));
		time.setBounds(731, 331, 32, 36);
		getContentPane().add(time);
		
		JButton song1 = new JButton("1       Jinklo                          D'Evil & Karan Kanchan               Just Neel Things                      1.47");
		song1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				InputStream in;
				try{
			        File f = new File("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\music\\Jinklo.wav");
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
		song1.setBounds(10, 397, 779, 36);
		song1.setOpaque(false);
		song1.setBackground(new java.awt.Color(0,0,0,1));
		//btnNewButton_4.setBorderPainted(false);
		getContentPane().add(song1);
		
		JButton song2 = new JButton("2       Rani Phadkti                Ajay Purkar & Ashutosh Mungle                   Fatteshikast            4.04");
		song2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputStream in;
				try{
			        File f = new File("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\music\\rani-phadkti.wav");
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
		song2.setBounds(10, 436, 779, 36);
		song2.setOpaque(false);
		song2.setBackground(new java.awt.Color(0,0,0,1));
		getContentPane().add(song2);
		
		JButton song3 = new JButton("3        Shivba Raje                                Avdhoot Gandi                     Sher Shivraj                    3.53");
		song3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputStream in;
				try{
			        File f = new File("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\music\\shivba-raje.wav");
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
		song3.setBounds(10, 473, 779, 36);
		getContentPane().add(song3);
		
		JButton song4 = new JButton(" 4       Shwasat Raje               Devdutta Manisha Baji                          Pawankhind                   2.25");
		song4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputStream in;
				try{
			        File f = new File("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\music\\shwasat-raja.wav");
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
		song4.setBounds(10, 510, 779, 36);
		getContentPane().add(song4);
		
		JButton song5 = new JButton(" 5        Yugat Mandli                Devdutta Manisha Baji                 Pawankhind                         3.38");
		song5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputStream in;
				try{
			        File f = new File("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\music\\yugat-mandli.wav");
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
		song5.setBounds(10, 548, 779, 36);
		getContentPane().add(song5);
	}

}
