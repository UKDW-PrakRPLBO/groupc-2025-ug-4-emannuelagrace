package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public int getResolution(){
        return maxResolusi;
    }

    public TV(int maxResolusi){
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan) {
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

}
