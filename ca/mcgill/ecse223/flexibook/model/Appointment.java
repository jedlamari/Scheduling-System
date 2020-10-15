/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/

package ca.mcgill.ecse223.flexibook.model;
import java.sql.Date;
import java.sql.Time;

<<<<<<< HEAD
// line 77 "../../../../../Version 0.5 - CC, YW.ump"
// line 169 "../../../../../Version 0.5 - CC, YW.ump"
=======
// line 62 "../../../../../Domain Model v1.1.ump"
// line 151 "../../../../../Domain Model v1.1.ump"
>>>>>>> master
public class Appointment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Appointment Attributes
<<<<<<< HEAD
  private Date serviceStartDate;
  private Time serviceStartTime;
  private boolean isCancelled;

  //Appointment Associations
  private Customer customer;
  private Calendar calendar;
  private Service service;
=======
  private Date appointmentStartDate;
  private Time appointmentStartTime;
  private boolean isCancelled;

  //Appointment Associations
  private CustomerAccount customerAccount;
  private Service serviceChosen;
>>>>>>> master

  //------------------------
  // CONSTRUCTOR
  //------------------------

<<<<<<< HEAD
  public Appointment(Date aServiceStartDate, Time aServiceStartTime, boolean aIsCancelled, Customer aCustomer, Calendar aCalendar, Service aService)
  {
    serviceStartDate = aServiceStartDate;
    serviceStartTime = aServiceStartTime;
    isCancelled = aIsCancelled;
    boolean didAddCustomer = setCustomer(aCustomer);
    if (!didAddCustomer)
    {
      throw new RuntimeException("Unable to create appointment due to customer. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddCalendar = setCalendar(aCalendar);
    if (!didAddCalendar)
    {
      throw new RuntimeException("Unable to create appointment due to calendar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddService = setService(aService);
    if (!didAddService)
    {
      throw new RuntimeException("Unable to create appointment due to service. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
=======
  public Appointment(Date aAppointmentStartDate, Time aAppointmentStartTime, boolean aIsCancelled, CustomerAccount aCustomerAccount, Service aServiceChosen)
  {
    appointmentStartDate = aAppointmentStartDate;
    appointmentStartTime = aAppointmentStartTime;
    isCancelled = aIsCancelled;
    boolean didAddCustomerAccount = setCustomerAccount(aCustomerAccount);
    if (!didAddCustomerAccount)
    {
      throw new RuntimeException("Unable to create appointment due to customerAccount. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    if (!setServiceChosen(aServiceChosen))
    {
      throw new RuntimeException("Unable to create Appointment due to aServiceChosen. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
>>>>>>> master
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

<<<<<<< HEAD
  public boolean setServiceStartDate(Date aServiceStartDate)
  {
    boolean wasSet = false;
    serviceStartDate = aServiceStartDate;
=======
  public boolean setAppointmentStartDate(Date aAppointmentStartDate)
  {
    boolean wasSet = false;
    appointmentStartDate = aAppointmentStartDate;
>>>>>>> master
    wasSet = true;
    return wasSet;
  }

<<<<<<< HEAD
  public boolean setServiceStartTime(Time aServiceStartTime)
  {
    boolean wasSet = false;
    serviceStartTime = aServiceStartTime;
=======
  public boolean setAppointmentStartTime(Time aAppointmentStartTime)
  {
    boolean wasSet = false;
    appointmentStartTime = aAppointmentStartTime;
>>>>>>> master
    wasSet = true;
    return wasSet;
  }

  public boolean setIsCancelled(boolean aIsCancelled)
  {
    boolean wasSet = false;
    isCancelled = aIsCancelled;
    wasSet = true;
    return wasSet;
  }

<<<<<<< HEAD
  public Date getServiceStartDate()
  {
    return serviceStartDate;
  }

  public Time getServiceStartTime()
  {
    return serviceStartTime;
=======
  public Date getAppointmentStartDate()
  {
    return appointmentStartDate;
  }

  public Time getAppointmentStartTime()
  {
    return appointmentStartTime;
>>>>>>> master
  }

  public boolean getIsCancelled()
  {
    return isCancelled;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsCancelled()
  {
    return isCancelled;
  }
  /* Code from template association_GetOne */
<<<<<<< HEAD
  public Customer getCustomer()
  {
    return customer;
  }
  /* Code from template association_GetOne */
  public Calendar getCalendar()
  {
    return calendar;
  }
  /* Code from template association_GetOne */
  public Service getService()
  {
    return service;
  }
  /* Code from template association_SetOneToMany */
  public boolean setCustomer(Customer aCustomer)
  {
    boolean wasSet = false;
    if (aCustomer == null)
=======
  public CustomerAccount getCustomerAccount()
  {
    return customerAccount;
  }
  /* Code from template association_GetOne */
  public Service getServiceChosen()
  {
    return serviceChosen;
  }
  /* Code from template association_SetOneToMany */
  public boolean setCustomerAccount(CustomerAccount aCustomerAccount)
  {
    boolean wasSet = false;
    if (aCustomerAccount == null)
>>>>>>> master
    {
      return wasSet;
    }

<<<<<<< HEAD
    Customer existingCustomer = customer;
    customer = aCustomer;
    if (existingCustomer != null && !existingCustomer.equals(aCustomer))
    {
      existingCustomer.removeAppointment(this);
    }
    customer.addAppointment(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setCalendar(Calendar aCalendar)
  {
    boolean wasSet = false;
    if (aCalendar == null)
    {
      return wasSet;
    }

    Calendar existingCalendar = calendar;
    calendar = aCalendar;
    if (existingCalendar != null && !existingCalendar.equals(aCalendar))
    {
      existingCalendar.removeAppointment(this);
    }
    calendar.addAppointment(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setService(Service aService)
  {
    boolean wasSet = false;
    if (aService == null)
    {
      return wasSet;
    }

    Service existingService = service;
    service = aService;
    if (existingService != null && !existingService.equals(aService))
    {
      existingService.removeAppointment(this);
    }
    service.addAppointment(this);
    wasSet = true;
=======
    CustomerAccount existingCustomerAccount = customerAccount;
    customerAccount = aCustomerAccount;
    if (existingCustomerAccount != null && !existingCustomerAccount.equals(aCustomerAccount))
    {
      existingCustomerAccount.removeAppointment(this);
    }
    customerAccount.addAppointment(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setServiceChosen(Service aNewServiceChosen)
  {
    boolean wasSet = false;
    if (aNewServiceChosen != null)
    {
      serviceChosen = aNewServiceChosen;
      wasSet = true;
    }
>>>>>>> master
    return wasSet;
  }

  public void delete()
  {
<<<<<<< HEAD
    Customer existingCustomer = customer;
    customer = null;
    if (existingCustomer != null)
    {
      existingCustomer.delete();
    }
    Calendar placeholderCalendar = calendar;
    this.calendar = null;
    if(placeholderCalendar != null)
    {
      placeholderCalendar.removeAppointment(this);
    }
    Service placeholderService = service;
    this.service = null;
    if(placeholderService != null)
    {
      placeholderService.removeAppointment(this);
    }
=======
    CustomerAccount placeholderCustomerAccount = customerAccount;
    this.customerAccount = null;
    if(placeholderCustomerAccount != null)
    {
      placeholderCustomerAccount.removeAppointment(this);
    }
    serviceChosen = null;
>>>>>>> master
  }


  public String toString()
  {
    return super.toString() + "["+
            "isCancelled" + ":" + getIsCancelled()+ "]" + System.getProperties().getProperty("line.separator") +
<<<<<<< HEAD
            "  " + "serviceStartDate" + "=" + (getServiceStartDate() != null ? !getServiceStartDate().equals(this)  ? getServiceStartDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "serviceStartTime" + "=" + (getServiceStartTime() != null ? !getServiceStartTime().equals(this)  ? getServiceStartTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "customer = "+(getCustomer()!=null?Integer.toHexString(System.identityHashCode(getCustomer())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "calendar = "+(getCalendar()!=null?Integer.toHexString(System.identityHashCode(getCalendar())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "service = "+(getService()!=null?Integer.toHexString(System.identityHashCode(getService())):"null");
=======
            "  " + "appointmentStartDate" + "=" + (getAppointmentStartDate() != null ? !getAppointmentStartDate().equals(this)  ? getAppointmentStartDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "appointmentStartTime" + "=" + (getAppointmentStartTime() != null ? !getAppointmentStartTime().equals(this)  ? getAppointmentStartTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "customerAccount = "+(getCustomerAccount()!=null?Integer.toHexString(System.identityHashCode(getCustomerAccount())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "serviceChosen = "+(getServiceChosen()!=null?Integer.toHexString(System.identityHashCode(getServiceChosen())):"null");
>>>>>>> master
  }
}