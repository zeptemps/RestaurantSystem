class Food extends Product {
    private static int currentFoodId = 101; // ตัวแปรสแตติกสำหรับการสร้างไอดีอัตโนมัติ
    private String type;

    public Food(String name, double price, String type) {
        super(name, price);
        this.id = currentFoodId++; // กำหนดไอดีโดยอัตโนมัติ
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}