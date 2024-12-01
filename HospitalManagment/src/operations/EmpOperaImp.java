package operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Emp;
import classes.Manager;
import connection.Connect;

public class EmpOperaImp implements  EmpOpera{

	@Override
	public void insertdata(Emp emp) {
		try {
			PreparedStatement  preparedStatement = Connect.getConnection()
					.prepareStatement("insert into empinfo values (? , ?)");
			preparedStatement.setString(1, emp.getName());
			preparedStatement.setInt(2, emp.getId());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletedata(Emp emp) {
		try {
			PreparedStatement preparedStatement = Connect.getConnection()
					.prepareStatement("delete from empinfo where ID=?");
			preparedStatement.setInt(1, emp.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updatedata(Emp emp) {
		try {
			PreparedStatement preparedStatement = Connect.getConnection()
					.prepareStatement("update empinfo set name = ? where ID = ?" );
			preparedStatement.setString(1, emp.getName());
			preparedStatement.setInt(2, emp.getId());
			preparedStatement.executeUpdate();
			System.out.println("Updated name");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void searchdata(Emp emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showdata(Emp emp) {
		ResultSet resultSet;
		try {
			resultSet = (ResultSet) Connect.getConnection().prepareStatement("select * from empinfo").executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getInt(2));
					
			}
			System.out.println("your data");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	}
	}

	@Override
	public void Manainsertdata(Manager manager) {
		try {
			PreparedStatement preparedStatement = Connect.getConnection()
					.prepareStatement("insert into manageinfo values(? , ?)");
			preparedStatement.setString(1, manager.getName());
			preparedStatement.setInt(2, manager.getId());
			preparedStatement.executeUpdate();
			System.out.println("Manager data inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void Manadeletedata(Manager manager) {
		try {
			PreparedStatement preparedStatement = Connect.getConnection().prepareStatement("delete from manageinfo where ID = ?");
			preparedStatement.setInt(1, manager.getId());
			preparedStatement.executeUpdate();
			System.out.println("Deleted data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void Manashowdata(Manager manager) {
		try {
			ResultSet resultSet = (ResultSet) Connect.getConnection().prepareStatement("select * from manageinfo").executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getInt(2));
			}
			System.out.println("Your data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}