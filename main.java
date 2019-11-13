public class Main {

	 public static void main(String[] args) {
		 AlertasVideos assunto = new AlertasVideos();

		Canais o1 = new Canais("DJ Gameplays");
		Canais o2 = new Canais("Renato Garcia");
		Canais o3 = new Canais("Rezende");
		Canais o4 = new Canais("Nobrez Game");

		assunto.attach(o1);
		assunto.attach(o2);
		assunto.attach(o3);
		assunto.attach(o4);
		
		assunto.Videosnovos();
		System.out.println("------");
		assunto.attach(o3);
		

		assunto.Videosnovos();
		
	}
	
}
