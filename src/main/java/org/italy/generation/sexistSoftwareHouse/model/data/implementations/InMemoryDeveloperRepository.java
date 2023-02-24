package org.italy.generation.sexistSoftwareHouse.model.data.implementations;

import org.italy.generation.sexistSoftwareHouse.model.CompetenceLevel;
import org.italy.generation.sexistSoftwareHouse.model.data.abstractions.DeveloperRepository;
import org.italy.generation.sexistSoftwareHouse.model.entities.Competence;
import org.italy.generation.sexistSoftwareHouse.model.entities.Developer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryDeveloperRepository implements DeveloperRepository {
   private Map<Long, Developer> dataSource;
   private static Long nextId;
   @Override
   public Map<Long, Iterable<String>> showAllDevelopers() {
      return null;
   }

   @Override
   public void addDeveloper(Developer developer) {
      developer.setId(++nextId);
      dataSource.putIfAbsent(developer.getId(), developer);
   }

   @Override
   public void fireDeveloper(Developer developer) {
      dataSource.remove(developer.getId());
   }

   @Override
   public Iterable<Developer> getDevByGradeYCompetence(String part, CompetenceLevel minLevel) {
      var competences = dataSource.values().stream()
            .map(Developer::getCompetences).;
      competences.get(0).get(0).


      Map<Developer, Iterable<Competence>> = dataSource.values().stream().collect(Collectors.toList(Collectors.groupingBy(Developer::getId, Developer::getCompetences)))
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
