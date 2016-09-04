package virtualYear;

class VirtualYear {
	
	public void yearPast(int year) {
		year *= 2000;
		try {
			Thread.sleep(year);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
