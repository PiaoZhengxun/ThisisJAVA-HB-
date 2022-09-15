package chapter14_LambdaExpressions.methodReferences.constructorReferences;

public class Member {
    private String name;
    private String id;

    public Member() {
        System.out.println("run Member();");
    }

    public Member(String id) {
        System.out.println("run Member(String id)");
        this.id = id;
    }

    public Member(String name, String id) {
        System.out.println("run Member(String name, String id);");
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
