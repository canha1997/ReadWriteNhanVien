package model;

public class NhanVien {

        private String ID;
        private String gioiTinh;
        private String Ten;
        private int luong;
        private boolean delete;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public int getLuong() {
            return luong;
        }

        public void setLuong(int luong) {
            this.luong = luong;
        }

        public boolean getDelete() {
            return delete;
        }

        public void setDelete(boolean delete) {
            this.delete = delete;
        }

        public String getTen() {
            return Ten;
        }

        public void setTen(String ten) {
            Ten = ten;
        }
    }

