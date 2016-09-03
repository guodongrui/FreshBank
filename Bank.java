import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Bank {

    private Map<Person, Double> account = new HashMap<Person, Double>();
    private static double INTEREST = 0.04;

    public void setAccount(Person person, double money) {
        Double m = new Double(money);
        account.put(person, money);
    }

    public double getAccount(Person person) {
        return account.get(person).doubleValue();
    }

    public void addInterest(int year) {

        for (Map.Entry<Person, Double> entry: account.entrySet()) {

            double new_money = entry.getValue();

            // add interest
            for (int i = 0; i < year; ++i)
                new_money *= (1 + INTEREST);

            account.put(entry.getKey(), new_money);
        }
    }
    
    public void saveService(Person person, double money) {
        account.put(person, account.get(person) + money);
    }

    public void drawService(Person person, double money) {
        account.put(person, account.get(person) - money);
    }
}

