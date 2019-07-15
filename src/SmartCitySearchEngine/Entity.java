/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCitySearchEngine;

/**
 *
 * @author ashik
 */
public class Entity {
    private String id;
    private String name;
    private String type;
    private String location;
    private String phone;
    private String email;
    private String website;
    Entity(String id,String name,String type,String  location,String  phone,String  email,String  website)
    {
     this.id=id;
     this.name=name;
     this.type=type;
     this.location=location;
     this.phone=phone;
     this.email=email;
     this. website=website;
    }
    public String getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getType()
    {
        return  type;
    }
    
    public String getLocation()
    {
        return location ;
    }
         public String getPhone()
    {
        return phone;
    }
          public String getEmail()
    {
        return email ;
    }
     public String getWebsite()
    {
        return website;
    }
}
