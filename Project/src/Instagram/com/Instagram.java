package Instagram.com;


interface Photoedit{
	void resize();
	void crop();
	void addFile();	
}

interface Videoedit{
	void trim();
	void addAudio();
	void changeSpeed();	
}
abstract class  Post{
	abstract void like(); 
	abstract void comment() ;
	abstract void share();

}

class Photo extends Post implements Photoedit{

	double size;
	int reso;
	String type;

	void post() {
		System.out.println("your photos is posted");

	}

	@Override
	public void resize() {
		System.out.println("you can resize the photos");

	}

	@Override
	public void crop() {
		System.out.println("you can crop the photos");

	}

	@Override
	public void addFile() {
		System.out.println("you can add filter in photos");

	}

	@Override
	void like() {
		System.out.println("You can like the photos");

	}

	@Override
	void comment() {
		System.out.println("You can comment on photos");

	}

	@Override
	void share() {
		System.out.println("You can share the photos");

	}

}
class Video extends Post implements Videoedit{

	double size;
	int duration;
	String quality;

	void minute(double size,int duration,String quality) {

	}
	void post() {
		System.out.println("Your Video is Posted");
	}


	public void trim() {
		System.out.println("You can trim the video");

	}

	public void addAudio() {
		System.out.println("You can add the Audio");

	}

	@Override
	public void changeSpeed() {
		System.out.println("You can change the Speed of the video");

	}

	@Override
	void like() {
		System.out.println("You can like the video");

	}

	@Override
	void comment() {
		System.out.println("You can comment on vedo");

	}

	@Override
	void share() {
		System.out.println("you can share the video");
	}

}
public class Instagram {
	public static void main(String[] args) {
		Photo obj1= new Photo();
		Video obj2=new Video();
		obj1.resize();
		obj1.crop();
		obj1.addFile();
		obj1.post();
		obj1.like();
		obj1.share();
		obj1.comment();
		System.out.println("<<<==================>>>");
		obj2.trim();
		obj2.addAudio();
		obj2.changeSpeed();
		obj2.post();
		obj2.like();
		obj2.comment();
		obj2.share();


	}

}
