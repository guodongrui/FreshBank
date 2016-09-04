public class Person{

    public String personName;
    private double cash;

    Person(String name, double treasure){
        personName = new String(name);
        cash = treasure;
    }    
    
    public void toSetAccount(Bank bank, double money){
        cash -= money;
        bank.setAccount(this, money);
    }

    public double checkAccount(Bank bank){
        return bank.getAccount(this);
    }

    public void saveMoney(Bank bank,double money){
        bank.saveService(this, money);
        cash -= money;
    }

    public void drawMoney(Bank bank,double money){
        bank.drawService(this, money);
        cash += money;
    }

    public double getCash(){
        return cash;
    }
}

