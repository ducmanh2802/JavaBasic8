public class TaiLieuDienTu extends Sach implements IDownload {
    double dungLuong;
    int luotTai;
    double giaThanh;

    public TaiLieuDienTu(int maSach, String tenSach, String NXB, int namXB, double dungLuong, int luotTai, double giaThanh) {
        super(maSach, tenSach, NXB, namXB);
        this.dungLuong = dungLuong;
        this.luotTai = luotTai;
        this.giaThanh = giaThanh;
    }

    public TaiLieuDienTu() {
        super();
    }

    public double getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(double dungLuong) {
        this.dungLuong = dungLuong;
    }

    public int getLuotTai() {
        return luotTai;
    }

    public void setLuotTai(int luotTai) {
        this.luotTai = luotTai;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhập vào dung lượng:");
        this.setDungLuong(sc.nextDouble());
        System.out.println("Nhập vào lượt tải:");
        this.setLuotTai(sc.nextInt());
        System.out.println("Nhập vào giá thành:");
        this.setGiaThanh(sc.nextDouble());
    }

    @Override
    public String toString() {
        return super.toString() + " " + dungLuong + " " + luotTai + " " + giaThanh;
    }

    @Override
    public double tongTien() {
        return giaThanh * luotTai;
    }
}
