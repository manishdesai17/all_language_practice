public class windowFactory<T> {
    public static T getwindowComponent(String type) {
    Button b=null;
        if (type.equalsIgnoreCase("button")) {
            Button<Button> ob = null;
            b=new WB();
            return ob = new WB();
          
        } else if (type.equalsIgnoreCase("checkbox")) {
            checkbox<checkbox> ob = null;
            ob = new WC();
            return  ob;
        } else {
            RadioButton<RadioButton> ob = null;
            ob = new WRB();
            return  ob;
        }
        return b;


    }
}
