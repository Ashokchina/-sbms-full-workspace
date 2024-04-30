package ashokit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_info")
public class User {

	@Id
	private Integer u_id;
	private String  u_name;
	private String u_mail;
	private String u_pwd;
	private Integer u_phno;
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_mail() {
		return u_mail;
	}
	public void setU_mail(String u_mail) {
		this.u_mail = u_mail;
	}
	public String getU_pwd() {
		return u_pwd;
	}
	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}
	public Integer getU_phno() {
		return u_phno;
	}
	public void setU_phno(Integer u_phno) {
		this.u_phno = u_phno;
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_mail=" + u_mail + ", u_pwd=" + u_pwd + ", u_phno="
				+ u_phno + "]";
	}
	
	
	
	
	
	
	
}
