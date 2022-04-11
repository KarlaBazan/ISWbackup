import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> parent of 0361301b (Revert "Merge branch 'main' into main")
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';

import { LoginComponent } from './login/login.component';


@NgModule({
  declarations: [
    AppComponent,

    HeaderComponent,
    FooterComponent
<<<<<<< HEAD
=======

@NgModule({
  declarations: [
    AppComponent
>>>>>>> parent of e56a91fd (Servicio rest direcciones)
=======

    LoginComponent

>>>>>>> parent of 0361301b (Revert "Merge branch 'main' into main")
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
