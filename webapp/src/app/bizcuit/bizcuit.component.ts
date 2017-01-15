import {Bizcuit} from '../../domain/Bizcuit';
import {Component} from '@angular/core';
import { BizcuitService } from '../_services/bizcuit.service';


@Component({
    selector:'',
    templateUrl: './app/bizcuit/bizcuit.component.html'
})

export class BizcuitComponent{

    bizcuits : Array<Bizcuit>;

    constructor(private bizcuitService: BizcuitService)
    {
        this.getAllBizcuits();
    }

    
    getAllBizcuits = function(){
        let bizcuits = this.bizcuitService.getAllBizcuits()
        console.log(bizcuits);        
    }
    

}