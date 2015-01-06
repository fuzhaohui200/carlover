import com.shine.carlover.utils.SendMailUtil;
import org.junit.Test;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

/**
 * Created by boka on 14-12-4.
 */
public class SendMailTest {

    private static final String SERVER_HOST = "smtp.163.com";
    private static final String SERVER_PORT = "25";
    private static final String EMAIL_LOCALHOST = "localhost";
    private static final String EMAIL_SERVER = "devboka@163.com";
    private static final String EMAIL_PASSWORD = "shboka123$";

    @Test
    public void testSend() {

        try {
            String[] recipients = {"461785260@qq.com"}; String subject = "fdsafdsafa";
            String message = "fdsafdsafdsa"; String from = "devboka@163.com";
            SendMailUtil.init(SERVER_HOST, EMAIL_LOCALHOST, EMAIL_SERVER, EMAIL_PASSWORD, true);
            SendMailUtil.getInstance().sendSSLMessage(recipients, subject, message, from);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
