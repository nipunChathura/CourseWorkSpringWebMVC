package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CarTypeDTO;
import lk.ijse.spring.service.CarTypeService;
import lk.ijse.spring.service.impl.CarTypeServiceImpl;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carType")
@CrossOrigin
public class CarTypeController {
    @Autowired
    @Lazy
    CarTypeService carTypeService;

    @PostMapping
    public ResponseEntity addCarType(@RequestBody CarTypeDTO dto) {
        carTypeService.saveCarType(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteCarType(@RequestParam String id) {
        carTypeService.deleteCarType(id);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateCarType(@RequestBody CarTypeDTO dto) {
        carTypeService.updateCarType(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchCarType(@PathVariable String id) {
        CarTypeDTO carTypeDTO = carTypeService.searchCarType(id);
        return new ResponseEntity(new StandradResponse(200, "Success", carTypeDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllCasType() {
        List<CarTypeDTO> allCarTypes = carTypeService.getAllCarTypes();
        return new ResponseEntity(new StandradResponse(200, "Success", allCarTypes), HttpStatus.OK);
    }
}
