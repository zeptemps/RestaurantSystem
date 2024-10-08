class Customer {
    protected String name;
    protected String membershipType;
    protected double points;

    public Customer(String name, String membershipType) {
        this.name = name;
        this.membershipType = membershipType;
        this.points = 0;
    }

    public void addPoints(double amountSpent) {
        if (membershipType.equals("VIP")) {
            points += (amountSpent / 20);
        } else {
            points += (amountSpent / 25);
        }
    }

    public double calculateDiscount(Product product) {
        if (product instanceof Food) {
            if (membershipType.equals("VIP")) {
                return product.getPrice() * 0.10;
            } else {
                return product.getPrice() * 0.05;
            }
        } else if (membershipType.equals("VIP")) {
            return product.getPrice() * 0.10; // VIP members get discount on drinks too
        }
        return 0; // Regular customers don't get discount on drinks
    }

    public void printCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Membership: " + membershipType);
        System.out.println("Points: " + points);
    }
}