package atividade01;

public class Computador {
    private Integer memoriaRAM;
    private Integer SSD;
    private Integer nucleos;
    private Float operacoesPorSegundos;


    public Computador(Integer memoriaRAM, Integer SSD, Integer nucleos, Float operacoesPorSegundos){
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundos = operacoesPorSegundos;
    }

    public Integer getmemoriaRAM(){
        return this.memoriaRAM;
    }

    public Integer setmemoriaRAM (Integer memoriaRAM){
        if(this.memoriaRAM != null && this.memoriaRAM > 0){
            this.memoriaRAM = memoriaRAM;
        }
    }

    public Integer getSSD(){
        return this.SSD;
    }

    public Integer getNucleos(){
        return this.nucleos;
    }

    public float getOperacoesPSegundo(){
        return this.operacoesPorSegundos;
    }
}