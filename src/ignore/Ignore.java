package ignore;

public enum Ignore {
    URL("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul"),
    PASSWORD("ssg1234");

    private String msg;
    Ignore(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
