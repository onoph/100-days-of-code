"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require("@angular/core");
var PanierService = (function () {
    function PanierService() {
        this.voirPanier = function () {
            return this.articles;
        };
        this.deleteItem = function (item) {
            var idx = this.itemsitems.indexOf(item);
            if (idx > -1) {
                this.articles.splice(idx, 1);
            }
        };
        this.resetPanier = function () {
            this.items = new Array();
        };
    }
    PanierService.prototype.addItem = function (item) {
        var itemInList = this.getPanierItem(item);
        if (itemInList == null) {
            this.items.push(item);
        }
    };
    PanierService.prototype.incrementQuantity = function (item) {
        var itemInList = this.getPanierItem(item.item);
        if (itemInList != null) {
            this.deleteItem(itemInList);
            item.quantity = item.quantity + 1;
            this.items.push(item);
        }
    };
    PanierService.prototype.getPanierItem = function (a) {
        for (var _i = 0, _a = this.items; _i < _a.length; _i++) {
            var i = _a[_i];
            if (i.item === a)
                return i;
        }
        return null;
    };
    return PanierService;
}());
PanierService = __decorate([
    core_1.Injectable()
], PanierService);
exports.PanierService = PanierService;

//# sourceMappingURL=panier.service.js.map
