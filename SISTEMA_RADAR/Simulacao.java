public class Simulacao {
     
    public static void main(String[] args) {
        Carro opala = new Carro("ACLR300", 0,  76, "Comodoro");
        
        Radar radar = new Radar("pardal", 60, "Pistão sul");
      
        opala.acelerar(); //5
        opala.acelerar(); //10
        opala.acelerar(); //15
        opala.acelerar(); //20
        opala.acelerar(); //25
        opala.acelerar(); //30
        opala.acelerar(); //35
        opala.acelerar(); //40
        opala.acelerar(); //45
        opala.acelerar(); //50
        opala.acelerar(); //55

        radar.avaliarVelocidade(opala);


        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        radar.avaliarVelocidade(opala);

    }
}
