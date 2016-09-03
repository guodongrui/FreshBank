public class Example {
    public static void main(String args[]){
        String personName1 = "甲";
        String personName2 = "乙";
        String personNmae3 = "丙";
        Person a = new Person(personName1, 100);
        Person b = new Person(personName2, 100);
        Person c = new Person(personName3, 100);
        a.personName = personName1;
        b.personName = personName2;
        c.personName = perosoName3;

        Bank bank = new Bank();
        a.setAccount(bank, 100);
        b.setAccount(bank, 100);
        c.setAccount(bank, 100);

        VirtualYear vr = new VirtualYear();
        vr.yearPast(1);
        bank.addInterest(1);

        a.saveMoney(bank, 50);
        b.drawMoney(bank, 100);

        vr.yearPast(1);
        bank.addInterest(1);

        System.out.printf("甲的资产%.2f\n", a.checkAccount(bank));
        System.out.printf("乙的资产%.2f\n", b.checkAccount(bank));        
        System.out.printf("丙的资产%.2f\n", c.checkAccount(bank));    
    }
}    
