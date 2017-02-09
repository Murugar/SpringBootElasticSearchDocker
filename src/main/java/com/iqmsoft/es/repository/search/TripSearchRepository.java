package com.iqmsoft.es.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.es.domain.Trip;

@Repository
public interface TripSearchRepository extends ElasticsearchRepository<Trip, Long>{

}
