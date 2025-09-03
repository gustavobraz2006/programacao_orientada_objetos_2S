package atividade01;

public class Programa {
    private Integer memoriaRAMAlocada;
    private Integer SSDOcupado;
    private Integer nucleos;
    private Integer quantidadeOperacoes;

        public Programa(Integer memoriaRAMAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeOperacoes){
            this.memoriaRAMAlocada = memoriaRAMAlocada;
            this.SSDOcupado = SSDOcupado;
            this.nucleos = nucleos;
            this.quantidadeOperacoes = quantidadeOperacoes;
        }

        public Integer getMemoriaRAMlocada(){
            return this.memoriaRAMAlocada;
        }
        
        public Integer getSSDOcupado(){
            return this.SSDOcupado;
        }

        public Integer getNucleos(){
            return this.nucleos;
        }

        public Integer getQuantidadeOperacoes(){
            return this.quantidadeOperacoes;
        }
}