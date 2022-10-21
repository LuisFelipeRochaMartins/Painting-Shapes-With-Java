package Objects;

public class Pyramid {

    final private double lado = 13.89;

    final private double altura = 41.87;

    final private double tipo = 344.34;

    final private double RENDIMENTO = 4.76;


    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }
    public double gerarGeratriz(){
        return(Math.sqrt(lado*lado+altura*altura));
    }

    public double areaTriangulo(){
        return(((lado*2)*gerarGeratriz()/2));
    }

    public double areaBase(){
        return(lado*lado*4);
    }

    public double areaTotal(){
        return(areaBase()+(areaTriangulo()*4));
    }

    public double calcVolume(){
        return((areaBase()*altura)/3);
    }
    public double calclitros(){
        return(areaTotal()/RENDIMENTO);
    }
    public double calcLatas(){
        return(Math.ceil(calclitros()/18));
    }

    public double calcPreco(){
        return(calcLatas()*tipo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Al : ").append(lado+"\n");
        sb.append("Altura: ").append(altura+"\n");
        sb.append("Área do Triângulo : ").append(areaTriangulo()+"\n");
        sb.append("Área da Base : ").append(areaBase()+"\n");
        sb.append("Área Total : ").append(areaTotal()+"\n");
        sb.append("Volume : ").append(calcVolume()+"\n");
        sb.append("Litros : ").append(calclitros()+"\n");
        sb.append("Latas : ").append((calcLatas())+"\n");
        sb.append("Preço : ").append((calcPreco()));
        return sb.toString();
    }
}
