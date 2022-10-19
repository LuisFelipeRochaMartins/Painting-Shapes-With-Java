package Objects;

import jdk.jfr.Experimental;

public class Cube {
    public Cube(double lado) throws Exception {
        setVolume(lado);
        setLado(lado);
    }
    private double lado;

    private double rendimento;

    private double tipo;

    private double volume;

    private double latas;

    private double preco;

    private double litros;

    private double areaTotal;

    public void setLado(double lado)throws Exception {
        if (lado>0) {
            this.lado = lado;
        }else{
            throw new Exception("Não é possível ter lados negativos ou nulos!");
        }
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento)throws Exception {
        if (rendimento >0) {
            this.rendimento = rendimento;
            setLitros(rendimento);
        }else{
            throw new Exception("Não é possível ter rendimento negativo ou nulo!");
        }
    }

    public double getTipo() {
        return tipo;
    }

    public void setTipo(double tipo){
        if (tipo==1){
            this.tipo = 101.90f;
        }if (tipo==2){
            this.tipo = 212.45f;
        }if (tipo==3){
            this.tipo = 345.56f;
        }
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double lado) {
        this.volume = lado*lado*lado;
    }

    public double getLatas() {
        setPreco(latas);
        return latas;

    }

    public void setLatas(double litros) {
        this.latas = Math.ceil(litros/18);

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double latas) {
        this.preco = latas*tipo;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double rendimento) {
        this.litros = lado*lado*6/rendimento;
        setLatas(this.litros);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Área da Base ").append(lado*lado+"\n");
        sb.append("Área Total : ").append(lado*lado*6+"\n");
        sb.append("Volume : ").append(getVolume()+"\n");
        sb.append("Diagonal do Cubo : ").append(lado*Math.sqrt(3)+"\n");
        sb.append("Litros de Tinta : ").append(getLitros()+"\n");
        sb.append("Latas de Tinta : ").append(getLatas()+"\n");
        sb.append("Valor total : R$ ").append(getPreco());
        return sb.toString();
    }
}
