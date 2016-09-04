public class VirtualYear {
    
    public void yearPass(int year) {
        year *= 2000;
        try {
            Thread.sleep(year);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
