package com.substation.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.substation.api.model.SubstationDefaultReportAud;

public interface PendingTacApprovedRepository1 extends JpaRepository<SubstationDefaultReportAud, Long>, JpaSpecificationExecutor<SubstationDefaultReportAud>{
	/*
	 * @PersistenceContext private EntityManager entityManager;
	 * 
	 * public int finddAll(Pageable pageable){ List<SubstationDefaultReport> posts =
	 * AuditReaderFactory.get( entityManager ) .createQuery() .forRevisionsOfEntity(
	 * SubstationDefaultReport.class, true, true ) .add( AuditEntity.id().eq( 1L ) )
	 * .getResultList();
	 * 
	 * //assertEquals( 3, posts.size() );
	 * 
	 * for ( int i = 0; i < posts.size(); i++ ) {
	 * System.out.println("Revision {} of Post entity: {}");
	 * System.out.println(posts.get( i )); } return 1; }
	 */
}
