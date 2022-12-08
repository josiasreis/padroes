package br.com.newapp.criacao.prototype;

public abstract class FormaGeometrica {

	public int x;
    public int y;
    public String color;
    
    public FormaGeometrica() {
    }
    
    public FormaGeometrica(FormaGeometrica target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    
    public abstract FormaGeometrica clone();
}
