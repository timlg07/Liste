public abstract class Listenelement {
    public Listenelement(  ){}
	public abstract Datenelement gibDaten(  );
	public abstract Listenelement gibNachfolger(  );
	public abstract Listenelement endeEinfuegen( Datenelement daten );
	public abstract int gibLaenge(  );
	public abstract String toString(  );
	public abstract boolean suchen( Datenelement suchObjekt );
	public abstract Listenelement entfernen( Datenelement d );
	public abstract Datenelement endeGeben(  );
}