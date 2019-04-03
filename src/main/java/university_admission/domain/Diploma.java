package university_admission.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Diploma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "certificate")
	private Integer certificate;
	private Integer englishScore;
	private Integer mathScore;
	private Integer historyScore;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "entrant_id")
	private Entrant entrant;

}
