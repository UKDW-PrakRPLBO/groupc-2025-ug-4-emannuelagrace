package org.example;

public class HDMI extends Colokan {
    public HDMI(int harga, int promisedBandwidth, String merk) {
        super(merk, promisedBandwidth, harga);
    }

    @Override
    public double getRealBandwidth() {
        int hargaPasar = 50000;
        int hargaJual = super.getHarga();
        double rasio = hargaPasar / hargaJual;
        if (rasio > 1) {
            return rasio * super.getPromisedBandwidth();
        }else{
            return super.getPromisedBandwidth();
        }
    }
}