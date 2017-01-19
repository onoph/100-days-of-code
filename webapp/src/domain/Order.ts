import {Map} from 'gulp-typescript/release/utils';
import {Customer} from './Customer';
import { Article } from './Article';
import { ArticleMap } from './ArticleMap';

export class Order{
    customer: Customer;
    articles: Map<ArticleMap>;
}