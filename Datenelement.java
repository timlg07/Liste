public class Datenelement {
	public int beispielDaten;

    public Datenelement( int beispielDaten ) {
    	this.beispielDaten = beispielDaten;
    }

    @Override
    public String toString(  ) {
    	return "(d:"+this.beispielDaten+")";
    }
}
