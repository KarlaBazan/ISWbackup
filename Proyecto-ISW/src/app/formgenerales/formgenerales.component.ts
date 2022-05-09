import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormBuilder } from '@angular/forms';


@Component({
  selector: 'app-formgenerales',
  templateUrl: './formgenerales.component.html',
  styleUrls: ['./formgenerales.component.css']
})
export class FormgeneralesComponent implements OnInit {
  public user: any;
  public formgenerales: FormGroup;
  constructor(private formBuilder: FormBuilder) { }

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

    this.formgenerales = this.formBuilder.group({
      boleta:'', 
      nombre: '', 
      curp: '',
      rfc: '',
      nacionalidad: '' 

    });

    this.formgenerales.patchValue({
      boleta:this.user.boleta, 
      nombre: this.user.nombre +" "+ this.user.paterno + " "+ this.user.materno, 
      curp: this.user.curp,
      rfc: this.user.rfc, 
      nacionalidad: this.user.nacionalidad 
    });

    
  }
  


  public update(){
    console.log("a");
  }

}
