package cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n03.S04T02N03FedoraevaAnna.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Fruits")

public class Fruit {
	
	
	@MongoId(FieldType.OBJECT_ID)
	private String id;

	private String name;
	
	private int kg;
}
