package org.italy.generation.sexistSoftwareHouse.model.data.abstractions;

import org.italy.generation.sexistSoftwareHouse.model.CompetenceLevel;
import org.italy.generation.sexistSoftwareHouse.model.entities.Competence;
import org.italy.generation.sexistSoftwareHouse.model.entities.Developer;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public interface DeveloperRepository {
   Map<Long, Iterable<String>> showAllDevelopers();

   void addDeveloper(Developer developer);
   void fireDeveloper(Developer developer);
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
