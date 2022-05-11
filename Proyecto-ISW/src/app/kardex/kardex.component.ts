import { Component, OnInit } from '@angular/core';
import { userInfo } from 'os';
import { RestService } from '../rest.service';
import { listarcalif } from './kardex.interface';

@Component({
  selector: 'app-kardex',
  templateUrl: './kardex.component.html',
  styleUrls: ['./kardex.component.css']
})
export class KardexComponent implements OnInit {
  public user : any;

  calif : listarcalif[];
  constructor(private rest:RestService){}
  ngOnInit(): void {
    this.rest.get("http://localhost:8080/Materias/findAll").subscribe(data => {
      this.calif = data;
    });
  }

}
