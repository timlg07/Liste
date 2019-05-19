public class Liste {
    private Listenelement anfang;
    
    public Liste(  ) {
    	this.anfang = new Abschluss(  );
    }
    
    // Fügt einen Knoten mit dem übergebenen Datenelement am Ende der Liste ein.
    public void endeEinfuegen( Datenelement daten ) {
    	this.anfang = this.anfang.endeEinfuegen( daten );
    }
    
    // Fügt einen Knoten mit dem übergebenen Datenelement am Anfang der Liste ein.
    public void anfangEinfuegen( Datenelement daten ) {
    	this.anfang = new Knoten( daten,this.anfang ) ;
    }
    
    // Gibt die Länge der Liste zurück.
    public int gibLaenge(  ) {
    	return this.anfang.gibLaenge();
    }
    
    // Gibt den Aufbau und Inhalt der Liste als formatierten String zurück.
    @Override
    public String toString(  ) {
    	return "[Liste] --> "+this.anfang.toString(); 
    }
    
    // Überprüft, ob ein Datenelement in der Liste vorhanden ist.
    public boolean suchen( Datenelement suchObjekt ) {
    	return this.anfang.suchen( suchObjekt );
    }
    
    // Entfernt alle Knoten mit dem exakt selben Datenelement.
    public void entfernen( Datenelement d ) {
    	this.anfang = this.anfang.entfernen( d );
    }
    
    // Entfernt und gibt das erste Element der Liste zurück (gibt 'null' zurück, wenn die Liste leer ist).
    public Datenelement anfangEntfernen(  ) {
    	Datenelement tmp = this.anfang.gibDaten();
    	this.anfang = this.anfang.gibNachfolger();
    	return tmp;
    }
    
    // Gibt das letzte Datenelement zurück (gibt 'null' zurück, wenn die Liste leer ist).
    public Datenelement endeGeben(  ) {
    	return this.anfang.endeGeben();
    }
    
    public Datenelement endeEntfernen(  ) {
    	Datenelement tmp = this.endeGeben();
    	this.entfernen( tmp );
    	return tmp;
    }
}
