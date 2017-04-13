package ru.stqa.pft.addressbook;

public class GroupDataContact {
  private final String name;
  private final String middlename;
  private final String surname;
  private final String phone;
  private final String actualAddress;
  private final String organizationName;
  private final String nickName;

  public GroupDataContact(String name, String middlename, String surname, String phone, String actualAddress, String organizationName, String nickName) {
    this.name = name;
    this.middlename = middlename;
    this.surname = surname;
    this.phone = phone;
    this.actualAddress = actualAddress;
    this.organizationName = organizationName;
    this.nickName = nickName;
  }

  public String getName() {
    return name;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getSurname() {
    return surname;
  }

  public String getPhone() {
    return phone;
  }

  public String getActualAddress() {
    return actualAddress;
  }

  public String getOrganizationName() {
    return organizationName;
  }

  public String getNickName() {
    return nickName;
  }
}
