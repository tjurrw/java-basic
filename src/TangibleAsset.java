public class TangibleAsset {
    private String name;
    private int price;
    private String color;

    //생성자
    public TangibleAsset(String name, int price, String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }
    //게터 메소드
    public String getName(){return this.name;}
    public int getPrice(){return this.price;}
    public String getColor(){return this.color;}
}
