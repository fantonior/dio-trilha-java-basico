public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv minhaSmartTv = new SmartTv();

        System.out.println("TV ligada?   :"  + minhaSmartTv.ligada);
        System.out.println("Canal atual  :"  + minhaSmartTv.canal);
        System.out.println("Volume atual :"  + minhaSmartTv.volume);

        minhaSmartTv.ligar();

        System.out.println("TV ligada?   :"  + minhaSmartTv.ligada);

        minhaSmartTv.desligar();

        System.out.println("TV ligada?   :"  + minhaSmartTv.ligada);

        minhaSmartTv.aumentarVolume();
        minhaSmartTv.aumentarVolume();
        minhaSmartTv.aumentarVolume();
        minhaSmartTv.aumentarVolume();
        minhaSmartTv.aumentarVolume();

        System.out.println("Volume atual :"  + minhaSmartTv.volume);

        minhaSmartTv.diminuirVolume();
        System.out.println("Volume atual :"  + minhaSmartTv.volume);

        minhaSmartTv.mudarCanal(10);
        System.out.println("Canal atual  :"  + minhaSmartTv.canal);

        minhaSmartTv.diminuirCanal();
        System.out.println("Canal atual  :"  + minhaSmartTv.canal);
    }  
  }
