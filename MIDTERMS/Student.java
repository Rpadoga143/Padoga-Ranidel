package Student;

class Student {
   String first_name = "";
   String middle_name = "";
   String last_name = "";
   String student_suffix = "";
   
   
   public Student(String fName,
                 String mName,
                 String lName,
                 String suffix)
              {
 
      first_name = fName;
      middle_name = mName; 
      last_name = lName;
      student_suffix = suffix;
   
   }
  
   public String getFirstName(){  
     
     return first_Name;
   }
   
   public String GetMiddleName(){
   
    return middle_name;
   } 
   
    public String GetLastName(){
    return last_name;
   
   } 
   
   public String GetSuffix(){
   
   return suffix;
   
   } 
   
   public void setFirstName(String fName){
      first_name = fName;
   }
   
   public void setmiddleName(String mName){
     middle_name = mName;
   }
   
   public void setlastName(String lName){
      last_name = lName;
   }
   
   public void setlsuffix(String suffix){
      student_suffix = suffix;
   }

   

   
}