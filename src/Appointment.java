public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor;

    // 默认构造函数
    public Appointment() {
        this.patientName = "未知";
        this.mobilePhone = "未知";
        this.timeSlot = "未知";
        this.doctor = null;
    }

    // 带参数构造函数
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // 打印所有实例变量
    public void printAppointmentDetails() {
        System.out.println("┌─────────────────────────────────────");
        System.out.println("│ 患者姓名: " + patientName);
        System.out.println("│ 手机号: " + mobilePhone);
        System.out.println("│ 预约时间: " + timeSlot);
        System.out.println("│ 预约医生信息:");
        System.out.println("│   - 医生ID: " + doctor.getID());
        System.out.println("│   - 医生姓名: " + doctor.getName());
        System.out.println("│   - 所属部门: " + doctor.getDepartment());

        // 使用多态性来显示特定类型医生的额外信息
        if (doctor instanceof GeneralPractitioner) {
            GeneralPractitioner gp = (GeneralPractitioner) doctor;
            System.out.println("│   - 医生类型: 全科医生");
            System.out.println("│   - 可开具处方: " + (gp.isCanPrescribeMedicine() ? "是" : "否"));
        } else if (doctor instanceof Specialist) {
            Specialist sp = (Specialist) doctor;
            System.out.println("│   - 医生类型: 专科医生");
            System.out.println("│   - 专业领域: " + sp.getSpecialty());
        }
        System.out.println("└─────────────────────────────────────");
        System.out.println();
    }

    // Getter和Setter方法
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}