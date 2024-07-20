package com.restapi.bootstrapapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.restapi.bootstrapapi.entities.Load;
import com.restapi.bootstrapapi.services.LoadService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/load")
public class LoadController {

    @Autowired
    private LoadService loadService;

    @PostMapping
    public ResponseEntity<String> createLoad(@RequestBody Load load) {
        loadService.saveLoad(load);
        return ResponseEntity.ok("Load details added successfully");
    }

    @GetMapping
    public ResponseEntity<List<Load>> getLoads(@RequestParam UUID shipperId) {
        return ResponseEntity.ok(loadService.getLoadsByShipperId(shipperId));
    }

    @GetMapping("/{loadId}")
    public ResponseEntity<Optional<Load>> getLoadById(@PathVariable UUID loadId) {
        return ResponseEntity.ok(loadService.getLoadById(loadId));
    }

    @PutMapping("/{loadId}")
    public ResponseEntity<Load> updateLoad(@PathVariable UUID loadId, @RequestBody Load loadDetails) {
        return ResponseEntity.ok(loadService.updateLoad(loadId, loadDetails));
    }

    @DeleteMapping("/{loadId}")
    public ResponseEntity<Void> deleteLoad(@PathVariable UUID loadId) {
        loadService.deleteLoad(loadId);
        return ResponseEntity.noContent().build();
    }
}

				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				   
				
