package c8.exam.dao;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("mysqlselect ");

	}

	@Override
	public void insert() {
		System.out.println("mysql insert");

	}

	@Override
	public void update() {
		System.out.println("mysql update");

	}

	@Override
	public void delete() {
		System.out.println("mysql delete");

	}

}
