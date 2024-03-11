package ranper.factory;

public class ContractFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Corolla(100,"cheio","Prata");
        } else {
            return new Celta(800, "cheio", "vermelho");
        }
    }
}
