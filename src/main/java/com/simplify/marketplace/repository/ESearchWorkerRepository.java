package com.simplify.marketplace.repository;

import com.simplify.marketplace.domain.ElasticWorker;
import java.util.ArrayList;
//import java.util.Map;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ESearchWorkerRepository extends ElasticsearchRepository<ElasticWorker, String> {
    @Query("{\"match_all\":{}}")
    public ArrayList<ElasticWorker> matchAll();
    //	@Query(
    //
    //			bool:{
    //				should:{
    //					query_string:{
    //						query:"Machine"
    //					},
    //					multi_match:{
    //
    //					},
    //					query_string:{
    //
    //					}
    //				}
    //			}
    //
    //
    //			)
    //

}
