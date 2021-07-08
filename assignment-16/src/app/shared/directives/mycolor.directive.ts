import { Renderer2 } from '@angular/core';
import { ElementRef } from '@angular/core';
import { HostBinding, HostListener } from '@angular/core';
import { Directive } from '@angular/core';

@Directive({
  selector: '[appMycolor]'
})
export class MycolorDirective {

  @HostBinding('style.color') color:string
  @HostBinding('style.backgroundColor') bgcolor!: string;

  constructor(private eleRef:ElementRef, private renderer:Renderer2) {
    this.color = 'black'
   }

   @HostListener('mouseover') onMouseOver(){
     this.color ='white'
     this.bgcolor = 'black'

   }
   @HostListener('mouseleave') onMouseLeave(){
    this.color =''
    this.bgcolor = ''

  }

}
