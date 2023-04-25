import { Component, OnInit } from '@angular/core';
import { BookApi, Book } from '../service';

@Component({
  selector: 'bs-book-list',
  templateUrl: './book-list.component.html',
  styles: []
})
export class BookListComponent implements OnInit {

    private nbBooks: number ;
    private books: Book[];

  constructor(private bookApi: BookApi) { }

  ngOnInit() {
      this.bookApi.countBooks().subscribe(nbBooks => this.nbBooks = nbBooks);
      this.bookApi.getBooks().subscribe(books => this.books = books);

  }

}
