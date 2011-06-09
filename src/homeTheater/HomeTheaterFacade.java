package homeTheater;

public class HomeTheaterFacade {
	
	Amp amp;
	Dvd dvd;
	Lights lights;
	Popper popper;
	Projector projector;
	Screen screen;	
	

	public void watchMovie(){
		Popper.on();
		Lights.dim(10);
		Screen.down();
		Projector.on();
		Amp.on();
		Dvd.on();
	}
	
	public void endMovie(){
		Popper.off();
		Lights.on();
		Screen.up();
		Projector.off();
		Amp.off();
		Dvd.stop();
		Dvd.eject();		
		Dvd.off();
	}
}
