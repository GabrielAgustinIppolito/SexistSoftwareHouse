package org.italy.generation.sexistSoftwareHouse.services.implementations;

import org.italy.generation.sexistSoftwareHouse.model.CompetenceLevel;
import org.italy.generation.sexistSoftwareHouse.model.data.abstractions.DeveloperRepository;
import org.italy.generation.sexistSoftwareHouse.model.entities.Competence;
import org.italy.generation.sexistSoftwareHouse.model.entities.Developer;
import org.italy.generation.sexistSoftwareHouse.services.abstractions.AbstractSoftwareDevelopmentService;

public class SoftwareDevelopmentService implements AbstractSoftwareDevelopmentService {
   private DeveloperRepository repo;

   public SoftwareDevelopmentService(DeveloperRepository repo) {
      this.repo = repo;
   }

   @Override
   public void addDeveloper() {

   }

   @Override
   public void fireDeveloper() {

   }

   @Override
   public Iterable<Developer> getDevByGradeYCompetence(String part, CompetenceLevel minLevel) {
      return null;
   }

   @Override
   public Iterable<Developer> getDevsByCompetenceNum(int competenceNum) {
      return null;
   }

   @Override
   public Iterable<Developer> getDevsByCompetenceNumYLevel(int competenceNum) {
      return null;
   }

   @Override
   public Iterable<Competence> getAllCompetences() {
      return null;
   }

   @Override
   public boolean getCompetenceByExactName(String competence) {
      return false;
   }

   @Override
   public double getAverageSalary() {
      return 0;
   }

   @Override
   public double getMaxSalary() {
      return 0;
   }

   @Override
   public boolean isYourFirmSexist() {
      return false;
   }

   @Override
   public Iterable<Integer> getModesOfSeniority() {
      return null;
   }
}
