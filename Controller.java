public class Controller {
	
	public static void main( String[]tanga ) {
		Liste l = new Liste(  );
		// Liste füllen
		Datenelement d = new Datenelement( 2 );
		l.endeEinfuegen( d );
		l.endeEinfuegen( new Datenelement( 3 ) );
		l.anfangEinfuegen( new Datenelement( 1 ) );
		l.endeEinfuegen( new Datenelement( 2 ) );
		
		ListeAusgeben( l );
		
		// alle (d:2) werden entfernt
		l.entfernen( d );
		
		ListeAusgeben( l );
		
		// Das erste Element wird aus der Liste entfernt und ausgegeben
		System.out.println( l.anfangEntfernen().toString() );
		
		ListeAusgeben( l );
	}
	
	public static void ListeAusgeben( Liste l ) {
		System.out.println( "Länge:"+l.gibLaenge()+" |  Aufbau: "+l.toString() );
	}
}
