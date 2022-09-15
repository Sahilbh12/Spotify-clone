import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SpotifyFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpotifyFrame frame = new SpotifyFrame();
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
	public SpotifyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 692);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel IntroImage = new JLabel("");
		IntroImage.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\Spotify_opening1.jpg"));
		IntroImage.setBounds(0, 0, 800, 600);
		contentPane.add(IntroImage);
		
		JButton enterBtn = new JButton("");
		enterBtn.setBounds(0, 598, 800, 52);
		enterBtn.setOpaque(false);
		enterBtn.setBackground(new java.awt.Color(0,0,0,1));
		enterBtn.setBorderPainted(false);
		enterBtn.setBackground(new Color(230, 230, 250));
		enterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SpotifyFrame2 sptFrame = new SpotifyFrame2();
				sptFrame.setVisible(true);
			}
		});
		enterBtn.setIcon(new ImageIcon("C:\\CodeWithHarry\\JAVA course\\BasicJavaTutorial\\Spotify\\image\\spotify-button3.png"));
		contentPane.add(enterBtn);

	}

}
