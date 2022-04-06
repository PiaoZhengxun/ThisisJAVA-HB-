package c8.exam.dao;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클select 검색 ㅇㅋ");

	}

	@Override
	public void insert() {
		System.out.println("오라클insert 검색 ㅇㅋ");

	}

	@Override
	public void update() {
		System.out.println("오라클 update검색 ㅇㅋ");

	}

	@Override
	public void delete() {
		System.out.println("오라클 delete검색 ㅇㅋ");

	}

}
