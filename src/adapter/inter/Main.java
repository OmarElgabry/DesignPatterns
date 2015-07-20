package adapter.inter;

public class Main {

	public static void main(String[] args) {
		
		// play mp3 file
		MediaPlayer player = new Mp3();
		player.play();
		
		// since mp4, vlc are incompatible,
		// so we need to add new media package,
		// and FormatAdapter will adapt the new media package 
		// so that incompatible formats can work as well.
		player = new FormatAdapter(new Mp4());
		player.play();
	}

}
