import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { response } from 'express';
import { RestService } from '../rest.service';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public formlogin: FormGroup;
  public user: any; 
  public error: any;
  constructor(private restService:RestService, private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.formlogin = this.formBuilder.group({
      boleta: ['', [Validators.required, Validators.minLength(8)]],
      password: ['', Validators.required]
    });
  }


  public send(){
    console.log(this.formlogin.value);
    this.restService.get('http://localhost:8080/Alumno/findAlumno/'+this.formlogin.value.boleta+'/'+this.formlogin.value.password)
    .subscribe(respuesta =>{
      console.log(respuesta);
      if(respuesta != null){
        window.location.href= '/home';
      }
      });
    
  }

}
