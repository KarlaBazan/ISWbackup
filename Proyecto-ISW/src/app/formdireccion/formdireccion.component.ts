import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { response } from 'express';
import { RestService } from '../rest.service';


@Component({
  selector: 'app-formdireccion',
  templateUrl: './formdireccion.component.html',
  styleUrls: ['./formdireccion.component.css']
})
export class FormdireccionComponent implements OnInit {
  public user: any;
  public formdireccion: FormGroup;
  public direcciones: any;
  constructor(private restService:RestService, private formBuilder: FormBuilder) { }

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

    this.restService.get('http://localhost:8080/Direcciones/findDireccion/'+this.user.direcciones_iddireccion)
    .subscribe(respuesta =>{
      this.direcciones=respuesta;
      console.log(respuesta);
      this.formdireccion.patchValue({
        calle: this.direcciones.calle,
        numext: this.direcciones.numext,
        numint: this.direcciones.numint ,
        cp: this.direcciones.cp,
        telcasa: this.direcciones.telcasa,
        telmovil: this.direcciones.telmovil,
        teltrabajo: this.direcciones.teltrabajo,
        ext: this.direcciones.ext,
        estado: this.direcciones.estado,
        alcaldia: this.direcciones.alcaldia,
        correo: this.direcciones.correo
      });
    });
    this.formdireccion = this.formBuilder.group({
      calle: ['', Validators.required],
      numext: ['', Validators.required],
      numint: ['', Validators.required],
      cp: ['', Validators.required],
      telcasa: ['', Validators.required],
      telmovil: ['', Validators.required],
      teltrabajo: ['', Validators.required],
      ext: ['', Validators.required],
      estado: ['', Validators.required],
      alcaldia: ['', Validators.required],
      correo: ['', [Validators.required, Validators.email]]

    });
  
    

  }
  public update(){
    console.log(this.formdireccion.value);
    this.direcciones.calle=this.formdireccion.value.calle;
    this.direcciones.numext=this.formdireccion.value.numext; 
    this.direcciones.numint=this.formdireccion.value.numint;
    this.direcciones.cp=this.formdireccion.value.cp;
    this.direcciones.telcasa=this.formdireccion.value.telcasa;
    this.direcciones.telmovil=this.formdireccion.value.telmovil;
    this.direcciones.estado=this.formdireccion.value.estado;
    this.direcciones.alcaldia=this.formdireccion.value.alcaldia;
    this.direcciones.correo=this.formdireccion.value.correo;
    alert("Datos modificados exitosamente");

  }

}
