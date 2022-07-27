public class Main {
    public static void main(String[] args) {
        Book title = new Book("吾輩は猫である");
        title.titleCall();

        title.setTitle("誰が為に鐘はなる");
        title.titleCall();
    }
}
