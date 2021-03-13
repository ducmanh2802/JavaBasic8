public class SachGiaoKhoa extends Sach implements IKho, IMuon {
    int soTrang;
    String tinhTrang;
    int tongSoLuong;
    int soLuongMuon;

    public SachGiaoKhoa(int maSach, String tenSach, String NXB, int namXB, int soTrang, String tinhTrang, int tongSoLuong, int soLuongMuon) {
        super(maSach, tenSach, NXB, namXB);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.tongSoLuong = tongSoLuong;
        this.soLuongMuon = soLuongMuon;
    }

    public SachGiaoKhoa() {
        super();
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(int tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    @Override
    public String viTri() {
        return tinhTrang;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhập vào số trang:");
        this.setSoTrang(Integer.valueOf(sc.nextLine()));
        System.out.println("Nhập vào tình trạng:");
        this.setTinhTrang(sc.nextLine());
        System.out.println("Nhập vào tổng số lượng:");
        this.setTongSoLuong(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập vào số lượng mượn:");
        this.setSoLuongMuon(Integer.valueOf(sc.nextLine()));
    }

    @Override
    public String toString() {
        return super.toString() + " " + soTrang + " " + tinhTrang + " " + tongSoLuong + " " + soLuongMuon;
    }

    @Override
    public int tonKho() {
        return tongSoLuong - soLuongMuon;
    }
}
