package tn.esprim.gestionfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestionfoyer.repositories.EtudiantRepository;
@Service
public class EtudiantServiceImpl  implements IEtudiantService{
    @Autowired
    private EtudiantRepository etudiantRepository;
}
