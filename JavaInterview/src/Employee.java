public class Employee implements Comparable {

    private long EmpId;
    private String EmpName;

    private String EmpCity;
    private String EmpCountry;
    private double EmpSalary;
    private String EmpDepratmentName;

    public Employee(long empId, String empName, String empCity, String empCountry, double empSalary, String empDepratmentName) {
        EmpId = empId;
        EmpName = empName;
        EmpCity = empCity;
        EmpCountry = empCountry;
        EmpSalary = empSalary;
        EmpDepratmentName = empDepratmentName;
    }

    public long getEmpId() {
        return EmpId;
    }

    public void setEmpId(long empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpCity() {
        return EmpCity;
    }

    public void setEmpCity(String empCity) {
        EmpCity = empCity;
    }

    public String getEmpCountry() {
        return EmpCountry;
    }

    public void setEmpCountry(String empCountry) {
        EmpCountry = empCountry;
    }

    public double getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(double empSalary) {
        EmpSalary = empSalary;
    }

    public String getEmpDepratmentName() {
        return EmpDepratmentName;
    }

    public void setEmpDepratmentName(String empDepratmentName) {
        EmpDepratmentName = empDepratmentName;
    }

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee) o;
        return emp.getEmpName().compareTo(this.getEmpName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", EmpCity='" + EmpCity + '\'' +
                ", EmpCountry='" + EmpCountry + '\'' +
                ", EmpSalary=" + EmpSalary +
                ", EmpDepratmentName='" + EmpDepratmentName + '\'' +
                '}';
    }
}
