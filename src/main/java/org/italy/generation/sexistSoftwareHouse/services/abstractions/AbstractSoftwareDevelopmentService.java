package org.italy.generation.sexistSoftwareHouse.services.abstractions;

import org.italy.generation.sexistSoftwareHouse.model.CompetenceLevel;
import org.italy.generation.sexistSoftwareHouse.model.entities.Competence;
import org.italy.generation.sexistSoftwareHouse.model.entities.Developer;

public interface AbstractSoftwareDevelopmentService {

   void addDeveloper();
   void fireDeveloper();
   Iterable<Developer> getDevByGradeYCompetence(String part, CompetenceLevel minLevel);
   Iterable<Developer> getDevsByCompetenceNum(int competenceNum);
   Iterable<Developer> getDevsByCompetenceNumYLevel(int competenceNum);
   Iterable<Competence> getAllCompetences();
   boolean getCompetenceByExactName(String competence);
   double getAverageSalary();
   double getMaxSalary();
   boolean isYourFirmSexist();
   Iterable<Integer> getModesOfSeniority();
}
