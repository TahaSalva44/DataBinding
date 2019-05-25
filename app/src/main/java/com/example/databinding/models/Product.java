package com.example.databinding.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {

    private String title;
    private String description;
    private int productImage;
    private double productPrice;
    private double productCampaign;
    private int ratingNote;
    private float ratingPoint;
    private int serialNumber;

    public Product(String title, String description, int productImage, double productPrice, double productCampaign, int ratingNote, float ratingPoint, int serialNumber) {
        this.title = title;
        this.description = description;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productCampaign = productCampaign;
        this.ratingNote = ratingNote;
        this.ratingPoint = ratingPoint;
        this.serialNumber = serialNumber;
    }

    protected Product(Parcel in) {
        title = in.readString();
        description = in.readString();
        productImage = in.readInt();
        productPrice = in.readDouble();
        productCampaign = in.readDouble();
        ratingNote = in.readInt();
        ratingPoint = in.readFloat();
        serialNumber = in.readInt();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductCampaign() {
        return productCampaign;
    }

    public void setProductCampaign(double productCampaign) {
        this.productCampaign = productCampaign;
    }

    public int getRatingNote() {
        return ratingNote;
    }

    public void setRatingNote(int ratingNote) {
        this.ratingNote = ratingNote;
    }

    public float getRatingPoint() {
        return ratingPoint;
    }

    public void setRatingPoint(float ratingPoint) {
        this.ratingPoint = ratingPoint;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(description);
        dest.writeInt(productImage);
        dest.writeDouble(productPrice);
        dest.writeDouble(productCampaign);
        dest.writeInt(ratingNote);
        dest.writeFloat(ratingPoint);
        dest.writeInt(serialNumber);
    }

    public boolean campaingPrice(){
        if (productCampaign > 0){
            return true;
        } else {
            return false;
        }
    }

    public String quantityConvert(int quantity){
        return "Miktar " + quantity;
    }
}
