package com.simplify.marketplace.web.rest;


import com.simplify.marketplace.domain.Certificate;
import com.simplify.marketplace.domain.CustomUser;
import com.simplify.marketplace.domain.Education;
import com.simplify.marketplace.domain.ElasticWorker;
import com.simplify.marketplace.domain.Employment;
import com.simplify.marketplace.repository.CertificateRepository;
import com.simplify.marketplace.repository.CustomUserRepository;
import com.simplify.marketplace.repository.ESearchWorkerRepository;
import com.simplify.marketplace.repository.EducationRepository;
import com.simplify.marketplace.repository.EmploymentRepository;
import com.simplify.marketplace.repository.FileRepository;
import com.simplify.marketplace.repository.JobPreferenceRepository;
import com.simplify.marketplace.repository.PortfolioRepository;
import com.simplify.marketplace.repository.ReferecesRepository;
import com.simplify.marketplace.repository.SkillsMasterRepository;
//import com.simplify.marketplace.domain.ElasticWorker;
//import com.simplify.marketplace.domain.Worker;
//import com.simplify.marketplace.repository.ESearchWorkerRepository;
import com.simplify.marketplace.repository.WorkerDTORepo;
import com.simplify.marketplace.service.dto.FileDTO;
import com.simplify.marketplace.service.dto.WorkerDTO;
import com.simplify.marketplace.domain.File;
import com.simplify.marketplace.domain.JobPreference;
import com.simplify.marketplace.domain.Portfolio;
import com.simplify.marketplace.domain.Refereces;
import com.simplify.marketplace.domain.SkillsMaster;

import java.util.Set;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @Autowired
    WorkerDTORepo repo;

    @Autowired
    ElasticWorker entity;

    @Autowired
    ESearchWorkerRepository rep1;
    
    @Autowired
    FileRepository fileRep;
    
    @Autowired
    EducationRepository eduRepo;
    
    @Autowired
    CertificateRepository certRepo;
    
    @Autowired
    JobPreferenceRepository jobRepo;
    
    @Autowired
    EmploymentRepository empRepo;
    
    @Autowired
    PortfolioRepository portRepo;
    
    @Autowired
    ReferecesRepository refRepo;
    
    @Autowired 
    SkillsMasterRepository skillRepo;
    
    @Autowired 
    CustomUserRepository customRepo;

    @RabbitListener(queues = "queue1")
    public void comsume(WorkerDTO worker) {
        entity = new ElasticWorker();
        
        Long id=worker.getId();
        
        entity.setId(worker.getId());
		entity.setFirstName(worker.getFirstName());
		entity.setMiddleName(worker.getMiddleName());
		entity.setLastName(worker.getLastName());
		entity.setPrimaryPhone(worker.getPrimaryPhone());
		entity.setDescription(worker.getDescription());
		//entity.setDateOfBirth(worker.getDateOfBirth());
		entity.setIsActive(worker.getIsActive());
		/* entity.setCreatedAt(worker.getCreatedAt());
		entity.setCreatedBy(worker.getCreatedBy());
		entity.setUpdatedBy(worker.getUpdatedBy());
		entity.setUpdatedAt(worker.getUpdatedBy());*/
	
		CustomUser user=customRepo.findAllEntitiesById(id);       
        entity.setCustomUser(user);
	 
		Set<SkillsMaster> skills=skillRepo.findAllEntitiesById(id);       
        entity.setSkills(skills);
     
        Set<File> file=fileRep.findAllEntitiesById(id);       
        entity.setFiles(file);
        
        Set<Education> edu=eduRepo.findAllEntitiesById(id);       
        entity.setEducations(edu);
        
        Set<Certificate> cert=certRepo.findAllEntitiesById(id);       
        entity.setCertificates(cert);
        
        Set<Employment> emp=empRepo.findAllEntitiesById(id);       
        entity.setEmployments(emp);
        
        Set<Portfolio> port=portRepo.findAllEntitiesById(id);       
        entity.setPortfolios(port);
        
        Set<Refereces> ref=refRepo.findAllEntitiesById(id);       
        entity.setRefereces(ref);
        
        Set<JobPreference> job=jobRepo.findAllEntitiesById(id);       
        entity.setJobPreferences(job);
        
		
        System.out.println("consumer");

        System.out.println(worker);
        rep1.save(entity);
    }
}
