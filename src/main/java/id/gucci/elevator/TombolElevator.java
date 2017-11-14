package id.gucci.elevator;
public class TombolElevator extends Tombol {

    private int nomorLantai;

    public TombolElevator(int nomorLantai) {
        this.nomorLantai = nomorLantai;
    }

    
    public void setNomorLantai(int nomorLantai) {
        this.nomorLantai = nomorLantai;
    }

    public int getNomorLantai() {
        return nomorLantai;
    }

}
