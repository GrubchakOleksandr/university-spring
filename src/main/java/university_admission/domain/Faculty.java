package university_admission.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "facultyName")
	private String facultyName;

	@Column(name = "passingScor")
	private Integer passingScore;

	@Column(name = "totalNumberOfPlaces")
	private Integer totalNumberOfPlaces;

	@Column(name = "numberOfGovernmentOrder")
	private Integer numberOfGovernmentOrder;

	@Column(name = "numberPaid")
	private Integer numberPaid;

	public Faculty() {
	}

	public Faculty(Integer id, String facultyName, Integer passingScore, Integer totalNumberOfPlaces,
			Integer numberOfGovernmentOrder, Integer numberPaid) {
		this.id = id;
		this.facultyName = facultyName;
		this.passingScore = passingScore;
		this.totalNumberOfPlaces = totalNumberOfPlaces;
		this.numberOfGovernmentOrder = numberOfGovernmentOrder;
		this.numberPaid = numberPaid;
	}

	public Faculty(String facultyName, Integer passingScore, Integer totalNumberOfPlaces, Integer numberFree,
			Integer numberPaid) {
		this.facultyName = facultyName;
		this.passingScore = passingScore;
		this.totalNumberOfPlaces = totalNumberOfPlaces;
		this.numberOfGovernmentOrder = numberOfGovernmentOrder;
		this.numberPaid = numberPaid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Integer getPassingScore() {
		return passingScore;
	}

	public void setPassingScore(Integer passingScore) {
		this.passingScore = passingScore;
	}

	public Integer getTotalNumberOfPlaces() {
		return totalNumberOfPlaces;
	}

	public void setTotalNumberOfPlaces(Integer totalNumberOfPlaces) {
		this.totalNumberOfPlaces = totalNumberOfPlaces;
	}

	public Integer getNumberFree() {
		return numberOfGovernmentOrder;
	}

	public void setNumberFree(Integer numberFree) {
		this.numberOfGovernmentOrder = numberFree;
	}

	public Integer getNumberPaid() {
		return numberPaid;
	}

	public void setNumberPaid(Integer numberPaid) {
		this.numberPaid = numberPaid;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", facultyName=" + facultyName + ", passingScore=" + passingScore
				+ ", totalNumberOfPlaces=" + totalNumberOfPlaces + ", numberFree=" + numberOfGovernmentOrder
				+ ", numberPaid=" + numberPaid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facultyName == null) ? 0 : facultyName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numberOfGovernmentOrder == null) ? 0 : numberOfGovernmentOrder.hashCode());
		result = prime * result + ((numberPaid == null) ? 0 : numberPaid.hashCode());
		result = prime * result + ((passingScore == null) ? 0 : passingScore.hashCode());
		result = prime * result + ((totalNumberOfPlaces == null) ? 0 : totalNumberOfPlaces.hashCode());
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
		Faculty other = (Faculty) obj;
		if (facultyName == null) {
			if (other.facultyName != null)
				return false;
		} else if (!facultyName.equals(other.facultyName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numberOfGovernmentOrder == null) {
			if (other.numberOfGovernmentOrder != null)
				return false;
		} else if (!numberOfGovernmentOrder.equals(other.numberOfGovernmentOrder))
			return false;
		if (numberPaid == null) {
			if (other.numberPaid != null)
				return false;
		} else if (!numberPaid.equals(other.numberPaid))
			return false;
		if (passingScore == null) {
			if (other.passingScore != null)
				return false;
		} else if (!passingScore.equals(other.passingScore))
			return false;
		if (totalNumberOfPlaces == null) {
			if (other.totalNumberOfPlaces != null)
				return false;
		} else if (!totalNumberOfPlaces.equals(other.totalNumberOfPlaces))
			return false;
		return true;
	}

}
