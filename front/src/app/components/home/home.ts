import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  imports: [],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

  visibilidadeLista = false;
  lista = [10, "Matheus", false, 11.5];

  apresentaLista(){
    this.visibilidadeLista = true;
  }
  escondeLista(){
    this.visibilidadeLista = false;
  }

}
