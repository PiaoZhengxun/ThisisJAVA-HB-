package c8.exam.dao;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("����Ŭselect �˻� ����");

	}

	@Override
	public void insert() {
		System.out.println("����Ŭinsert �˻� ����");

	}

	@Override
	public void update() {
		System.out.println("����Ŭ update�˻� ����");

	}

	@Override
	public void delete() {
		System.out.println("����Ŭ delete�˻� ����");

	}

}
