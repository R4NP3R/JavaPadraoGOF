package ranper.factory;

public class NoContractFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Fusca(1800,"cheio","Azul");
        } else {
            return new Lancer(20, "cheio", "preto");
        }
    }
}
