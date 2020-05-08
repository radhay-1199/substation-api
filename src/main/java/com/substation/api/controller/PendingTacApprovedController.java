package com.substation.api.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.substation.api.model.FilterRequest;
import com.substation.api.model.SubstationDefaultReport;
import com.substation.api.model.SubstationDefaultReportAud;
import com.substation.api.service.impl.PendingTacApprovedImpl;

@RestController
public class PendingTacApprovedController {

	private static final Logger logger = LogManager.getLogger(PendingTacApprovedController.class);

	@Autowired
	PendingTacApprovedImpl pendingTacApprovedImpl;

	// @ApiOperation(value = "pagination View filtered PendingTacApprovedDb", response = ConsignmentMgmt.class)
	@PostMapping("/filter/pending-tac-approveddb") public MappingJacksonValue withPaginationConsignments(@RequestBody FilterRequest filterRequest,
			@RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
			@RequestParam(value = "file", defaultValue = "0") Integer file) {

		MappingJacksonValue mapping = null; 
		if(file == 0) {
			logger.info("Request to view filtered audit trail = " + filterRequest);
			Page<SubstationDefaultReport> pendingTacApprovedDb = pendingTacApprovedImpl.filterPendingTacApprovedDb(filterRequest, pageNo, pageSize);
			mapping = new MappingJacksonValue(pendingTacApprovedDb); 
			}

		logger.info("Response of view Request = " + mapping);

		return mapping;
	}
	
	@RequestMapping(path = "filter/record/history", method = RequestMethod.POST)
	public MappingJacksonValue getAllActionDetailsHistory(@RequestBody FilterRequest filterRequest,
			@RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
			@RequestParam(value = "file", defaultValue = "0") Integer file) {

		MappingJacksonValue mapping = null;

		if(file == 0) {
			logger.info("Record request to Stolen And Recovery Info = "+filterRequest);
			Page<SubstationDefaultReportAud> pendingTacApprovedDb = pendingTacApprovedImpl.getAllHistoryInfo(filterRequest,pageNo,pageSize);
			mapping = new MappingJacksonValue(pendingTacApprovedDb);
		}
		logger.info("Record Response of Stolen And Recovery Info = " + mapping);

		return mapping;
	}
}