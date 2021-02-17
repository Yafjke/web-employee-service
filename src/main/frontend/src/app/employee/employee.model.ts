export class Employee{
  public id: number;
  public employeeName: string;
  public employeeCompany: string;
  public employeePosition: string;
  public employeePhoneNumber: string;
  public employeeMail: string;

constructor(employeeName: string, employeeCompany: string, employeePosition: string, employeePhoneNumber:string, employeeMail:string) {
  this.employeeName = employeeName;
  this.employeeCompany = employeeCompany;
  this.employeePosition = employeePosition;
  this.employeePhoneNumber = employeePhoneNumber;
  this.employeeMail = employeeMail;
}
}
