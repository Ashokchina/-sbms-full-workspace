package ashokit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {
	@Id
	private Integer eid;
	private String ename;
	private Double eprice;

	public employee() {

	}

	public employee(Integer eid, String ename, Double eprice) {

		this.eid = eid;
		this.ename = ename;
		this.eprice = eprice;
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

	public Double getEprice() {
		return eprice;
	}

	public void setEprice(Double eprice) {
		this.eprice = eprice;
	}

	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", eprice=" + eprice + "]";
	}
	

}
