package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Magazines");
		System.out.println(obj);
		
		Seller seller = new Seller(21, "Fred", "fred@gmail.com", new Date(), 1080.90, obj);
		System.out.println(seller);

	}

}
