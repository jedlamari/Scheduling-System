/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/

package ca.mcgill.ecse223.flexibook.model;
import java.util.*;

// line 19 "../../../../../Domain Model v1.1.ump"
// line 129 "../../../../../Domain Model v1.1.ump"
public abstract class Account
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static Map<String, Account> accountsByName = new HashMap<String, Account>();

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private String name;
  private String password;
  private boolean isOwner;
  private boolean isActive;

  //Account Associations
  private FlexiBookSystem flexiBookSystem;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(String aName, String aPassword, boolean aIsOwner, boolean aIsActive, FlexiBookSystem aFlexiBookSystem)
  {
    password = aPassword;
    isOwner = aIsOwner;
    isActive = aIsActive;
    if (!setName(aName))
    {
      throw new RuntimeException("Cannot create due to duplicate name. See http://manual.umple.org?RE003ViolationofUniqueness.html");
    }
    boolean didAddFlexiBookSystem = setFlexiBookSystem(aFlexiBookSystem);
    if (!didAddFlexiBookSystem)
    {
      throw new RuntimeException("Unable to create account due to flexiBookSystem. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    String anOldName = getName();
    if (anOldName != null && anOldName.equals(aName)) {
      return true;
    }
    if (hasWithName(aName)) {
      return wasSet;
    }
    name = aName;
    wasSet = true;
    if (anOldName != null) {
      accountsByName.remove(anOldName);
    }
    accountsByName.put(aName, this);
    return wasSet;
  }

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsOwner(boolean aIsOwner)
  {
    boolean wasSet = false;
    isOwner = aIsOwner;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsActive(boolean aIsActive)
  {
    boolean wasSet = false;
    isActive = aIsActive;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template attribute_GetUnique */
  public static Account getWithName(String aName)
  {
    return accountsByName.get(aName);
  }
  /* Code from template attribute_HasUnique */
  public static boolean hasWithName(String aName)
  {
    return getWithName(aName) != null;
  }

  public String getPassword()
  {
    return password;
  }

  public boolean getIsOwner()
  {
    return isOwner;
  }

  public boolean getIsActive()
  {
    return isActive;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsOwner()
  {
    return isOwner;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsActive()
  {
    return isActive;
  }
  /* Code from template association_GetOne */
  public FlexiBookSystem getFlexiBookSystem()
  {
    return flexiBookSystem;
  }
  /* Code from template association_SetOneToMany */
  public boolean setFlexiBookSystem(FlexiBookSystem aFlexiBookSystem)
  {
    boolean wasSet = false;
    if (aFlexiBookSystem == null)
    {
      return wasSet;
    }

    FlexiBookSystem existingFlexiBookSystem = flexiBookSystem;
    flexiBookSystem = aFlexiBookSystem;
    if (existingFlexiBookSystem != null && !existingFlexiBookSystem.equals(aFlexiBookSystem))
    {
      existingFlexiBookSystem.removeAccount(this);
    }
    flexiBookSystem.addAccount(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    accountsByName.remove(getName());
    FlexiBookSystem placeholderFlexiBookSystem = flexiBookSystem;
    this.flexiBookSystem = null;
    if(placeholderFlexiBookSystem != null)
    {
      placeholderFlexiBookSystem.removeAccount(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "password" + ":" + getPassword()+ "," +
            "isOwner" + ":" + getIsOwner()+ "," +
            "isActive" + ":" + getIsActive()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "flexiBookSystem = "+(getFlexiBookSystem()!=null?Integer.toHexString(System.identityHashCode(getFlexiBookSystem())):"null");
  }
}