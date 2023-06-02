import java.security.PublicKey;
import java.util.ArrayList;

public class HoGiaDinh {
    private int SoNha;
    private int SoThanhVien;
    private ArrayList<Nguoi> DsThanhVien ;
    public HoGiaDinh(int soNha, int soThanhVien){
        setSoNha(soNha);
        setSoThanhVien(soThanhVien);
        DsThanhVien = new ArrayList<>();
    }

    public ArrayList<Nguoi> getDsThanhVien() {
        return DsThanhVien;
    }

    public void setDsThanhVien(ArrayList<Nguoi> dsThanhVien) {
        DsThanhVien = dsThanhVien;
    }

    public int getSoNha() {
        return SoNha;
    }

    public void setSoNha(int soNha) {
        SoNha = soNha;
    }

    public int getSoThanhVien() {
        return SoThanhVien;
    }
    public void ThemThanhVien(Nguoi nguoi){
        DsThanhVien.add(nguoi);
    }

    public void setSoThanhVien(int soThanhVien) {
        SoThanhVien = soThanhVien;
    }
    public void HienThiHoGd(){
        for (int i = 0; i <DsThanhVien.size(); i++){
            System.out.println("Thông tin hộ thứ " + (i + 1));
            DsThanhVien.get(i).HienThiThanhVien();
        }

    }
}
