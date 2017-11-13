public class KontrolElevator{
	private int idLantai;
	private int posisi;

    public KontrolElevator(int idLantai, int posisi) {
        this.idLantai = idLantai;
        this.posisi = posisi;
    }

    public int getIdLantai() {
        return idLantai;
    }

    public void setIdLantai(int idLantai) {
        this.idLantai = idLantai;
    }

    public int getPosisi() {
        return posisi;
    }

    public void setPosisi(int posisi) {
        this.posisi = posisi;
    }
        
    
}