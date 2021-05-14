
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<String>> listFuture = new ArrayList<Future<String>>(); // Khởi tạo danh sách các Future

        for (int i = 1; i <= 10; i++) {
            com.company.MyCallable myCallable = new com.company.MyCallable("Callable " + i);

            Future<String> future = executorService.submit(myCallable);
            listFuture.add(future); // Từng Future sẽ quản lý một Callable
        }

        for (Future future : listFuture) {
            try {
                System.out.println(future.get() + " kết thúc");
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        // Phương thức này đã nói ở trên đây rồi
        executorService.shutdown();
    }
}
