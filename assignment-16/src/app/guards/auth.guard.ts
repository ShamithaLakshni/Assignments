import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService } from '../services/auth.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
    constructor(private authService:AuthService){ }
  canActivate(route: ActivatedRouteSnapshot,state: RouterStateSnapshot): boolean {
    if(this.authService.isUserLoggedIn()){
      return true;
    }
    else{
      alert('Boss! You are not allowed for Java Access')
      return false;
    }
  }

  }
  
