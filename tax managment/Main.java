public class Main {
    public static void main(String[] args) {
        Button b = windowFactory.getwindowComponent("Button");
        System.out.println(b.createButton());
    }
}
