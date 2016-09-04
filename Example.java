public class Example{
    public static void main(String args[]){
        String personName1 = "甲";
        String personName2 = "乙";
        String personName3 = "丙";
        Person a = new Person(personName1, 100);
        Person b = new Person(personName2, 100);
        Person c = new Person(personName3, 100);
        a.personName = personName1;
        b.personName = personName2;
        c.personName = personName3;

        Bank bank = new Bank();
        a.toSetAccount(bank, 100);
        b.toSetAccount(bank, 100);
        c.toSetAccount(bank, 100);

        System.out.println("第 0 年");
        VirtualYear vr = new VirtualYear();
        vr.yearPast(1);
        bank.addInterest(1);
        System.out.println("一年过去...");

        a.saveMoney(bank, 50);
        b.drawMoney(bank, 50);

        vr.yearPast(1);
        bank.addInterest(1);
        System.out.println("一年又过去...");

        System.out.printf("甲的资产%.2f\n", a.checkAccount(bank));
        System.out.printf("乙的资产%.2f\n", b.checkAccount(bank));        
        System.out.printf("丙的资产%.2f\n", c.checkAccount(bank));    
    }
}    
