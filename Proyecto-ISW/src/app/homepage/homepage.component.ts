import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  boleta:string;

  constructor(private rutaActiva: ActivatedRoute) { }

  ngOnInit(): void {
    this.obtenerUser();
    
  }
  public obtenerUser()
  {this.boleta = this.rutaActiva.snapshot.params.boleta;
  console.log('el user es: '+this.boleta);}
}
