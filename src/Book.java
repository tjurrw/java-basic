public class Book extends TangibleAsset{
    private String isbn;
//생성자
    public Book(String name, int price, String color, String isbn){
        super(name, price, color);
        this.isbn = isbn;
    }
//게터 메소드
    public String getIsbn(){return this.isbn;}
}