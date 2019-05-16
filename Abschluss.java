public class Abschluss extends Listenelement {

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
}
