package nsis.metier.forme;

public abstract class Forme {
	
	//Centre de la forme
	protected double centreX;
	protected double centreY;

	protected double surface;
    protected double perimetre;

	public abstract void surface();
    public abstract void perimetre();
    public abstract void afficher();
    
    public Forme(){}
    
    public Forme(double centreX, double centreY){
    	this.centreX = centreX;
    	this.centreY = centreY;
    }
    
    public void deplacer(double dx, double dy) {
		setCentreX(getCentreX()+dx);
		setCentreY(getCentreY()+dy);
	}
    
    @Override
	 public String toString(){
	 	return "x="+centreX+", y="+centreY;
	 }
    
	public double getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	}
	public double getPerimetre() {
		return perimetre;
	}
	public void setPerimetre(int perimetre) {
		this.perimetre = perimetre;
	}
    
    public double getCentreX() {
		return centreX;
	}
	public void setCentreX(double centreX) {
		this.centreX = centreX;
	}
	public double getCentreY() {
		return centreY;
	}
	public void setCentreY(double centreY) {
		this.centreY = centreY;
	}
}
