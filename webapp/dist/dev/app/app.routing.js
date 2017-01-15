"use strict";
var router_1 = require("@angular/router");
var home_component_1 = require("./home/home.component");
var about_component_1 = require("./about/about.component");
var bizcuit_component_1 = require("./bizcuit/bizcuit.component");
var appRoutes = [
    { path: '', component: home_component_1.HomeComponent },
    { path: 'about', component: about_component_1.AboutComponent },
    { path: 'bizcuits', component: bizcuit_component_1.BizcuitComponent }
];
exports.appRoutingProviders = [];
exports.routing = router_1.RouterModule.forRoot(appRoutes);

//# sourceMappingURL=app.routing.js.map
