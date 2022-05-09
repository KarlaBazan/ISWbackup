import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navdata',
  templateUrl: './navdata.component.html',
  styleUrls: ['./navdata.component.css']
})
export class NavdataComponent implements OnInit {
  public user: any; 
  constructor() { }

  ngOnInit(): void {
    
    this.user=JSON.parse(localStorage.getItem("user")??`{
      "boleta": "000000000",
    "nombre": "Jhon",
    "paterno": "Doe",
    "materno": "Doe",
    "foto": null,
    "rfc": "AXXX9999XXX",
    "curp": "AXXZZ009SSA090",
    "nacionalidad": "Mexa",
    "cartilla": "XXXXXX",
    "pasaporte": "XXXXXXX",
    "direcciones_iddireccion": 1,
    "datosmedicos_num_seg_social": 1234567,
    "password": null}`);
  }





  public logOut(){
    window.location.href='/login';
    localStorage.removeItem("user");
  }


}


