public class GeneralPractitioner extends HealthProfessional {
    private boolean canPrescribeMedicine;  // 全科医生特有属性

    // 默认构造函数
    public GeneralPractitioner() {
    }

    // 带参数构造函数
    public GeneralPractitioner(int ID, String name, String department, boolean canPrescribeMedicine) {
        super(ID, name, department);
        this.canPrescribeMedicine = canPrescribeMedicine;
    }

    // 打印详细信息
    public void printProfessionalDetails() {
        System.out.println("健康专业人员详情:");
        System.out.println("类型: 全科医生");
        super.printDetails();
        System.out.println("可开具处方: " + (canPrescribeMedicine ? "是" : "否"));
        System.out.println("------------------------");
    }

    // Getter和Setter
    public boolean isCanPrescribeMedicine() {
        return canPrescribeMedicine;
    }

    public void setCanPrescribeMedicine(boolean canPrescribeMedicine) {
        this.canPrescribeMedicine = canPrescribeMedicine;
    }
}