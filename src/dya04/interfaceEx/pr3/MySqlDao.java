package dya04.interfaceEx.pr3;

public class MySqlDao implements DataAccessObject{

    private final String dbName = "MySQL DB";
    @Override
    public void select() {
        System.out.println(dbName + "에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(dbName + "에서 삽입");
    }

    @Override
    public void update() {
        System.out.println(dbName + "에서 수정");
    }

    @Override
    public void delete() {
        System.out.println(dbName + "에서 삭제");
    }
}
