import java.sql.*;
public class JyothiDB
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jyothi","root","karat03");
		Statement st=con.createStatement();
		
		st.executeUpdate("insert into student values(1,'Amal','CSE',7.0)");
		st.executeUpdate("insert into student values(2,'Dia','CSE',9.0)");
		st.executeUpdate("insert into student values(3,'Joel','CSE',8.5)");
		System.out.println("***Inserted 3 records***");
		
		ResultSet rs=st.executeQuery("select * from student");
		String str="";
		while(rs.next())
		{
		str=rs.getInt("rollno")+":"+rs.getString("name")+":"+rs.getString("branch")+":"+rs.getFloat("cgpa");
		System.out.println(str);
		}
		
		st.executeUpdate("delete from student where rollno=3");
		System.out.println("***Deleted 1 record***");
		
		ResultSet rs2=st.executeQuery("select * from student");
		String str2="";
		while(rs2.next())
		{
		str2=rs2.getInt("rollno")+":"+rs2.getString("name")+":"+rs2.getString("branch")+":"+rs2.getFloat("cgpa");
		System.out.println(str2);
		}
		
		st.close();
		con.close();
	}
}
