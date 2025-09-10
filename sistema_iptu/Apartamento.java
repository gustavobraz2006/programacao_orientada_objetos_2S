package sistema_iptu;

public class Apartamento extends Imovel{
    
    private Boolean possuiElevador;

    public Apartamento(Boolean possuiElevador, Double areaM2, Municipio municipio, Integer vagas) {
        super(areaM2, municipio, vagas);
        this.possuiElevador = possuiElevador;
    }
    
    public Boolean getPossuiElevador() {
        return possuiElevador;
    }

    public void setPossuiElevador(Boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }

}
