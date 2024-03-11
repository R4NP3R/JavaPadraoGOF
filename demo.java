package ranper.factory;

public class demo {

    public static void main(String[] args){
        Customer cliente = new Customer("A", true);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer cliente) {
        if(cliente.isHasCompanyContract()) {
            return new ContractFactory();
        }
        return new NoContractFactory();

    }
}
