public class Controller {
	public static void main( String[]tanga ) {
		Liste l = new Liste(  );
		l.endeEinfuegen( new Datenelement( 2 ) );
		l.endeEinfuegen( new Datenelement( 3 ) );
		l.anfangEinfuegen( new Datenelement( 1 ) );
		System.out.println( l.gibLaenge(  ) );
	}
}
