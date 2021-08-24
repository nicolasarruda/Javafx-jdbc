package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	// "MOCKar" quando vc retorna os dados de mentirinha. Não é ainda os dados
	// do banco de dados.
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll(){
		return dao.findAll();
	}
}
