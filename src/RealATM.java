//класс - наследник BaseATM
public class RealATM extends BaseATM {
    CashStock cashStock = new CashStock();

    public RealATM(String nameOfBank, String nameOfProducerATM) {
        super(nameOfBank, nameOfProducerATM);
    }

    @Override
    public void takeCashFromATM() {
        cashStock.takeMoney();
    }

    @Override
    public void printNameOfBank() {
        System.out.println("Name of Bank: " + getNameOfBank());
    }

    @Override
    public void printNameOfProducerATM() {
        System.out.println("Producer of ATM: " + getNameOfProducerATM());
    }

    @Override
    public void showNumberOfBills() {
        cashStock.showNumberOfBills();
    }

    @Override
    public void showSumOfMoney() {
        cashStock.showSumOfMoney();
    }
}
