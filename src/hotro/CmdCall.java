package hotro;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CmdCall {
    public void call(){
        try{

            String command = "E:\\[JAVA]NetBeans\\BTL\\src\\crawlerdatawebsite\\stock_news_crawler.py";

            Process proc = Runtime.getRuntime().exec(command);

            // Read the output
            System.out.println("Reading the output");
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(proc.getInputStream()));

            String line = "";
            while((line = reader.readLine()) != null) {
                System.out.print(line + "\n");
            }

            proc.waitFor();

        }
        catch (Exception e){
            System.out.println("Smt wrong here");
            e.printStackTrace();
        }
    }
}