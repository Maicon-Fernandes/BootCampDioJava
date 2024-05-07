public class Usuario {
        public static void main(String[] args)
    {
        SmartTv smartTv = new SmartTv();

        System.out.println("A televisão está ligada? " + smartTv.ligada);
        System.out.println("Canal : " + smartTv.canal);
        System.out.println("Volume : " + smartTv.volume);
        
        System.out.println("+----------------");
        System.out.println("Novo Estado da TV.");
        smartTv.ligar();
        System.out.println("A televisão está ligada? " + smartTv.ligada);
        smartTv.trocarCanal(30);
        System.out.println("Canal : " + smartTv.canal);
        smartTv.aumentarVolume();
        System.out.println("Volume : " + smartTv.volume);
    }
}
