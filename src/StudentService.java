public class StudentService extends Person{
    @Override
    public void create() {
        System.out.println("Telebe elave edildi");
    }

    @Override
    public void read() {
        System.out.println("Telebe melumati ekrana cixarildi");
    }

    @Override
    public void update() {
        System.out.println("Telebe melumati yenilendi");
    }

    @Override
    public void delete() {
        System.out.println("Telebe melumati silindi");
    }
}
