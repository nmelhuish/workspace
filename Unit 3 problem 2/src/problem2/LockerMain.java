package problem2;

public class LockerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean results;
		
		CombinationLock mmCombo= new CombinationLock(28,17,39);
		CombinationLock ddCombo= new CombinationLock(35,16,27);
		
		Locker mm= new Locker(100, "Mickey Mouse", 3,mmCombo);
		Locker dd= new Locker(275, "Donald Duck", 0,ddCombo);
		
		
		
		
		mm.openLocker();
		mm.putBookInLocker();
		mm.putBookInLocker();
		mm.putBookInLocker();
		System.out.println("Books in Mickey Mouse's locker is:" + mm.getNumBooks());
		results=dd.removeBookFromLocker();
		/**System.out.println("Books in Donald Ducks locker is:" + results);*/
		
		System.out.println("Mickey Mouse's locker number is  " + mm.getLockerNum());
		System.out.println("Mickey Mouse's locker name is  " + mm.getName());
		System.out.println("Mickey Mouse's number of books is  " + mm.getNumBooks());
		/**System.out.println("Mickey Mouse's combination is  " + mm.getComboNum());*/
		
		System.out.println("Donald Duck's locker number is  " + dd.getLockerNum());
		System.out.println("Donald Duck's locker name is  " + dd.getName());
		System.out.println("Donald Duck's number of books is  " + dd.getNumBooks());
		/**System.out.println("Donald Duck's combination is  " + dd.getComboNum());*/
	}

}
