package lecture04;
import java.util.ArrayList;
import java.util.List;
public class ATM {
    List<Account> accounts;

    ATM() {
        this.accounts = new ArrayList<>();
    }

    void registerAccount(String name, String number) {

        Account account = new Account(name, number);
        this.accounts.add(account);
        System.out.println(name + "さんのアカウントを口座番号:" + number + "で登録しました。");
    }

    boolean exsitsAccount(String name, String number) {
        for (Account account : accounts) {
            if (account.getName().equals(name) && account.getNumber().equals(number)) {
                System.out.println("名前:" + name + " 口座番号:" + number + "は存在します。");
                return true;
            }
        }
            System.out.println("名前:" + name + " 口座番号:" + number + "は存在しません。");
            return false;
    }

    void deposit(String number, long money) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                System.out.println("口座番号:" + number + "に" + money + "円入金しました。");
                account.setBalance(account.getBalance() + money);
            }
        }
    }

    public void withdraw(String number, long money) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number) && account.getBalance() >= money) {
                System.out.println("口座番号:" + number + "に" + money + "円引き出しました。");
                account.setBalance(account.getBalance() - money);
            } else if (account.getNumber().equals(number) && account.getBalance() <= money) {
                System.out.println("口座番号:" + number + "に" + money + "円引き出しませんでした。");
            }
        }
    }
}
