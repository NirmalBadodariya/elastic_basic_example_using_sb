package com.elasticdemo.demo.repository;

import com.elasticdemo.demo.model.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends ElasticsearchRepository<Person, String> {
}