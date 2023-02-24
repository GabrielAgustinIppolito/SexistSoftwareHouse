package org.italy.generation.sexistSoftwareHouse.model.entities;

import org.italy.generation.sexistSoftwareHouse.model.CompetenceLevel;

public class Competence {
   private long id;
   private String name, description;
   private CompetenceLevel level;

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public CompetenceLevel getLevel() {
      return level;
   }

   public void setLevel(CompetenceLevel level) {
      this.level = level;
   }
}
