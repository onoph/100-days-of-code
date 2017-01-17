"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require("@angular/core");
var bizcuit_service_1 = require("../_services/bizcuit.service");
var panier_service_1 = require("../_services/panier.service");
var BizcuitComponent = (function () {
    function BizcuitComponent(bizcuitService, panierService) {
        this.bizcuitService = bizcuitService;
        this.panierService = panierService;
        this.getAllBizcuits = function () {
            var _this = this;
            console.log("getting bizcuits");
            this.bizcuitService.getAllBizcuits()
                .subscribe(function (data) { return _this.bizcuits = data; });
            console.log(this.bizcuits);
        };
        this.addToPanier = function (bizcuit) {
            this.panierService.addArticle(bizcuit);
        };
        this.getAllBizcuits();
    }
    return BizcuitComponent;
}());
BizcuitComponent = __decorate([
    core_1.Component({
        selector: '',
        templateUrl: './app/bizcuit/bizcuit.component.html'
    }),
    __metadata("design:paramtypes", [bizcuit_service_1.BizcuitService,
        panier_service_1.PanierService])
], BizcuitComponent);
exports.BizcuitComponent = BizcuitComponent;

//# sourceMappingURL=bizcuit.component.js.map
