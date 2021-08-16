package com.simplify.marketplace.repository;

import com.simplify.marketplace.domain.ElasticWorker;
import java.util.ArrayList;
//import java.util.Map;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;

public interface ESearchWorkerRepository extends ElasticsearchRepository<ElasticWorker, String> {
    @Query("{\"match_all\":{}}")
    public ArrayList<ElasticWorker> matchAll();

    @Query(
        "{\"bool\": {\n" +
        "      \"should\": [\n" +
        "        \n" +
        "            {\n" +
        "           \n" +
        "          \"query_string\": {\n" +
        "            \"query\": \"?0\",\n" +
        "            \"boost\": 1, \n" +
        "            \"default_operator\": \"OR\"\n" +
        "             \n" +
        "          }\n" +
        "            }, {\n" +
        "          \n" +
        "            \"query_string\": {\n" +
        "            \"query\": \"?0\",\n" +
        "            \"boost\": 10, \n" +
        "            \"default_operator\": \"AND\"\n" +
        "             \n" +
        "          }},\n" +
        "          {\"multi_match\": {\n" +
        "            \"query\": \"?0\",\n" +
        "            \"type\": \"phrase\",\n" +
        "            \"boost\": 100, \n" +
        "            \"fields\": [\"name\",\"description\"]\n" +
        "          }}\n" +
        "            \n" +
        "          \n" +
        "          \n" +
        "            \n" +
        "          \n" +
        "        \n" +
        "      ]\n" +
        "    }}"
    )
    public ArrayList<ElasticWorker> searchQuery(@Param("str") String parameter);
}
