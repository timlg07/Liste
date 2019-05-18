public class Knoten extends Listenelement {
    public Listenelement nachfolger;
    public Datenelement daten;

    public Knoten( Datenelement daten, Listenelement nachfolger ) {
    	this.daten = daten;
    	this.nachfolger = nachfolger;
    }

    // Nachfolgende Knoten geben eine Referenz auf sich selbst zur�ck, die Struktur der Liste wird beibehalten.
    // Hat ein Knoten einen Abschluss als Nachfolger, gibt dieser den neuen Knoten zur�ck, der somit in die Liste mit eingebunden wird.
	@Override
	public Listenelement endeEinfuegen( Datenelement daten ) {
		this.nachfolger = this.nachfolger.endeEinfuegen( daten );
		return this;
	}

	// Rekursiv erh�ht jeder Knoten die Zahl um eins.
	@Override
	public int gibLaenge(  ) {
		return this.nachfolger.gibLaenge() + 1;
	}

	@Override
	public String toString(  ) {
		return this.daten.toString() + " -> " + this.nachfolger.toString();
	}
}
