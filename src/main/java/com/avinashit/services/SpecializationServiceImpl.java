package com.avinashit.services;

import java.util.Collection;
import java.util.Collections;

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

}
