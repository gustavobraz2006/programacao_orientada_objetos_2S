public class Radar {
    public Integer limiteVelocidade;
    public String modelo;
    public String localizacao;

    public Radar(String modelo, Integer limiteVelocidade, String localizacao){
        this.modelo = modelo;
        this.limiteVelocidade = limiteVelocidade;
        this.localizacao = localizacao;
    }

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de velocidade: "+ this.limiteVelocidade);
        System.out.println("Velocidade avaliada: "+ velocidadeAvaliada);
        System.out.println("Localizacao: "+ this.localizacao);
        System.out.println("Placa: "+ placa);
    }

    public void avaliarVelocidade(Carro c){
        if(c.getVelocidade() > this.limiteVelocidade){
           emitirNotificacao(c.getPlaca(), c.getVelocidade());
        }

        else if (c.getVelocidade() < this.limiteVelocidade) {                    
            System.out.println("Velocidade permitida.\n\n");
        }
    }
}
