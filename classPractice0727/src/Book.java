public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void titleCall() {
        System.out.println("本のタイトルは「" + title + "」");
    }

    public String getTitle() {
        return title;
    }

}
