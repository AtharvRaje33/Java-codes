public class Bank {
				String customer;
				int account_no;
				float transaction;
				public static void main(String []args)
				{
					Bank b1= new Bank();
					
					b1.customer="Rahul";
					b1.account_no=162345;
					b1.transaction=21000;
					
					System.out.println(b1.customer);

					System.out.println(b1.account_no);

					System.out.println(b1.transaction);
				}
}

