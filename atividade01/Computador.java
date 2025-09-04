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

    public Integer getMemoriaRAM(){
        return this.memoriaRAM;
    }

    public void setMemoriaRAM (Integer memoriaRAM){
        if(memoriaRAM != null && memoriaRAM > 0){
            this.memoriaRAM = memoriaRAM;
        }
    }

    public Integer getSSD(){
        return this.SSD;
    }

    public void setSSD(Integer SSD){
        if(SSD != null && SSD > 0){
            this.SSD = SSD;
        }
    }
    
    public Integer getNucleos(){
        return this.nucleos;
    }

    public void setNucleos(Integer nucleos){
        if(nucleos != null && nucleos > 0){
            this.nucleos = nucleos;
        }
    }

    public Float getOperacoesPSegundo(){
        return this.operacoesPorSegundos;
    }

    public void setOperacoesPSegundo(Float operacoesPorSegundos){
        if(operacoesPorSegundos != null && operacoesPorSegundos > 0){
            this.operacoesPorSegundos = operacoesPorSegundos;
        }
    }
}