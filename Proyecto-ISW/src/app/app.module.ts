import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomepageComponent } from './homepage/homepage.component';
import { NavdataComponent } from './navdata/navdata.component';
import { FormdireccionComponent } from './formdireccion/formdireccion.component';
import { FormgeneralesComponent } from './formgenerales/formgenerales.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { ErrorTailorModule } from '@ngneat/error-tailor';
import { ReccontraComponent } from './reccontra/reccontra.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    NavbarComponent,
    NavdataComponent,
    HomepageComponent, 
    FormdireccionComponent, 
    FormgeneralesComponent,
    ReccontraComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    ReactiveFormsModule, 
    ErrorTailorModule.forRoot({
      errors:{
        useValue: {
          required:'Campo requerido',
          minlength:({requiredLength, actualLength})=> 
          'Se necesitan 10 caracteres',
          email: error =>'Direccion invalida'
        }
      }
    })
  ],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
