import {Observable} from 'rxjs/Rx';
import {Injectable} from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/Rx';
import { Bizcuit } from '../../domain/Bizcuit';


@Injectable()
export class BizcuitService{
    
    private baseUrl = "http://localhost:8080/bizcuit";

    
    constructor(private http:Http){}

    getAllBizcuits = function() : Observable<Array<Bizcuit>>
    {
        return this.http.get(this.baseUrl)
                 .flatMap((data: any) => data.json())
                 .catch((err : any) => console.log('err', err))
    }
    /*
    saveBizcuit = function(bizcuit: Bizcuit) : Observable<Bizcuit>
    {
        return this.http.post(this.baseUrl, bizcuit)
                     .map((data : any) => data.json())
                     .catch((err : any) => console.log('err', err));
    }

    updateBizcuit = function(bizcuit : Bizcuit) : Observable<Bizcuit>
    {
        return this.http.put(this.baseUrl, bizcuit)
                     .map((data : any) => data.json())
                     .catch((err : any) => console.log('err', err));
    }
    */

}