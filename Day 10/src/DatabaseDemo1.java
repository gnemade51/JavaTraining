import java.sql.*;

public class DatabaseDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is Loaded !");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zensar","root","5699Gmax");
			System.out.println("Connection Successful !");
			//Statement st=con.createStatement();
//			PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
//			pst.setInt(1, 2);
//			pst.setString(2,"John");
//			pst.setInt(3, 10000);
//			pst.executeUpdate();
//			System.out.println("Values are inserted !");
			
			//call procedure in db
			CallableStatement cst=con.prepareCall("");
			cst.execute();
			
			
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery("select * from employee");
//			boolean ans = st.execute(Str);
//			int i = st.executeUpdate(Str);
//			
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
