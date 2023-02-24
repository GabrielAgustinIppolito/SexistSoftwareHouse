package org.italy.generation.sexistSoftwareHouse.model;

public enum CompetenceLevel {
   BASE(0), MIDDLE(1),ADVANCED(2),GURU(3),GOD(4);
   private int grade;
   private CompetenceLevel(int grade){
      this.grade=grade;
   }

   public int getGrade() {
      return grade;
   }
}
