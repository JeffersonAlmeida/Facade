package homeTheater;

public class HomeTesteCliente {	
	
	public static void main(String[] args) {
		
		HomeTheaterFacade facade = new HomeTheaterFacade();
		facade.watchMovie();
		System.out.println("\n\n");
		facade.endMovie();		
		
	}

}
