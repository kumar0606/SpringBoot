package com.Ravi.Service;

import java.util.List;

import com.Ravi.Model.Employe;

public interface EmployeService {


  public Employe save(Employe employe);

Employe update(Employe employe);

Employe findById(Integer eid);

void DeleteById(Integer eid);

public List<Employe> FindAll();


}
