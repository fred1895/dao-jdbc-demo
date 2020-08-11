package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(7);
		System.out.println("=== TEST 1: findById ===");
		System.out.println(seller);
		System.out.println();

		System.out.println("=== TEST 2: finfByDepartment ===");
		Department dep = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		list.forEach(System.out::println);
		System.out.println();

		System.out.println("=== TEST 3: finfByAll ===");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
		System.out.println();

		System.out.println("=== TEST 4: Seller:: insert ===");
		Seller newSeller = new Seller(null, "Flavia", "flavia@gmail.com", new Date(), 2100.00, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new seller. New Id = " + newSeller.getId());
		System.out.println();

		System.out.println("=== TEST 4: Seller:: insert ===");
		seller = sellerDao.findById(1);
		seller.setName("Gabigol Barbosa");
		seller.setBaseSalary(50000.00);
		sellerDao.update(seller);
		System.out.println("Update completed");
		System.out.println();

		System.out.println("=== TEST 5: Seller:: delete ===");
		System.out.print("Enter the Seller Id you want to delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted id " + id);

	}

}
