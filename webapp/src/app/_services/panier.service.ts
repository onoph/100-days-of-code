import { Injectable } from '@angular/core';
import { Article } from '../../domain/Article';
import { PanierItem } from '../../model/PanierItem';

@Injectable()
export class PanierService{
    items : Array<PanierItem>;

    addItem(item:PanierItem){
        var itemInList = this.getPanierItem(item);
        if(itemInList == null){
            this.items.push(item);
        } 
    }

    incrementQuantity(item: PanierItem){
        var itemInList = this.getPanierItem(item.item);
        if(itemInList != null){
            this.deleteItem(itemInList);
            item.quantity = item.quantity + 1;
            this.items.push(item);
        }
    }

    voirPanier = function(){
        return this.articles;
    }

    deleteItem = function(item){
        var idx = this.itemsitems.indexOf(item);
        if(idx > -1){
            this.articles.splice(idx, 1);
        }
    }

    resetPanier = function(){
        this.items = new Array<Article>();
    }

    getPanierItem(a:Article){
        for(let i of this.items){
            if(i.item === a)
                return i;
        }
        return null;
    }
}