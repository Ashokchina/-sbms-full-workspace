package ashokit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="emp_addr_info")
public class Empaddr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empaddrid;
	private String city;
	private String state;
	private String country;
	
	private Integer empid;
	public Empaddr() {
	
	}
	public Empaddr(Integer empaddrid, String city, String state, Integer empid) {
		
		this.empaddrid = empaddrid;
		this.city = city;
		this.state = state;
		this.empid = empid;
		this.country=country;
	}
	public Integer getEmpaddrid() {
		return empaddrid;
	}
	public void setEmpaddrid(Integer empaddrid) {
		this.empaddrid = empaddrid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Empaddr [empaddrid=" + empaddrid + ", city=" + city + ", state=" + state + ", empid=" + empid + "]";
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
