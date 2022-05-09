import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { FormdireccionComponent } from './formdireccion/formdireccion.component';
import { FormgeneralesComponent } from './formgenerales/formgenerales.component';
import { ReccontraComponent } from './reccontra/reccontra.component';
const routes: Routes = [
      {path:'login', component: LoginComponent},
      {path:'home', component: HomepageComponent},
      {path:'direccion', component: FormdireccionComponent},
      {path:'generales', component: FormgeneralesComponent},
      {path:'recupera', component: ReccontraComponent} 
      
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
