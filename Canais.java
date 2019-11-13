
public class Canais implements Observer{
	
	private int Usuario;
	private String name;
	
	public Canais(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Subject s, Object o) {
		Usuario = (Integer) o;
		System.out.println("Observador "+name+" atualizado: Valor = "+Usuario);
	}

	public void Videosnovos() {
		// TODO Auto-generated method stub
		
	}

	public void attach(Canais o4) {
		// TODO Auto-generated method stub
		
	}

}
