package Jdbcexample;

public class Employee{
	int empid;
	String empName;
	double empSalary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	public Employee(int empid, String empName, double empSalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
	}
}