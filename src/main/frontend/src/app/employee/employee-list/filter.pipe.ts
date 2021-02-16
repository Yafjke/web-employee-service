import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(items: any[], searchEmployee): any[] {

  if (!items) {
  return [];
  }
  if (!searchEmployee) {
  return items;
  }
  searchEmployee = searchEmployee.toLocaleLowerCase();
   return items.filter(it => {
      return it.employeeName.toLocaleLowerCase().indexOf(searchEmployee) > - 1 ||
       it.employeePosition.toLocaleLowerCase().indexOf(searchEmployee) > - 1 ||
       it.company.toLocaleLowerCase().indexOf(searchEmployee) > - 1 ||
       it.employeePhoneNumber.toLocaleLowerCase().indexOf(searchEmployee) > - 1 ||
       it.employeeMail.toLocaleLowerCase().indexOf(searchEmployee) > - 1;
    });
}

}
