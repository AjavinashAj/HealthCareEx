package com.avinashit.services;

import java.util.List;

import com.avinashit.entity.Specialization;

public interface ISpecializationService {

	Long saveSpecialization(Specialization specialization);

	List<Specialization> allSpeciData();

	void deleteData(Long id);

	Specialization editData(Long id);

	void updateSpecData(Specialization specialization);

}
