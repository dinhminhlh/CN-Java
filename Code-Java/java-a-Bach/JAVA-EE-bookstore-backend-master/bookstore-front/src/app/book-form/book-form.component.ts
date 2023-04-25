import { Component, OnInit } from '@angular/core';
import { Book, BookApi } from '../service';
import { Router } from '@angular/router';

@Component({
  selector: 'bs-book-form',
  templateUrl: './book-form.component.html',
  styles: []
})
export class BookFormComponent implements OnInit {

    private book : Book;

  constructor(private router: Router, private bookApi: BookApi) { }

  ngOnInit() {
  }

  create() {
    this.bookApi.createBook(this.book)
        .finally(() => this.router.navigate(['/book-list']))
        .subscribe();
  }

}
