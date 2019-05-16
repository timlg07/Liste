public class Abschluss extends Listenelement {

	@Override
	public Listenelement endeEinfuegen(Datenelement daten) {
		return new Knoten( daten,this );
	}

	@Override
	public int gibLaenge(  ) {
		return 0;
	}
}
