package com.avinashit.services;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avinashit.entity.Specialization;
import com.avinashit.repository.SpecializationRepository;

@Service
public class SpecializationServiceImpl implements ISpecializationService {
	@Autowired
	private SpecializationRepository specializationRepository;

	@Override
	public Long saveSpecialization(Specialization specialization) {
		if (specialization != null) {
			Long specId = specializationRepository.save(specialization).getSpecId();
			return specId;
		}
		return null;

	}

	@Override
	public List<Specialization> allSpeciData() {

		return specializationRepository.findAll();
	}

	@Override
	public void deleteData(Long id) {
		specializationRepository.deleteById(id);

	}

	@Override
	public Specialization editData(Long id) {
		Specialization specialization = specializationRepository.findById(id).get();
		return specialization;
	}

	@Override
	public void updateSpecData(Specialization specialization) {
		specializationRepository.save(specialization);

	}

}
