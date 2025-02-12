package day02.exception02resource;

public class MyResource implements AutoCloseable{
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("[myResource] ("+ name + ") 열기");
    }

    public String read1() {
        System.out.println("[myResource] ("+ name + ") 읽기");
        return "200";
    }

    @Override
    public void close() throws Exception {
        System.out.println("[myResource] ("+ name + ") 닫기");
    }

    public String read2() {
        System.out.println("[myResource] ("+ name + ") 읽기");
        return "abc";
    }
}
