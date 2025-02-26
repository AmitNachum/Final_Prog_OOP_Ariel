package BasicClasses;

import SearchStrategy.PriceRangeSearch;
import Services.TransactionService;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Apartment extends Property {
    private List<Apartment> subApartments;
    private Apartment parentApartment;
    private int subCount;
    private TransactionService additionalServices;

    public Apartment(int avenue, int address, double pricePerSqM, double size, boolean isSold) {
        super(address, avenue,pricePerSqM, size, isSold);
        this.subApartments = new ArrayList<>();
        this.parentApartment = null;
        this.subCount = 0;
    }


    public Apartment getParentApartment() {
        return parentApartment;
    }

    public void addSubApartment(Apartment subApartment) {
        if (subApartment == null) return;
        this.subCount++;
        if (this.subApartments == null) {
            this.subApartments = new ArrayList<>();
        }

        subApartment.parentApartment = this;

        if (!subApartments.contains(subApartment)) {
            subApartments.add(subApartment);

        }



        for (Apartment nested : subApartment.getSubApartments()) {
            addSubApartment(nested);
        }
    }




    public List<Apartment> getSubApartments() {
        return subApartments;
    }


    public double calculateTotalPrice() {
        double basePrice = this.pricePerSqM * this.size;
        return (additionalServices != null) ? basePrice+additionalServices.getCost() : basePrice;
    }


    public List<Integer> getAddress() {
        List<Integer> fullAddress = new ArrayList<>();
        if (parentApartment != null) {
            fullAddress.addAll(parentApartment.getAddress());
        }
        fullAddress.add(this.avenue);
        fullAddress.add(this.address);
        return fullAddress;
    }


    public void setSold(boolean sold) {
        this.isSold = sold;
    }

    public double getPricePerSqM() {
        return this.pricePerSqM;
    }

    public boolean isSold() {
        return this.isSold;
    }

    public double getSize() {
        return this.size;
    }
    public int getSubCount(){
        return this.subCount;
    }


    @Override
    public String toString() {
        return "Address: " + getAddress() + ", Price per m²: " + pricePerSqM + "$, Size: " + size + " m², " +
                "Total Price : " + calculateTotalPrice() +"$" + " Status: " + (isSold ? "Sold" : "For Sale") + ", Sub-apartments: " + getSubCount();
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Apartment other = (Apartment) obj;
        return Objects.equals(this.getAddress(), other.getAddress()); // Compare addresses
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getAddress());
    }



}












