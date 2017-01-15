import {Component, Input} from '@angular/core';
import { Bizcuit } from '../../../domain/Bizcuit';

@Component({
    selector:'bizcuit',
    templateUrl: './app/bizcuit/bizcuitItem/bizcuitItem.component.html'
})

export class BizcuitItemComponent{
    
    @Input() bizcuit: Bizcuit;

    saveBizcuit = function()
    {

    }

}