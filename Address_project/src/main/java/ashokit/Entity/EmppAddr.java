package ashokit.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_paddr")
public class EmppAddr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer peid;
	private String pecity;
	private String pstate;
	private String pcountry;

	private Integer aid;

	public EmppAddr() {

	}

	public EmppAddr(Integer peid, String pecity, String pstate, String pcountry, Integer aid) {
		this.peid = peid;
		this.pecity = pecity;
		this.pstate = pstate;
		this.pcountry = pcountry;
		this.aid = aid;
	}

	public Integer getPeid() {
		return peid;
	}

	public void setPeid(Integer peid) {
		this.peid = peid;
	}

	public String getPecity() {
		return pecity;
	}

	public void setPecity(String pecity) {
		this.pecity = pecity;
	}

	public String getPstate() {
		return pstate;
	}

	public void setPstate(String pstate) {
		this.pstate = pstate;
	}

	public String getPcountry() {
		return pcountry;
	}

	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	@Override
	public String toString() {
		return "EmppAddr [peid=" + peid + ", pecity=" + pecity + ", pstate=" + pstate + ", pcountry=" + pcountry
				+ ", aid=" + aid + "]";
	}

}
