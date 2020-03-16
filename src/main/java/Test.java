public class Test {
    public static void main(String[] args) {

         new Thread(new Runnable(){
             public void run() {
                 System.out.println();
                 System.out.println("-----------");
                 System.out.println("-----------");


             }
         }).start();

    }
}
