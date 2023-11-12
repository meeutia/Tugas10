public abstract class Member {
    protected int poin;
    protected double totalBelanja;

    public abstract void redeemPoin(int jumlahPoin);
    public abstract int getPoin();

    public abstract double hitungTotalBayar(double jumlahBelanja);

    public abstract double hitungOngkir(int jarakTujuan);

    public abstract double hitungCicilanPerBulan(double totalBelanja, int jumlahBulan);

    public abstract void depositSaldo(int jumlahDeposit);
    public abstract void tarikTunai(int jumlahTarikTunai);
    public abstract int cekSaldo();
}
