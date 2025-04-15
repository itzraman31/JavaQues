interface camera{
    void takepic();
    void recordvid();
    default void pixel(){
        System.out.println("This camera is of 24mpx");
    }
}
interface screen{
    void playgame();
    void watchmovie();
}

class iphone implements camera,screen{
    @Override
    public void takepic(){
        System.out.println("Taking pic from iPhone");
    }
    @Override
    public void recordvid(){
        System.out.println("Recroding video via iPhone");
    }
    @Override
    public void playgame(){
        System.out.println("Playing game on iPhone");
    }
    @Override
    public void watchmovie(){
        System.out.println("Watching movie on iphone");
    }
}
class vivo implements camera,screen{
    @Override
    public void takepic(){
        System.out.println("Taking pic from Vivo");
    }
    @Override
    public void recordvid(){
        System.out.println("Recroding video via Vivo");
    }
    @Override
    public void playgame(){
        System.out.println("Playing game on Vivo");
    }
    @Override
    public void watchmovie(){
        System.out.println("Watching movie on Vivo");
    }
}
public class CameraAppleVivo {
    public static void main(String[] args) {
     camera c=new iphone();
     c.takepic();   
     c.recordvid();
     c.pixel();

     screen sc=new vivo();
     sc.playgame();
     sc.watchmovie();

     iphone ip=new iphone();
     ip.watchmovie();
     ip.takepic();
     ip.pixel();

    }
}
