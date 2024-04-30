package ashokit.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data

@Entity
@Table(name ="Employee_tbl" )
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer eid;
private String ename;
private  Double Salary;

@OneToMany(cascade = CascadeType.ALL,orphanRemoval =true)
private List<Address> aadr;
}
