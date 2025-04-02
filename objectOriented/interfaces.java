public class interfaces {
    public static void main(String args[]) {
        Maruti800 m8 = new Maruti800();
        m8.Setcolor("Black");
        m8.SetPrice(200000);
        m8.ShowPrice();
        m8.Showcolor();
    }
}


interface car {
    void Setcolor(String color);

    void SetPrice(int price);

    void ShowPrice();

    void Showcolor();
}

class Maruti800 implements car {
    private String color;
    private int price;

    public void Setcolor(String color) {
        this.color = color;
    }

    public void SetPrice(int price) {
        this.price = price;
    }

    public void ShowPrice() {
        System.out.println(this.price);
    }

    public void Showcolor() {
        System.out.println(this.color);
    }
}