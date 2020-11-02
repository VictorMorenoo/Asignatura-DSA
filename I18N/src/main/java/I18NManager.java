import java.util.HashMap;
import java.util.ResourceBundle;



//Singleton
public class I18NManager
{
    private static I18NManager manager;
    //data

    //List<String>
    /* HashMap<String, String> dataCAT;
    HashMap<String, String> dataES;
    HashMap<String, String> dataEN;
     */

    HashMap<String, ResourceBundle> data;

    private I18NManager()
    {
        /* this.dataCAT = new HashMap<String, String();
        this.dataCAT.put("l1","hola");
         */
        this.data = new HashMap<String, ResourceBundle>();

        ResourceBundle es = ResourceBundle.getBundle("es");
        ResourceBundle en = ResourceBundle.getBundle("en");
        ResourceBundle ca = ResourceBundle.getBundle("ca");

        this.data.put("es",es);
        this.data.put("ca",ca);
        this.data.put("en",en);
    }

    public static I18NManager getInstance()   // Unica instancia que gestionaremos
    {
        if (manager==null) manager = new I18NManager();
        return manager;
    }

    public String getText(String lenguage,String key)  //Metodo
    {
        String result = null;       //Estructura de datos que hemos inicializado
        result = this.data.get(lenguage).getString(key);

        return result;
    }

    public static void main(String[] args)
    {
        String msg1 = I18NManager.getInstance().getText("ca","l2");
        String msg2 = I18NManager.getInstance().getText("es","l2");

        System.out.println(msg1);
        System.out.println(msg2);




      /*  String msg3 = I18NManager.getInstance().getText("en","l1");
        String msg4 = I18NManager.getInstance().getText("ca","l2");
        String msg5 = I18NManager.getInstance().getText("es","l3");
        String msg6 = I18NManager.getInstance().getText("en","l3");*/

    }
}
