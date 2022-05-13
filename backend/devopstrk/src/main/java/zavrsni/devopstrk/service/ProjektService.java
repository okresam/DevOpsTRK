package zavrsni.devopstrk.service;

import zavrsni.devopstrk.model.Korisnik;
import zavrsni.devopstrk.model.Projekt;

import java.util.List;

public interface ProjektService {
    List<Projekt> listAll();

    Projekt createProjekt(Projekt projekt);
}