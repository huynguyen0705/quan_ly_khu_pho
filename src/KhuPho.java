public class KhuPho {
    private int SoHo;
    private HoGiaDinh[] DsHoGd;
    public KhuPho(){

    }

    public KhuPho(int soHo) {
        SoHo = soHo;
        DsHoGd = new HoGiaDinh[soHo];
    }
    public void ThemHoDan(HoGiaDinh hoGiaDinh){
        for (int i = 0; i < DsHoGd.length; i++){
            DsHoGd[i] = hoGiaDinh;

        }
    }

    public void HienThiKhuPho(){
        for (int i = 0; i < DsHoGd.length; i++){
            System.out.println("Thông tin hộ thứ " + (i + 1));
            DsHoGd[i].HienThiHoGd();
        }
    }

}
