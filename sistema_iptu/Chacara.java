package sistema_iptu;

public class Chacara extends Imovel{
    
    private Boolean possuiPocoArtesiano;

    public Chacara(Boolean possuiPocoArtesiano, Double areaM2, Municipio municipio, Integer vagas) {
        super(areaM2, municipio, vagas);
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }

    public Boolean getPossuiPocoArtesiano() {
        return possuiPocoArtesiano;
    }

    public void setPossuiPocoArtesiano(Boolean possuiPocoArtesiano) {
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }
}
