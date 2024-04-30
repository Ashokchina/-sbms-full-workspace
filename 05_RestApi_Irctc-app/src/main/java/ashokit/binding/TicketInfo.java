package ashokit.binding;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="ticket_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long ticketNum;
private String name;
private String doj;
@Column(name = "from_location")
private String from;

@Column(name = "to")
private String to;

private String trainNum;
private String status;
private Integer pid;



}
