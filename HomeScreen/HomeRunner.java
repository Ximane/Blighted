package HomeScreen;

public class HomeRunner implements Runnable{
    
    static double n = 0;

    HomeRunner(){
        Home homePage = new Home();
        homePage.initialize();
    }

    // HomeRunner(int p){
    //     int i = 0;
    //     do{
    //         System.out.print(i*p + " ");
    //         ++i;
    //     } while(i!= 4);
    // }

    public void run(){
        // n+=6;
        // System.out.println(n + " " +  Thread.currentThread().getId());
    }
    

    public static void main(String[] args){
        Thread launchPageThread = new Thread(new HomeRunner());
        launchPageThread.start();
        
        // System.out.println(launchPageThread.isAlive());

        //Thread Practice
        // Thread altThread = new Thread(new HomeRunner(4));
        // Thread ltThread = new Thread(new HomeRunner(4));
        // Thread tThread = new Thread(new HomeRunner(4));
        // Thread hread = new Thread(new HomeRunner(4));
        // Thread read = new Thread(new HomeRunner(4));
        // Thread ead = new Thread(new HomeRunner(4));
        // altThread.run();
        // ltThread.run();
        // tThread.run();
        // hread.run();
        // read.run();
        // ead.run();


    }
}
