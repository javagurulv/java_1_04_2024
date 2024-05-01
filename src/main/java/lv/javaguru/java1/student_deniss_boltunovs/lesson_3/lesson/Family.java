package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

class Family {

     private FamilyMember father;
     private FamilyMember mother;
     private FamilyMember child1;
     private FamilyMember child2;

     public Family(FamilyMember father,
                   FamilyMember mother,
                   FamilyMember child1,
                   FamilyMember child2) {

         this.father = father;
         this.mother = mother;
         this.child1 = child1;
         this.child2 = child2;
     }

     public FamilyMember getFather() {
         return this.father;
     }

     public FamilyMember getMother() {
         return this.mother;
     }

     public FamilyMember getChild1() {
         return this.child1;
     }

     public FamilyMember getChild2(){
         return this.child2;
     }

}
