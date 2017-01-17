import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpModule, JsonpModule} from '@angular/http';

import {AppComponent} from './app.component';
import {routing, appRoutingProviders} from './app.routing';
import {HomeComponent} from './home/home.component';
import {AboutComponent} from './about/about.component';
import { BizcuitService } from './_services/bizcuit.service';
import { BizcuitComponent } from './bizcuit/bizcuit.component';
import { PanierService } from './_services/panier.service';


@NgModule({
    declarations: [
        AppComponent,
        HomeComponent,
        AboutComponent,
        BizcuitComponent
    ],
    imports: [
        BrowserModule,
        FormsModule,
        HttpModule,
        JsonpModule,
        routing
    ],
    providers: [appRoutingProviders, BizcuitService, PanierService],
    bootstrap: [AppComponent]
})

export class AppModule {
}
