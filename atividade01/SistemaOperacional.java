package atividade01;

public class SistemaOperacional {
    Computador pc1 = new Computador(16, 512, 8, 3.5f);

    Programa p1 = new Programa(1, 20, 2, 2);

    public void executarPrograma(Computador pc1, Programa p1){

        if(pc1.getmemoriaRAM() < p1.getMemoriaRAMlocada()){
            System.out.println("Erro ao rodar o programa no sistema.");
        }

        if(p1.getSSDOcupado() > pc1.getSSD()){
            System.out.println("Erro ao rodar o programa no sistema.");
        }

    }
}
