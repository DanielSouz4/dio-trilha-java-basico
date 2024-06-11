public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuido para "+volume);
    }

    public void subirCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado= false;
    }

}
