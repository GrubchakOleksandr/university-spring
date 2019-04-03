package university_admission.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Entrant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "entrantFirstName")
	private String entrantFirstName;

	@Column(name = "entrantSecondName")
	private String entrantSecondName;

	@Column(name = "entrantLastName")
	private String entrantLastName;

	@Column(name = "EntrantDiploma")
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "entrant", cascade = CascadeType.ALL)
	private Diploma diploma;

	public Entrant() {
	}

	public Entrant(String entrantFirstName, String entrantSecondName, String entrantLastName, Diploma diploma) {
		this.entrantFirstName = entrantFirstName;
		this.entrantSecondName = entrantSecondName;
		this.entrantLastName = entrantLastName;
		this.diploma = diploma;
	}

	public Entrant(Integer id, String entrantFirstName, String entrantSecondName, String entrantLastName,
			Diploma diploma) {
		this.id = id;
		this.entrantFirstName = entrantFirstName;
		this.entrantSecondName = entrantSecondName;
		this.entrantLastName = entrantLastName;
		this.diploma = diploma;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEntrantFirstName() {
		return entrantFirstName;
	}

	public void setEntrantFirstName(String entrantFirstName) {
		this.entrantFirstName = entrantFirstName;
	}

	public String getEntrantSecondName() {
		return entrantSecondName;
	}

	public void setEntrantSecondName(String entrantSecondName) {
		this.entrantSecondName = entrantSecondName;
	}

	public String getEntrantLastName() {
		return entrantLastName;
	}

	public void setEntrantLastName(String entrantLastName) {
		this.entrantLastName = entrantLastName;
	}

	public Diploma getDiploma() {
		return diploma;
	}

	public void setDiploma(Diploma diploma) {
		this.diploma = diploma;
	}

	@Override
	public String toString() {
		return "Entrant [id=" + id + ", entrantFirstName=" + entrantFirstName + ", entrantSecondName="
				+ entrantSecondName + ", entrantLastName=" + entrantLastName + ", diploma=" + diploma + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diploma == null) ? 0 : diploma.hashCode());
		result = prime * result + ((entrantFirstName == null) ? 0 : entrantFirstName.hashCode());
		result = prime * result + ((entrantLastName == null) ? 0 : entrantLastName.hashCode());
		result = prime * result + ((entrantSecondName == null) ? 0 : entrantSecondName.hashCode());
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
		Entrant other = (Entrant) obj;
		if (diploma == null) {
			if (other.diploma != null)
				return false;
		} else if (!diploma.equals(other.diploma))
			return false;
		if (entrantFirstName == null) {
			if (other.entrantFirstName != null)
				return false;
		} else if (!entrantFirstName.equals(other.entrantFirstName))
			return false;
		if (entrantLastName == null) {
			if (other.entrantLastName != null)
				return false;
		} else if (!entrantLastName.equals(other.entrantLastName))
			return false;
		if (entrantSecondName == null) {
			if (other.entrantSecondName != null)
				return false;
		} else if (!entrantSecondName.equals(other.entrantSecondName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
