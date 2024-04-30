package ashokit.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp1_info")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer eid;
private String ename;
private Double salary;
public Employee() {
}
public Employee(Integer eid, String ename, Double salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
}



}
