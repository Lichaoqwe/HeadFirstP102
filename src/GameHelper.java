import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/4/28 21:25
 * @version: 1.0
 * @modified By:
 */
public class GameHelper {
    public String getUserInput(String prompt){
        String inputline = null;
        System.out.println(prompt+" ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline = is.readLine();
            if (inputline.length()==0){
                return null;
            }
        }
        catch (IOException e){
            System.out.println("IOException:"+e);

        }
        return inputline;
    }
}
