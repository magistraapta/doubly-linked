public class App {
    public static void main(String[] args) throws Exception {
        linked x = new linked();

        x.tambahDepan("kambing");
        x.tambahDepan("sapi");
        x.tambahDepan("kerbau");
        x.tambahDepan("singa");
        x.tambahDepan("gajah");
        x.hapusNilai("kerbau");
        x.print();

    }
}
