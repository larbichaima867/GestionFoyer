package tn.esprim.gestionfoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.gestionfoyer.service.IFoyerService;
@RestController
public class FoyerRestController {
    @Autowired
    private IFoyerService foyerService;
}
