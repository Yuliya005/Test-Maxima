public class Main3 {
    public static void main(String[] args) {
     Person person = new Person.Builder();



    }
}

class Person {
    private String name;
    private String surName;
    private String thirdName;
    private Integer age;
    private String country;
    private String sex;
    private String paper;
    private String seriesPaper;
    private String numberPaper;
    private String familyStatus;


    private Person(Builder builder){
        this.name = builder.name;
        this.surName = builder.surName;
        this.thirdName = builder.thirdName;
        this.age = builder.age;
        this.country = builder.country;
        this.sex = builder.sex;
        this.paper = builder.paper;
        this.seriesPaper = builder.seriesPaper;
        this.numberPaper = builder.numberPaper;
        this.familyStatus = builder.familyStatus;

    }

    public static class Builder {
         private String name;
         private String surName;
         private String thirdName;
         private Integer age;
         private String country;
         private String sex;
         private String paper;
         private String seriesPaper;
         private String numberPaper;
         private String familyStatus;

         public Builder(String name,String surName,Integer age,String country,
                              String paper,String seriesPaper,String numberPaper){
             this.name=name;
             this.surName=surName;
             this.age=age;
             this.country=country;
             this.paper=paper;
             this.seriesPaper=seriesPaper;
             this.numberPaper=numberPaper;

         }
         public Builder thirdName(String thirdName){
             this.thirdName=thirdName;
             return this;
         }

         public Builder sex(String sex){
             this.sex=sex;
             return this;
         }

         public Builder familyStatus( String familyStatus){
             this.familyStatus=familyStatus;
             return  this;
         }
         public Person build(){
             return new Person(this);
         }


    }
}
