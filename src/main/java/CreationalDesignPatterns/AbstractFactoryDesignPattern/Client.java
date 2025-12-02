package CreationalDesignPatterns.AbstractFactoryDesignPattern;

public class Client {
    private Button button;
    private ScrollBar scrollBar;

    public Client(UIFactory factory) {
        this.button  = factory.createButton();
        this.scrollBar = factory.createScrollBar();
    }

    public void renderUI() {
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {
        Client app = new Client(new WindowsFactory());
        app.renderUI();
    }
}
