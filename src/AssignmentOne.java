import java.util.ArrayList;

public class AssignmentOne {

    public static void main(String[] args) {

        // ============================================
        // Part 3 – Using classes and objects
        // ============================================
        System.out.println("=== Part 3 - 使用类和对象 ===");
        System.out.println();

        // 创建三个全科医生对象
        System.out.println("创建全科医生对象:");
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "张医生", "全科门诊", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "李医生", "全科门诊", true);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "王医生", "急诊科", false);

        // 创建两个专科医生对象
        System.out.println("创建专科医生对象:");
        Specialist sp1 = new Specialist(201, "赵医生", "心脏科", "心脏病学");
        Specialist sp2 = new Specialist(202, "刘医生", "神经科", "神经外科");

        System.out.println();
        System.out.println("打印所有健康专业人员详情:");
        System.out.println("==========================");

        // 打印所有健康专业人员详情
        gp1.printProfessionalDetails();
        gp2.printProfessionalDetails();
        gp3.printProfessionalDetails();
        sp1.printProfessionalDetails();
        sp2.printProfessionalDetails();

        System.out.println("---");

        // ============================================
        // Part 5 – Collection of appointments
        // ============================================
        System.out.println("=== Part 5 - 预约集合管理 ===");
        System.out.println();

        // 声明ArrayList来存储预约对象
        ArrayList<Appointment> appointments = new ArrayList<>();

        // 创建预约
        System.out.println("创建预约:");
        createAppointment(appointments, "张三", "13800138001", "09:00", gp1);
        createAppointment(appointments, "李四", "13800138002", "10:30", gp2);
        createAppointment(appointments, "王五", "13800138003", "14:00", sp1);
        createAppointment(appointments, "赵六", "13800138004", "15:30", sp2);

        System.out.println();

        // 打印现有预约
        System.out.println("第一次打印预约列表:");
        printExistingAppointments(appointments);

        System.out.println();

        // 取消一个预约
        System.out.println("取消预约:");
        cancelBooking(appointments, "13800138002");

        System.out.println();

        // 再次打印现有预约
        System.out.println("取消后的预约列表:");
        printExistingAppointments(appointments);

        System.out.println("---");
    }

    // Part 5 的方法实现
    public static void createAppointment(ArrayList<Appointment> appointments,
                                         String patientName, String mobilePhone,
                                         String timeSlot, HealthProfessional doctor) {
        // 验证所有必要信息是否提供
        if (patientName == null || patientName.trim().isEmpty()) {
            System.out.println("错误: 患者姓名不能为空!");
            return;
        }
        if (mobilePhone == null || mobilePhone.trim().isEmpty()) {
            System.out.println("错误: 手机号不能为空!");
            return;
        }
        if (timeSlot == null || timeSlot.trim().isEmpty()) {
            System.out.println("错误: 时间段不能为空!");
            return;
        }
        if (doctor == null) {
            System.out.println("错误: 必须选择医生!");
            return;
        }

        // 创建新预约并添加到列表
        Appointment newAppointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(newAppointment);
        System.out.println("成功为 " + patientName + " 创建 " + timeSlot + " 的预约!");
    }

    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("当前没有预约。");
        } else {
            System.out.println("现有预约数量: " + appointments.size());
            for (int i = 0; i < appointments.size(); i++) {
                System.out.println("预约 #" + (i + 1) + ":");
                appointments.get(i).printAppointmentDetails();
            }
        }
    }

    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                String patientName = appointments.get(i).getPatientName();
                appointments.remove(i);
                System.out.println("成功取消患者 " + patientName + " (手机号: " + mobilePhone + ") 的预约。");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("错误: 未找到手机号为 " + mobilePhone + " 的预约。");
        }
    }
}