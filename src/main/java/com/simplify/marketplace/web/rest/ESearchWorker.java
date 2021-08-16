package com.simplify.marketplace.web.rest;

import com.simplify.marketplace.domain.ElasticWorker;
import com.simplify.marketplace.repository.ESearchWorkerRepository;
import java.util.ArrayList;
//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ESearchWorker {

    @Autowired
    ESearchWorkerRepository workerRepo;

    @GetMapping("/workers/{id}")
    public ElasticWorker getWorker(@PathVariable String id) {
        return workerRepo.findById(id).get();
    }

    @PostMapping("/workers")
    public ElasticWorker postWorker(@RequestBody ElasticWorker EW) {
        return workerRepo.save(EW);
    }

    @GetMapping("/allworkers")
    public Iterable<ElasticWorker> getall() {
        return workerRepo.findAll();
    }

    @GetMapping("/allworkerscustom")
    public ArrayList<ElasticWorker> matchall() {
        return workerRepo.matchAll();
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        workerRepo.deleteAll();
        return "Records Deleted Successfully";
    }
}
