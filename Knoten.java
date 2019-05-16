public class Knoten extends Listenelement {
    public Listenelement nachfolger;
    public Datenelement daten;

    public Knoten( Datenelement daten, Listenelement nachfolger ) {
    	this.daten = daten;
    	this.nachfolger = nachfolger;
    }

	@Override
	public Listenelement endeEinfuegen( Datenelement daten ) {
		this.nachfolger = this.nachfolger.endeEinfuegen( daten );
		return this;
	}
}
