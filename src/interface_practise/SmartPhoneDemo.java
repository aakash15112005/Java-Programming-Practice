package interface_practise;

interface Camera{
	void takePhoto();
}
interface MusicPlayer{
	void playMusic();
}
class SmartPhone implements Camera,MusicPlayer{
	public void takePhoto() {
		System.out.println("Taking a photo...");
		}
	public void playMusic() {
		System.out.println("Playing music...");
	}
}
public class SmartPhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone sm = new SmartPhone();
		sm.takePhoto();
		sm.playMusic();
	}

}
