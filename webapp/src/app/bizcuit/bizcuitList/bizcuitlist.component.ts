import {Bizcuit} from '../../../domain/Bizcuit';
import { Component } from '@angular/core';
import { BizcuitService } from '../../_services/bizcuit.service';
import { BizcuitItemComponent } from '../bizcuitItem/bizcuitItem.component';


@Component({
    selector:'bizcuit-list',
    templateUrl: './src/bizcuit/bizcuitList/bizcuitList.component.html'
})

export class BizcuitListComponent{

    allBizcuits : Array<Bizcuit>;

    constructor(private bizcuitService : BizcuitService){
        this.getAllBizcuits();
    }

    getAllBizcuits = function(){
        console.log('get all');
        let bizs =  this.bizcuitService.getAllBizcuits()
        console.log(bizs);
    }

}