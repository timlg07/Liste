public class Liste {
    public Listenelement anfang;

    public Liste(  ) {
    	this.anfang = new Abschluss(  );
    }

    public void endeEinfuegen( Datenelement daten ) {
    	this.anfang = this.anfang.endeEinfuegen( daten );
    }

    public void anfangEinfuegen( Datenelement daten ) {
    	this.anfang = new Knoten( daten,this.anfang ) ;
    }
}
