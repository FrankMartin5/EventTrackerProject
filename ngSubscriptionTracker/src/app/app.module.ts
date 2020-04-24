import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SubListComponent } from './sub-list/sub-list.component';
import { SubComponent } from './model/sub/sub.component';

@NgModule({
  declarations: [
    AppComponent,
    SubListComponent,
    SubComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
