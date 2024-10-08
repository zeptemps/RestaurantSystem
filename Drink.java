class Drink extends Product {
    private static int currentDrinkId = 1; // ตัวแปรสแตติกสำหรับการสร้างไอดีอัตโนมัติ
    private String expirationDate;
    private String company;

    public Drink(String name, double price, String expirationDate, String company) {
        super(name, price);
        this.id = currentDrinkId++; // กำหนดไอดีโดยอัตโนมัติ
        this.expirationDate = expirationDate;
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + ", Expiration: " + expirationDate + ", Company: " + company;
    }
}