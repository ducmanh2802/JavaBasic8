public class DoAn extends Sach implements IKho {
    int soTrang;
    String tinhTrang;

    public DoAn(int maSach, String tenSach, String NXB, int namXB, int soTrang, String tinhTrang) {
        super(maSach, tenSach, NXB, namXB);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
    }

    public DoAn() {
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

    @Override
    public String viTri() {
        return tinhTrang;
    }

    @Override
    public String toString() {
        return super.toString() + " " + soTrang + " " + tinhTrang;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhập vào số trang:");
        this.setSoTrang(Integer.valueOf(sc.nextLine()));
        System.out.println("Nhập vào tình trạng:");
        this.setTinhTrang(sc.nextLine());
    }
}
