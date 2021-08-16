package com.simplify.marketplace.repository;

import com.simplify.marketplace.service.dto.WorkerDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface WorkerDTORepo extends ElasticsearchRepository<WorkerDTO, String> {}
