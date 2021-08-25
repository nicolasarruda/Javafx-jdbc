package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll() {
		return dao.findAll();
	}
	
	public void saveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
			System.out.println("CREATE");
		}
		else {
			dao.update(obj);
			System.out.println("UPDATE");
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
}
