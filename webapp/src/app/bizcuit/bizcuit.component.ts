import {Bizcuit} from '../../domain/Bizcuit';
import {Component} from '@angular/core';
import { BizcuitService } from '../_services/bizcuit.service';
import { PanierService } from '../_services/panier.service';

@Component({
    selector:'',
    templateUrl: './app/bizcuit/bizcuit.component.html'
})

export class BizcuitComponent{

    bizcuits : Array<Bizcuit>;

    constructor(private bizcuitService: BizcuitService,
                private panierService: PanierService)
    {
        this.getAllBizcuits();
    }

    
    getAllBizcuits = function(){
        console.log("getting bizcuits");
        this.bizcuitService.getAllBizcuits()
            .subscribe((data : any) => this.bizcuits = data);
        console.log(this.bizcuits);
    }

    addToPanier = function(bizcuit){
        this.panierService.addArticle(bizcuit);
    }    

}