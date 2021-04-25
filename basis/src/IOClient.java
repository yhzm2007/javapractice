import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * 实现功能：
 *
 * @author 作者[yhzm2019]
 * @version 1.0.00  2021-04-25 16:12
 */
public class IOClient {
    public static void main(String[] args) {
        // TODO 创建多个线程，模拟多个客户端连接服务端
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 3333);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();

    }
}
