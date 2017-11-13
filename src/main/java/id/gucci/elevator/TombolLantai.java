public class TombolLantai extends Tombol {
    private int nomorLantai;
    private boolean arah;

    public TombolLantai(int nomorLantai, boolean arah) {
        this.nomorLantai = nomorLantai;
        this.arah = arah;
    }

    
    public int getNomorLantai() {
        return nomorLantai;
    }

    public boolean isArah() {
        return arah;
    }

    public void setNomorLantai(int nomorLantai) {
        this.nomorLantai = nomorLantai;
    }

    public void setArah(boolean arah) {
        this.arah = arah;
    }
    
}
