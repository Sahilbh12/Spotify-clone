import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SpotifyFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpotifyFrame2 frame = new SpotifyFrame2();
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
	public SpotifyFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 692);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel choose = new JLabel("What music do you like?");
		choose.setForeground(new Color(0, 0, 0));
		choose.setFont(new Font("Times New Roman", Font.BOLD, 40));
		choose.setBounds(166, 11, 424, 104);
		contentPane.add(choose);
		
		JButton hindi = new JButton("");
		hindi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SpotifyHindi sptHindi = new SpotifyHindi();
				sptHindi.setVisible(true);
			}
		});
		hindi.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\hindi3.png"));
		hindi.setBounds(294, 191, 186, 97);
		contentPane.add(hindi);
		
		JButton international = new JButton("");
		international.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SpotifyInternational sptInternational = new SpotifyInternational();
				sptInternational.setVisible(true);
			}
		});
		international.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\international3.png"));
		international.setBounds(532, 191, 186, 97);
		contentPane.add(international);
		
		JButton tamil = new JButton("");
		tamil.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\tamil3.png"));
		tamil.setBounds(532, 487, 186, 91);
		contentPane.add(tamil);
		
		JButton punjabi = new JButton("");
		punjabi.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\punjabi3.png"));
		punjabi.setBounds(532, 338, 186, 91);
		contentPane.add(punjabi);
		
		JButton malayalam = new JButton("");
		malayalam.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\malayalam3.png"));
		malayalam.setBounds(51, 344, 180, 85);
		contentPane.add(malayalam);
		
		JButton marathi = new JButton("");
		marathi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SpotifyMarathi sptMarathi = new SpotifyMarathi();
				sptMarathi.setVisible(true);
			}
		});
		marathi.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\marathi3.png"));
		marathi.setBounds(51, 191, 180, 91);
		contentPane.add(marathi);
		
		JButton gujarati = new JButton("");
		gujarati.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\gujrati3.png"));
		gujarati.setBounds(294, 487, 180, 91);
		contentPane.add(gujarati);
		
		JButton bengali = new JButton("");
		bengali.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\bengali3.png"));
		bengali.setBounds(51, 493, 180, 85);
		contentPane.add(bengali);
		
		JButton hiphop = new JButton("");
		hiphop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SpotifyHiphop sptHiphop = new SpotifyHiphop();
				sptHiphop.setVisible(true);
			}
		});
		hiphop.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\hiphop2.png"));
		hiphop.setBounds(324, 320, 130, 126);
		contentPane.add(hiphop);
		
		JLabel searchImg = new JLabel("");
		searchImg.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\search4.png"));
		searchImg.setBounds(188, 93, 81, 70);
		contentPane.add(searchImg);
		
		search = new JTextField();
		search.setBounds(279, 109, 265, 33);
		contentPane.add(search);
		search.setColumns(10);
	}
}
