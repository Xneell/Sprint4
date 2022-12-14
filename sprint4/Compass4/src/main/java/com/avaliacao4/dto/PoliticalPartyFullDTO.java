import java.time.LocalDate;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;

@Data
public class PoliticalPartyFullDTO {

	private Integer id;
	@NotNull
	private String name;
	@NotNull
	private String acronym;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Ideology ideology;
	@NotNull
	@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate fundationDate;
	
	private List<Associate> associates;
}
