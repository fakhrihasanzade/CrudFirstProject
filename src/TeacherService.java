public class TeacherService extends Person{
    @Override
    public void create() {
        System.out.println("Muellim elave edildi");
    }

    @Override
    public void read() {
        System.out.println("Muellim melumati ekrana cixarildi");
    }

    @Override
    public void update() {
        System.out.println("Muellim melumati yenilendi");
    }

    @Override
    public void delete() {
        System.out.println("Muellim melumati silindi");
    }
}
