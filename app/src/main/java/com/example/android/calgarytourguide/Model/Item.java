package com.example.android.calgarytourguide.Model;

public class Item {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDestination;
    private String mDescription;
    private String mDetails;
    private String mPhone;
    private int mImageResourceId = -1;

    public Item(String destination, String details, int imageResourceId) {
        mDestination = destination;
        mDetails = details;
        mImageResourceId = imageResourceId;
    }

    public Item(String destination, String description, String details, String phone) {
        mDestination = destination;
        mDescription = description;
        mDetails = details;
        mPhone = phone;
    }

    public String getDestination() {
        return mDestination;
    }

    public String getDetails() {
        return mDetails;
    }

    public String getDescription() { return mDescription; }

    public String getPhone() { return mPhone; }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasDescription() {
        if (mDescription != null) {
            return true;
        }
        return false;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPhone() {
        if(mPhone != null) {
            return true;
        }
        return false;
    }
}
