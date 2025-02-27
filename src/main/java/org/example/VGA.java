package org.example;

public class VGA extends Colokan{
    public VGA(int harga, int promisedBandwidth, String merk) {
        super(merk, promisedBandwidth, harga);
    }

    @Override
    public double getRealBandwidth() {
        int hargaPasar = 30000;
        int hargaJual = super.getHarga();
        double rasio = hargaPasar / hargaJual;
        if (rasio > 1) {
            return rasio * super.getPromisedBandwidth();
        }else{
            return super.getPromisedBandwidth();
        }
    }
}
