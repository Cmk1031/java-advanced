package day01.inheritance.sealed;

public non-sealed class Manager extends Person {
    @Override
    public void work() {
        System.out.println("생산 관리");
    }
}
