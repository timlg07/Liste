public class Abschluss extends Listenelement {

	// F�gt einen neuen Knoten vor sich ein.
	@Override
	public Listenelement endeEinfuegen(Datenelement daten) {
		return new Knoten( daten,this );
	}

	@Override
	public int gibLaenge(  ) {
		return 0;
	}

	@Override
	public String toString() {
		return "[Abschluss]";
	}

	// Wenn das gesuchte Element bis hierhin noch nicht gefunden wurde, ist es nicht in der Liste enthalten.
	@Override
	public boolean suchen( Datenelement suchObjekt ) {
		return false;
	}

	@Override
	public Listenelement entfernen(Datenelement d) {
		return this;
	}    
}
