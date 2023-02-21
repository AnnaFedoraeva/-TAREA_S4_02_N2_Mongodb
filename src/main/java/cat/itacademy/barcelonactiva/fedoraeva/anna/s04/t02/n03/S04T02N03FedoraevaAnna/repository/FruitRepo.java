package cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n03.S04T02N03FedoraevaAnna.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t02.n03.S04T02N03FedoraevaAnna.domain.Fruit;

@Repository
public interface FruitRepo extends MongoRepository<Fruit, Integer> {

	Optional<Fruit> findById(String id);

	void deleteById(String id);

}
