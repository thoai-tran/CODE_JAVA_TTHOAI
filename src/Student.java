public class Student {
    public void printPoint(){
        for (int i = 0; i < 10; i++) {
           System.out.println(i +" ");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
