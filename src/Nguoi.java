public class Nguoi {
    private String HoTen;
    private int Tuoi;
    private int NamSinh;
    private String NgheNghiep;
    public Nguoi(String hoTen, int tuoi, int namSinh, String ngheNghiep){
        setHoTen(hoTen);
        setTuoi(tuoi);
        setNamSinh(namSinh);
        setNgheNghiep(ngheNghiep);

    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public String getNgheNghiep() {
        return NgheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        NgheNghiep = ngheNghiep;
    }
    public void HienThiThanhVien(){
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Tuổi: "+getTuoi());
        System.out.println("Năm sinh: "+getNamSinh());
        System.out.println("Nghề nghiệp: "+getNgheNghiep());
    }
}
