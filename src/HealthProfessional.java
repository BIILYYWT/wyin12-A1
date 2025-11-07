public class HealthProfessional {
    private int ID;
    private String name;
    private String department; // 例如，部门

    // 默认构造函数
    public HealthProfessional() {
    }

    // 带参数的构造函数
    public HealthProfessional(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    // 打印详细信息的方法
    public void printDetails() {
        System.out.println("HealthProfessional ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    // 为了在子类中访问这些变量，我们可以提供getter方法，或者将变量改为protected。这里我们使用private并提供getter。
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}