package Objects;

public class Cone {
    private double  raio = 6;

    private double altura = 8;

    final private double PI = 3.14;

    final private double RENDIMENTO = 3.45;

    private double nivel = 238.90;


    public double getRaio() {
        return raio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public double getNivel() {
        return nivel;
    }

    public double geratriz(){
        return (Math.sqrt((raio*raio)+(altura*altura)));
    }
    public double fundoCone(){
        return(PI*raio*raio);
    }
    public double lateralCone(){
        return (double)(PI*raio*geratriz());
    }
    public double areaTotalCone(){
        return (PI*raio*(raio+geratriz()));
    }
    public double litros(){
        return (areaTotalCone()*RENDIMENTO);
    }

    public double latas(){
        return(Math.ceil(litros()/18));
    }
    public double preco(){
        return (latas()*nivel);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Raio : ").append(raio+"\n");
        sb.append("Altura : ").append(altura+"\n");
        sb.append("Nível : ").append("1 \n");
        sb.append("Geratriz : ").append(geratriz()+"\n");
        sb.append("Área do Fundo: ").append(fundoCone()+"\n");
        sb.append("Área Lateral do Cone: ").append((lateralCone())+"\n");
        sb.append("Área Total do Cone : ").append(areaTotalCone()+"\n");
        sb.append("Litros : ").append(litros()+"\n");
        sb.append("Latas : ").append(latas()+"\n");
        sb.append("Preço Total : ").append(preco());
        return sb.toString();
    }
}

