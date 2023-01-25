//абстрактный класс: базовый банкомат
public abstract class BaseATM implements NameOfBankATM, NameOfProducerATM, SetCash, GetCash, NumberOfBills, SumOfMoney {
    private final String nameOfBank;
    private final String nameOfProducerATM;
    private final CashStock cashStock = new CashStock();

    public String getNameOfBank() {
        return nameOfBank;
    }

    public String getNameOfProducerATM() {
        return nameOfProducerATM;
    }

    public BaseATM(String nameOfBank, String nameOfProducerATM) {
        this.nameOfBank = nameOfBank;
        this.nameOfProducerATM = nameOfProducerATM;
    }

    public void printNameOfBank() {

        System.out.println("Name of Bank: " + getNameOfBank());
    }

    public void printNameOfProducerATM() {
        System.out.println("Producer of ATM: " + getNameOfProducerATM());
    }

    @Override
    public void setCash(Nominals[] nominals) {
        cashStock.addMoney(nominals);
    }

    @Override
    public void takeCashFromATM() {
        cashStock.takeMoney();

    }

    public void showNumberOfBills() {
        cashStock.showNumberOfBills();

    }

    public void showSumOfMoney() {
        cashStock.showSumOfMoney();

    }
}
