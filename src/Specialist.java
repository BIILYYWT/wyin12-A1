public class Specialist extends HealthProfessional {
    private String specialty;  // 专科医生的专业领域

    // 默认构造函数
    public Specialist() {
    }

    // 带参数构造函数
    public Specialist(int ID, String name, String department, String specialty) {
        super(ID, name, department);
        this.specialty = specialty;
    }

    // 打印详细信息
    public void printProfessionalDetails() {
        System.out.println("健康专业人员详情:");
        System.out.println("类型: 专科医生");
        super.printDetails();
        System.out.println("专业领域: " + specialty);
        System.out.println("------------------------");
    }

    // Getter和Setter
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
