import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-kardex',
  templateUrl: './kardex.component.html',
  styleUrls: ['./kardex.component.css']
})
export class KardexComponent implements OnInit {

  clave: string = 'C101';
  materia: string = 'Analisis Vectorial';
  fecha: string = "18/Dic/21";
  ev: string = "ORD";
  calif: number = 10;

  ngOnInit(): void {
  }

}
