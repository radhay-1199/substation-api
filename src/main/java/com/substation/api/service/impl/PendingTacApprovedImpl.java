package com.substation.api.service.impl;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.substation.api.configuration.PropertiesReader;
import com.substation.api.exceptions.ResourceServicesException;
import com.substation.api.model.FilterRequest;
import com.substation.api.model.SearchCriteria;
import com.substation.api.model.SubstationDefaultReport;
import com.substation.api.model.SubstationDefaultReportAud;
import com.substation.api.model.constants.Datatype;
import com.substation.api.model.constants.SearchOperation;
import com.substation.api.repository.PendingTacApprovedRepository;
import com.substation.api.repository.PendingTacApprovedRepository1;
import com.substation.apispecificationsbuilder.GenericSpecificationBuilder;

@Service
public class PendingTacApprovedImpl {

	private static final Logger logger = LogManager.getLogger(PendingTacApprovedImpl.class);

	@Autowired
	PendingTacApprovedRepository pendingTacApprovedRepository;
	
	@Autowired
	PendingTacApprovedRepository1 pendingTacApprovedRepository1;
	
	@Autowired
	PropertiesReader propertiesReader;


	public Page<SubstationDefaultReport> filterPendingTacApprovedDb(FilterRequest filterRequest, Integer pageNo,
			Integer pageSize) {
		try {
			Pageable pageable = PageRequest.of(pageNo, pageSize, new Sort(Sort.Direction.DESC, "unitId"));

			Page<SubstationDefaultReport> page = pendingTacApprovedRepository.findAll(buildSpecification(filterRequest).build(), pageable);
			return page;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ResourceServicesException(this.getClass().getName(), e.getMessage());
		}
	}
	
	public Page<SubstationDefaultReportAud> getAllHistoryInfo(FilterRequest filterRequest, Integer pageNo, Integer pageSize){
		try {
			Pageable pageable = PageRequest.of(pageNo, pageSize, new Sort(Sort.Direction.DESC, "unitId"));

			Page<SubstationDefaultReportAud> page = pendingTacApprovedRepository1.findAll(buildSpecifications(filterRequest).build(), pageable);
			return page;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ResourceServicesException(this.getClass().getName(), e.getMessage());
		}	
	}
	
	private GenericSpecificationBuilder<SubstationDefaultReport> buildSpecification(FilterRequest pendingTacApprovedDb){
		GenericSpecificationBuilder<SubstationDefaultReport> cmsb = new GenericSpecificationBuilder<>(propertiesReader.dialect);

		if(Objects.nonNull(pendingTacApprovedDb.getUnitId()) && !pendingTacApprovedDb.getUnitId().equals(null))
			cmsb.with(new SearchCriteria("unitId", pendingTacApprovedDb.getUnitId(), SearchOperation.EQUALITY, Datatype.LONG));

		if(Objects.nonNull(pendingTacApprovedDb.getDistrictName()) && !pendingTacApprovedDb.getDistrictName().isEmpty())
			cmsb.with(new SearchCriteria("districtName",pendingTacApprovedDb.getDistrictName() ,SearchOperation.EQUALITY, Datatype.STRING));

		if(Objects.nonNull(pendingTacApprovedDb.getSubstationName()) && !pendingTacApprovedDb.getSubstationName().isEmpty())
			cmsb.with(new SearchCriteria("substationName",pendingTacApprovedDb.getSubstationName() , SearchOperation.EQUALITY, Datatype.STRING));

		return cmsb;
	}

	private GenericSpecificationBuilder<SubstationDefaultReportAud> buildSpecifications(FilterRequest pendingTacApprovedDb){
		GenericSpecificationBuilder<SubstationDefaultReportAud> cmsb = new GenericSpecificationBuilder<>(propertiesReader.dialect);

		if(Objects.nonNull(pendingTacApprovedDb.getUnitId()) && !pendingTacApprovedDb.getUnitId().equals(null))
			cmsb.with(new SearchCriteria("unitId", pendingTacApprovedDb.getUnitId(), SearchOperation.EQUALITY, Datatype.LONG));

		if(Objects.nonNull(pendingTacApprovedDb.getDistrictName()) && !pendingTacApprovedDb.getDistrictName().isEmpty())
			cmsb.with(new SearchCriteria("districtName",pendingTacApprovedDb.getDistrictName() ,SearchOperation.EQUALITY, Datatype.STRING));

		if(Objects.nonNull(pendingTacApprovedDb.getSubstationName()) && !pendingTacApprovedDb.getSubstationName().isEmpty())
			cmsb.with(new SearchCriteria("substationName",pendingTacApprovedDb.getSubstationName() , SearchOperation.EQUALITY, Datatype.STRING));

		return cmsb;
	}
}
