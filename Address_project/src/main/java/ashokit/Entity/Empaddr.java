package ashokit.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Empaddr_info")
public class Empaddr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;
	private String ccity;
	private String cstate;
	private String ccountry;
	
	private Integer eid;
	public Empaddr() {

	}
	public Empaddr(Integer aid, String ccity, String cstate, String ccountry, Integer eid) {
		
		this.aid = aid;
		this.ccity = ccity;
		this.cstate = cstate;
		this.ccountry = ccountry;
		this.eid = eid;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public String getCstate() {
		return cstate;
	}
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}
	public String getCcountry() {
		return ccountry;
	}
	public void setCcountry(String ccountry) {
		this.ccountry = ccountry;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Empaddr [aid=" + aid + ", ccity=" + ccity + ", cstate=" + cstate + ", ccountry=" + ccountry + ", eid="
				+ eid + "]";
	}

	
	}


