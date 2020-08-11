package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(7);
		System.out.println("=== TEST 1: findById ===");
		System.out.println(seller);
		System.out.println();
		System.out.println("=== TEST 2: finfByDepartment ===");
		Department dep = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		list.forEach(System.out::println);

	}

}
