public class Methods {
    public static void main(String[] args) {
    String str = "   Welcome   "; // created in String pool 
     
    System.out.println(str); // print the same String
    System.out.println(str.length()); // return the length of String
    System.out.println(str.trim()); // remove all blank space and return new String
    System.out.println(str.toLowerCase()); // convert to lower case and return new String
    System.out.println(str.toUpperCase()); // convert to upper case and return new String
    System.out.println(str.substring(0)); // from index 0 to last and return new String
    System.out.println(str.substring(6, 10)); //from 3rd index to 6-5 index and return new String 
    System.out.println(str.replace('o', 'a')); // replace o by a and return new String 
    System.out.println(str.startsWith("Wel")); //return true if Wel un start of String 
    System.out.println(str.endsWith("me")); // retrue if ends with me
    System.out.println(str.charAt(2)); // return char at give index
    System.out.println(str.indexOf('W')); //return index of given char
    System.out.println(str.indexOf("Wel")); 
    System.out.println(str.lastIndexOf("Wel"));
    System.out.println(str.equals("   Welcome   ")); // compair to string andd return boolean
    System.out.println(str.equalsIgnoreCase("   WeLCome   ")); 
    System.out.println(str.compareTo("   WeLco"));
    System.out.println(str.compareTo("   w"));
    System.out.println(str.compareTo("   Welcome   "));
    System.out.println(String.valueOf(5)); // convert int into Integer object it is a static method
    System.out.println(str.concat(" to Home")); // concate the given String  and return new String
    System.out.println(str.contains("Wel")); // return boolean 
   
   String str2 = "rohitkumarojha@gmail.com"; // saprate the user name and Domain and cheack domain is valid or not
   String str3 = "gmail.com";
    System.out.println(str2.substring(0, str2.indexOf('@')) + "--" + str2.substring(str2.indexOf('@')+1,str2.length()));

    System.out.println(str3.equals(str2.substring(str2.indexOf('@')+1,str2.length())));
    


}
    
}
