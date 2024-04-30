package ashokit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo {
	@Id
	private int id;
	private String name;
	@Lob
	@Column(name="image",columnDefinition = "longblob")
	private byte[]image;
	

}
