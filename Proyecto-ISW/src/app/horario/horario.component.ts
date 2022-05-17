import { Component, OnInit } from '@angular/core';
import { RestService } from '../rest.service';

@Component({
  selector: 'app-horario',
  templateUrl: './horario.component.html',
  styleUrls: ['./horario.component.css']
})
export class HorarioComponent implements OnInit {
  
  public user: any;
  public alumnos_has_grupos: any;

  constructor(private restService:RestService) { }

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


    this.restService.get('http://localhost:8080/Alumnos_has_grupos/findAll/').subscribe(respuesta =>{
      localStorage.setItem("alumnos_has_grupos", JSON.stringify(respuesta))
      this.alumnos_has_grupos=JSON.parse(localStorage.getItem("alumnos_has_grupos")??`{
        "alumnos_boleta": "000000000",
        "grupos_grupo": "XXXX"}`);
        console.log('el objeto es: '+this.alumnos_has_grupos.alumnos_boleta);
    });
  }

  

}
