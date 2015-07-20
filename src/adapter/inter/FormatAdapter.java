package adapter.inter;

public class FormatAdapter implements MediaPlayer{

	private MediaPackage media;
	
	public FormatAdapter(MediaPackage _media){
		media = _media;
	}
	
	@Override
	public void play() {
		System.out.print("Using Adapter - ");
		media.playFile();
	}
	
}
