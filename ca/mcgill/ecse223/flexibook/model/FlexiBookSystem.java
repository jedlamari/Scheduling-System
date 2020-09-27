/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/

package ca.mcgill.ecse223.flexibook.model;
import java.util.*;

// line 5 "../../../../../Domain Model v1.1.ump"
// line 121 "../../../../../Domain Model v1.1.ump"
public class FlexiBookSystem
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static FlexiBookSystem theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //FlexiBookSystem Attributes
  private String address;
  private String phoneNumber;
  private String emailAddress;
  private boolean hasUserLoggedIn;

  //FlexiBookSystem Associations
  private List<Account> accounts;
  private List<Service> services;
  private Calendar calendar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private FlexiBookSystem()
  {
    address = null;
    phoneNumber = null;
    emailAddress = null;
    hasUserLoggedIn = false;
    accounts = new ArrayList<Account>();
    services = new ArrayList<Service>();
  }

  public static FlexiBookSystem getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new FlexiBookSystem();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setPhoneNumber(String aPhoneNumber)
  {
    boolean wasSet = false;
    phoneNumber = aPhoneNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmailAddress(String aEmailAddress)
  {
    boolean wasSet = false;
    emailAddress = aEmailAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setHasUserLoggedIn(boolean aHasUserLoggedIn)
  {
    boolean wasSet = false;
    hasUserLoggedIn = aHasUserLoggedIn;
    wasSet = true;
    return wasSet;
  }

  public String getAddress()
  {
    return address;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getEmailAddress()
  {
    return emailAddress;
  }

  public boolean getHasUserLoggedIn()
  {
    return hasUserLoggedIn;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isHasUserLoggedIn()
  {
    return hasUserLoggedIn;
  }
  /* Code from template association_GetMany */
  public Account getAccount(int index)
  {
    Account aAccount = accounts.get(index);
    return aAccount;
  }

  public List<Account> getAccounts()
  {
    List<Account> newAccounts = Collections.unmodifiableList(accounts);
    return newAccounts;
  }

  public int numberOfAccounts()
  {
    int number = accounts.size();
    return number;
  }

  public boolean hasAccounts()
  {
    boolean has = accounts.size() > 0;
    return has;
  }

  public int indexOfAccount(Account aAccount)
  {
    int index = accounts.indexOf(aAccount);
    return index;
  }
  /* Code from template association_GetMany */
  public Service getService(int index)
  {
    Service aService = services.get(index);
    return aService;
  }

  public List<Service> getServices()
  {
    List<Service> newServices = Collections.unmodifiableList(services);
    return newServices;
  }

  public int numberOfServices()
  {
    int number = services.size();
    return number;
  }

  public boolean hasServices()
  {
    boolean has = services.size() > 0;
    return has;
  }

  public int indexOfService(Service aService)
  {
    int index = services.indexOf(aService);
    return index;
  }
  /* Code from template association_GetOne */
  public Calendar getCalendar()
  {
    return calendar;
  }

  public boolean hasCalendar()
  {
    boolean has = calendar != null;
    return has;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAccounts()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */


  public boolean addAccount(Account aAccount)
  {
    boolean wasAdded = false;
    if (accounts.contains(aAccount)) { return false; }
    FlexiBookSystem existingFlexiBookSystem = aAccount.getFlexiBookSystem();
    boolean isNewFlexiBookSystem = existingFlexiBookSystem != null && !this.equals(existingFlexiBookSystem);
    if (isNewFlexiBookSystem)
    {
      aAccount.setFlexiBookSystem(this);
    }
    else
    {
      accounts.add(aAccount);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAccount(Account aAccount)
  {
    boolean wasRemoved = false;
    //Unable to remove aAccount, as it must always have a flexiBookSystem
    if (!this.equals(aAccount.getFlexiBookSystem()))
    {
      accounts.remove(aAccount);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAccountAt(Account aAccount, int index)
  {  
    boolean wasAdded = false;
    if(addAccount(aAccount))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAccounts()) { index = numberOfAccounts() - 1; }
      accounts.remove(aAccount);
      accounts.add(index, aAccount);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAccountAt(Account aAccount, int index)
  {
    boolean wasAdded = false;
    if(accounts.contains(aAccount))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAccounts()) { index = numberOfAccounts() - 1; }
      accounts.remove(aAccount);
      accounts.add(index, aAccount);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAccountAt(aAccount, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfServices()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */


  public boolean addService(Service aService)
  {
    boolean wasAdded = false;
    if (services.contains(aService)) { return false; }
    FlexiBookSystem existingFlexiBookSystem = aService.getFlexiBookSystem();
    boolean isNewFlexiBookSystem = existingFlexiBookSystem != null && !this.equals(existingFlexiBookSystem);
    if (isNewFlexiBookSystem)
    {
      aService.setFlexiBookSystem(this);
    }
    else
    {
      services.add(aService);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeService(Service aService)
  {
    boolean wasRemoved = false;
    //Unable to remove aService, as it must always have a flexiBookSystem
    if (!this.equals(aService.getFlexiBookSystem()))
    {
      services.remove(aService);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addServiceAt(Service aService, int index)
  {  
    boolean wasAdded = false;
    if(addService(aService))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfServices()) { index = numberOfServices() - 1; }
      services.remove(aService);
      services.add(index, aService);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveServiceAt(Service aService, int index)
  {
    boolean wasAdded = false;
    if(services.contains(aService))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfServices()) { index = numberOfServices() - 1; }
      services.remove(aService);
      services.add(index, aService);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addServiceAt(aService, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setCalendar(Calendar aNewCalendar)
  {
    boolean wasSet = false;
    if (calendar != null && !calendar.equals(aNewCalendar) && equals(calendar.getFlexiBookSystem()))
    {
      //Unable to setCalendar, as existing calendar would become an orphan
      return wasSet;
    }

    calendar = aNewCalendar;
    FlexiBookSystem anOldFlexiBookSystem = aNewCalendar != null ? aNewCalendar.getFlexiBookSystem() : null;

    if (!this.equals(anOldFlexiBookSystem))
    {
      if (anOldFlexiBookSystem != null)
      {
        anOldFlexiBookSystem.calendar = null;
      }
      if (calendar != null)
      {
        calendar.setFlexiBookSystem(this);
      }
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while (accounts.size() > 0)
    {
      Account aAccount = accounts.get(accounts.size() - 1);
      aAccount.delete();
      accounts.remove(aAccount);
    }
    
    while (services.size() > 0)
    {
      Service aService = services.get(services.size() - 1);
      aService.delete();
      services.remove(aService);
    }
    
    Calendar existingCalendar = calendar;
    calendar = null;
    if (existingCalendar != null)
    {
      existingCalendar.delete();
      existingCalendar.setFlexiBookSystem(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "address" + ":" + getAddress()+ "," +
            "phoneNumber" + ":" + getPhoneNumber()+ "," +
            "emailAddress" + ":" + getEmailAddress()+ "," +
            "hasUserLoggedIn" + ":" + getHasUserLoggedIn()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "calendar = "+(getCalendar()!=null?Integer.toHexString(System.identityHashCode(getCalendar())):"null");
  }
}