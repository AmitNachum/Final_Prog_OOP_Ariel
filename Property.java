package BasicClasses;

public abstract class Property {
    protected final int address;
    protected final int avenue;
    protected double pricePerSqM;
    protected final double size;
    protected boolean isSold;


public int getAddNum(){
    return address;
}
    public int getAvenue() {
        return avenue;
    }

    public double getSize() {
        return size;
    }

    public double getPricePerSqM() {
        return pricePerSqM;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public Property(int address, int avenue, double pricePerSqM, double size, boolean isSold){
        if (address <= 0 || avenue <= 0){
            throw new IllegalArgumentException("Addresses and negative numbers are not Allowed");
        }
        this.address = address;
        this.avenue  = avenue;
        this.size = size;
        this.pricePerSqM = pricePerSqM;
        this.isSold = isSold;
    }

}
