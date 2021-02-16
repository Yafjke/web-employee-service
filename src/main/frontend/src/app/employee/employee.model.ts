export class Employee{
  public id: number;
  public name: string;
  public company: string;
  public position: string;
  public phonenum: string;
  public mail: string;

constructor(name: string, company: string, position: string, phonenum:string, mail:string) {
  this.name = name;
  this.company = company;
  this.position = position;
  this.phonenum = phonenum;
  this.mail = mail;
}
}
