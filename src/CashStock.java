import java.util.Scanner;

public class CashStock {
    private int x100;
    private int x50;
    private int x20;

    public int showSumOfMoney() {
        int sum = (x20 * 20) + (x50 * 50) + (x100 * 100);
        System.out.println("Total amount of money: " + sum);
        return sum;
    }

    public void showNumberOfBills() {
        System.out.println("nominals 20: " + x20 + ", nominals 50: " + x50 + ", nominals 100: " + x100);
    }

    public int returnNominal20() {
        return x20;
    }

    public int returnNominal50() {
        return x50;
    }

    public int returnNominal100() {
        return x100;
    }

    public void addMoney(Nominals[] nominals) {
        // Loading Cash in ATM
        for (Nominals nominal : nominals) {    // for (int i = 0; i < nominals.length; i++)
            if (nominal == Nominals.NOMINAL_100) {
                x100++;        //x20= x20+1;
            } else if (nominal == Nominals.NOMINAL_50) {
                x50++;
            } else {
                x20++;
            }
        }
    }

    // метод по снятию денег
    public void takeMoney() {
        int accountValue = showSumOfMoney(); //переменная, инициализированная методом, возвращающим сумму денег в АТМ
        int nominal20 = returnNominal20();
        int nominal50 = returnNominal50();
        int nominal100 = returnNominal100();

        final int amountNominal100 = 100;
        final int amountNominal50 = 50;
        final int amountNominal20 = 20;

        System.out.println("Enter the amount to withdraw cash corresponding to the denominations: 20, 50, 100");
        Scanner scanner = new Scanner(System.in);
        int takeCash = scanner.nextInt();
        if (takeCash > accountValue || takeCash < 20 || takeCash % 10 != 0) {
            System.out.println("Operation impossible");
        } else {
            while (takeCash >= 100 && nominal100 > 0) {
                takeCash -= amountNominal100;
                nominal100--;
                if (takeCash == 0) {
                    System.out.println("Succesfull!");
                }
            }
            while (takeCash >= 50 && nominal50 > 0) {
                takeCash -= amountNominal50;
                nominal50--;
                if (takeCash == 0) {
                    System.out.println("Succesfull!");
                }
            }
            while (takeCash >= 20 && nominal20 > 0) {
                takeCash -= amountNominal20;
                nominal20--;
                if (takeCash == 0) {
                    System.out.println("Succesfull!");
                }
            }
            if (takeCash != 0) {
                System.out.println("Operation impossible. The amount does not correspond to available banknotes!!!");
            }
        }
    }
}
