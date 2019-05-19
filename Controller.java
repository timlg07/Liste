public class Controller {
	
	public static void main( String[]tanga ) {
		Liste l = new Liste(  );
		// Liste füllen
		Datenelement d = new Datenelement( 2 );
		l.endeEinfuegen( d );
		l.endeEinfuegen( new Datenelement( 3 ) );
		l.anfangEinfuegen( new Datenelement( 1 ) );
		l.endeEinfuegen( new Datenelement( 2 ) );
		
		listeAusgeben( l );
		
		System.out.println( "letztes Element: " + l.endeGeben() );
		
		l.entfernen( d );
		
		listeAusgeben( l );
		
		// Das erste Element wird aus der Liste entfernt und ausgegeben
		System.out.println( "entferntes erstes Element: " + l.anfangEntfernen() );

		// Die beiden letzten Elemente werden aus der Liste entfernt und ausgegeben
		System.out.println( "entferntes letztes Element: " + l.endeEntfernen() );
		System.out.println( "entferntes letztes Element: " + l.endeEntfernen() );

		listeAusgeben( l );
		System.out.println( "letztes Element: " + l.endeGeben() );
	}
	
	public static void listeAusgeben( Liste l ) {
		System.out.println( "Länge:"+l.gibLaenge()+" |  Aufbau: "+l.toString() );
	}
}
