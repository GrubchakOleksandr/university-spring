package university_admission.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "entrantId") // one to many
	private Integer entrantId;

	private Integer facultyId;

	@Temporal(TemporalType.DATE)
	@Column(name = "register_date")
	private Date date;

	@Column(name = "accepted", nullable = false) // accepted must be in the base = false
	private Boolean accepted = true;

	public Register() {
	}

	public Register(Integer id, Integer entrantId, Integer facultyId, Date date, Boolean accepted) {
		this.id = id;
		this.entrantId = entrantId;
		this.facultyId = facultyId;
		this.date = date;
		this.accepted = accepted;
	}

	public Register(Integer entrantId, Integer facultyId, Date date, Boolean accepted) {
		this.entrantId = entrantId;
		this.facultyId = facultyId;
		this.date = date;
		this.accepted = accepted;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEntrantId() {
		return entrantId;
	}

	public void setEntrantId(Integer entrantId) {
		this.entrantId = entrantId;
	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", entrantId=" + entrantId + ", facultyId=" + facultyId + ", date=" + date
				+ ", accepted=" + accepted + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accepted == null) ? 0 : accepted.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((entrantId == null) ? 0 : entrantId.hashCode());
		result = prime * result + ((facultyId == null) ? 0 : facultyId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Register other = (Register) obj;
		if (accepted == null) {
			if (other.accepted != null)
				return false;
		} else if (!accepted.equals(other.accepted))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (entrantId == null) {
			if (other.entrantId != null)
				return false;
		} else if (!entrantId.equals(other.entrantId))
			return false;
		if (facultyId == null) {
			if (other.facultyId != null)
				return false;
		} else if (!facultyId.equals(other.facultyId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
